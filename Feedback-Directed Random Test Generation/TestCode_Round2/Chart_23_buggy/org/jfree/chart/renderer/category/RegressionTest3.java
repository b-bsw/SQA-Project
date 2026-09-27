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
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        int int1 = minMaxCategoryRenderer0.getPassCount();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = minMaxCategoryRenderer0.getItemLabelGenerator(10, (int) (short) 0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint7 = minMaxCategoryRenderer5.lookupSeriesOutlinePaint(100);
        java.awt.Paint paint9 = minMaxCategoryRenderer5.getSeriesOutlinePaint(0);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer10 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        int int11 = minMaxCategoryRenderer10.getPassCount();
        minMaxCategoryRenderer10.setBaseCreateEntities(false, false);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer15 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint17 = minMaxCategoryRenderer15.lookupSeriesOutlinePaint(100);
        java.awt.Paint paint19 = minMaxCategoryRenderer15.getSeriesOutlinePaint(0);
        javax.swing.Icon icon20 = minMaxCategoryRenderer15.getMaxIcon();
        java.awt.Stroke stroke23 = minMaxCategoryRenderer15.getItemStroke((int) (short) 100, (int) (byte) 100);
        minMaxCategoryRenderer10.setGroupStroke(stroke23);
        minMaxCategoryRenderer5.setGroupStroke(stroke23);
        boolean boolean26 = minMaxCategoryRenderer0.equals((java.lang.Object) minMaxCategoryRenderer5);
        minMaxCategoryRenderer5.setBaseSeriesVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = minMaxCategoryRenderer5.getNegativeItemLabelPosition(100, (int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(icon20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.lookupSeriesOutlinePaint(100);
        boolean boolean3 = minMaxCategoryRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator5 = minMaxCategoryRenderer0.getSeriesToolTipGenerator(1);
        java.awt.Stroke stroke6 = minMaxCategoryRenderer0.getBaseStroke();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer7 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint9 = minMaxCategoryRenderer7.lookupSeriesOutlinePaint(100);
        java.awt.Paint paint11 = minMaxCategoryRenderer7.getSeriesOutlinePaint(0);
        javax.swing.Icon icon12 = minMaxCategoryRenderer7.getMaxIcon();
        java.awt.Stroke stroke15 = minMaxCategoryRenderer7.getItemStroke((int) (short) 100, (int) (byte) 100);
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke15, false);
        java.awt.Stroke stroke19 = minMaxCategoryRenderer0.getSeriesOutlineStroke((int) '#');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator20 = null;
        minMaxCategoryRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator20);
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = minMaxCategoryRenderer0.hasListener(eventListener22);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        minMaxCategoryRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator25, false);
        boolean boolean28 = minMaxCategoryRenderer0.getBaseCreateEntities();
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        // The following exception was thrown during execution in test generation
        try {
            minMaxCategoryRenderer0.drawOutline(graphics2D29, categoryPlot30, rectangle2D31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(icon12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.lookupSeriesOutlinePaint(100);
        java.awt.Paint paint4 = minMaxCategoryRenderer0.getSeriesOutlinePaint(0);
        int int5 = minMaxCategoryRenderer0.getRowCount();
        java.awt.Font font7 = minMaxCategoryRenderer0.getSeriesItemLabelFont(100);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = minMaxCategoryRenderer8.getSeriesNegativeItemLabelPosition(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        minMaxCategoryRenderer8.setBaseItemLabelGenerator(categoryItemLabelGenerator11);
        java.lang.Boolean boolean14 = minMaxCategoryRenderer8.getSeriesCreateEntities((int) (short) 100);
        minMaxCategoryRenderer8.setBaseSeriesVisible(true);
        minMaxCategoryRenderer8.setItemLabelAnchorOffset(0.0d);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer19 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint21 = minMaxCategoryRenderer19.lookupSeriesOutlinePaint(100);
        boolean boolean22 = minMaxCategoryRenderer19.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = minMaxCategoryRenderer19.getSeriesToolTipGenerator(1);
        java.awt.Stroke stroke25 = minMaxCategoryRenderer19.getBaseStroke();
        minMaxCategoryRenderer8.setGroupStroke(stroke25);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer27 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint29 = minMaxCategoryRenderer27.lookupSeriesOutlinePaint(100);
        boolean boolean30 = minMaxCategoryRenderer27.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = minMaxCategoryRenderer27.getSeriesToolTipGenerator(1);
        java.awt.Stroke stroke33 = minMaxCategoryRenderer27.getBaseStroke();
        minMaxCategoryRenderer8.setBaseOutlineStroke(stroke33);
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke33, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) '4');
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = minMaxCategoryRenderer0.hasListener(eventListener39);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = minMaxCategoryRenderer0.getURLGenerator(100, (int) 'a');
        boolean boolean44 = minMaxCategoryRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(categoryURLGenerator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = minMaxCategoryRenderer0.getSeriesNegativeItemLabelPosition(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = null;
        minMaxCategoryRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator3);
        boolean boolean6 = minMaxCategoryRenderer0.isSeriesItemLabelsVisible((int) '4');
        minMaxCategoryRenderer0.setSeriesItemLabelsVisible((int) (short) 0, (java.lang.Boolean) true, false);
        java.awt.Stroke stroke12 = minMaxCategoryRenderer0.lookupSeriesStroke((int) (byte) -1);
        org.junit.Assert.assertNotNull(itemLabelPosition2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.lookupSeriesOutlinePaint(100);
        java.awt.Paint paint4 = minMaxCategoryRenderer0.getSeriesOutlinePaint(0);
        int int5 = minMaxCategoryRenderer0.getRowCount();
        java.awt.Font font7 = minMaxCategoryRenderer0.getSeriesItemLabelFont(100);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer8 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = minMaxCategoryRenderer8.getSeriesNegativeItemLabelPosition(1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        minMaxCategoryRenderer8.setBaseItemLabelGenerator(categoryItemLabelGenerator11);
        java.lang.Boolean boolean14 = minMaxCategoryRenderer8.getSeriesCreateEntities((int) (short) 100);
        minMaxCategoryRenderer8.setBaseSeriesVisible(true);
        minMaxCategoryRenderer8.setItemLabelAnchorOffset(0.0d);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer19 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint21 = minMaxCategoryRenderer19.lookupSeriesOutlinePaint(100);
        boolean boolean22 = minMaxCategoryRenderer19.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = minMaxCategoryRenderer19.getSeriesToolTipGenerator(1);
        java.awt.Stroke stroke25 = minMaxCategoryRenderer19.getBaseStroke();
        minMaxCategoryRenderer8.setGroupStroke(stroke25);
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer27 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint29 = minMaxCategoryRenderer27.lookupSeriesOutlinePaint(100);
        boolean boolean30 = minMaxCategoryRenderer27.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = minMaxCategoryRenderer27.getSeriesToolTipGenerator(1);
        java.awt.Stroke stroke33 = minMaxCategoryRenderer27.getBaseStroke();
        minMaxCategoryRenderer8.setBaseOutlineStroke(stroke33);
        minMaxCategoryRenderer0.setBaseOutlineStroke(stroke33, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = minMaxCategoryRenderer0.getSeriesPositiveItemLabelPosition((int) '4');
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = minMaxCategoryRenderer0.hasListener(eventListener39);
        int int41 = minMaxCategoryRenderer0.getColumnCount();
        java.awt.Shape shape42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        minMaxCategoryRenderer0.setBaseShape(shape42, false);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(shape42);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint2 = minMaxCategoryRenderer0.lookupSeriesOutlinePaint(100);
        java.awt.Paint paint4 = minMaxCategoryRenderer0.getSeriesOutlinePaint(0);
        boolean boolean7 = minMaxCategoryRenderer0.getItemVisible((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = minMaxCategoryRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        minMaxCategoryRenderer0.setBaseURLGenerator(categoryURLGenerator9, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = null;
        minMaxCategoryRenderer0.setSeriesItemLabelGenerator(1, categoryItemLabelGenerator13, false);
        java.awt.Shape shape18 = minMaxCategoryRenderer0.getItemShape((-1), (int) (short) 10);
        minMaxCategoryRenderer0.setBaseCreateEntities(true, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        minMaxCategoryRenderer0.setSeriesURLGenerator((int) '#', categoryURLGenerator23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = minMaxCategoryRenderer0.getPositiveItemLabelPosition(100, (int) (byte) 0);
        minMaxCategoryRenderer0.removeAnnotations();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer29 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint31 = minMaxCategoryRenderer29.lookupSeriesOutlinePaint(100);
        boolean boolean32 = minMaxCategoryRenderer29.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = minMaxCategoryRenderer29.getSeriesToolTipGenerator(1);
        java.awt.Stroke stroke35 = minMaxCategoryRenderer29.getBaseStroke();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer36 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint38 = minMaxCategoryRenderer36.lookupSeriesOutlinePaint(100);
        java.awt.Paint paint40 = minMaxCategoryRenderer36.getSeriesOutlinePaint(0);
        javax.swing.Icon icon41 = minMaxCategoryRenderer36.getMaxIcon();
        java.awt.Stroke stroke44 = minMaxCategoryRenderer36.getItemStroke((int) (short) 100, (int) (byte) 100);
        minMaxCategoryRenderer29.setBaseOutlineStroke(stroke44, false);
        java.awt.Stroke stroke48 = minMaxCategoryRenderer29.getSeriesOutlineStroke((int) '#');
        java.awt.Font font50 = null;
        minMaxCategoryRenderer29.setSeriesItemLabelFont((int) (short) 0, font50, true);
        java.awt.Font font55 = minMaxCategoryRenderer29.getItemLabelFont((int) (short) 100, (int) (short) 100);
        boolean boolean56 = minMaxCategoryRenderer29.getAutoPopulateSeriesPaint();
        boolean boolean57 = minMaxCategoryRenderer29.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer58 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        java.awt.Paint paint60 = minMaxCategoryRenderer58.lookupSeriesOutlinePaint(100);
        java.awt.Paint paint61 = minMaxCategoryRenderer58.getBaseOutlinePaint();
        java.awt.Font font63 = minMaxCategoryRenderer58.getSeriesItemLabelFont((int) '#');
        org.jfree.chart.renderer.category.MinMaxCategoryRenderer minMaxCategoryRenderer64 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition66 = minMaxCategoryRenderer64.getSeriesNegativeItemLabelPosition(1);
        boolean boolean67 = minMaxCategoryRenderer64.isDrawLines();
        java.awt.Shape shape68 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        minMaxCategoryRenderer64.setBaseShape(shape68, true);
        minMaxCategoryRenderer58.setBaseShape(shape68);
        java.awt.Paint paint74 = minMaxCategoryRenderer58.getItemPaint(0, (int) (short) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator75 = minMaxCategoryRenderer58.getLegendItemLabelGenerator();
        minMaxCategoryRenderer29.setLegendItemLabelGenerator(categorySeriesLabelGenerator75);
        minMaxCategoryRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator75);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNotNull(icon41);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNull(stroke48);
        org.junit.Assert.assertNotNull(font55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNull(font63);
        org.junit.Assert.assertNotNull(itemLabelPosition66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(shape68);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator75);
    }
}

