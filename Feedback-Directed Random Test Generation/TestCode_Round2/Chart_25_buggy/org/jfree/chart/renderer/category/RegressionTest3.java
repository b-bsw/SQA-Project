package org.jfree.chart.renderer.category;

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
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) false, true);
        boolean boolean19 = statisticalBarRenderer0.getItemCreateEntity((int) (byte) 0, (-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer20.setBaseOutlineStroke(stroke21);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer20.setBaseFillPaint(paint25);
        java.awt.Font font27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer20.setBaseItemLabelFont(font27);
        boolean boolean29 = statisticalBarRenderer20.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer20.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition30);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = statisticalBarRenderer0.hasListener(eventListener34);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator36, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator39);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNull(categoryItemLabelGenerator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        java.awt.Paint paint11 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint15 = statisticalBarRenderer0.getItemLabelPaint((int) (short) 100, 0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = statisticalBarRenderer0.getDrawingSupplier();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = statisticalBarRenderer0.getSeriesURLGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer21.setBaseOutlineStroke(stroke22);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer24.setBaseOutlineStroke(stroke25);
        java.awt.Shape shape27 = statisticalBarRenderer24.getBaseShape();
        statisticalBarRenderer21.setBaseShape(shape27);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke31 = statisticalBarRenderer29.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer21.setBaseStroke(stroke31, false);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke31);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = statisticalBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(categoryURLGenerator20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(categoryURLGenerator35);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setBaseItemLabelPaint(paint13, true);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer16 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer16);
        statisticalBarRenderer0.setSeriesCreateEntities((int) '#', (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer22.setBaseOutlineStroke(stroke23);
        statisticalBarRenderer22.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer28.setBaseOutlineStroke(stroke29);
        statisticalBarRenderer28.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer28.setBaseFillPaint(paint33);
        java.awt.Font font35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer28.setBaseItemLabelFont(font35);
        statisticalBarRenderer22.setSeriesItemLabelFont((int) (byte) 0, font35, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = null;
        statisticalBarRenderer22.setBaseItemLabelGenerator(categoryItemLabelGenerator39);
        java.awt.Shape shape41 = statisticalBarRenderer22.getBaseShape();
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape41);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        boolean boolean45 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator1 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator1, true);
        statisticalBarRenderer0.setItemMargin((double) 1.0f);
        statisticalBarRenderer0.removeAnnotations();
        boolean boolean7 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean9 = statisticalBarRenderer8.getBaseCreateEntities();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = statisticalBarRenderer8.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        double double17 = statisticalBarRenderer12.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer18.setBaseOutlineStroke(stroke19);
        statisticalBarRenderer18.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint23);
        java.awt.Font font25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer18.setBaseItemLabelFont(font25);
        java.awt.Stroke stroke29 = statisticalBarRenderer18.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke32 = statisticalBarRenderer18.getItemStroke((int) (short) 1, (int) ' ');
        statisticalBarRenderer12.setBaseOutlineStroke(stroke32);
        java.awt.Shape shape36 = statisticalBarRenderer12.getItemShape((int) '#', (int) (short) 1);
        boolean boolean37 = statisticalBarRenderer12.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer39.setBaseOutlineStroke(stroke40);
        statisticalBarRenderer39.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean44 = statisticalBarRenderer39.getBaseSeriesVisibleInLegend();
        boolean boolean45 = statisticalBarRenderer39.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = statisticalBarRenderer39.getBaseItemLabelGenerator();
        boolean boolean48 = statisticalBarRenderer39.isSeriesVisible(0);
        statisticalBarRenderer39.setSeriesItemLabelsVisible((int) ' ', true);
        java.awt.Paint paint52 = statisticalBarRenderer39.getBaseItemLabelPaint();
        statisticalBarRenderer12.setSeriesPaint((int) (byte) 10, paint52, true);
        statisticalBarRenderer8.setBaseFillPaint(paint52);
        statisticalBarRenderer0.setBasePaint(paint52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        org.jfree.chart.LegendItem legendItem20 = statisticalBarRenderer0.getLegendItem((int) (byte) 10, (int) (byte) 100);
        statisticalBarRenderer0.setSeriesVisible((int) ' ', (java.lang.Boolean) false, false);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        boolean boolean27 = statisticalBarRenderer0.isDrawBarOutline();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(legendItem20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer10.setMaximumBarWidth((double) 100L);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer13 = null;
        statisticalBarRenderer10.setGradientPaintTransformer(gradientPaintTransformer13);
        java.awt.Stroke stroke17 = statisticalBarRenderer10.getItemOutlineStroke((int) (byte) 10, 10);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke17);
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 1);
        boolean boolean21 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) 'a', categoryURLGenerator23);
        boolean boolean27 = statisticalBarRenderer0.getItemVisible((int) '4', (int) (short) -1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator28);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer0.getNegativeItemLabelPosition(1, 10);
        statisticalBarRenderer0.removeAnnotations();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint17);
        java.awt.Font font19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer12.setBaseItemLabelFont(font19);
        boolean boolean21 = statisticalBarRenderer12.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer12.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition22, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator27 = statisticalBarRenderer0.getURLGenerator((int) ' ', (int) 'a');
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = statisticalBarRenderer0.getPlot();
        double double29 = statisticalBarRenderer0.getItemMargin();
        boolean boolean30 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer31.setBaseOutlineStroke(stroke32);
        statisticalBarRenderer31.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean36 = statisticalBarRenderer31.getBaseSeriesVisibleInLegend();
        boolean boolean37 = statisticalBarRenderer31.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer31.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer31.setAutoPopulateSeriesFillPaint(false);
        double double43 = statisticalBarRenderer31.getItemLabelAnchorOffset();
        java.awt.Paint paint45 = statisticalBarRenderer31.lookupSeriesFillPaint((int) '#');
        statisticalBarRenderer31.setSeriesItemLabelsVisible((int) '#', false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator49 = statisticalBarRenderer31.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator49);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNull(categoryURLGenerator27);
        org.junit.Assert.assertNull(categoryPlot28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2.0d + "'", double43 == 2.0d);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator49);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.LegendItem legendItem5 = statisticalBarRenderer0.getLegendItem(1, (int) (short) 1);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 100, (java.lang.Boolean) false);
        java.awt.Shape shape10 = statisticalBarRenderer0.lookupSeriesShape((int) 'a');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertNull(legendItem5);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(itemLabelPosition11);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer3.setBaseOutlineStroke(stroke4);
        java.awt.Shape shape6 = statisticalBarRenderer3.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator9, true);
        java.awt.Shape shape14 = statisticalBarRenderer0.getItemShape((int) 'a', (int) (short) 0);
        double double15 = statisticalBarRenderer0.getMinimumBarLength();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Shape shape5 = statisticalBarRenderer0.getBaseShape();
        statisticalBarRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator8 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator8);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double4 = statisticalBarRenderer3.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = null;
        statisticalBarRenderer3.setSeriesPositiveItemLabelPosition(1, itemLabelPosition6, false);
        java.awt.Paint paint10 = statisticalBarRenderer3.getSeriesPaint(0);
        java.lang.Boolean boolean12 = statisticalBarRenderer3.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke14);
        statisticalBarRenderer13.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer13.setBaseFillPaint(paint18);
        java.awt.Font font20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer13.setBaseItemLabelFont(font20);
        java.awt.Stroke stroke24 = statisticalBarRenderer13.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer3.setBaseOutlineStroke(stroke24);
        java.awt.Paint paint26 = statisticalBarRenderer3.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBaseOutlinePaint(paint26);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double31 = statisticalBarRenderer30.getBase();
        java.awt.Paint paint34 = statisticalBarRenderer30.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint34);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator36 = statisticalBarRenderer0.getBaseToolTipGenerator();
        statisticalBarRenderer0.setItemMargin((double) (-1L));
        java.awt.Paint paint41 = statisticalBarRenderer0.getItemLabelPaint((int) (short) 10, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer42.setBaseOutlineStroke(stroke43);
        java.awt.Shape shape45 = statisticalBarRenderer42.getBaseShape();
        java.awt.Shape shape46 = statisticalBarRenderer42.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer47.setBaseOutlineStroke(stroke48);
        statisticalBarRenderer47.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer47.setBaseFillPaint(paint52);
        java.awt.Font font54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer47.setBaseItemLabelFont(font54);
        java.awt.Stroke stroke58 = statisticalBarRenderer47.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Paint paint60 = statisticalBarRenderer47.getSeriesItemLabelPaint((int) (byte) 1);
        java.awt.Stroke stroke61 = statisticalBarRenderer47.getBaseStroke();
        statisticalBarRenderer42.setErrorIndicatorStroke(stroke61);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke61);
        statisticalBarRenderer0.setSeriesCreateEntities(1, (java.lang.Boolean) false, false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categoryToolTipGenerator36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(font54);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertNull(paint60);
        org.junit.Assert.assertNotNull(stroke61);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        boolean boolean20 = statisticalBarRenderer0.isItemLabelVisible((int) ' ', (int) (byte) 1);
        java.awt.Paint paint22 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        java.awt.Paint paint23 = statisticalBarRenderer0.getErrorIndicatorPaint();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, true);
        java.awt.Stroke stroke29 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 100);
        java.lang.Boolean boolean31 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 1);
        boolean boolean32 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        java.awt.Paint paint34 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) 0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(stroke29);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(paint34);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getItemStroke((int) (short) 1, (int) ' ');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 10, categoryToolTipGenerator10);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer12 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke14);
        statisticalBarRenderer13.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer13.setBaseFillPaint(paint18);
        statisticalBarRenderer13.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint23 = statisticalBarRenderer13.getSeriesPaint((int) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer13.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer13.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition26);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer31.setBaseOutlineStroke(stroke32);
        statisticalBarRenderer31.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer31.setBaseFillPaint(paint36);
        statisticalBarRenderer31.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint41 = statisticalBarRenderer31.getSeriesPaint((int) '#');
        statisticalBarRenderer31.removeAnnotations();
        java.awt.Shape shape45 = statisticalBarRenderer31.getItemShape((int) (byte) 100, (int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator46 = null;
        statisticalBarRenderer31.setBaseToolTipGenerator(categoryToolTipGenerator46);
        boolean boolean48 = statisticalBarRenderer31.isDrawBarOutline();
        java.awt.Stroke stroke49 = statisticalBarRenderer31.getErrorIndicatorStroke();
        statisticalBarRenderer0.setBaseOutlineStroke(stroke49);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator51 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator51, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(gradientPaintTransformer12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) true);
        statisticalBarRenderer0.setBaseSeriesVisible(true, true);
        boolean boolean10 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = statisticalBarRenderer0.getPlot();
        boolean boolean12 = statisticalBarRenderer0.getIncludeBaseInRange();
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer16.setBaseOutlineStroke(stroke17);
        statisticalBarRenderer16.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer16.setBaseFillPaint(paint21);
        java.awt.Font font23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer16.setBaseItemLabelFont(font23);
        boolean boolean25 = statisticalBarRenderer16.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer16.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer28.setBaseOutlineStroke(stroke29);
        java.awt.Shape shape31 = statisticalBarRenderer28.getBaseShape();
        java.awt.Shape shape32 = statisticalBarRenderer28.getBaseShape();
        statisticalBarRenderer16.setSeriesShape((int) ' ', shape32);
        java.awt.Font font36 = statisticalBarRenderer16.getItemLabelFont((int) (byte) 10, (int) '#');
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font36);
        java.awt.Stroke stroke40 = statisticalBarRenderer0.getItemStroke(10, 0);
        java.lang.Boolean boolean42 = statisticalBarRenderer0.getSeriesVisible((int) (short) 100);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryPlot11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNull(boolean42);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = statisticalBarRenderer0.getDrawingSupplier();
        java.awt.Graphics2D graphics2D16 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawBackground(graphics2D16, categoryPlot17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(drawingSupplier15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint12 = statisticalBarRenderer0.getBasePaint();
        org.jfree.chart.LegendItem legendItem15 = statisticalBarRenderer0.getLegendItem((int) (short) 0, (int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(legendItem15);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        java.awt.Shape shape3 = statisticalBarRenderer0.getBaseShape();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = statisticalBarRenderer0.hasListener(eventListener4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint12 = statisticalBarRenderer6.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseOutlinePaint(paint12, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer15.setBaseOutlineStroke(stroke16);
        statisticalBarRenderer15.setAutoPopulateSeriesOutlinePaint(true);
        double double20 = statisticalBarRenderer15.getBase();
        java.awt.Stroke stroke21 = statisticalBarRenderer15.getBaseStroke();
        statisticalBarRenderer0.setBaseStroke(stroke21);
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer24.setBaseOutlineStroke(stroke25);
        statisticalBarRenderer24.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer24.setBaseFillPaint(paint29);
        statisticalBarRenderer24.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint34 = statisticalBarRenderer24.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = null;
        statisticalBarRenderer24.setBaseItemLabelGenerator(categoryItemLabelGenerator35, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer24.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator38);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) ' ');
        boolean boolean14 = statisticalBarRenderer0.getItemVisible((int) (byte) 0, (int) '#');
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer17.setBaseOutlineStroke(stroke18);
        statisticalBarRenderer17.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer17.setBaseFillPaint(paint22);
        java.awt.Font font24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer17.setBaseItemLabelFont(font24);
        boolean boolean28 = statisticalBarRenderer17.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer17.setSeriesItemLabelPaint((int) (byte) 1, paint30, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation33 = null;
        boolean boolean34 = statisticalBarRenderer17.removeAnnotation(categoryAnnotation33);
        java.awt.Paint paint35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer17.setBaseFillPaint(paint35);
        java.awt.Stroke stroke38 = statisticalBarRenderer17.getSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer17.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer41.setBaseOutlineStroke(stroke42);
        statisticalBarRenderer41.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint47 = statisticalBarRenderer41.lookupSeriesOutlinePaint((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double49 = statisticalBarRenderer48.getBase();
        java.awt.Paint paint52 = statisticalBarRenderer48.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer41.setErrorIndicatorPaint(paint52);
        statisticalBarRenderer17.setBaseOutlinePaint(paint52);
        java.awt.Paint paint55 = statisticalBarRenderer17.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer57.setBaseOutlineStroke(stroke58);
        statisticalBarRenderer57.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer57.setBaseFillPaint(paint62);
        java.awt.Font font64 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer57.setBaseItemLabelFont(font64);
        statisticalBarRenderer17.setSeriesItemLabelFont(10, font64);
        statisticalBarRenderer0.setBaseItemLabelFont(font64, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(stroke38);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(font64);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        statisticalBarRenderer0.setMinimumBarLength((double) 1L);
        java.lang.Object obj9 = statisticalBarRenderer0.clone();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer10.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition17);
        double double19 = statisticalBarRenderer0.getItemMargin();
        java.awt.Font font22 = statisticalBarRenderer0.getItemLabelFont((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator23, true);
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer3 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer3);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 10, 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseOutlineStroke(stroke9);
        statisticalBarRenderer8.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer8.setBaseFillPaint(paint13);
        java.awt.Font font15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer8.setBaseItemLabelFont(font15);
        java.awt.Stroke stroke19 = statisticalBarRenderer8.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke19, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Stroke stroke24 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double26 = statisticalBarRenderer25.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = null;
        statisticalBarRenderer25.setSeriesPositiveItemLabelPosition(1, itemLabelPosition28, false);
        java.awt.Paint paint32 = statisticalBarRenderer25.getSeriesPaint(0);
        java.lang.Boolean boolean34 = statisticalBarRenderer25.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer35.setBaseOutlineStroke(stroke36);
        statisticalBarRenderer35.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer35.setBaseFillPaint(paint40);
        java.awt.Font font42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer35.setBaseItemLabelFont(font42);
        java.awt.Stroke stroke46 = statisticalBarRenderer35.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer25.setBaseOutlineStroke(stroke46);
        statisticalBarRenderer25.setSeriesVisibleInLegend(100, (java.lang.Boolean) true, false);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer52 = statisticalBarRenderer25.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer52);
        int int54 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(font42);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(gradientPaintTransformer52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer18.setBaseOutlineStroke(stroke19);
        statisticalBarRenderer18.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean23 = statisticalBarRenderer18.getBaseSeriesVisibleInLegend();
        boolean boolean24 = statisticalBarRenderer18.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer18.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer18.setAutoPopulateSeriesFillPaint(false);
        java.awt.Stroke stroke31 = statisticalBarRenderer18.lookupSeriesStroke(0);
        boolean boolean32 = statisticalBarRenderer18.getAutoPopulateSeriesShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer18.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition34, true);
        java.awt.Paint paint37 = statisticalBarRenderer0.getBasePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = statisticalBarRenderer0.getDrawingSupplier();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 0);
        boolean boolean18 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator19, true);
        double double22 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator11, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = statisticalBarRenderer0.getURLGenerator((int) (byte) 0, (int) '#');
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(10, categoryURLGenerator22, true);
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainGridline(graphics2D25, categoryPlot26, rectangle2D27, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNull(categoryURLGenerator17);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator1 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator1, true);
        statisticalBarRenderer0.setMinimumBarLength((double) (-1L));
        double double6 = statisticalBarRenderer0.getLowerClip();
        statisticalBarRenderer0.setBaseCreateEntities(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        boolean boolean19 = statisticalBarRenderer10.getAutoPopulateSeriesStroke();
        java.lang.Boolean boolean21 = statisticalBarRenderer10.getSeriesCreateEntities((int) ' ');
        statisticalBarRenderer10.setBase((double) 100.0f);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer24.setAutoPopulateSeriesOutlinePaint(true);
        statisticalBarRenderer24.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) true, false);
        java.awt.Stroke stroke31 = statisticalBarRenderer24.getBaseStroke();
        statisticalBarRenderer10.setBaseStroke(stroke31);
        boolean boolean33 = statisticalBarRenderer10.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double35 = statisticalBarRenderer34.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = null;
        statisticalBarRenderer34.setSeriesPositiveItemLabelPosition(1, itemLabelPosition37, false);
        java.awt.Paint paint41 = statisticalBarRenderer34.getSeriesPaint(0);
        java.lang.Boolean boolean43 = statisticalBarRenderer34.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer44.setBaseOutlineStroke(stroke45);
        statisticalBarRenderer44.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer44.setBaseFillPaint(paint49);
        java.awt.Font font51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer44.setBaseItemLabelFont(font51);
        java.awt.Stroke stroke55 = statisticalBarRenderer44.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer34.setBaseOutlineStroke(stroke55);
        java.awt.Paint paint57 = statisticalBarRenderer34.getErrorIndicatorPaint();
        double double58 = statisticalBarRenderer34.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer59 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer59.setBaseOutlineStroke(stroke60);
        statisticalBarRenderer59.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer65 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer65.setBaseOutlineStroke(stroke66);
        statisticalBarRenderer65.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint70 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer65.setBaseFillPaint(paint70);
        java.awt.Font font72 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer65.setBaseItemLabelFont(font72);
        java.awt.Paint paint75 = statisticalBarRenderer65.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer59.setSeriesFillPaint((int) '#', paint75);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator78 = statisticalBarRenderer59.getSeriesItemLabelGenerator((int) (short) 0);
        java.awt.Paint paint81 = statisticalBarRenderer59.getItemOutlinePaint((-1), (int) (short) 0);
        statisticalBarRenderer34.setBaseItemLabelPaint(paint81, false);
        statisticalBarRenderer10.setBaseFillPaint(paint81);
        statisticalBarRenderer0.setBaseOutlinePaint(paint81, true);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(font51);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(font72);
        org.junit.Assert.assertNotNull(paint75);
        org.junit.Assert.assertNull(categoryItemLabelGenerator78);
        org.junit.Assert.assertNotNull(paint81);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        boolean boolean15 = statisticalBarRenderer0.isSeriesItemLabelsVisible(10);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = statisticalBarRenderer0.getDrawingSupplier();
        java.awt.Paint paint17 = null;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) ' ', paint17, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(drawingSupplier15);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator12);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setMaximumBarWidth((double) 100L);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer18 = null;
        statisticalBarRenderer15.setGradientPaintTransformer(gradientPaintTransformer18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double22 = statisticalBarRenderer21.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = null;
        statisticalBarRenderer21.setSeriesPositiveItemLabelPosition(1, itemLabelPosition24, false);
        java.awt.Paint paint28 = statisticalBarRenderer21.getSeriesPaint(0);
        statisticalBarRenderer21.setItemLabelAnchorOffset((double) 0);
        java.lang.Boolean boolean32 = statisticalBarRenderer21.getSeriesCreateEntities((int) (short) 10);
        java.awt.Font font35 = statisticalBarRenderer21.getItemLabelFont((int) (byte) 10, (int) 'a');
        statisticalBarRenderer15.setSeriesItemLabelFont((int) (byte) 1, font35);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) ' ', font35, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNull(boolean32);
        org.junit.Assert.assertNotNull(font35);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        boolean boolean13 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean15 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) '4', 0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) true);
        statisticalBarRenderer0.setBaseSeriesVisible(true, true);
        boolean boolean10 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = statisticalBarRenderer0.getPlot();
        boolean boolean12 = statisticalBarRenderer0.getIncludeBaseInRange();
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer16.setBaseOutlineStroke(stroke17);
        statisticalBarRenderer16.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer16.setBaseFillPaint(paint21);
        java.awt.Font font23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer16.setBaseItemLabelFont(font23);
        boolean boolean25 = statisticalBarRenderer16.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer16.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer28.setBaseOutlineStroke(stroke29);
        java.awt.Shape shape31 = statisticalBarRenderer28.getBaseShape();
        java.awt.Shape shape32 = statisticalBarRenderer28.getBaseShape();
        statisticalBarRenderer16.setSeriesShape((int) ' ', shape32);
        java.awt.Font font36 = statisticalBarRenderer16.getItemLabelFont((int) (byte) 10, (int) '#');
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font36);
        java.awt.Paint paint39 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) 100);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryPlot11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) ' ');
        boolean boolean14 = statisticalBarRenderer0.getItemVisible((int) (byte) 0, (int) '#');
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double18 = statisticalBarRenderer17.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = null;
        statisticalBarRenderer17.setSeriesPositiveItemLabelPosition(1, itemLabelPosition20, false);
        java.awt.Paint paint24 = statisticalBarRenderer17.getSeriesPaint(0);
        statisticalBarRenderer17.setItemLabelAnchorOffset((double) 0);
        java.lang.Boolean boolean28 = statisticalBarRenderer17.getSeriesCreateEntities((int) (short) 10);
        statisticalBarRenderer17.setBaseItemLabelsVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer17.getPositiveItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer17.getSeriesPositiveItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition33);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(itemLabelPosition31);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) true);
        statisticalBarRenderer0.setBaseSeriesVisible(true, true);
        boolean boolean10 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = statisticalBarRenderer0.getPlot();
        boolean boolean12 = statisticalBarRenderer0.getIncludeBaseInRange();
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer16.setBaseOutlineStroke(stroke17);
        statisticalBarRenderer16.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer16.setBaseFillPaint(paint21);
        java.awt.Font font23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer16.setBaseItemLabelFont(font23);
        boolean boolean25 = statisticalBarRenderer16.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer16.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer28.setBaseOutlineStroke(stroke29);
        java.awt.Shape shape31 = statisticalBarRenderer28.getBaseShape();
        java.awt.Shape shape32 = statisticalBarRenderer28.getBaseShape();
        statisticalBarRenderer16.setSeriesShape((int) ' ', shape32);
        java.awt.Font font36 = statisticalBarRenderer16.getItemLabelFont((int) (byte) 10, (int) '#');
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font36);
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint39);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryPlot11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        statisticalBarRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) true, false);
        java.util.EventListener eventListener27 = null;
        boolean boolean28 = statisticalBarRenderer0.hasListener(eventListener27);
        statisticalBarRenderer0.setBaseSeriesVisible(true, false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 0);
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 10);
        java.awt.Font font14 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 10, (int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer15.setBaseOutlineStroke(stroke16);
        statisticalBarRenderer15.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint20);
        statisticalBarRenderer15.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint25 = statisticalBarRenderer15.getSeriesPaint((int) '#');
        statisticalBarRenderer15.removeAnnotations();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = statisticalBarRenderer15.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer28.setMaximumBarWidth((double) 100L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double32 = statisticalBarRenderer31.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer31.setSeriesPositiveItemLabelPosition(1, itemLabelPosition34, false);
        java.awt.Paint paint38 = statisticalBarRenderer31.getSeriesPaint(0);
        java.lang.Boolean boolean40 = statisticalBarRenderer31.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer41.setBaseOutlineStroke(stroke42);
        statisticalBarRenderer41.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer41.setBaseFillPaint(paint46);
        java.awt.Font font48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer41.setBaseItemLabelFont(font48);
        java.awt.Stroke stroke52 = statisticalBarRenderer41.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer31.setBaseOutlineStroke(stroke52);
        java.awt.Paint paint54 = statisticalBarRenderer31.getErrorIndicatorPaint();
        statisticalBarRenderer28.setBaseOutlinePaint(paint54);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition57 = statisticalBarRenderer28.getSeriesPositiveItemLabelPosition((int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double59 = statisticalBarRenderer58.getBase();
        java.awt.Paint paint62 = statisticalBarRenderer58.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer28.setBaseItemLabelPaint(paint62);
        statisticalBarRenderer15.setBaseOutlinePaint(paint62);
        statisticalBarRenderer0.setBaseFillPaint(paint62);
        java.lang.Boolean boolean67 = statisticalBarRenderer0.getSeriesCreateEntities(1);
        statisticalBarRenderer0.setSeriesCreateEntities((int) ' ', (java.lang.Boolean) false, true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(itemLabelPosition57);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNull(boolean67);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer3.setBaseOutlineStroke(stroke4);
        java.awt.Shape shape6 = statisticalBarRenderer3.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator9, true);
        int int12 = statisticalBarRenderer0.getRowCount();
        double double13 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.awt.Shape shape15 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer16.setBaseOutlineStroke(stroke17);
        statisticalBarRenderer16.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer16.setBaseFillPaint(paint21);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer16.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer25.setBaseOutlineStroke(stroke26);
        statisticalBarRenderer25.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer25.setBaseFillPaint(paint30);
        java.awt.Font font32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer25.setBaseItemLabelFont(font32);
        boolean boolean36 = statisticalBarRenderer25.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer25.setSeriesItemLabelPaint((int) (byte) 1, paint38, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation41 = null;
        boolean boolean42 = statisticalBarRenderer25.removeAnnotation(categoryAnnotation41);
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer25.setBaseFillPaint(paint43);
        statisticalBarRenderer16.setSeriesOutlinePaint((int) '#', paint43);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = statisticalBarRenderer16.getBasePositiveItemLabelPosition();
        statisticalBarRenderer16.setBaseSeriesVisible(false);
        java.awt.Paint paint50 = null;
        statisticalBarRenderer16.setSeriesFillPaint(0, paint50);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition54 = statisticalBarRenderer16.getPositiveItemLabelPosition(1, (int) (short) 0);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition54);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.0d + "'", double13 == 2.0d);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
        org.junit.Assert.assertNotNull(itemLabelPosition54);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer9.setBaseOutlineStroke(stroke10);
        statisticalBarRenderer9.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint14);
        java.awt.Font font16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer9.setBaseItemLabelFont(font16);
        boolean boolean20 = statisticalBarRenderer9.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer9.setSeriesItemLabelPaint((int) (byte) 1, paint22, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        boolean boolean26 = statisticalBarRenderer9.removeAnnotation(categoryAnnotation25);
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint27);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '#', paint27);
        double double30 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer32.setBaseOutlineStroke(stroke33);
        statisticalBarRenderer32.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean37 = statisticalBarRenderer32.getBaseSeriesVisibleInLegend();
        boolean boolean38 = statisticalBarRenderer32.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer32.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer32.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer32.setBaseOutlinePaint(paint44);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) '#', paint44);
        double double47 = statisticalBarRenderer0.getMinimumBarLength();
        java.awt.Graphics2D graphics2D48 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis52 = null;
        org.jfree.chart.axis.ValueAxis valueAxis53 = null;
        org.jfree.data.statistics.StatisticalCategoryDataset statisticalCategoryDataset54 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawVerticalItem(graphics2D48, categoryItemRendererState49, rectangle2D50, categoryPlot51, categoryAxis52, valueAxis53, statisticalCategoryDataset54, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer3.setBaseOutlineStroke(stroke4);
        java.awt.Shape shape6 = statisticalBarRenderer3.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator9, true);
        java.awt.Shape shape14 = statisticalBarRenderer0.getItemShape((int) 'a', (int) (short) 0);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double4 = statisticalBarRenderer3.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = null;
        statisticalBarRenderer3.setSeriesPositiveItemLabelPosition(1, itemLabelPosition6, false);
        java.awt.Paint paint10 = statisticalBarRenderer3.getSeriesPaint(0);
        java.lang.Boolean boolean12 = statisticalBarRenderer3.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke14);
        statisticalBarRenderer13.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer13.setBaseFillPaint(paint18);
        java.awt.Font font20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer13.setBaseItemLabelFont(font20);
        java.awt.Stroke stroke24 = statisticalBarRenderer13.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer3.setBaseOutlineStroke(stroke24);
        java.awt.Paint paint26 = statisticalBarRenderer3.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBaseOutlinePaint(paint26);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double31 = statisticalBarRenderer30.getBase();
        java.awt.Paint paint34 = statisticalBarRenderer30.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint34);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator36 = statisticalBarRenderer0.getBaseToolTipGenerator();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        java.awt.Shape shape41 = statisticalBarRenderer0.getItemShape((int) '#', (int) '#');
        java.awt.Paint paint44 = statisticalBarRenderer0.getItemPaint(100, 0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation45 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categoryToolTipGenerator36);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 0, (int) '#');
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseStroke();
        double double9 = statisticalBarRenderer0.getItemMargin();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesStroke((int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) false, true);
        boolean boolean19 = statisticalBarRenderer0.getItemCreateEntity((int) (byte) 0, (-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer20.setBaseOutlineStroke(stroke21);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer20.setBaseFillPaint(paint25);
        java.awt.Font font27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer20.setBaseItemLabelFont(font27);
        boolean boolean29 = statisticalBarRenderer20.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer20.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition30);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        java.util.EventListener eventListener34 = null;
        boolean boolean35 = statisticalBarRenderer0.hasListener(eventListener34);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator38 = statisticalBarRenderer0.getToolTipGenerator((int) (short) -1, (int) (byte) 10);
        boolean boolean41 = statisticalBarRenderer0.getItemVisible((-1), (int) '4');
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNull(categoryItemLabelGenerator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double4 = statisticalBarRenderer3.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = null;
        statisticalBarRenderer3.setSeriesPositiveItemLabelPosition(1, itemLabelPosition6, false);
        java.awt.Paint paint10 = statisticalBarRenderer3.getSeriesPaint(0);
        java.lang.Boolean boolean12 = statisticalBarRenderer3.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke14);
        statisticalBarRenderer13.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer13.setBaseFillPaint(paint18);
        java.awt.Font font20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer13.setBaseItemLabelFont(font20);
        java.awt.Stroke stroke24 = statisticalBarRenderer13.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer3.setBaseOutlineStroke(stroke24);
        java.awt.Paint paint26 = statisticalBarRenderer3.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBaseOutlinePaint(paint26);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double31 = statisticalBarRenderer30.getBase();
        java.awt.Paint paint34 = statisticalBarRenderer30.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint34);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator36 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean37 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 100, (java.lang.Boolean) false, false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) false, true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categoryToolTipGenerator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator1 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator1, true);
        statisticalBarRenderer0.setItemMargin((double) 1.0f);
        statisticalBarRenderer0.setSeriesVisible(100, (java.lang.Boolean) false, true);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer10.setMaximumBarWidth((double) 100L);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer13 = null;
        statisticalBarRenderer10.setGradientPaintTransformer(gradientPaintTransformer13);
        java.awt.Stroke stroke17 = statisticalBarRenderer10.getItemOutlineStroke((int) (byte) 10, 10);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke17);
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 1);
        boolean boolean21 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) 'a', categoryURLGenerator23);
        boolean boolean27 = statisticalBarRenderer0.getItemVisible((int) '4', (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer29.setMaximumBarWidth((double) 100L);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer32 = null;
        statisticalBarRenderer29.setGradientPaintTransformer(gradientPaintTransformer32);
        java.awt.Stroke stroke36 = statisticalBarRenderer29.getItemOutlineStroke((int) (byte) 10, 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer37.setBaseOutlineStroke(stroke38);
        statisticalBarRenderer37.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer37.setBaseFillPaint(paint42);
        java.awt.Font font44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer37.setBaseItemLabelFont(font44);
        java.awt.Stroke stroke48 = statisticalBarRenderer37.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer29.setBaseOutlineStroke(stroke48, true);
        java.awt.Stroke stroke53 = statisticalBarRenderer29.getItemOutlineStroke((int) (byte) 100, (-1));
        statisticalBarRenderer0.setSeriesStroke((int) (byte) 10, stroke53, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition58 = statisticalBarRenderer0.getNegativeItemLabelPosition(100, 0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(itemLabelPosition58);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint17);
        java.awt.Font font19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer12.setBaseItemLabelFont(font19);
        boolean boolean21 = statisticalBarRenderer12.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer12.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition22, false);
        boolean boolean25 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        statisticalBarRenderer0.setBase((double) 0.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection28 = statisticalBarRenderer0.getLegendItems();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer29.setBaseOutlineStroke(stroke30);
        statisticalBarRenderer29.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean34 = statisticalBarRenderer29.getBaseSeriesVisibleInLegend();
        boolean boolean35 = statisticalBarRenderer29.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = statisticalBarRenderer29.getBaseItemLabelGenerator();
        statisticalBarRenderer29.setBaseCreateEntities(false, false);
        boolean boolean40 = statisticalBarRenderer29.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer41.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer41.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        statisticalBarRenderer41.setMinimumBarLength((double) 1L);
        boolean boolean50 = statisticalBarRenderer41.getAutoPopulateSeriesOutlinePaint();
        java.awt.Paint paint51 = statisticalBarRenderer41.getBaseOutlinePaint();
        statisticalBarRenderer29.setBasePaint(paint51);
        statisticalBarRenderer0.setBaseFillPaint(paint51);
        java.awt.Paint paint55 = statisticalBarRenderer0.getSeriesItemLabelPaint(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator57 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator57, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(legendItemCollection28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNull(paint55);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.plot.Marker marker15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D12, categoryPlot13, valueAxis14, marker15, rectangle2D16);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 1, categoryToolTipGenerator19);
        double double21 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setBase((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setMinimumBarLength((double) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(0, categoryURLGenerator14, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer22.setBaseOutlineStroke(stroke23);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer25.setBaseOutlineStroke(stroke26);
        java.awt.Shape shape28 = statisticalBarRenderer25.getBaseShape();
        statisticalBarRenderer22.setBaseShape(shape28);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = statisticalBarRenderer30.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer22.setBaseStroke(stroke32, false);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke32, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer37.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer37.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        java.awt.Shape shape46 = statisticalBarRenderer37.getItemShape(1, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer47.setBaseOutlineStroke(stroke48);
        statisticalBarRenderer47.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer47.setBaseFillPaint(paint52);
        statisticalBarRenderer47.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint57 = statisticalBarRenderer47.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = null;
        statisticalBarRenderer47.setBaseItemLabelGenerator(categoryItemLabelGenerator58, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator61 = statisticalBarRenderer47.getLegendItemLabelGenerator();
        statisticalBarRenderer37.setLegendItemLabelGenerator(categorySeriesLabelGenerator61);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator61);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer66 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke67 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer66.setBaseOutlineStroke(stroke67);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer69 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke70 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer69.setBaseOutlineStroke(stroke70);
        java.awt.Shape shape72 = statisticalBarRenderer69.getBaseShape();
        statisticalBarRenderer66.setBaseShape(shape72);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator75 = null;
        statisticalBarRenderer66.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator75, true);
        int int78 = statisticalBarRenderer66.getRowCount();
        double double79 = statisticalBarRenderer66.getItemLabelAnchorOffset();
        java.awt.Shape shape81 = statisticalBarRenderer66.lookupSeriesShape((int) (byte) 100);
        java.awt.Paint paint82 = statisticalBarRenderer66.getBaseItemLabelPaint();
        java.awt.Stroke stroke85 = statisticalBarRenderer66.getItemOutlineStroke((int) (short) 0, 0);
        statisticalBarRenderer0.setBaseStroke(stroke85);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNull(paint57);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator61);
        org.junit.Assert.assertNotNull(stroke67);
        org.junit.Assert.assertNotNull(stroke70);
        org.junit.Assert.assertNotNull(shape72);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 2.0d + "'", double79 == 2.0d);
        org.junit.Assert.assertNotNull(shape81);
        org.junit.Assert.assertNotNull(paint82);
        org.junit.Assert.assertNotNull(stroke85);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) true, false);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(categoryToolTipGenerator10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double9 = statisticalBarRenderer8.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer8.setSeriesPositiveItemLabelPosition(1, itemLabelPosition11, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer14.setBaseOutlineStroke(stroke15);
        statisticalBarRenderer14.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer14.setBaseFillPaint(paint19);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = statisticalBarRenderer14.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer8.setBasePositiveItemLabelPosition(itemLabelPosition21);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer23.setBaseOutlineStroke(stroke24);
        statisticalBarRenderer23.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean28 = statisticalBarRenderer23.getBaseSeriesVisibleInLegend();
        boolean boolean29 = statisticalBarRenderer23.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer23.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer23.setIncludeBaseInRange(true);
        java.lang.Boolean boolean36 = statisticalBarRenderer23.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer37.setBaseOutlineStroke(stroke38);
        statisticalBarRenderer37.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer37.setBaseFillPaint(paint42);
        statisticalBarRenderer37.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint47 = statisticalBarRenderer37.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator48 = null;
        statisticalBarRenderer37.setBaseItemLabelGenerator(categoryItemLabelGenerator48, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator51 = statisticalBarRenderer37.getLegendItemLabelGenerator();
        statisticalBarRenderer23.setLegendItemLabelGenerator(categorySeriesLabelGenerator51);
        statisticalBarRenderer8.setLegendItemURLGenerator(categorySeriesLabelGenerator51);
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator51);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator55 = statisticalBarRenderer0.getBaseToolTipGenerator();
        statisticalBarRenderer0.setMinimumBarLength((double) (short) 10);
        java.awt.Graphics2D graphics2D58 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = null;
        java.awt.geom.Rectangle2D rectangle2D60 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawBackground(graphics2D58, categoryPlot59, rectangle2D60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(paint47);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator51);
        org.junit.Assert.assertNull(categoryToolTipGenerator55);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint11);
        java.awt.Font font13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer6.setBaseItemLabelFont(font13);
        java.awt.Paint paint16 = statisticalBarRenderer6.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer0.setSeriesFillPaint((int) '#', paint16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 0);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        java.lang.Boolean boolean23 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) (byte) 10);
        java.awt.Paint paint26 = statisticalBarRenderer0.getItemOutlinePaint(100, (int) '4');
        org.jfree.chart.LegendItem legendItem29 = statisticalBarRenderer0.getLegendItem(10, (int) (byte) 0);
        java.lang.Boolean boolean31 = statisticalBarRenderer0.getSeriesItemLabelsVisible(0);
        java.awt.Paint paint33 = statisticalBarRenderer0.getSeriesOutlinePaint(10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator35, false);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 100.0f);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(legendItem29);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(paint33);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        int int9 = statisticalBarRenderer0.getColumnCount();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseItemLabelPaint();
        int int11 = statisticalBarRenderer0.getPassCount();
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) -1);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1L);
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getSeriesOutlineStroke(10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double20 = statisticalBarRenderer19.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = null;
        statisticalBarRenderer19.setSeriesPositiveItemLabelPosition(1, itemLabelPosition22, false);
        java.awt.Paint paint26 = statisticalBarRenderer19.getSeriesPaint(0);
        java.lang.Boolean boolean28 = statisticalBarRenderer19.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer29.setBaseOutlineStroke(stroke30);
        statisticalBarRenderer29.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer29.setBaseFillPaint(paint34);
        java.awt.Font font36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer29.setBaseItemLabelFont(font36);
        java.awt.Stroke stroke40 = statisticalBarRenderer29.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer19.setBaseOutlineStroke(stroke40);
        java.awt.Paint paint42 = statisticalBarRenderer19.getErrorIndicatorPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = statisticalBarRenderer19.getBaseURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer44.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer48.setBaseOutlineStroke(stroke49);
        statisticalBarRenderer48.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean53 = statisticalBarRenderer48.getBaseSeriesVisibleInLegend();
        boolean boolean54 = statisticalBarRenderer48.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer48.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer48.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer48.setBaseOutlinePaint(paint60);
        statisticalBarRenderer44.setSeriesItemLabelPaint(0, paint60);
        statisticalBarRenderer19.setBaseItemLabelPaint(paint60);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer65 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer65.setBaseOutlineStroke(stroke66);
        statisticalBarRenderer65.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint70 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer65.setBaseFillPaint(paint70);
        java.awt.Font font72 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer65.setBaseItemLabelFont(font72);
        boolean boolean74 = statisticalBarRenderer65.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition75 = statisticalBarRenderer65.getBaseNegativeItemLabelPosition();
        java.awt.Paint paint78 = statisticalBarRenderer65.getItemLabelPaint((-1), 10);
        java.awt.Stroke stroke80 = statisticalBarRenderer65.lookupSeriesStroke((int) '#');
        statisticalBarRenderer19.setSeriesOutlineStroke((int) 'a', stroke80, true);
        statisticalBarRenderer0.setSeriesStroke((int) '4', stroke80, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(categoryURLGenerator43);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(font72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition75);
        org.junit.Assert.assertNotNull(paint78);
        org.junit.Assert.assertNotNull(stroke80);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        java.awt.Shape shape3 = statisticalBarRenderer0.getBaseShape();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = statisticalBarRenderer0.hasListener(eventListener4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint12 = statisticalBarRenderer6.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseOutlinePaint(paint12, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double16 = statisticalBarRenderer15.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        statisticalBarRenderer15.setSeriesPositiveItemLabelPosition(1, itemLabelPosition18, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer21.setBaseOutlineStroke(stroke22);
        statisticalBarRenderer21.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer21.setBaseFillPaint(paint26);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = statisticalBarRenderer21.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer15.setBasePositiveItemLabelPosition(itemLabelPosition28);
        boolean boolean30 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer15);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Shape shape34 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 100);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shape34);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint12 = statisticalBarRenderer0.getBaseFillPaint();
        boolean boolean14 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (short) 0);
        java.awt.Paint paint16 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (short) 10);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(paint16);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = statisticalBarRenderer0.getURLGenerator((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getSeriesStroke((int) (byte) 10);
        java.awt.Paint paint17 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) 10);
        boolean boolean18 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        statisticalBarRenderer0.setBaseSeriesVisible(false, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryURLGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(stroke15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) 'a', (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) (short) -1, itemLabelPosition15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 10, categoryToolTipGenerator10);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer12 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke14);
        statisticalBarRenderer13.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer13.setBaseFillPaint(paint18);
        statisticalBarRenderer13.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint23 = statisticalBarRenderer13.getSeriesPaint((int) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer13.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer13.getSeriesPositiveItemLabelPosition((int) (byte) 100);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition26);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 1, (java.lang.Boolean) false);
        boolean boolean34 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Stroke stroke37 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(gradientPaintTransformer12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        statisticalBarRenderer0.setSeriesCreateEntities(100, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        statisticalBarRenderer12.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) true, false);
        java.awt.Stroke stroke19 = statisticalBarRenderer12.getBaseStroke();
        statisticalBarRenderer0.setBaseOutlineStroke(stroke19, false);
        java.awt.Paint paint24 = statisticalBarRenderer0.getItemOutlinePaint((int) (byte) -1, 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) -1, categoryURLGenerator26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        statisticalBarRenderer0.setMinimumBarLength((double) 1L);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke14);
        java.awt.Shape shape16 = statisticalBarRenderer13.getBaseShape();
        statisticalBarRenderer0.setSeriesShape(10, shape16);
        double double18 = statisticalBarRenderer0.getMaximumBarWidth();
        java.awt.Paint paint21 = statisticalBarRenderer0.getItemOutlinePaint((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer23.setBaseOutlineStroke(stroke24);
        statisticalBarRenderer23.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer23.setBaseFillPaint(paint28);
        java.awt.Font font30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer23.setBaseItemLabelFont(font30);
        boolean boolean32 = statisticalBarRenderer23.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer23.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition33);
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 10, (java.lang.Boolean) false, false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = statisticalBarRenderer0.getBaseURLGenerator();
        statisticalBarRenderer0.setMinimumBarLength((double) (byte) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) '4', (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer18.setBaseOutlineStroke(stroke19);
        statisticalBarRenderer18.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean23 = statisticalBarRenderer18.getBaseSeriesVisibleInLegend();
        boolean boolean24 = statisticalBarRenderer18.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer18.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer18.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint30 = statisticalBarRenderer18.getBaseFillPaint();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesPaint((int) (short) -1, paint30, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(categoryURLGenerator11);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint18);
        java.awt.Stroke stroke21 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        boolean boolean24 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer16.setBaseOutlineStroke(stroke17);
        statisticalBarRenderer16.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer16.setBaseFillPaint(paint21);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer16.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer25.setBaseOutlineStroke(stroke26);
        statisticalBarRenderer25.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer25.setBaseFillPaint(paint30);
        java.awt.Font font32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer25.setBaseItemLabelFont(font32);
        boolean boolean36 = statisticalBarRenderer25.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer25.setSeriesItemLabelPaint((int) (byte) 1, paint38, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation41 = null;
        boolean boolean42 = statisticalBarRenderer25.removeAnnotation(categoryAnnotation41);
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer25.setBaseFillPaint(paint43);
        statisticalBarRenderer16.setSeriesOutlinePaint((int) '#', paint43);
        double double46 = statisticalBarRenderer16.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer48.setBaseOutlineStroke(stroke49);
        statisticalBarRenderer48.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean53 = statisticalBarRenderer48.getBaseSeriesVisibleInLegend();
        boolean boolean54 = statisticalBarRenderer48.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer48.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer48.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer48.setBaseOutlinePaint(paint60);
        statisticalBarRenderer16.setSeriesItemLabelPaint((int) '#', paint60);
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 10, paint60);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation64 = null;
        boolean boolean65 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation64);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        double double5 = statisticalBarRenderer0.getBase();
        double double6 = statisticalBarRenderer0.getBase();
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getSeriesStroke((int) (short) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 0, categoryURLGenerator10, false);
        boolean boolean13 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.util.EventListener eventListener14 = null;
        boolean boolean15 = statisticalBarRenderer0.hasListener(eventListener14);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer8.setBaseOutlineStroke(stroke9);
        statisticalBarRenderer8.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer8.setBaseFillPaint(paint13);
        java.awt.Font font15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer8.setBaseItemLabelFont(font15);
        java.awt.Stroke stroke19 = statisticalBarRenderer8.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer21.setBaseOutlineStroke(stroke22);
        statisticalBarRenderer21.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean26 = statisticalBarRenderer21.getBaseSeriesVisibleInLegend();
        boolean boolean27 = statisticalBarRenderer21.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer21.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer21.setAutoPopulateSeriesFillPaint(false);
        statisticalBarRenderer21.setAutoPopulateSeriesShape(false);
        statisticalBarRenderer21.setBase(1.0d);
        java.awt.Paint paint38 = statisticalBarRenderer21.lookupSeriesPaint(0);
        statisticalBarRenderer8.setSeriesOutlinePaint(0, paint38);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint38);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.awt.Paint paint8 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer9.setBaseOutlineStroke(stroke10);
        statisticalBarRenderer9.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint14);
        java.awt.Font font16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer9.setBaseItemLabelFont(font16);
        java.awt.Stroke stroke20 = statisticalBarRenderer9.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke23 = statisticalBarRenderer9.getItemStroke((int) (short) 1, (int) ' ');
        statisticalBarRenderer9.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer9.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition27);
        java.lang.Boolean boolean30 = statisticalBarRenderer0.getSeriesCreateEntities(1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNull(boolean30);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Shape shape5 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) -1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.lookupSeriesStroke((int) '#');
        int int12 = statisticalBarRenderer0.getRowCount();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double16 = statisticalBarRenderer15.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        statisticalBarRenderer15.setSeriesPositiveItemLabelPosition(1, itemLabelPosition18, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer21.setBaseOutlineStroke(stroke22);
        statisticalBarRenderer21.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer21.setBaseFillPaint(paint26);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = statisticalBarRenderer21.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer15.setBasePositiveItemLabelPosition(itemLabelPosition28);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition28);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double32 = statisticalBarRenderer31.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer31.setSeriesPositiveItemLabelPosition(1, itemLabelPosition34, false);
        java.awt.Paint paint38 = statisticalBarRenderer31.getSeriesPaint(0);
        java.lang.Boolean boolean40 = statisticalBarRenderer31.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer41.setBaseOutlineStroke(stroke42);
        statisticalBarRenderer41.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer41.setBaseFillPaint(paint46);
        java.awt.Font font48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer41.setBaseItemLabelFont(font48);
        java.awt.Stroke stroke52 = statisticalBarRenderer41.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer31.setBaseOutlineStroke(stroke52);
        java.awt.Paint paint54 = statisticalBarRenderer31.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBaseOutlinePaint(paint54);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator58 = statisticalBarRenderer0.getToolTipGenerator((int) 'a', (int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator59 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator59);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNull(categoryToolTipGenerator58);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        statisticalBarRenderer0.removeAnnotations();
        java.awt.Shape shape14 = statisticalBarRenderer0.getItemShape((int) (byte) 100, (int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer15.setBaseOutlineStroke(stroke16);
        statisticalBarRenderer15.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint20);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer15.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition22);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer24 = statisticalBarRenderer0.getGradientPaintTransformer();
        java.awt.Paint paint25 = null;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint25);
        boolean boolean29 = statisticalBarRenderer0.getItemVisible(1, (int) (short) 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(gradientPaintTransformer24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer11.setBaseOutlineStroke(stroke12);
        statisticalBarRenderer11.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer11.setBaseFillPaint(paint16);
        java.awt.Font font18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer11.setBaseItemLabelFont(font18);
        boolean boolean22 = statisticalBarRenderer11.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer11.setSeriesItemLabelPaint((int) (byte) 1, paint24, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation27 = null;
        boolean boolean28 = statisticalBarRenderer11.removeAnnotation(categoryAnnotation27);
        boolean boolean31 = statisticalBarRenderer11.isItemLabelVisible((int) ' ', (int) (byte) 1);
        java.awt.Paint paint33 = statisticalBarRenderer11.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setBaseFillPaint(paint33, true);
        boolean boolean36 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        boolean boolean37 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Shape shape39 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        java.awt.Paint paint42 = statisticalBarRenderer0.getItemLabelPaint((int) (short) 0, 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator44 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesToolTipGenerator((-1), categoryToolTipGenerator44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        double double23 = statisticalBarRenderer0.getUpperClip();
        java.awt.Paint paint26 = statisticalBarRenderer0.getItemPaint(10, (int) (short) 10);
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesFillPaint((int) (short) 100, paint30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke34 = statisticalBarRenderer32.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer32.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) true);
        statisticalBarRenderer32.setBaseSeriesVisible(true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator42 = null;
        statisticalBarRenderer32.setSeriesURLGenerator((int) 'a', categoryURLGenerator42);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer45.setBaseOutlineStroke(stroke46);
        statisticalBarRenderer45.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer45.setBaseFillPaint(paint50);
        statisticalBarRenderer45.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator55 = null;
        statisticalBarRenderer45.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator55, true);
        statisticalBarRenderer45.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier60 = statisticalBarRenderer45.getDrawingSupplier();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition62 = statisticalBarRenderer45.getSeriesNegativeItemLabelPosition((int) (short) 0);
        statisticalBarRenderer32.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition62, true);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition62);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNull(drawingSupplier60);
        org.junit.Assert.assertNotNull(itemLabelPosition62);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.LegendItem legendItem5 = statisticalBarRenderer0.getLegendItem(1, (int) (short) 1);
        boolean boolean7 = statisticalBarRenderer0.isSeriesVisibleInLegend(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer8.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        statisticalBarRenderer8.setMinimumBarLength((double) 1L);
        java.lang.Object obj17 = statisticalBarRenderer8.clone();
        java.awt.Paint paint20 = statisticalBarRenderer8.getItemOutlinePaint(1, 100);
        statisticalBarRenderer0.setBaseFillPaint(paint20);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) 'a');
        java.lang.Boolean boolean25 = statisticalBarRenderer0.getSeriesVisible(1);
        int int26 = statisticalBarRenderer0.getPassCount();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer0.getNegativeItemLabelPosition((-1), (int) (short) 100);
        statisticalBarRenderer0.setItemLabelAnchorOffset(0.0d);
        org.junit.Assert.assertNull(legendItem5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Shape shape5 = statisticalBarRenderer0.getBaseShape();
        java.awt.Paint paint8 = statisticalBarRenderer0.getItemFillPaint(10, (int) (byte) -1);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = statisticalBarRenderer0.getToolTipGenerator(10, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer15.setBaseOutlineStroke(stroke16);
        statisticalBarRenderer15.setAutoPopulateSeriesOutlinePaint(true);
        double double20 = statisticalBarRenderer15.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer21.setBaseOutlineStroke(stroke22);
        statisticalBarRenderer21.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer21.setBaseFillPaint(paint26);
        java.awt.Font font28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer21.setBaseItemLabelFont(font28);
        java.awt.Stroke stroke32 = statisticalBarRenderer21.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke35 = statisticalBarRenderer21.getItemStroke((int) (short) 1, (int) ' ');
        statisticalBarRenderer15.setBaseOutlineStroke(stroke35);
        java.awt.Shape shape39 = statisticalBarRenderer15.getItemShape((int) '#', (int) (short) 1);
        boolean boolean40 = statisticalBarRenderer15.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer42.setBaseOutlineStroke(stroke43);
        statisticalBarRenderer42.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean47 = statisticalBarRenderer42.getBaseSeriesVisibleInLegend();
        boolean boolean48 = statisticalBarRenderer42.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = statisticalBarRenderer42.getBaseItemLabelGenerator();
        boolean boolean51 = statisticalBarRenderer42.isSeriesVisible(0);
        statisticalBarRenderer42.setSeriesItemLabelsVisible((int) ' ', true);
        java.awt.Paint paint55 = statisticalBarRenderer42.getBaseItemLabelPaint();
        statisticalBarRenderer15.setSeriesPaint((int) (byte) 10, paint55, true);
        statisticalBarRenderer0.setSeriesFillPaint((int) (byte) 10, paint55, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryToolTipGenerator13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer13.setMaximumBarWidth((double) 100L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double17 = statisticalBarRenderer16.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = null;
        statisticalBarRenderer16.setSeriesPositiveItemLabelPosition(1, itemLabelPosition19, false);
        java.awt.Paint paint23 = statisticalBarRenderer16.getSeriesPaint(0);
        java.lang.Boolean boolean25 = statisticalBarRenderer16.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer26.setBaseOutlineStroke(stroke27);
        statisticalBarRenderer26.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer26.setBaseFillPaint(paint31);
        java.awt.Font font33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer26.setBaseItemLabelFont(font33);
        java.awt.Stroke stroke37 = statisticalBarRenderer26.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer16.setBaseOutlineStroke(stroke37);
        java.awt.Paint paint39 = statisticalBarRenderer16.getErrorIndicatorPaint();
        statisticalBarRenderer13.setBaseOutlinePaint(paint39);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer13.getSeriesPositiveItemLabelPosition((int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double44 = statisticalBarRenderer43.getBase();
        java.awt.Paint paint47 = statisticalBarRenderer43.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer13.setBaseItemLabelPaint(paint47);
        statisticalBarRenderer0.setBaseOutlinePaint(paint47);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer50 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition51 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(gradientPaintTransformer50);
        org.junit.Assert.assertNull(itemLabelPosition51);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer11.setBaseOutlineStroke(stroke12);
        statisticalBarRenderer11.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer11.setBaseFillPaint(paint16);
        java.awt.Font font18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer11.setBaseItemLabelFont(font18);
        boolean boolean22 = statisticalBarRenderer11.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer11.setSeriesItemLabelPaint((int) (byte) 1, paint24, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation27 = null;
        boolean boolean28 = statisticalBarRenderer11.removeAnnotation(categoryAnnotation27);
        boolean boolean31 = statisticalBarRenderer11.isItemLabelVisible((int) ' ', (int) (byte) 1);
        java.awt.Paint paint33 = statisticalBarRenderer11.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setBaseFillPaint(paint33, true);
        boolean boolean36 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        boolean boolean37 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Shape shape39 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        java.awt.Paint paint40 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 1, false);
        java.lang.Object obj10 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPosition(10, (int) (short) 100);
        org.jfree.chart.event.RendererChangeListener rendererChangeListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.removeChangeListener(rendererChangeListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        java.awt.Shape shape3 = statisticalBarRenderer0.getBaseShape();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = statisticalBarRenderer0.hasListener(eventListener4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint12 = statisticalBarRenderer6.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseOutlinePaint(paint12, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer15.setBaseOutlineStroke(stroke16);
        statisticalBarRenderer15.setAutoPopulateSeriesOutlinePaint(true);
        double double20 = statisticalBarRenderer15.getBase();
        java.awt.Stroke stroke21 = statisticalBarRenderer15.getBaseStroke();
        statisticalBarRenderer0.setBaseStroke(stroke21);
        double double23 = statisticalBarRenderer0.getMinimumBarLength();
        boolean boolean26 = statisticalBarRenderer0.getItemVisible(100, (int) (byte) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = statisticalBarRenderer0.getURLGenerator((int) 'a', (int) (short) 0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(categoryURLGenerator29);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        java.awt.Paint paint23 = statisticalBarRenderer0.getErrorIndicatorPaint();
        double double24 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer25.setBaseOutlineStroke(stroke26);
        statisticalBarRenderer25.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer31.setBaseOutlineStroke(stroke32);
        statisticalBarRenderer31.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer31.setBaseFillPaint(paint36);
        java.awt.Font font38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer31.setBaseItemLabelFont(font38);
        java.awt.Paint paint41 = statisticalBarRenderer31.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer25.setSeriesFillPaint((int) '#', paint41);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator44 = statisticalBarRenderer25.getSeriesItemLabelGenerator((int) (short) 0);
        java.awt.Paint paint47 = statisticalBarRenderer25.getItemOutlinePaint((-1), (int) (short) 0);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint47, false);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer50 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator53 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.LegendItem legendItem56 = statisticalBarRenderer0.getLegendItem((int) (short) 100, (int) (byte) 0);
        statisticalBarRenderer0.setMaximumBarWidth((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(categoryItemLabelGenerator44);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(gradientPaintTransformer50);
        org.junit.Assert.assertNull(categoryItemLabelGenerator52);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator53);
        org.junit.Assert.assertNull(legendItem56);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) ' ');
        boolean boolean14 = statisticalBarRenderer0.getItemVisible((int) (byte) 0, (int) '#');
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        java.awt.Shape shape19 = statisticalBarRenderer0.getItemShape((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator11, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint18);
        java.awt.Stroke stroke21 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer24.setBaseOutlineStroke(stroke25);
        statisticalBarRenderer24.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint30 = statisticalBarRenderer24.lookupSeriesOutlinePaint((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double32 = statisticalBarRenderer31.getBase();
        java.awt.Paint paint35 = statisticalBarRenderer31.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer24.setErrorIndicatorPaint(paint35);
        statisticalBarRenderer0.setBaseOutlinePaint(paint35);
        java.awt.Stroke stroke39 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke(1, stroke39, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) -1, 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(itemLabelPosition44);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        java.lang.Boolean boolean13 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 10);
        java.awt.Paint paint15 = statisticalBarRenderer0.lookupSeriesPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(itemLabelPosition16);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        boolean boolean23 = statisticalBarRenderer0.getBaseSeriesVisible();
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        java.awt.Stroke stroke26 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Paint paint27 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = statisticalBarRenderer0.getItemLabelGenerator((int) (byte) 0, (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer31.setBaseOutlineStroke(stroke32);
        statisticalBarRenderer31.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint38 = statisticalBarRenderer31.getItemLabelPaint(100, (int) (short) 0);
        java.awt.Paint paint39 = statisticalBarRenderer31.getBaseOutlinePaint();
        statisticalBarRenderer0.setErrorIndicatorPaint(paint39);
        java.awt.Paint paint41 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(categoryItemLabelGenerator30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPosition(10, (int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) -1, (int) '4');
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        statisticalBarRenderer0.removeAnnotations();
        java.awt.Shape shape14 = statisticalBarRenderer0.getItemShape((int) (byte) 100, (int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator15 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator15);
        boolean boolean17 = statisticalBarRenderer0.isDrawBarOutline();
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer19.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer19.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        statisticalBarRenderer19.setMinimumBarLength((double) 1L);
        boolean boolean28 = statisticalBarRenderer19.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke31 = statisticalBarRenderer29.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer29.setSeriesItemLabelsVisible((int) '4', (java.lang.Boolean) true);
        statisticalBarRenderer29.setBaseSeriesVisible(true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator39 = null;
        statisticalBarRenderer29.setSeriesURLGenerator((int) 'a', categoryURLGenerator39);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer42.setBaseOutlineStroke(stroke43);
        statisticalBarRenderer42.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer42.setBaseFillPaint(paint47);
        statisticalBarRenderer42.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator52 = null;
        statisticalBarRenderer42.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator52, true);
        statisticalBarRenderer42.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier57 = statisticalBarRenderer42.getDrawingSupplier();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition59 = statisticalBarRenderer42.getSeriesNegativeItemLabelPosition((int) (short) 0);
        statisticalBarRenderer29.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition59, true);
        statisticalBarRenderer19.setBasePositiveItemLabelPosition(itemLabelPosition59, true);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition59);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator66 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) ' ', categoryToolTipGenerator66, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(drawingSupplier57);
        org.junit.Assert.assertNotNull(itemLabelPosition59);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer11.setBaseOutlineStroke(stroke12);
        statisticalBarRenderer11.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer11.setBaseFillPaint(paint16);
        java.awt.Font font18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer11.setBaseItemLabelFont(font18);
        boolean boolean22 = statisticalBarRenderer11.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer11.setSeriesItemLabelPaint((int) (byte) 1, paint24, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation27 = null;
        boolean boolean28 = statisticalBarRenderer11.removeAnnotation(categoryAnnotation27);
        boolean boolean31 = statisticalBarRenderer11.isItemLabelVisible((int) ' ', (int) (byte) 1);
        java.awt.Paint paint33 = statisticalBarRenderer11.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setBaseFillPaint(paint33, true);
        boolean boolean36 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        boolean boolean37 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Shape shape39 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        java.awt.Stroke stroke40 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(shape39);
        org.junit.Assert.assertNotNull(stroke40);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = statisticalBarRenderer0.getDrawingSupplier();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer0.getLegendItemURLGenerator();
        int int19 = statisticalBarRenderer0.getColumnCount();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 100, (java.lang.Boolean) true, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer25.setBaseOutlineStroke(stroke26);
        statisticalBarRenderer25.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean30 = statisticalBarRenderer25.getBaseSeriesVisibleInLegend();
        boolean boolean31 = statisticalBarRenderer25.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer25.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer25.setAutoPopulateSeriesFillPaint(false);
        java.awt.Stroke stroke38 = statisticalBarRenderer25.lookupSeriesStroke(0);
        statisticalBarRenderer0.setSeriesStroke(0, stroke38);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(drawingSupplier15);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        boolean boolean20 = statisticalBarRenderer0.isItemLabelVisible((int) ' ', (int) (byte) 1);
        java.awt.Paint paint22 = statisticalBarRenderer0.lookupSeriesPaint((int) (byte) 0);
        java.awt.Paint paint23 = statisticalBarRenderer0.getErrorIndicatorPaint();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false, true);
        java.awt.Stroke stroke29 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 100);
        boolean boolean31 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) -1);
        double double32 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer33.setBaseOutlineStroke(stroke34);
        statisticalBarRenderer33.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer33.setBaseFillPaint(paint38);
        java.awt.Font font40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer33.setBaseItemLabelFont(font40);
        java.awt.Stroke stroke44 = statisticalBarRenderer33.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition45 = statisticalBarRenderer33.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition45);
        java.awt.Paint paint49 = statisticalBarRenderer0.getItemOutlinePaint((int) '4', 0);
        boolean boolean50 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator52 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(10, categoryURLGenerator52);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(stroke29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(font40);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(itemLabelPosition45);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint11);
        java.awt.Font font13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer6.setBaseItemLabelFont(font13);
        java.awt.Paint paint16 = statisticalBarRenderer6.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer0.setSeriesFillPaint((int) '#', paint16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 0);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        java.lang.Boolean boolean23 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) (byte) 10);
        java.awt.Paint paint26 = statisticalBarRenderer0.getItemOutlinePaint(100, (int) '4');
        org.jfree.chart.LegendItem legendItem29 = statisticalBarRenderer0.getLegendItem(10, (int) (byte) 0);
        java.lang.Boolean boolean31 = statisticalBarRenderer0.getSeriesItemLabelsVisible(0);
        java.awt.Paint paint33 = statisticalBarRenderer0.getSeriesOutlinePaint(10);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 100, (java.lang.Boolean) true, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) '#', (int) (byte) 0);
        java.awt.Stroke stroke41 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = statisticalBarRenderer0.getPlot();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(legendItem29);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(categoryPlot42);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        java.awt.Shape shape3 = statisticalBarRenderer0.getBaseShape();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = statisticalBarRenderer0.hasListener(eventListener4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint12 = statisticalBarRenderer6.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseOutlinePaint(paint12, false);
        java.awt.Paint paint15 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer9.setBaseOutlineStroke(stroke10);
        statisticalBarRenderer9.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint14);
        statisticalBarRenderer9.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint19 = statisticalBarRenderer9.getSeriesPaint((int) '#');
        statisticalBarRenderer9.setBaseItemLabelsVisible(true);
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer9.setSeriesOutlineStroke((int) '4', stroke23);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 100, stroke23, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 100, (int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer32.setBaseOutlineStroke(stroke33);
        statisticalBarRenderer32.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean37 = statisticalBarRenderer32.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = null;
        statisticalBarRenderer32.setLegendItemToolTipGenerator(categorySeriesLabelGenerator38);
        double double40 = statisticalBarRenderer32.getMinimumBarLength();
        double double41 = statisticalBarRenderer32.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer42.setBaseOutlineStroke(stroke43);
        statisticalBarRenderer42.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer42.setBaseFillPaint(paint47);
        java.awt.Font font49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer42.setBaseItemLabelFont(font49);
        java.awt.Stroke stroke53 = statisticalBarRenderer42.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer54 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer54.setBaseOutlineStroke(stroke55);
        statisticalBarRenderer54.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint59 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer54.setBaseFillPaint(paint59);
        java.awt.Font font61 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer54.setBaseItemLabelFont(font61);
        boolean boolean63 = statisticalBarRenderer54.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = statisticalBarRenderer54.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer42.setBaseNegativeItemLabelPosition(itemLabelPosition64, false);
        statisticalBarRenderer32.setBaseNegativeItemLabelPosition(itemLabelPosition64);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition64);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(categoryURLGenerator28);
        org.junit.Assert.assertNull(categoryItemLabelGenerator31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.2d + "'", double41 == 0.2d);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(font61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition64);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer9.setBaseOutlineStroke(stroke10);
        statisticalBarRenderer9.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint14);
        java.awt.Font font16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer9.setBaseItemLabelFont(font16);
        boolean boolean20 = statisticalBarRenderer9.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer9.setSeriesItemLabelPaint((int) (byte) 1, paint22, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        boolean boolean26 = statisticalBarRenderer9.removeAnnotation(categoryAnnotation25);
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint27);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '#', paint27);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer33.setBaseOutlineStroke(stroke34);
        statisticalBarRenderer33.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer33.setBaseFillPaint(paint38);
        statisticalBarRenderer33.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint43 = statisticalBarRenderer33.getSeriesPaint((int) '#');
        statisticalBarRenderer33.removeAnnotations();
        java.awt.Shape shape47 = statisticalBarRenderer33.getItemShape((int) (byte) 100, (int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator48 = null;
        statisticalBarRenderer33.setBaseToolTipGenerator(categoryToolTipGenerator48);
        boolean boolean50 = statisticalBarRenderer33.isDrawBarOutline();
        java.awt.Shape shape53 = statisticalBarRenderer33.getItemShape(1, (int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke56 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer55.setBaseOutlineStroke(stroke56);
        statisticalBarRenderer55.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer55.setBaseFillPaint(paint60);
        java.awt.Font font62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer55.setBaseItemLabelFont(font62);
        boolean boolean66 = statisticalBarRenderer55.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint68 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer55.setSeriesItemLabelPaint((int) (byte) 1, paint68, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation71 = null;
        boolean boolean72 = statisticalBarRenderer55.removeAnnotation(categoryAnnotation71);
        boolean boolean75 = statisticalBarRenderer55.isItemLabelVisible((int) ' ', (int) (byte) 1);
        java.awt.Paint paint77 = statisticalBarRenderer55.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer33.setSeriesOutlinePaint((int) '4', paint77);
        boolean boolean79 = statisticalBarRenderer0.equals((java.lang.Object) '4');
        boolean boolean81 = statisticalBarRenderer0.isSeriesItemLabelsVisible(10);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(paint43);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(paint77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1L);
        java.awt.Paint paint9 = statisticalBarRenderer0.getSeriesFillPaint(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        statisticalBarRenderer10.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint20 = statisticalBarRenderer10.getSeriesPaint((int) '#');
        statisticalBarRenderer10.setBaseItemLabelsVisible(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = null;
        statisticalBarRenderer10.setSeriesURLGenerator(0, categoryURLGenerator24, true);
        int int27 = statisticalBarRenderer10.getRowCount();
        double double28 = statisticalBarRenderer10.getMinimumBarLength();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer10.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator29);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator29);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        double double23 = statisticalBarRenderer0.getUpperClip();
        java.awt.Paint paint26 = statisticalBarRenderer0.getItemPaint(10, (int) (short) 10);
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double30 = statisticalBarRenderer29.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = null;
        statisticalBarRenderer29.setSeriesPositiveItemLabelPosition(1, itemLabelPosition32, false);
        java.awt.Paint paint36 = statisticalBarRenderer29.getSeriesPaint(0);
        java.lang.Boolean boolean38 = statisticalBarRenderer29.getSeriesCreateEntities((int) (short) 1);
        int int39 = statisticalBarRenderer29.getColumnCount();
        java.awt.Stroke stroke40 = statisticalBarRenderer29.getBaseStroke();
        java.awt.Paint paint43 = statisticalBarRenderer29.getItemOutlinePaint((int) 'a', (int) (short) 0);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint43, true);
        boolean boolean48 = statisticalBarRenderer0.getItemCreateEntity(1, 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNull(paint36);
        org.junit.Assert.assertNull(boolean38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Shape shape5 = statisticalBarRenderer0.getBaseShape();
        java.awt.Paint paint8 = statisticalBarRenderer0.getItemFillPaint(10, (int) (byte) -1);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean10 = statisticalBarRenderer0.getIncludeBaseInRange();
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseItemLabelPaint();
        int int11 = statisticalBarRenderer0.getPassCount();
        java.awt.Stroke stroke12 = statisticalBarRenderer0.getBaseStroke();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer3.setBaseOutlineStroke(stroke4);
        java.awt.Shape shape6 = statisticalBarRenderer3.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator9, true);
        java.awt.Font font13 = statisticalBarRenderer0.getSeriesItemLabelFont(100);
        java.awt.Font font15 = statisticalBarRenderer0.getSeriesItemLabelFont((-1));
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(font13);
        org.junit.Assert.assertNull(font15);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint18);
        java.awt.Stroke stroke20 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(0, categoryURLGenerator22);
        double double24 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 10, shape26, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer29.setBaseOutlineStroke(stroke30);
        java.awt.Shape shape32 = statisticalBarRenderer29.getBaseShape();
        java.awt.Paint paint34 = statisticalBarRenderer29.getSeriesFillPaint((int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer35.setBaseOutlineStroke(stroke36);
        statisticalBarRenderer35.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer35.setBaseFillPaint(paint40);
        statisticalBarRenderer35.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint45 = statisticalBarRenderer35.getSeriesPaint((int) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = statisticalBarRenderer35.getBasePositiveItemLabelPosition();
        statisticalBarRenderer29.setBasePositiveItemLabelPosition(itemLabelPosition46);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition46);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double50 = statisticalBarRenderer49.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = null;
        statisticalBarRenderer49.setSeriesPositiveItemLabelPosition(1, itemLabelPosition52, false);
        java.awt.Paint paint56 = statisticalBarRenderer49.getSeriesPaint(0);
        java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer49.setBaseStroke(stroke57);
        java.awt.Font font59 = statisticalBarRenderer49.getBaseItemLabelFont();
        statisticalBarRenderer0.setBaseItemLabelFont(font59);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(paint45);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNull(paint56);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(font59);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer6.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition13);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer15.setBaseOutlineStroke(stroke16);
        statisticalBarRenderer15.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean20 = statisticalBarRenderer15.getBaseSeriesVisibleInLegend();
        boolean boolean21 = statisticalBarRenderer15.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer15.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer15.setIncludeBaseInRange(true);
        java.lang.Boolean boolean28 = statisticalBarRenderer15.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer29.setBaseOutlineStroke(stroke30);
        statisticalBarRenderer29.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer29.setBaseFillPaint(paint34);
        statisticalBarRenderer29.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint39 = statisticalBarRenderer29.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        statisticalBarRenderer29.setBaseItemLabelGenerator(categoryItemLabelGenerator40, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = statisticalBarRenderer29.getLegendItemLabelGenerator();
        statisticalBarRenderer15.setLegendItemLabelGenerator(categorySeriesLabelGenerator43);
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator43);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        java.awt.Stroke stroke49 = statisticalBarRenderer0.getBaseOutlineStroke();
        boolean boolean52 = statisticalBarRenderer0.getItemCreateEntity((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator43);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint11 = statisticalBarRenderer0.getItemFillPaint((int) (byte) 100, (int) (short) 0);
        double double12 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke14);
        statisticalBarRenderer13.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer13.setBaseFillPaint(paint18);
        statisticalBarRenderer13.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint23 = statisticalBarRenderer13.getSeriesPaint((int) '#');
        java.awt.Paint paint24 = statisticalBarRenderer13.getBaseOutlinePaint();
        boolean boolean25 = statisticalBarRenderer13.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer26.setBaseOutlineStroke(stroke27);
        java.awt.Shape shape29 = statisticalBarRenderer26.getBaseShape();
        java.awt.Paint paint31 = statisticalBarRenderer26.getSeriesFillPaint((int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer32.setBaseOutlineStroke(stroke33);
        statisticalBarRenderer32.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer32.setBaseFillPaint(paint37);
        statisticalBarRenderer32.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint42 = statisticalBarRenderer32.getSeriesPaint((int) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = statisticalBarRenderer32.getBasePositiveItemLabelPosition();
        statisticalBarRenderer26.setBasePositiveItemLabelPosition(itemLabelPosition43);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer45.setBaseOutlineStroke(stroke46);
        statisticalBarRenderer45.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean50 = statisticalBarRenderer45.getBaseSeriesVisibleInLegend();
        boolean boolean51 = statisticalBarRenderer45.getAutoPopulateSeriesOutlineStroke();
        double double52 = statisticalBarRenderer45.getMinimumBarLength();
        double double53 = statisticalBarRenderer45.getItemLabelAnchorOffset();
        statisticalBarRenderer45.setItemLabelAnchorOffset((double) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator56 = statisticalBarRenderer45.getLegendItemLabelGenerator();
        statisticalBarRenderer26.setLegendItemToolTipGenerator(categorySeriesLabelGenerator56);
        statisticalBarRenderer13.setLegendItemToolTipGenerator(categorySeriesLabelGenerator56);
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator56);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNull(paint31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 2.0d + "'", double53 == 2.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator56);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.awt.Paint paint10 = statisticalBarRenderer0.getItemFillPaint((int) (short) 1, 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer11.setBaseOutlineStroke(stroke12);
        statisticalBarRenderer11.setAutoPopulateSeriesOutlinePaint(true);
        double double16 = statisticalBarRenderer11.getBase();
        statisticalBarRenderer11.setSeriesVisible((int) (byte) 0, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer20.setBaseOutlineStroke(stroke21);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer20.setBaseFillPaint(paint25);
        java.awt.Font font27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer20.setBaseItemLabelFont(font27);
        java.awt.Stroke stroke31 = statisticalBarRenderer20.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer32.setBaseOutlineStroke(stroke33);
        statisticalBarRenderer32.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer32.setBaseFillPaint(paint37);
        java.awt.Font font39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer32.setBaseItemLabelFont(font39);
        boolean boolean41 = statisticalBarRenderer32.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer32.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer20.setBaseNegativeItemLabelPosition(itemLabelPosition42, false);
        statisticalBarRenderer11.setBasePositiveItemLabelPosition(itemLabelPosition42, false);
        boolean boolean47 = statisticalBarRenderer11.isDrawBarOutline();
        boolean boolean48 = statisticalBarRenderer11.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double50 = statisticalBarRenderer49.getBase();
        java.awt.Paint paint53 = statisticalBarRenderer49.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer11.setBaseOutlinePaint(paint53, false);
        statisticalBarRenderer0.setBasePaint(paint53);
        java.lang.Boolean boolean58 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) (short) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator60 = statisticalBarRenderer0.getSeriesItemLabelGenerator((-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator61 = statisticalBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNull(boolean58);
        org.junit.Assert.assertNull(categoryItemLabelGenerator60);
        org.junit.Assert.assertNull(categoryURLGenerator61);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer21.setBaseOutlineStroke(stroke22);
        statisticalBarRenderer21.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean26 = statisticalBarRenderer21.getBaseSeriesVisibleInLegend();
        boolean boolean27 = statisticalBarRenderer21.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer21.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer21.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setBaseOutlinePaint(paint33);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (short) 100, paint33);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer36.setBaseOutlineStroke(stroke37);
        statisticalBarRenderer36.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer36.setBaseFillPaint(paint41);
        statisticalBarRenderer36.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint46 = statisticalBarRenderer36.getSeriesPaint((int) '#');
        statisticalBarRenderer36.removeAnnotations();
        java.awt.Shape shape50 = statisticalBarRenderer36.getItemShape((int) (byte) 100, (int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = statisticalBarRenderer36.getNegativeItemLabelPosition((int) (short) 100, (int) '#');
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition53, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer56.setBaseOutlineStroke(stroke57);
        statisticalBarRenderer56.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint61 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer56.setBaseFillPaint(paint61);
        java.awt.Font font63 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer56.setBaseItemLabelFont(font63);
        boolean boolean65 = statisticalBarRenderer56.getAutoPopulateSeriesStroke();
        java.awt.Paint paint66 = statisticalBarRenderer56.getBaseItemLabelPaint();
        int int67 = statisticalBarRenderer56.getPassCount();
        java.awt.Paint paint69 = statisticalBarRenderer56.lookupSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator71 = null;
        statisticalBarRenderer56.setSeriesToolTipGenerator((int) 'a', categoryToolTipGenerator71, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator74 = statisticalBarRenderer56.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator74);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(itemLabelPosition53);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(font63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator74);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer7.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer7.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        java.awt.Shape shape16 = statisticalBarRenderer7.getItemShape(1, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer17.setBaseOutlineStroke(stroke18);
        statisticalBarRenderer17.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer17.setBaseFillPaint(paint22);
        statisticalBarRenderer17.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint27 = statisticalBarRenderer17.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = null;
        statisticalBarRenderer17.setBaseItemLabelGenerator(categoryItemLabelGenerator28, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer17.getLegendItemLabelGenerator();
        statisticalBarRenderer7.setLegendItemLabelGenerator(categorySeriesLabelGenerator31);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator31);
        java.awt.Shape shape36 = statisticalBarRenderer0.getItemShape((int) (byte) 100, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        java.awt.Shape shape39 = statisticalBarRenderer0.lookupSeriesShape((-1));
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNull(itemLabelPosition37);
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.awt.Paint paint8 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer9.setBaseOutlineStroke(stroke10);
        statisticalBarRenderer9.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint14);
        java.awt.Font font16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer9.setBaseItemLabelFont(font16);
        java.awt.Stroke stroke20 = statisticalBarRenderer9.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke23 = statisticalBarRenderer9.getItemStroke((int) (short) 1, (int) ' ');
        statisticalBarRenderer9.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer9.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition27);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNull(categoryURLGenerator30);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Paint paint13 = statisticalBarRenderer0.getItemOutlinePaint(1, 10);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator17, false);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, (java.lang.Boolean) false);
        java.awt.Font font23 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator1 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke3 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer2.setBaseOutlineStroke(stroke3);
        statisticalBarRenderer2.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean7 = statisticalBarRenderer2.getBaseSeriesVisibleInLegend();
        boolean boolean8 = statisticalBarRenderer2.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer2.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double13 = statisticalBarRenderer12.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = null;
        statisticalBarRenderer12.setSeriesPositiveItemLabelPosition(1, itemLabelPosition15, false);
        java.awt.Paint paint19 = statisticalBarRenderer12.getSeriesPaint(0);
        java.lang.Boolean boolean21 = statisticalBarRenderer12.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer22.setBaseOutlineStroke(stroke23);
        statisticalBarRenderer22.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer22.setBaseFillPaint(paint27);
        java.awt.Font font29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer22.setBaseItemLabelFont(font29);
        java.awt.Stroke stroke33 = statisticalBarRenderer22.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer12.setBaseOutlineStroke(stroke33);
        java.awt.Paint paint35 = statisticalBarRenderer12.getErrorIndicatorPaint();
        double double36 = statisticalBarRenderer12.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer37.setBaseOutlineStroke(stroke38);
        statisticalBarRenderer37.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer43.setBaseOutlineStroke(stroke44);
        statisticalBarRenderer43.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer43.setBaseFillPaint(paint48);
        java.awt.Font font50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer43.setBaseItemLabelFont(font50);
        java.awt.Paint paint53 = statisticalBarRenderer43.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer37.setSeriesFillPaint((int) '#', paint53);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = statisticalBarRenderer37.getSeriesItemLabelGenerator((int) (short) 0);
        java.awt.Paint paint59 = statisticalBarRenderer37.getItemOutlinePaint((-1), (int) (short) 0);
        statisticalBarRenderer12.setBaseItemLabelPaint(paint59, false);
        statisticalBarRenderer2.setSeriesFillPaint((int) (short) 1, paint59);
        statisticalBarRenderer0.setBaseFillPaint(paint59);
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(font50);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNull(categoryItemLabelGenerator56);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.LegendItem legendItem5 = statisticalBarRenderer0.getLegendItem(1, (int) (short) 1);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 100, (java.lang.Boolean) false);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNull(legendItem5);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean4 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Paint paint7 = statisticalBarRenderer0.getItemPaint((int) (byte) 1, (-1));
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 0);
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 10);
        boolean boolean13 = statisticalBarRenderer0.isSeriesVisibleInLegend(1);
        java.awt.Shape shape16 = statisticalBarRenderer0.getItemShape((int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator5 = statisticalBarRenderer0.getToolTipGenerator((int) '#', (int) ' ');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent7 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent7);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double10 = statisticalBarRenderer9.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition(1, itemLabelPosition12, false);
        java.awt.Paint paint16 = statisticalBarRenderer9.getSeriesPaint(0);
        java.awt.Paint paint19 = statisticalBarRenderer9.getItemFillPaint((int) (short) 1, 10);
        statisticalBarRenderer9.setIncludeBaseInRange(false);
        boolean boolean22 = statisticalBarRenderer9.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer23.setBaseOutlineStroke(stroke24);
        statisticalBarRenderer23.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer23.setBaseFillPaint(paint28);
        java.awt.Font font30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer23.setBaseItemLabelFont(font30);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = null;
        statisticalBarRenderer23.setSeriesToolTipGenerator((int) (short) 10, categoryToolTipGenerator33);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer35 = statisticalBarRenderer23.getGradientPaintTransformer();
        statisticalBarRenderer9.setGradientPaintTransformer(gradientPaintTransformer35);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer37.setBaseOutlineStroke(stroke38);
        java.awt.Shape shape40 = statisticalBarRenderer37.getBaseShape();
        java.awt.Paint paint42 = statisticalBarRenderer37.getSeriesFillPaint((int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer43.setBaseOutlineStroke(stroke44);
        statisticalBarRenderer43.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer43.setBaseFillPaint(paint48);
        statisticalBarRenderer43.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint53 = statisticalBarRenderer43.getSeriesPaint((int) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition54 = statisticalBarRenderer43.getBasePositiveItemLabelPosition();
        statisticalBarRenderer37.setBasePositiveItemLabelPosition(itemLabelPosition54);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer56.setBaseOutlineStroke(stroke57);
        statisticalBarRenderer56.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean61 = statisticalBarRenderer56.getBaseSeriesVisibleInLegend();
        boolean boolean62 = statisticalBarRenderer56.getAutoPopulateSeriesOutlineStroke();
        double double63 = statisticalBarRenderer56.getMinimumBarLength();
        double double64 = statisticalBarRenderer56.getItemLabelAnchorOffset();
        statisticalBarRenderer56.setItemLabelAnchorOffset((double) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator67 = statisticalBarRenderer56.getLegendItemLabelGenerator();
        statisticalBarRenderer37.setLegendItemToolTipGenerator(categorySeriesLabelGenerator67);
        statisticalBarRenderer9.setLegendItemURLGenerator(categorySeriesLabelGenerator67);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator67);
        org.junit.Assert.assertNull(categoryToolTipGenerator5);
        org.junit.Assert.assertNull(itemLabelPosition6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(gradientPaintTransformer35);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(shape40);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNull(paint53);
        org.junit.Assert.assertNotNull(itemLabelPosition54);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 2.0d + "'", double64 == 2.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator67);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getMinimumBarLength();
        double double8 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator11, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Paint paint13 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (byte) 1);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getBaseStroke();
        boolean boolean15 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint11);
        java.awt.Font font13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer6.setBaseItemLabelFont(font13);
        java.awt.Paint paint16 = statisticalBarRenderer6.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer0.setSeriesFillPaint((int) '#', paint16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 0);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        java.lang.Boolean boolean23 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) (byte) 10);
        java.awt.Paint paint26 = statisticalBarRenderer0.getItemOutlinePaint(100, (int) '4');
        org.jfree.chart.LegendItem legendItem29 = statisticalBarRenderer0.getLegendItem(10, (int) (byte) 0);
        java.lang.Boolean boolean31 = statisticalBarRenderer0.getSeriesItemLabelsVisible(0);
        java.awt.Paint paint33 = statisticalBarRenderer0.getSeriesOutlinePaint(10);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 100, (java.lang.Boolean) true, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) '#', (int) (byte) 0);
        java.awt.Stroke stroke41 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = statisticalBarRenderer0.getSeriesURLGenerator((int) '4');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator45 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) '#', categoryURLGenerator45);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(legendItem29);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(categoryURLGenerator43);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Paint paint13 = statisticalBarRenderer0.getItemOutlinePaint(1, 10);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator17, false);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        double double5 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double7 = statisticalBarRenderer6.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = null;
        statisticalBarRenderer6.setSeriesPositiveItemLabelPosition(1, itemLabelPosition9, false);
        java.awt.Paint paint13 = statisticalBarRenderer6.getSeriesPaint(0);
        statisticalBarRenderer6.setBaseSeriesVisibleInLegend(true);
        java.awt.Paint paint18 = statisticalBarRenderer6.getItemLabelPaint((int) ' ', (-1));
        statisticalBarRenderer0.setErrorIndicatorPaint(paint18);
        java.awt.Paint paint22 = statisticalBarRenderer0.getItemLabelPaint((int) 'a', 10);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        boolean boolean10 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation9);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer12.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer20.setBaseOutlineStroke(stroke21);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(true);
        double double25 = statisticalBarRenderer20.getBase();
        statisticalBarRenderer20.setSeriesVisible((int) (byte) 0, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer29.setBaseOutlineStroke(stroke30);
        statisticalBarRenderer29.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer29.setBaseFillPaint(paint34);
        java.awt.Font font36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer29.setBaseItemLabelFont(font36);
        java.awt.Stroke stroke40 = statisticalBarRenderer29.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer41.setBaseOutlineStroke(stroke42);
        statisticalBarRenderer41.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer41.setBaseFillPaint(paint46);
        java.awt.Font font48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer41.setBaseItemLabelFont(font48);
        boolean boolean50 = statisticalBarRenderer41.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition51 = statisticalBarRenderer41.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer29.setBaseNegativeItemLabelPosition(itemLabelPosition51, false);
        statisticalBarRenderer20.setBasePositiveItemLabelPosition(itemLabelPosition51, false);
        boolean boolean56 = statisticalBarRenderer20.isDrawBarOutline();
        boolean boolean57 = statisticalBarRenderer20.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double59 = statisticalBarRenderer58.getBase();
        java.awt.Paint paint62 = statisticalBarRenderer58.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer20.setBaseOutlinePaint(paint62, false);
        statisticalBarRenderer12.setSeriesFillPaint((int) (short) 0, paint62);
        statisticalBarRenderer0.setSeriesFillPaint((int) (short) 0, paint62);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(paint62);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer7.setBaseOutlineStroke(stroke8);
        statisticalBarRenderer7.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer7.setBaseFillPaint(paint12);
        java.awt.Font font14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer7.setBaseItemLabelFont(font14);
        java.awt.Stroke stroke18 = statisticalBarRenderer7.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer19.setBaseOutlineStroke(stroke20);
        statisticalBarRenderer19.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer25.setBaseOutlineStroke(stroke26);
        statisticalBarRenderer25.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer25.setBaseFillPaint(paint30);
        java.awt.Font font32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer25.setBaseItemLabelFont(font32);
        java.awt.Paint paint35 = statisticalBarRenderer25.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer19.setSeriesFillPaint((int) '#', paint35);
        statisticalBarRenderer7.setErrorIndicatorPaint(paint35);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer38.setBaseOutlineStroke(stroke39);
        statisticalBarRenderer38.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer38.setBaseFillPaint(paint43);
        statisticalBarRenderer38.setMaximumBarWidth((double) (byte) 1);
        java.awt.Stroke stroke48 = statisticalBarRenderer38.lookupSeriesOutlineStroke((int) (byte) -1);
        statisticalBarRenderer7.setBaseStroke(stroke48, true);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 10, stroke48);
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range53 = statisticalBarRenderer0.findRangeBounds(categoryDataset52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) ' ');
        java.awt.Paint paint13 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (byte) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        double double15 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer17.setBaseOutlineStroke(stroke18);
        statisticalBarRenderer17.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer17.setBaseFillPaint(paint22);
        java.awt.Font font24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer17.setBaseItemLabelFont(font24);
        java.awt.Stroke stroke28 = statisticalBarRenderer17.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke31 = statisticalBarRenderer17.getItemStroke((int) (short) 1, (int) ' ');
        statisticalBarRenderer17.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = statisticalBarRenderer17.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) (short) 10, itemLabelPosition35);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 2.0d + "'", double15 == 2.0d);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(itemLabelPosition35);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        java.awt.Stroke stroke19 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) -1);
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.plot.Marker marker23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D20, categoryPlot21, valueAxis22, marker23, rectangle2D24);
        double double26 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        double double5 = statisticalBarRenderer0.getBase();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer7.setBaseOutlineStroke(stroke8);
        statisticalBarRenderer7.setAutoPopulateSeriesOutlinePaint(true);
        java.lang.Boolean boolean13 = statisticalBarRenderer7.getSeriesVisible(0);
        java.awt.Paint paint15 = statisticalBarRenderer7.lookupSeriesFillPaint(10);
        statisticalBarRenderer0.setBasePaint(paint15);
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getErrorIndicatorStroke();
        boolean boolean18 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Paint paint13 = statisticalBarRenderer0.getItemOutlinePaint(1, 10);
        statisticalBarRenderer0.setItemMargin(0.0d);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = statisticalBarRenderer0.hasListener(eventListener16);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator18);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        int int10 = statisticalBarRenderer0.getColumnCount();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getBaseStroke();
        java.awt.Paint paint14 = statisticalBarRenderer0.getItemOutlinePaint((int) 'a', (int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getMinimumBarLength();
        double double8 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = null;
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) true, false);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Paint paint10 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer11.setBaseItemLabelGenerator(categoryItemLabelGenerator12, true);
        statisticalBarRenderer11.setItemMargin((double) 1.0f);
        statisticalBarRenderer11.removeAnnotations();
        boolean boolean18 = statisticalBarRenderer11.getAutoPopulateSeriesPaint();
        java.awt.Paint paint19 = statisticalBarRenderer11.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBasePaint(paint19);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer2.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer2.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        java.awt.Shape shape11 = statisticalBarRenderer2.getItemShape(1, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint17);
        statisticalBarRenderer12.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint22 = statisticalBarRenderer12.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        statisticalBarRenderer12.setBaseItemLabelGenerator(categoryItemLabelGenerator23, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer12.getLegendItemLabelGenerator();
        statisticalBarRenderer2.setLegendItemLabelGenerator(categorySeriesLabelGenerator26);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator26);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getMinimumBarLength();
        double double8 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 0);
        statisticalBarRenderer0.setBaseSeriesVisible(true, true);
        double double14 = statisticalBarRenderer0.getMaximumBarWidth();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Paint paint13 = statisticalBarRenderer0.getItemOutlinePaint(1, 10);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator17, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = statisticalBarRenderer0.getURLGenerator((int) ' ', 10);
        java.awt.Shape shape25 = statisticalBarRenderer0.getItemShape((int) '#', (int) '#');
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(categoryURLGenerator22);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) true, false);
        boolean boolean7 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities(10);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(0, (int) (short) -1);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer10.setMaximumBarWidth((double) 100L);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer13 = null;
        statisticalBarRenderer10.setGradientPaintTransformer(gradientPaintTransformer13);
        java.awt.Stroke stroke17 = statisticalBarRenderer10.getItemOutlineStroke((int) (byte) 10, 10);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke17);
        boolean boolean19 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        double double9 = statisticalBarRenderer0.getItemMargin();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) 1);
        java.lang.Boolean boolean13 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) -1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(boolean13);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint17);
        java.awt.Font font19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer12.setBaseItemLabelFont(font19);
        boolean boolean21 = statisticalBarRenderer12.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer12.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition22, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator26, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer29.setBaseOutlineStroke(stroke30);
        statisticalBarRenderer29.setAutoPopulateSeriesOutlinePaint(true);
        double double34 = statisticalBarRenderer29.getBase();
        java.awt.Stroke stroke35 = statisticalBarRenderer29.getBaseStroke();
        statisticalBarRenderer0.setBaseStroke(stroke35, true);
        double double38 = statisticalBarRenderer0.getMaximumBarWidth();
        double double39 = statisticalBarRenderer0.getLowerClip();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        boolean boolean20 = statisticalBarRenderer0.isItemLabelVisible((int) ' ', (int) (byte) 1);
        statisticalBarRenderer0.setBaseCreateEntities(true, true);
        java.awt.Shape shape24 = statisticalBarRenderer0.getBaseShape();
        java.awt.Stroke stroke26 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) 100);
        boolean boolean29 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (byte) 100);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Paint paint13 = statisticalBarRenderer0.getItemOutlinePaint(1, 10);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator17, false);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator25);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) false, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getToolTipGenerator(0, 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 0, categoryToolTipGenerator11, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        double double9 = statisticalBarRenderer0.getMinimumBarLength();
        int int10 = statisticalBarRenderer0.getRowCount();
        java.awt.Paint paint13 = statisticalBarRenderer0.getItemPaint((int) (byte) 100, (int) (short) 1);
        double double14 = statisticalBarRenderer0.getItemMargin();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getItemStroke((int) (short) 1, (int) ' ');
        java.awt.Stroke stroke16 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 10);
        java.awt.Shape shape18 = statisticalBarRenderer0.lookupSeriesShape((int) (short) -1);
        boolean boolean19 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Paint paint22 = statisticalBarRenderer0.getItemPaint(100, 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        java.awt.Paint paint23 = statisticalBarRenderer0.getErrorIndicatorPaint();
        double double24 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer25.setBaseOutlineStroke(stroke26);
        statisticalBarRenderer25.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer31.setBaseOutlineStroke(stroke32);
        statisticalBarRenderer31.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer31.setBaseFillPaint(paint36);
        java.awt.Font font38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer31.setBaseItemLabelFont(font38);
        java.awt.Paint paint41 = statisticalBarRenderer31.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer25.setSeriesFillPaint((int) '#', paint41);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator44 = statisticalBarRenderer25.getSeriesItemLabelGenerator((int) (short) 0);
        java.awt.Paint paint47 = statisticalBarRenderer25.getItemOutlinePaint((-1), (int) (short) 0);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint47, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator50 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Stroke stroke53 = statisticalBarRenderer0.getItemStroke((int) (byte) -1, (int) (short) 10);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator54 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(categoryItemLabelGenerator44);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator50);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator54);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint12 = statisticalBarRenderer0.getBaseFillPaint();
        boolean boolean13 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Shape shape15 = statisticalBarRenderer0.lookupSeriesShape(0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        double double9 = statisticalBarRenderer0.getItemMargin();
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator12, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        java.awt.Stroke stroke12 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 100);
        java.awt.Paint paint15 = statisticalBarRenderer0.getItemPaint(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        java.awt.Shape shape9 = statisticalBarRenderer0.getItemShape(1, (int) '#');
        boolean boolean10 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint17);
        java.awt.Font font19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer12.setBaseItemLabelFont(font19);
        boolean boolean23 = statisticalBarRenderer12.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setSeriesItemLabelPaint((int) (byte) 1, paint25, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation28 = null;
        boolean boolean29 = statisticalBarRenderer12.removeAnnotation(categoryAnnotation28);
        boolean boolean32 = statisticalBarRenderer12.isItemLabelVisible((int) ' ', (int) (byte) 1);
        statisticalBarRenderer12.setBaseCreateEntities(true, true);
        java.awt.Shape shape36 = statisticalBarRenderer12.getBaseShape();
        java.awt.Stroke stroke38 = statisticalBarRenderer12.lookupSeriesOutlineStroke((int) (byte) 100);
        statisticalBarRenderer0.setSeriesStroke(100, stroke38, false);
        java.awt.Shape shape42 = statisticalBarRenderer0.lookupSeriesShape(1);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(shape42);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint6 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 1);
        boolean boolean7 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer9.setBaseOutlineStroke(stroke10);
        statisticalBarRenderer9.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint14);
        java.awt.Font font16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer9.setBaseItemLabelFont(font16);
        java.awt.Stroke stroke20 = statisticalBarRenderer9.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke23 = statisticalBarRenderer9.getItemStroke((int) (short) 1, (int) ' ');
        statisticalBarRenderer0.setSeriesStroke((int) (short) 10, stroke23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator26, false);
        boolean boolean29 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer6.setBaseFillPaint(paint11);
        java.awt.Font font13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer6.setBaseItemLabelFont(font13);
        java.awt.Paint paint16 = statisticalBarRenderer6.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer0.setSeriesFillPaint((int) '#', paint16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 0);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        java.lang.Boolean boolean23 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) (byte) 10);
        java.awt.Stroke stroke26 = statisticalBarRenderer0.getItemStroke((int) (byte) -1, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer27.setBaseOutlineStroke(stroke28);
        statisticalBarRenderer27.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer27.setBaseFillPaint(paint32);
        java.awt.Font font34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer27.setBaseItemLabelFont(font34);
        boolean boolean36 = statisticalBarRenderer27.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = statisticalBarRenderer27.getBaseNegativeItemLabelPosition();
        java.awt.Paint paint40 = statisticalBarRenderer27.getItemLabelPaint((-1), 10);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer41 = statisticalBarRenderer27.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer41);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator44 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesToolTipGenerator((-1), categoryToolTipGenerator44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(gradientPaintTransformer41);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) ' ');
        boolean boolean13 = statisticalBarRenderer0.isSeriesVisibleInLegend(0);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, true);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, false);
        java.awt.Shape shape21 = statisticalBarRenderer0.getSeriesShape((int) (byte) 1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(shape21);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        java.awt.Paint paint15 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        double double9 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer22.setBaseOutlineStroke(stroke23);
        statisticalBarRenderer22.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer22.setBaseFillPaint(paint27);
        java.awt.Font font29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer22.setBaseItemLabelFont(font29);
        boolean boolean31 = statisticalBarRenderer22.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer22.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer10.setBaseNegativeItemLabelPosition(itemLabelPosition32, false);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition32);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer36.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer36.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        statisticalBarRenderer36.setMinimumBarLength((double) 1L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer45.setMaximumBarWidth((double) 100L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator50 = statisticalBarRenderer45.getToolTipGenerator((int) '#', (int) ' ');
        java.awt.Paint paint52 = statisticalBarRenderer45.lookupSeriesFillPaint((int) 'a');
        statisticalBarRenderer36.setErrorIndicatorPaint(paint52);
        statisticalBarRenderer0.setBasePaint(paint52, false);
        java.awt.Graphics2D graphics2D56 = null;
        java.awt.geom.Rectangle2D rectangle2D57 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis58 = null;
        org.jfree.chart.axis.ValueAxis valueAxis59 = null;
        org.jfree.chart.util.Layer layer60 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo61 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D56, rectangle2D57, categoryAxis58, valueAxis59, layer60, plotRenderingInfo61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertNull(categoryToolTipGenerator50);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        java.awt.Stroke stroke12 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 100);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 100, shape17, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer20.setBaseOutlineStroke(stroke21);
        statisticalBarRenderer20.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        statisticalBarRenderer20.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator26, true);
        boolean boolean29 = statisticalBarRenderer20.getAutoPopulateSeriesOutlinePaint();
        statisticalBarRenderer20.setSeriesVisible((int) (short) 10, (java.lang.Boolean) false);
        statisticalBarRenderer20.setIncludeBaseInRange(false);
        int int35 = statisticalBarRenderer20.getColumnCount();
        java.awt.Shape shape37 = statisticalBarRenderer20.lookupSeriesShape((int) (byte) 1);
        statisticalBarRenderer0.setBaseShape(shape37, false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(shape37);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint18);
        java.awt.Stroke stroke21 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer24.setBaseOutlineStroke(stroke25);
        statisticalBarRenderer24.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint30 = statisticalBarRenderer24.lookupSeriesOutlinePaint((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double32 = statisticalBarRenderer31.getBase();
        java.awt.Paint paint35 = statisticalBarRenderer31.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer24.setErrorIndicatorPaint(paint35);
        statisticalBarRenderer0.setBaseOutlinePaint(paint35);
        java.awt.Paint paint38 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer40.setBaseOutlineStroke(stroke41);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer43.setBaseOutlineStroke(stroke44);
        java.awt.Shape shape46 = statisticalBarRenderer43.getBaseShape();
        statisticalBarRenderer40.setBaseShape(shape46);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke50 = statisticalBarRenderer48.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer40.setBaseStroke(stroke50, false);
        java.awt.Font font55 = statisticalBarRenderer40.getItemLabelFont((-1), (int) (short) -1);
        java.awt.Paint paint57 = statisticalBarRenderer40.lookupSeriesFillPaint(1);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) 'a', paint57);
        boolean boolean61 = statisticalBarRenderer0.getItemVisible(0, 0);
        statisticalBarRenderer0.setMinimumBarLength((double) (-1.0f));
        java.awt.Paint paint65 = statisticalBarRenderer0.getSeriesOutlinePaint(0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(font55);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(paint65);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer13.setMaximumBarWidth((double) 100L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double17 = statisticalBarRenderer16.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = null;
        statisticalBarRenderer16.setSeriesPositiveItemLabelPosition(1, itemLabelPosition19, false);
        java.awt.Paint paint23 = statisticalBarRenderer16.getSeriesPaint(0);
        java.lang.Boolean boolean25 = statisticalBarRenderer16.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer26.setBaseOutlineStroke(stroke27);
        statisticalBarRenderer26.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer26.setBaseFillPaint(paint31);
        java.awt.Font font33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer26.setBaseItemLabelFont(font33);
        java.awt.Stroke stroke37 = statisticalBarRenderer26.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer16.setBaseOutlineStroke(stroke37);
        java.awt.Paint paint39 = statisticalBarRenderer16.getErrorIndicatorPaint();
        statisticalBarRenderer13.setBaseOutlinePaint(paint39);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer13.getSeriesPositiveItemLabelPosition((int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double44 = statisticalBarRenderer43.getBase();
        java.awt.Paint paint47 = statisticalBarRenderer43.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer13.setBaseItemLabelPaint(paint47);
        statisticalBarRenderer0.setBaseOutlinePaint(paint47);
        java.awt.Paint paint51 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (short) -1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator52 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator52);
        java.awt.Font font56 = statisticalBarRenderer0.getItemLabelFont((int) '#', (int) (short) 0);
        int int57 = statisticalBarRenderer0.getColumnCount();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(paint51);
        org.junit.Assert.assertNotNull(font56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        java.awt.Paint paint23 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator24 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer25.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer29.setBaseOutlineStroke(stroke30);
        statisticalBarRenderer29.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean34 = statisticalBarRenderer29.getBaseSeriesVisibleInLegend();
        boolean boolean35 = statisticalBarRenderer29.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer29.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer29.setAutoPopulateSeriesFillPaint(false);
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer29.setBaseOutlinePaint(paint41);
        statisticalBarRenderer25.setSeriesItemLabelPaint(0, paint41);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint41);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        boolean boolean47 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(categoryURLGenerator24);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        double double23 = statisticalBarRenderer0.getUpperClip();
        java.awt.Paint paint26 = statisticalBarRenderer0.getItemPaint(10, (int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer27.setBaseOutlineStroke(stroke28);
        statisticalBarRenderer27.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer27.setBaseFillPaint(paint32);
        statisticalBarRenderer27.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint37 = statisticalBarRenderer27.getSeriesPaint((int) '#');
        statisticalBarRenderer27.removeAnnotations();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = statisticalBarRenderer27.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer40.setMaximumBarWidth((double) 100L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double44 = statisticalBarRenderer43.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = null;
        statisticalBarRenderer43.setSeriesPositiveItemLabelPosition(1, itemLabelPosition46, false);
        java.awt.Paint paint50 = statisticalBarRenderer43.getSeriesPaint(0);
        java.lang.Boolean boolean52 = statisticalBarRenderer43.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer53.setBaseOutlineStroke(stroke54);
        statisticalBarRenderer53.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer53.setBaseFillPaint(paint58);
        java.awt.Font font60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer53.setBaseItemLabelFont(font60);
        java.awt.Stroke stroke64 = statisticalBarRenderer53.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer43.setBaseOutlineStroke(stroke64);
        java.awt.Paint paint66 = statisticalBarRenderer43.getErrorIndicatorPaint();
        statisticalBarRenderer40.setBaseOutlinePaint(paint66);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition69 = statisticalBarRenderer40.getSeriesPositiveItemLabelPosition((int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer70 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double71 = statisticalBarRenderer70.getBase();
        java.awt.Paint paint74 = statisticalBarRenderer70.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer40.setBaseItemLabelPaint(paint74);
        statisticalBarRenderer27.setBaseOutlinePaint(paint74);
        statisticalBarRenderer0.setBaseOutlinePaint(paint74, false);
        java.awt.Graphics2D graphics2D79 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot80 = null;
        org.jfree.chart.axis.ValueAxis valueAxis81 = null;
        org.jfree.chart.plot.Marker marker82 = null;
        java.awt.geom.Rectangle2D rectangle2D83 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D79, categoryPlot80, valueAxis81, marker82, rectangle2D83);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator86 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) ' ', categoryURLGenerator86);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(paint37);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator39);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNull(paint50);
        org.junit.Assert.assertNull(boolean52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(font60);
        org.junit.Assert.assertNotNull(stroke64);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(itemLabelPosition69);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(paint74);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        double double9 = statisticalBarRenderer0.getMinimumBarLength();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesStroke(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint17);
        java.awt.Font font19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer12.setBaseItemLabelFont(font19);
        boolean boolean23 = statisticalBarRenderer12.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setSeriesItemLabelPaint((int) (byte) 1, paint25, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation28 = null;
        boolean boolean29 = statisticalBarRenderer12.removeAnnotation(categoryAnnotation28);
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint30);
        java.awt.Stroke stroke32 = statisticalBarRenderer12.getBaseOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = null;
        statisticalBarRenderer34.setBaseItemLabelGenerator(categoryItemLabelGenerator35, true);
        java.awt.Paint paint40 = statisticalBarRenderer34.getItemPaint((int) (byte) 10, (-1));
        statisticalBarRenderer12.setSeriesPaint(100, paint40, false);
        boolean boolean45 = statisticalBarRenderer12.isItemLabelVisible(0, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer46.setBaseOutlineStroke(stroke47);
        statisticalBarRenderer46.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer46.setBaseFillPaint(paint51);
        statisticalBarRenderer46.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator56 = null;
        statisticalBarRenderer46.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator56, true);
        statisticalBarRenderer46.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer61 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double62 = statisticalBarRenderer61.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = null;
        statisticalBarRenderer61.setSeriesPositiveItemLabelPosition(1, itemLabelPosition64, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer67 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke68 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer67.setBaseOutlineStroke(stroke68);
        statisticalBarRenderer67.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint72 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer67.setBaseFillPaint(paint72);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition74 = statisticalBarRenderer67.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer61.setBasePositiveItemLabelPosition(itemLabelPosition74);
        statisticalBarRenderer46.setBasePositiveItemLabelPosition(itemLabelPosition74);
        statisticalBarRenderer12.setBasePositiveItemLabelPosition(itemLabelPosition74);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition74);
        java.awt.Stroke stroke79 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseStroke(stroke79, true);
        boolean boolean82 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNotNull(paint72);
        org.junit.Assert.assertNotNull(itemLabelPosition74);
        org.junit.Assert.assertNotNull(stroke79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisible();
        java.lang.Boolean boolean8 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer11.setBaseOutlineStroke(stroke12);
        statisticalBarRenderer11.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer11.setBaseFillPaint(paint16);
        java.awt.Font font18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer11.setBaseItemLabelFont(font18);
        boolean boolean22 = statisticalBarRenderer11.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer11.setSeriesItemLabelPaint((int) (byte) 1, paint24, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation27 = null;
        boolean boolean28 = statisticalBarRenderer11.removeAnnotation(categoryAnnotation27);
        boolean boolean31 = statisticalBarRenderer11.isItemLabelVisible((int) ' ', (int) (byte) 1);
        java.awt.Paint paint33 = statisticalBarRenderer11.lookupSeriesPaint((int) (byte) 0);
        statisticalBarRenderer0.setBaseFillPaint(paint33, true);
        boolean boolean36 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        boolean boolean37 = statisticalBarRenderer0.getBaseCreateEntities();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesVisibleInLegend((-1), (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        double double5 = statisticalBarRenderer0.getBase();
        statisticalBarRenderer0.setSeriesVisible((int) (byte) 0, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer9.setBaseOutlineStroke(stroke10);
        statisticalBarRenderer9.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer9.setBaseFillPaint(paint14);
        java.awt.Font font16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer9.setBaseItemLabelFont(font16);
        java.awt.Stroke stroke20 = statisticalBarRenderer9.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer21.setBaseOutlineStroke(stroke22);
        statisticalBarRenderer21.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer21.setBaseFillPaint(paint26);
        java.awt.Font font28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer21.setBaseItemLabelFont(font28);
        boolean boolean30 = statisticalBarRenderer21.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer21.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer9.setBaseNegativeItemLabelPosition(itemLabelPosition31, false);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition31, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer37.setBaseOutlineStroke(stroke38);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer40.setBaseOutlineStroke(stroke41);
        java.awt.Shape shape43 = statisticalBarRenderer40.getBaseShape();
        statisticalBarRenderer37.setBaseShape(shape43);
        statisticalBarRenderer0.setSeriesShape((int) (short) 10, shape43, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer47.setBaseOutlineStroke(stroke48);
        java.awt.Shape shape50 = statisticalBarRenderer47.getBaseShape();
        java.awt.Paint paint52 = statisticalBarRenderer47.getSeriesFillPaint((int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer53.setBaseOutlineStroke(stroke54);
        statisticalBarRenderer53.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer53.setBaseFillPaint(paint58);
        statisticalBarRenderer53.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint63 = statisticalBarRenderer53.getSeriesPaint((int) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = statisticalBarRenderer53.getBasePositiveItemLabelPosition();
        statisticalBarRenderer47.setBasePositiveItemLabelPosition(itemLabelPosition64);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition64);
        double double67 = statisticalBarRenderer0.getItemMargin();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNull(paint52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNull(paint63);
        org.junit.Assert.assertNotNull(itemLabelPosition64);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.2d + "'", double67 == 0.2d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        java.awt.Shape shape3 = statisticalBarRenderer0.getBaseShape();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = statisticalBarRenderer0.hasListener(eventListener4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer6.setBaseOutlineStroke(stroke7);
        statisticalBarRenderer6.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint12 = statisticalBarRenderer6.lookupSeriesOutlinePaint((int) (short) 1);
        statisticalBarRenderer0.setBaseOutlinePaint(paint12, false);
        java.awt.Paint paint15 = statisticalBarRenderer0.getErrorIndicatorPaint();
        java.awt.Paint paint17 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 10, categoryToolTipGenerator19);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        int int10 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) 100);
        boolean boolean15 = statisticalBarRenderer0.getItemVisible((int) '#', (int) '4');
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(categoryURLGenerator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Font font13 = statisticalBarRenderer0.getSeriesItemLabelFont(100);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesFillPaint((int) ' ', paint15, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer19.setBaseOutlineStroke(stroke20);
        statisticalBarRenderer19.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean24 = statisticalBarRenderer19.getBaseSeriesVisibleInLegend();
        boolean boolean25 = statisticalBarRenderer19.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer19.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer29.setMaximumBarWidth((double) 100L);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer32 = null;
        statisticalBarRenderer29.setGradientPaintTransformer(gradientPaintTransformer32);
        java.awt.Stroke stroke36 = statisticalBarRenderer29.getItemOutlineStroke((int) (byte) 10, 10);
        statisticalBarRenderer19.setBaseOutlineStroke(stroke36);
        statisticalBarRenderer19.setMaximumBarWidth((double) (short) 1);
        boolean boolean40 = statisticalBarRenderer19.getAutoPopulateSeriesPaint();
        statisticalBarRenderer19.setAutoPopulateSeriesOutlineStroke(true);
        java.awt.Stroke stroke43 = statisticalBarRenderer19.getErrorIndicatorStroke();
        statisticalBarRenderer0.setSeriesOutlineStroke((int) '4', stroke43);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) 'a');
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
        org.junit.Assert.assertNull(font13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        statisticalBarRenderer0.setMinimumBarLength((double) 1L);
        java.lang.Object obj9 = statisticalBarRenderer0.clone();
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemOutlinePaint(1, 100);
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainGridline(graphics2D13, categoryPlot14, rectangle2D15, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        java.awt.Shape shape3 = statisticalBarRenderer0.getBaseShape();
        statisticalBarRenderer0.setBaseCreateEntities(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double8 = statisticalBarRenderer7.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        statisticalBarRenderer7.setSeriesPositiveItemLabelPosition(1, itemLabelPosition10, false);
        java.awt.Paint paint14 = statisticalBarRenderer7.getSeriesPaint(0);
        java.lang.Boolean boolean16 = statisticalBarRenderer7.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer17.setBaseOutlineStroke(stroke18);
        statisticalBarRenderer17.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer17.setBaseFillPaint(paint22);
        java.awt.Font font24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer17.setBaseItemLabelFont(font24);
        java.awt.Stroke stroke28 = statisticalBarRenderer17.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer7.setBaseOutlineStroke(stroke28);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer30.setBaseOutlineStroke(stroke31);
        statisticalBarRenderer30.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer30.setBaseFillPaint(paint35);
        java.awt.Font font37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer30.setBaseItemLabelFont(font37);
        boolean boolean39 = statisticalBarRenderer30.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = statisticalBarRenderer30.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer7.setBasePositiveItemLabelPosition(itemLabelPosition40);
        statisticalBarRenderer7.setItemMargin((double) (short) 100);
        java.awt.Shape shape45 = statisticalBarRenderer7.lookupSeriesShape((int) (short) -1);
        statisticalBarRenderer0.setSeriesShape((int) (byte) 100, shape45, true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(1, (java.lang.Boolean) true, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation52 = null;
        boolean boolean53 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation52);
        java.awt.Paint paint55 = statisticalBarRenderer0.getSeriesItemLabelPaint((-1));
        org.jfree.chart.LegendItem legendItem58 = statisticalBarRenderer0.getLegendItem((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNotNull(shape45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(paint55);
        org.junit.Assert.assertNull(legendItem58);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer3.setBaseOutlineStroke(stroke4);
        statisticalBarRenderer3.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer3.setBaseFillPaint(paint8);
        java.awt.Font font10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer3.setBaseItemLabelFont(font10);
        java.awt.Stroke stroke14 = statisticalBarRenderer3.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke17 = statisticalBarRenderer3.getItemStroke((int) (short) 1, (int) ' ');
        statisticalBarRenderer3.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = statisticalBarRenderer3.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) (byte) 100, itemLabelPosition21, false);
        boolean boolean24 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        boolean boolean25 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        java.awt.Shape shape28 = statisticalBarRenderer0.getItemShape(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(shape28);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint10 = statisticalBarRenderer0.getBaseItemLabelPaint();
        int int11 = statisticalBarRenderer0.getPassCount();
        java.awt.Paint paint13 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) -1);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1L);
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        double double5 = statisticalBarRenderer0.getBase();
        java.lang.Boolean boolean7 = statisticalBarRenderer0.getSeriesCreateEntities((int) '4');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator8, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) '4', categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer3.setBaseOutlineStroke(stroke4);
        java.awt.Shape shape6 = statisticalBarRenderer3.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 10, categoryURLGenerator9, true);
        int int12 = statisticalBarRenderer0.getRowCount();
        double double13 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.awt.Shape shape15 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.0d + "'", double13 == 2.0d);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNull(categoryPlot16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 100, categoryToolTipGenerator10, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke14);
        statisticalBarRenderer13.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean18 = statisticalBarRenderer13.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = null;
        statisticalBarRenderer13.setLegendItemToolTipGenerator(categorySeriesLabelGenerator19);
        double double21 = statisticalBarRenderer13.getMinimumBarLength();
        double double22 = statisticalBarRenderer13.getItemMargin();
        statisticalBarRenderer13.setAutoPopulateSeriesFillPaint(true);
        boolean boolean25 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer13);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator26);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Shape shape5 = statisticalBarRenderer0.getBaseShape();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getErrorIndicatorStroke();
        boolean boolean9 = statisticalBarRenderer0.getItemCreateEntity(10, (int) '#');
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        java.lang.Boolean boolean10 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getItemStroke((int) (short) 1, (int) ' ');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) true);
        java.lang.Object obj18 = statisticalBarRenderer0.clone();
        boolean boolean19 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        boolean boolean23 = statisticalBarRenderer0.getBaseSeriesVisible();
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        java.awt.Stroke stroke26 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Stroke stroke28 = statisticalBarRenderer0.getSeriesStroke((int) (byte) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 100);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, true);
        java.awt.Paint paint34 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(stroke28);
        org.junit.Assert.assertNull(categoryURLGenerator30);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        statisticalBarRenderer0.removeAnnotations();
        java.awt.Shape shape14 = statisticalBarRenderer0.getItemShape((int) (byte) 100, (int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer15.setBaseOutlineStroke(stroke16);
        statisticalBarRenderer15.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer15.setBaseFillPaint(paint20);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer15.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition22);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer24 = statisticalBarRenderer0.getGradientPaintTransformer();
        java.awt.Paint paint25 = null;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint25);
        boolean boolean28 = statisticalBarRenderer0.isSeriesVisible((int) (short) 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(gradientPaintTransformer24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer18.setBaseOutlineStroke(stroke19);
        statisticalBarRenderer18.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean23 = statisticalBarRenderer18.getBaseSeriesVisibleInLegend();
        boolean boolean24 = statisticalBarRenderer18.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer18.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer18.setAutoPopulateSeriesFillPaint(false);
        java.awt.Stroke stroke31 = statisticalBarRenderer18.lookupSeriesStroke(0);
        boolean boolean32 = statisticalBarRenderer18.getAutoPopulateSeriesShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer18.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition34, true);
        java.awt.Stroke stroke37 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Paint paint40 = statisticalBarRenderer0.getItemPaint(10, (int) (byte) -1);
        boolean boolean41 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Stroke stroke44 = statisticalBarRenderer0.getItemOutlineStroke(100, (int) (short) 0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator11 = statisticalBarRenderer0.getLegendItemURLGenerator();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) -1, (java.lang.Boolean) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator11);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        java.awt.Stroke stroke13 = statisticalBarRenderer0.lookupSeriesStroke(0);
        boolean boolean14 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation17 = null;
        boolean boolean18 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation17);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(100, categoryToolTipGenerator20);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator5 = statisticalBarRenderer0.getToolTipGenerator((int) '#', (int) ' ');
        java.awt.Paint paint7 = statisticalBarRenderer0.lookupSeriesFillPaint((int) 'a');
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setSeriesCreateEntities(0, (java.lang.Boolean) true);
        org.junit.Assert.assertNull(categoryToolTipGenerator5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPosition(10, (int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) -1, (int) '4');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator15, false);
        double double18 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        java.awt.Shape shape3 = statisticalBarRenderer0.getBaseShape();
        java.util.EventListener eventListener4 = null;
        boolean boolean5 = statisticalBarRenderer0.hasListener(eventListener4);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        statisticalBarRenderer0.setSeriesVisible((int) ' ', (java.lang.Boolean) true);
        statisticalBarRenderer0.setMinimumBarLength((double) (short) 1);
        boolean boolean13 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double16 = statisticalBarRenderer15.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        statisticalBarRenderer15.setSeriesPositiveItemLabelPosition(1, itemLabelPosition18, false);
        java.awt.Paint paint22 = statisticalBarRenderer15.getSeriesPaint(0);
        statisticalBarRenderer15.setItemLabelAnchorOffset((double) 0);
        java.lang.Boolean boolean26 = statisticalBarRenderer15.getSeriesCreateEntities((int) (short) 10);
        statisticalBarRenderer15.setBaseItemLabelsVisible(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator31 = statisticalBarRenderer15.getToolTipGenerator(1, (int) (short) -1);
        java.awt.Font font32 = statisticalBarRenderer15.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 10, font32, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNull(categoryToolTipGenerator31);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean4 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer5.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer5.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer12.setMaximumBarWidth((double) 100L);
        statisticalBarRenderer12.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) false, true);
        java.awt.Shape shape21 = statisticalBarRenderer12.getItemShape(1, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer22.setBaseOutlineStroke(stroke23);
        statisticalBarRenderer22.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer22.setBaseFillPaint(paint27);
        statisticalBarRenderer22.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint32 = statisticalBarRenderer22.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = null;
        statisticalBarRenderer22.setBaseItemLabelGenerator(categoryItemLabelGenerator33, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator36 = statisticalBarRenderer22.getLegendItemLabelGenerator();
        statisticalBarRenderer12.setLegendItemLabelGenerator(categorySeriesLabelGenerator36);
        statisticalBarRenderer5.setLegendItemLabelGenerator(categorySeriesLabelGenerator36);
        java.awt.Shape shape41 = statisticalBarRenderer5.getItemShape((int) (byte) 100, (int) (short) 1);
        statisticalBarRenderer0.setBaseShape(shape41);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator36);
        org.junit.Assert.assertNotNull(shape41);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) -1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator15, true);
        java.awt.Paint paint20 = statisticalBarRenderer0.getItemOutlinePaint((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setMaximumBarWidth((double) 100L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double4 = statisticalBarRenderer3.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = null;
        statisticalBarRenderer3.setSeriesPositiveItemLabelPosition(1, itemLabelPosition6, false);
        java.awt.Paint paint10 = statisticalBarRenderer3.getSeriesPaint(0);
        java.lang.Boolean boolean12 = statisticalBarRenderer3.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer13.setBaseOutlineStroke(stroke14);
        statisticalBarRenderer13.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer13.setBaseFillPaint(paint18);
        java.awt.Font font20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer13.setBaseItemLabelFont(font20);
        java.awt.Stroke stroke24 = statisticalBarRenderer13.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer3.setBaseOutlineStroke(stroke24);
        java.awt.Paint paint26 = statisticalBarRenderer3.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBaseOutlinePaint(paint26);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '4');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double31 = statisticalBarRenderer30.getBase();
        java.awt.Paint paint34 = statisticalBarRenderer30.getItemLabelPaint((int) (short) -1, (int) (short) 10);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint34);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator36 = statisticalBarRenderer0.getBaseToolTipGenerator();
        statisticalBarRenderer0.setItemMargin((double) (-1L));
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator42 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(1, categoryToolTipGenerator42, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer46.setBaseOutlineStroke(stroke47);
        statisticalBarRenderer46.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer46.setBaseFillPaint(paint51);
        java.awt.Font font53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer46.setBaseItemLabelFont(font53);
        java.awt.Stroke stroke57 = statisticalBarRenderer46.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke59 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer58.setBaseOutlineStroke(stroke59);
        statisticalBarRenderer58.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint63 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer58.setBaseFillPaint(paint63);
        java.awt.Font font65 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer58.setBaseItemLabelFont(font65);
        boolean boolean67 = statisticalBarRenderer58.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition68 = statisticalBarRenderer58.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer46.setBaseNegativeItemLabelPosition(itemLabelPosition68, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator72 = null;
        statisticalBarRenderer46.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator72, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer75 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke76 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer75.setBaseOutlineStroke(stroke76);
        statisticalBarRenderer75.setAutoPopulateSeriesOutlinePaint(true);
        double double80 = statisticalBarRenderer75.getBase();
        java.awt.Stroke stroke81 = statisticalBarRenderer75.getBaseStroke();
        statisticalBarRenderer46.setBaseStroke(stroke81, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition84 = statisticalBarRenderer46.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint85 = statisticalBarRenderer46.getBaseOutlinePaint();
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 100, paint85);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categoryToolTipGenerator36);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertNotNull(font65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition68);
        org.junit.Assert.assertNotNull(stroke76);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertNotNull(stroke81);
        org.junit.Assert.assertNull(itemLabelPosition84);
        org.junit.Assert.assertNotNull(paint85);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke2 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 10);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPosition(10, (int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) -1, (int) '4');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 100, categoryURLGenerator15, false);
        double double18 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        statisticalBarRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer23.setBaseOutlineStroke(stroke24);
        statisticalBarRenderer23.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer23.setBaseFillPaint(paint28);
        java.awt.Font font30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer23.setBaseItemLabelFont(font30);
        java.awt.Stroke stroke34 = statisticalBarRenderer23.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        java.awt.Stroke stroke37 = statisticalBarRenderer23.getItemStroke((int) (short) 1, (int) ' ');
        java.awt.Stroke stroke39 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 10);
        boolean boolean40 = statisticalBarRenderer23.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer41.setBaseOutlineStroke(stroke42);
        statisticalBarRenderer41.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer41.setBaseFillPaint(paint46);
        java.awt.Font font48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer41.setBaseItemLabelFont(font48);
        double double50 = statisticalBarRenderer41.getMinimumBarLength();
        int int51 = statisticalBarRenderer41.getRowCount();
        java.awt.Paint paint54 = statisticalBarRenderer41.getItemPaint((int) (byte) 100, (int) (short) 1);
        statisticalBarRenderer23.setBaseItemLabelPaint(paint54);
        statisticalBarRenderer0.setSeriesPaint(0, paint54, true);
        statisticalBarRenderer0.setMinimumBarLength(0.2d);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNull(stroke39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer10.setBaseOutlineStroke(stroke11);
        statisticalBarRenderer10.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer10.setBaseFillPaint(paint15);
        java.awt.Font font17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer10.setBaseItemLabelFont(font17);
        java.awt.Stroke stroke21 = statisticalBarRenderer10.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke21);
        java.awt.Paint paint23 = statisticalBarRenderer0.getErrorIndicatorPaint();
        double double24 = statisticalBarRenderer0.getLowerClip();
        boolean boolean25 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        boolean boolean26 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator11, true);
        boolean boolean15 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer16.setBaseOutlineStroke(stroke17);
        statisticalBarRenderer16.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer16.setBaseFillPaint(paint21);
        java.awt.Font font23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer16.setBaseItemLabelFont(font23);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer16.getLegendItemToolTipGenerator();
        java.awt.Paint paint26 = statisticalBarRenderer16.getBaseOutlinePaint();
        statisticalBarRenderer0.setBaseItemLabelPaint(paint26);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 0);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemOutlinePaint((int) '4', 1);
        org.jfree.chart.LegendItem legendItem15 = statisticalBarRenderer0.getLegendItem((int) '4', (int) (byte) -1);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer19.setBaseOutlineStroke(stroke20);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer22.setBaseOutlineStroke(stroke23);
        java.awt.Shape shape25 = statisticalBarRenderer22.getBaseShape();
        statisticalBarRenderer19.setBaseShape(shape25);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke29 = statisticalBarRenderer27.lookupSeriesOutlineStroke((int) ' ');
        statisticalBarRenderer19.setBaseStroke(stroke29, false);
        java.awt.Paint paint33 = statisticalBarRenderer19.lookupSeriesPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer34.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.LegendItem legendItem39 = statisticalBarRenderer34.getLegendItem(1, (int) (short) 1);
        boolean boolean41 = statisticalBarRenderer34.isSeriesVisibleInLegend(100);
        statisticalBarRenderer34.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer44.setBaseOutlineStroke(stroke45);
        statisticalBarRenderer34.setBaseStroke(stroke45, true);
        statisticalBarRenderer19.setBaseStroke(stroke45, true);
        statisticalBarRenderer0.setSeriesStroke((int) (short) 1, stroke45);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(legendItem15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(legendItem39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.LegendItem legendItem5 = statisticalBarRenderer0.getLegendItem(1, (int) (short) 1);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(legendItem5);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(1, itemLabelPosition3, false);
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint(0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator10);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.chart.plot.Marker marker15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D12, categoryPlot13, valueAxis14, marker15, rectangle2D16);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 1, categoryToolTipGenerator19);
        double double21 = statisticalBarRenderer0.getMinimumBarLength();
        java.awt.Stroke stroke23 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(stroke23);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean11 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 1, paint13, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        boolean boolean17 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation16);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint18);
        java.awt.Stroke stroke20 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        statisticalBarRenderer22.setBaseItemLabelGenerator(categoryItemLabelGenerator23, true);
        java.awt.Paint paint28 = statisticalBarRenderer22.getItemPaint((int) (byte) 10, (-1));
        statisticalBarRenderer0.setSeriesPaint(100, paint28, false);
        boolean boolean33 = statisticalBarRenderer0.isItemLabelVisible(0, (int) '#');
        double double34 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 2.0d + "'", double34 == 2.0d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer3.setBaseOutlineStroke(stroke4);
        java.awt.Shape shape6 = statisticalBarRenderer3.getBaseShape();
        statisticalBarRenderer0.setBaseShape(shape6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) '4', categoryURLGenerator9, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseFillPaint(paint17);
        java.awt.Font font19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer12.setBaseItemLabelFont(font19);
        boolean boolean23 = statisticalBarRenderer12.isItemLabelVisible((int) (byte) 1, (int) (short) 1);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setSeriesItemLabelPaint((int) (byte) 1, paint25, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation28 = null;
        boolean boolean29 = statisticalBarRenderer12.removeAnnotation(categoryAnnotation28);
        boolean boolean32 = statisticalBarRenderer12.isItemLabelVisible((int) ' ', (int) (byte) 1);
        java.awt.Paint paint34 = statisticalBarRenderer12.lookupSeriesPaint((int) (byte) 0);
        java.awt.Paint paint35 = statisticalBarRenderer12.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBaseItemLabelPaint(paint35, true);
        org.jfree.chart.LegendItem legendItem40 = statisticalBarRenderer0.getLegendItem((int) '#', 1);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation41 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(legendItem40);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 10, (java.lang.Boolean) false);
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getSeriesStroke(0);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke17);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        statisticalBarRenderer0.setMaximumBarWidth((double) (byte) 1);
        java.awt.Stroke stroke10 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        int int11 = statisticalBarRenderer0.getRowCount();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseFillPaint(paint5);
        java.awt.Font font7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font7);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer18.setBaseOutlineStroke(stroke19);
        statisticalBarRenderer18.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer18.setBaseFillPaint(paint23);
        java.awt.Font font25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer18.setBaseItemLabelFont(font25);
        java.awt.Paint paint28 = statisticalBarRenderer18.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer12.setSeriesFillPaint((int) '#', paint28);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint28);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer31.setBaseOutlineStroke(stroke32);
        statisticalBarRenderer31.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer31.setBaseFillPaint(paint36);
        statisticalBarRenderer31.setMaximumBarWidth((double) (byte) 1);
        java.awt.Stroke stroke41 = statisticalBarRenderer31.lookupSeriesOutlineStroke((int) (byte) -1);
        statisticalBarRenderer0.setBaseStroke(stroke41, true);
        int int44 = statisticalBarRenderer0.getRowCount();
        java.awt.Paint paint46 = statisticalBarRenderer0.getSeriesItemLabelPaint(1);
        java.awt.Paint paint49 = statisticalBarRenderer0.getItemOutlinePaint(0, (int) (byte) 0);
        java.awt.Stroke stroke52 = statisticalBarRenderer0.getItemOutlineStroke((int) ' ', (int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer53.setBaseOutlineStroke(stroke54);
        statisticalBarRenderer53.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean58 = statisticalBarRenderer53.getBaseSeriesVisibleInLegend();
        boolean boolean59 = statisticalBarRenderer53.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer53.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer63.setMaximumBarWidth((double) 100L);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer66 = null;
        statisticalBarRenderer63.setGradientPaintTransformer(gradientPaintTransformer66);
        java.awt.Stroke stroke70 = statisticalBarRenderer63.getItemOutlineStroke((int) (byte) 10, 10);
        statisticalBarRenderer53.setBaseOutlineStroke(stroke70);
        statisticalBarRenderer53.setMaximumBarWidth((double) (short) 1);
        boolean boolean74 = statisticalBarRenderer53.getAutoPopulateSeriesPaint();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator76 = null;
        statisticalBarRenderer53.setSeriesURLGenerator((int) 'a', categoryURLGenerator76);
        boolean boolean80 = statisticalBarRenderer53.getItemVisible((int) '4', (int) (short) -1);
        java.awt.Paint paint81 = statisticalBarRenderer53.getBaseItemLabelPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition84 = statisticalBarRenderer53.getNegativeItemLabelPosition(0, (int) (byte) 0);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition84);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(stroke70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(paint81);
        org.junit.Assert.assertNotNull(itemLabelPosition84);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double7 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getPositiveItemLabelPosition(10, (int) (short) 100);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) false, true);
        boolean boolean17 = statisticalBarRenderer0.isItemLabelVisible(0, (int) '4');
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double1 = statisticalBarRenderer0.getBase();
        boolean boolean2 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) -1, categoryToolTipGenerator4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean5 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean6 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double9 = statisticalBarRenderer8.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer8.setSeriesPositiveItemLabelPosition(1, itemLabelPosition11, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer14.setBaseOutlineStroke(stroke15);
        statisticalBarRenderer14.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer14.setBaseFillPaint(paint19);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = statisticalBarRenderer14.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer8.setBasePositiveItemLabelPosition(itemLabelPosition21);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer23.setBaseOutlineStroke(stroke24);
        statisticalBarRenderer23.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean28 = statisticalBarRenderer23.getBaseSeriesVisibleInLegend();
        boolean boolean29 = statisticalBarRenderer23.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer23.setSeriesItemLabelsVisible((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer23.setIncludeBaseInRange(true);
        java.lang.Boolean boolean36 = statisticalBarRenderer23.getSeriesCreateEntities((int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer37.setBaseOutlineStroke(stroke38);
        statisticalBarRenderer37.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer37.setBaseFillPaint(paint42);
        statisticalBarRenderer37.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint47 = statisticalBarRenderer37.getSeriesPaint((int) '#');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator48 = null;
        statisticalBarRenderer37.setBaseItemLabelGenerator(categoryItemLabelGenerator48, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator51 = statisticalBarRenderer37.getLegendItemLabelGenerator();
        statisticalBarRenderer23.setLegendItemLabelGenerator(categorySeriesLabelGenerator51);
        statisticalBarRenderer8.setLegendItemURLGenerator(categorySeriesLabelGenerator51);
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator51);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer55 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke56 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer55.setBaseOutlineStroke(stroke56);
        statisticalBarRenderer55.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer55.setBaseFillPaint(paint60);
        statisticalBarRenderer55.setMaximumBarWidth((double) (byte) 1);
        java.awt.Paint paint65 = statisticalBarRenderer55.getSeriesPaint((int) '#');
        statisticalBarRenderer55.removeAnnotations();
        java.awt.Shape shape69 = statisticalBarRenderer55.getItemShape((int) (byte) 100, (int) (short) 100);
        statisticalBarRenderer0.setBaseShape(shape69);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(paint47);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator51);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNull(paint65);
        org.junit.Assert.assertNotNull(shape69);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint7 = statisticalBarRenderer0.getItemLabelPaint(100, (int) (short) 0);
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setSeriesPaint(1, paint9);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke13);
        statisticalBarRenderer12.setAutoPopulateSeriesOutlinePaint(true);
        boolean boolean17 = statisticalBarRenderer12.getBaseSeriesVisibleInLegend();
        boolean boolean18 = statisticalBarRenderer12.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer12.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        double double23 = statisticalBarRenderer22.getBase();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer22.setSeriesPositiveItemLabelPosition(1, itemLabelPosition25, false);
        java.awt.Paint paint29 = statisticalBarRenderer22.getSeriesPaint(0);
        java.lang.Boolean boolean31 = statisticalBarRenderer22.getSeriesCreateEntities((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer32.setBaseOutlineStroke(stroke33);
        statisticalBarRenderer32.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer32.setBaseFillPaint(paint37);
        java.awt.Font font39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer32.setBaseItemLabelFont(font39);
        java.awt.Stroke stroke43 = statisticalBarRenderer32.getItemOutlineStroke((int) (short) 100, (int) (byte) 1);
        statisticalBarRenderer22.setBaseOutlineStroke(stroke43);
        java.awt.Paint paint45 = statisticalBarRenderer22.getErrorIndicatorPaint();
        double double46 = statisticalBarRenderer22.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer47.setBaseOutlineStroke(stroke48);
        statisticalBarRenderer47.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Stroke stroke54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        statisticalBarRenderer53.setBaseOutlineStroke(stroke54);
        statisticalBarRenderer53.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Paint paint58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer53.setBaseFillPaint(paint58);
        java.awt.Font font60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer53.setBaseItemLabelFont(font60);
        java.awt.Paint paint63 = statisticalBarRenderer53.lookupSeriesOutlinePaint((int) (byte) 10);
        statisticalBarRenderer47.setSeriesFillPaint((int) '#', paint63);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator66 = statisticalBarRenderer47.getSeriesItemLabelGenerator((int) (short) 0);
        java.awt.Paint paint69 = statisticalBarRenderer47.getItemOutlinePaint((-1), (int) (short) 0);
        statisticalBarRenderer22.setBaseItemLabelPaint(paint69, false);
        statisticalBarRenderer12.setSeriesFillPaint((int) (short) 1, paint69);
        statisticalBarRenderer0.setSeriesPaint((int) (short) 0, paint69, false);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.data.category.CategoryDataset categoryDataset77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range78 = statisticalBarRenderer0.findRangeBounds(categoryDataset77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(font60);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertNull(categoryItemLabelGenerator66);
        org.junit.Assert.assertNotNull(paint69);
    }
}

