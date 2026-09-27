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
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        double double7 = valueMarker1.getValue();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.lang.String str9 = valueMarker1.getLabel();
        double double10 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke5 = valueMarker4.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker4.getLabelTextAnchor();
        valueMarker4.setValue((double) 0L);
        java.awt.Font font9 = valueMarker4.getLabelFont();
        valueMarker1.setLabelFont(font9);
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = valueMarker13.equals((java.lang.Object) wildcardClass15);
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker13.getLabelTextAnchor();
        java.awt.Stroke stroke18 = valueMarker13.getOutlineStroke();
        java.lang.Class<?> wildcardClass19 = stroke18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray20 = valueMarker1.getListeners((java.lang.Class) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.awt.BasicStroke; cannot be cast to class [Ljava.util.EventListener; ([Ljava.awt.BasicStroke; is in module java.desktop of loader 'bootstrap'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.lang.String str12 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker14.getLabelTextAnchor();
        java.awt.Paint paint18 = valueMarker14.getOutlinePaint();
        float float19 = valueMarker14.getAlpha();
        java.awt.Stroke stroke20 = valueMarker14.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker14.addChangeListener(markerChangeListener21);
        java.awt.Stroke stroke23 = valueMarker14.getStroke();
        java.awt.Font font24 = valueMarker14.getLabelFont();
        valueMarker1.setLabelFont(font24);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker1.getLabelAnchor();
        double double27 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker1.removeChangeListener(markerChangeListener28);
        java.awt.Paint paint30 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker1.addChangeListener(markerChangeListener31);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) (byte) -1);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint18 = valueMarker17.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker17.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker17.getLabelTextAnchor();
        valueMarker17.setLabel("");
        double double23 = valueMarker17.getValue();
        valueMarker17.setLabel("hi!");
        java.awt.Stroke stroke26 = valueMarker17.getOutlineStroke();
        valueMarker1.setStroke(stroke26);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        java.awt.Font font14 = valueMarker9.getLabelFont();
        valueMarker1.setLabelFont(font14);
        valueMarker1.setValue((double) (byte) 100);
        java.awt.Paint paint18 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.lang.Class<?> wildcardClass5 = valueMarker1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke14 = valueMarker13.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker13.getLabelTextAnchor();
        valueMarker13.setValue((double) 0L);
        java.awt.Font font18 = valueMarker13.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke21 = valueMarker20.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker20.getLabelTextAnchor();
        java.awt.Stroke stroke23 = valueMarker20.getOutlineStroke();
        valueMarker13.setStroke(stroke23);
        valueMarker1.setOutlineStroke(stroke23);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint28 = valueMarker1.getOutlinePaint();
        double double29 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker1.notifyListeners(markerChangeEvent30);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker11.getOutlinePaint();
        float float16 = valueMarker11.getAlpha();
        java.awt.Stroke stroke17 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke21 = valueMarker20.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker20.getLabelOffsetType();
        java.awt.Paint paint23 = valueMarker20.getPaint();
        valueMarker20.setLabel("hi!");
        float float26 = valueMarker20.getAlpha();
        java.awt.Paint paint27 = valueMarker20.getLabelPaint();
        java.awt.Paint paint28 = valueMarker20.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        boolean boolean33 = valueMarker30.equals((java.lang.Object) wildcardClass32);
        java.awt.Paint paint34 = valueMarker30.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        valueMarker30.notifyListeners(markerChangeEvent35);
        valueMarker30.setAlpha(0.0f);
        java.awt.Paint paint39 = valueMarker30.getOutlinePaint();
        java.awt.Stroke stroke40 = valueMarker30.getOutlineStroke();
        valueMarker20.setOutlineStroke(stroke40);
        valueMarker1.setStroke(stroke40);
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke40);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        valueMarker1.setAlpha((float) 0L);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = valueMarker16.equals((java.lang.Object) wildcardClass18);
        java.awt.Paint paint20 = valueMarker16.getPaint();
        valueMarker16.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        boolean boolean27 = valueMarker24.equals((java.lang.Object) wildcardClass26);
        java.awt.Stroke stroke28 = valueMarker24.getOutlineStroke();
        java.awt.Stroke stroke29 = valueMarker24.getOutlineStroke();
        valueMarker16.setStroke(stroke29);
        java.awt.Font font31 = valueMarker16.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker16.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker16.getLabelAnchor();
        java.lang.Class<?> wildcardClass34 = rectangleAnchor33.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray35 = valueMarker1.getListeners((java.lang.Class) wildcardClass34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.util.RectangleAnchor; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.util.RectangleAnchor; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker6.setValue((double) 0L);
        java.awt.Font font10 = valueMarker6.getLabelFont();
        java.awt.Paint paint11 = valueMarker6.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker6.removeChangeListener(markerChangeListener12);
        java.awt.Paint paint14 = valueMarker6.getPaint();
        valueMarker1.setLabelPaint(paint14);
        java.awt.Font font16 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint19 = valueMarker18.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker18.getLabelTextAnchor();
        java.awt.Paint paint22 = valueMarker18.getOutlinePaint();
        float float23 = valueMarker18.getAlpha();
        double double24 = valueMarker18.getValue();
        java.awt.Paint paint25 = valueMarker18.getLabelPaint();
        valueMarker1.setPaint(paint25);
        java.awt.Paint paint27 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke7 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        java.awt.Stroke stroke7 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        float float10 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker14.getLabelTextAnchor();
        valueMarker14.setLabel("");
        double double20 = valueMarker14.getValue();
        java.awt.Stroke stroke21 = valueMarker14.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.addChangeListener(markerChangeListener23);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        valueMarker9.setLabel("");
        boolean boolean16 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        double double24 = valueMarker1.getValue();
        java.lang.String str25 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.lang.String str9 = valueMarker1.getLabel();
        java.lang.String str10 = valueMarker1.getLabel();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.lang.String str3 = valueMarker1.getLabel();
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker1.notifyListeners(markerChangeEvent5);
        java.awt.Stroke stroke7 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker8.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker8.getPaint();
        valueMarker8.setLabel("hi!");
        valueMarker8.setValue((double) '#');
        valueMarker8.setAlpha((float) 0L);
        java.awt.Paint paint18 = valueMarker8.getPaint();
        valueMarker1.setLabelPaint(paint18);
        valueMarker1.setLabel("");
        java.lang.String str22 = valueMarker1.getLabel();
        java.awt.Font font23 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.lang.String str4 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        boolean boolean10 = valueMarker7.equals((java.lang.Object) wildcardClass9);
        java.awt.Paint paint11 = valueMarker7.getPaint();
        valueMarker7.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        boolean boolean18 = valueMarker15.equals((java.lang.Object) wildcardClass17);
        java.awt.Stroke stroke19 = valueMarker15.getOutlineStroke();
        java.awt.Stroke stroke20 = valueMarker15.getOutlineStroke();
        valueMarker7.setStroke(stroke20);
        java.awt.Paint paint22 = valueMarker7.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker7.getOutlinePaint();
        java.awt.Paint paint24 = valueMarker7.getPaint();
        valueMarker1.setLabelPaint(paint24);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker1.addChangeListener(markerChangeListener26);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker8);
        java.lang.String str11 = valueMarker8.getLabel();
        java.awt.Paint paint12 = valueMarker8.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint14 = valueMarker8.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker8.addChangeListener(markerChangeListener15);
        valueMarker8.setLabel("");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = valueMarker3.equals((java.lang.Object) wildcardClass5);
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker3.getLabelTextAnchor();
        java.awt.Stroke stroke8 = valueMarker3.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker3.getLabelOffsetType();
        java.awt.Paint paint10 = valueMarker3.getLabelPaint();
        java.awt.Stroke stroke11 = valueMarker3.getOutlineStroke();
        java.lang.Class<?> wildcardClass12 = stroke11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray13 = valueMarker1.getListeners((java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.awt.BasicStroke; cannot be cast to class [Ljava.util.EventListener; ([Ljava.awt.BasicStroke; is in module java.desktop of loader 'bootstrap'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = valueMarker9.equals((java.lang.Object) wildcardClass11);
        java.awt.Paint paint13 = valueMarker9.getPaint();
        valueMarker9.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker9.getLabelTextAnchor();
        java.awt.Font font17 = valueMarker9.getLabelFont();
        valueMarker1.setLabelFont(font17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint21 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker20.getLabelTextAnchor();
        java.awt.Paint paint24 = valueMarker20.getOutlinePaint();
        valueMarker20.setValue((double) 1);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker20.addChangeListener(markerChangeListener27);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint31 = valueMarker30.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker30.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker30.addChangeListener(markerChangeListener33);
        java.awt.Paint paint35 = valueMarker30.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker30.addChangeListener(markerChangeListener36);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker30.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor39 = valueMarker30.getLabelTextAnchor();
        java.awt.Stroke stroke40 = valueMarker30.getOutlineStroke();
        valueMarker20.setOutlineStroke(stroke40);
        boolean boolean42 = valueMarker1.equals((java.lang.Object) stroke40);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(rectangleAnchor38);
        org.junit.Assert.assertNotNull(textAnchor39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        valueMarker1.setLabel("hi!");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker1.notifyListeners(markerChangeEvent5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        boolean boolean11 = valueMarker8.equals((java.lang.Object) wildcardClass10);
        java.awt.Paint paint12 = valueMarker8.getPaint();
        valueMarker8.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = valueMarker16.equals((java.lang.Object) wildcardClass18);
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        java.awt.Stroke stroke21 = valueMarker16.getOutlineStroke();
        valueMarker8.setStroke(stroke21);
        java.awt.Font font23 = valueMarker8.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker8.getLabelOffsetType();
        valueMarker8.setValue((double) 0L);
        float float27 = valueMarker8.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker8.getLabelOffset();
        valueMarker8.setValue(100.0d);
        java.awt.Stroke stroke31 = valueMarker8.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        valueMarker8.notifyListeners(markerChangeEvent32);
        boolean boolean34 = valueMarker1.equals((java.lang.Object) markerChangeEvent32);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        java.awt.Font font9 = valueMarker1.getLabelFont();
        double double10 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke8 = valueMarker1.getStroke();
        valueMarker1.setLabel("");
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        float float12 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint11 = valueMarker10.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker10.getLabelTextAnchor();
        java.awt.Paint paint14 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint15 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker10.getLabelPaint();
        valueMarker1.setOutlinePaint(paint16);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker1.getLabelAnchor();
        float float20 = valueMarker1.getAlpha();
        java.awt.Stroke stroke21 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint6 = valueMarker5.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker5.getLabelOffsetType();
        java.awt.Stroke stroke8 = valueMarker5.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        double double15 = valueMarker1.getValue();
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        java.lang.String str7 = valueMarker1.getLabel();
        java.lang.String str8 = valueMarker1.getLabel();
        float float9 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        java.awt.Font font14 = valueMarker9.getLabelFont();
        valueMarker1.setLabelFont(font14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = valueMarker19.equals((java.lang.Object) wildcardClass21);
        java.awt.Paint paint23 = valueMarker19.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        valueMarker19.notifyListeners(markerChangeEvent24);
        valueMarker19.setAlpha(0.0f);
        java.awt.Paint paint28 = valueMarker19.getOutlinePaint();
        valueMarker1.setPaint(paint28);
        float float30 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke33 = valueMarker32.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker32.getLabelTextAnchor();
        valueMarker32.setValue((double) 0L);
        valueMarker32.setLabel("");
        float float39 = valueMarker32.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker32.getLabelTextAnchor();
        java.awt.Font font41 = valueMarker32.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor42 = valueMarker32.getLabelAnchor();
        java.awt.Stroke stroke43 = valueMarker32.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        boolean boolean48 = valueMarker45.equals((java.lang.Object) wildcardClass47);
        java.awt.Font font49 = valueMarker45.getLabelFont();
        valueMarker32.setLabelFont(font49);
        valueMarker32.setLabel("hi!");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType53 = valueMarker32.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType53);
        java.awt.Paint paint55 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(textAnchor34);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.8f + "'", float39 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor40);
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertNotNull(rectangleAnchor42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(lengthAdjustmentType53);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = valueMarker5.equals((java.lang.Object) wildcardClass7);
        java.awt.Paint paint9 = valueMarker5.getPaint();
        valueMarker5.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        valueMarker5.setLabelOffset(rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke20 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        valueMarker1.setLabel("hi!");
        valueMarker1.setLabel("");
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke14 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint17 = valueMarker16.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        java.awt.Paint paint21 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker16.removeChangeListener(markerChangeListener23);
        java.awt.Paint paint25 = valueMarker16.getOutlinePaint();
        valueMarker1.setPaint(paint25);
        java.awt.Paint paint27 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        java.awt.Stroke stroke14 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker1.getLabelOffset();
        java.lang.Class<?> wildcardClass18 = rectangleInsets17.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        java.awt.Stroke stroke7 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        java.lang.Object obj10 = valueMarker1.clone();
        org.jfree.chart.text.TextAnchor textAnchor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelTextAnchor(textAnchor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor8);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.awt.Paint paint1 = null;
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) 0);
        double double4 = valueMarker3.getValue();
        java.awt.Stroke stroke5 = valueMarker3.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker(10.0d, paint1, stroke5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        float float12 = valueMarker7.getAlpha();
        java.awt.Stroke stroke13 = valueMarker7.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker7.addChangeListener(markerChangeListener14);
        java.awt.Stroke stroke16 = valueMarker7.getStroke();
        java.awt.Font font17 = valueMarker7.getLabelFont();
        java.awt.Stroke stroke18 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke18);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker1.getLabelTextAnchor();
        double double21 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker1.notifyListeners(markerChangeEvent22);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.lang.String str12 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        float float15 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        float float18 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker6.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.removeChangeListener(markerChangeListener13);
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke18 = valueMarker17.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker17.getLabelTextAnchor();
        valueMarker17.setValue((double) 0L);
        valueMarker17.setLabel("");
        float float24 = valueMarker17.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker17.getLabelTextAnchor();
        java.awt.Font font26 = valueMarker17.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker17.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor27);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker1.addChangeListener(markerChangeListener29);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker1.removeChangeListener(markerChangeListener31);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker1.getLabelAnchor();
        java.lang.String str11 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        float float7 = valueMarker1.getAlpha();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = valueMarker11.equals((java.lang.Object) wildcardClass13);
        java.awt.Paint paint15 = valueMarker11.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker11.notifyListeners(markerChangeEvent16);
        valueMarker11.setAlpha(0.0f);
        java.awt.Paint paint20 = valueMarker11.getOutlinePaint();
        java.awt.Stroke stroke21 = valueMarker11.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint25 = valueMarker24.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker24.getLabelTextAnchor();
        java.awt.Paint paint28 = valueMarker24.getOutlinePaint();
        float float29 = valueMarker24.getAlpha();
        java.awt.Stroke stroke30 = valueMarker24.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker24.addChangeListener(markerChangeListener31);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker24.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor34 = valueMarker24.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor34);
        java.awt.Paint paint36 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke37 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.8f + "'", float29 == 0.8f);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
        org.junit.Assert.assertNotNull(textAnchor34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        java.awt.Stroke stroke14 = valueMarker1.getOutlineStroke();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker1.getLabelTextAnchor();
        double double18 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.lang.String str3 = valueMarker1.getLabel();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker1.removeChangeListener(markerChangeListener6);
        valueMarker1.setValue((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke12 = valueMarker11.getStroke();
        valueMarker11.setValue((double) 0L);
        float float15 = valueMarker11.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker11.getLabelOffset();
        java.awt.Paint paint17 = valueMarker11.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = valueMarker19.equals((java.lang.Object) wildcardClass21);
        java.awt.Stroke stroke23 = valueMarker19.getOutlineStroke();
        java.awt.Stroke stroke24 = valueMarker19.getOutlineStroke();
        valueMarker19.setAlpha((float) (short) 0);
        java.awt.Paint paint27 = valueMarker19.getLabelPaint();
        java.lang.String str28 = valueMarker19.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType29 = valueMarker19.getLabelOffsetType();
        double double30 = valueMarker19.getValue();
        double double31 = valueMarker19.getValue();
        java.lang.String str32 = valueMarker19.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke37 = valueMarker36.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker36.getLabelTextAnchor();
        valueMarker36.setValue((double) 0L);
        valueMarker36.setLabel("");
        float float43 = valueMarker36.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker36.getLabelTextAnchor();
        java.awt.Font font45 = valueMarker36.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor46 = valueMarker36.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint49 = valueMarker48.getOutlinePaint();
        valueMarker36.setLabelPaint(paint49);
        valueMarker34.setPaint(paint49);
        valueMarker19.setPaint(paint49);
        valueMarker11.setOutlinePaint(paint49);
        valueMarker1.setOutlinePaint(paint49);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(lengthAdjustmentType29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(textAnchor38);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.8f + "'", float43 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertNotNull(font45);
        org.junit.Assert.assertNotNull(rectangleAnchor46);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        float float12 = valueMarker7.getAlpha();
        java.awt.Stroke stroke13 = valueMarker7.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker7.addChangeListener(markerChangeListener14);
        java.awt.Stroke stroke16 = valueMarker7.getStroke();
        java.awt.Font font17 = valueMarker7.getLabelFont();
        java.awt.Stroke stroke18 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke18);
        java.awt.Font font20 = valueMarker1.getLabelFont();
        double double21 = valueMarker1.getValue();
        java.awt.Paint paint22 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        float float5 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) 1L);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        double double9 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker11.getOutlinePaint();
        float float16 = valueMarker11.getAlpha();
        java.awt.Stroke stroke17 = valueMarker11.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker11.addChangeListener(markerChangeListener18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker11.getLabelAnchor();
        boolean boolean21 = valueMarker1.equals((java.lang.Object) valueMarker11);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) -1);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke4 = valueMarker3.getStroke();
        valueMarker3.setValue((double) 0L);
        java.awt.Font font7 = valueMarker3.getLabelFont();
        java.awt.Paint paint8 = valueMarker3.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker3.removeChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker3.getPaint();
        valueMarker1.setPaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = valueMarker14.equals((java.lang.Object) wildcardClass16);
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke18);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke12 = valueMarker11.getStroke();
        valueMarker11.setValue((double) 0L);
        java.awt.Font font15 = valueMarker11.getLabelFont();
        java.awt.Paint paint16 = valueMarker11.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker11.getLabelAnchor();
        valueMarker11.setValue((double) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker11.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets21);
        java.awt.Font font23 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '4');
        org.jfree.chart.text.TextAnchor textAnchor2 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke5 = valueMarker4.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker7.getLabelTextAnchor();
        valueMarker7.setValue((double) 0L);
        java.awt.Font font12 = valueMarker7.getLabelFont();
        valueMarker4.setLabelFont(font12);
        java.awt.Paint paint14 = valueMarker4.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint14);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(textAnchor2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = valueMarker5.equals((java.lang.Object) wildcardClass7);
        java.awt.Paint paint9 = valueMarker5.getPaint();
        valueMarker5.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        valueMarker5.setLabelOffset(rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        double double18 = valueMarker1.getValue();
        valueMarker1.setLabel("");
        java.awt.Stroke stroke21 = valueMarker1.getOutlineStroke();
        float float22 = valueMarker1.getAlpha();
        double double23 = valueMarker1.getValue();
        java.awt.Paint paint24 = valueMarker1.getLabelPaint();
        java.awt.Paint paint25 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        float float8 = valueMarker1.getAlpha();
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        valueMarker1.notifyListeners(markerChangeEvent11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        float float2 = valueMarker1.getAlpha();
        double double3 = valueMarker1.getValue();
        valueMarker1.setLabel("");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8f + "'", float2 == 0.8f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint11);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint14 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        double double17 = valueMarker1.getValue();
        valueMarker1.setValue((double) 0.8f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint3 = valueMarker2.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker2.addChangeListener(markerChangeListener8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker2.addChangeListener(markerChangeListener10);
        valueMarker2.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        valueMarker15.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke21 = valueMarker20.getStroke();
        valueMarker15.setOutlineStroke(stroke21);
        valueMarker2.setStroke(stroke21);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker2.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke27 = valueMarker26.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker26.getLabelOffsetType();
        java.awt.Paint paint29 = valueMarker26.getPaint();
        valueMarker26.setLabel("hi!");
        float float32 = valueMarker26.getAlpha();
        java.awt.Font font33 = valueMarker26.getLabelFont();
        valueMarker2.setLabelFont(font33);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke37 = valueMarker36.getStroke();
        valueMarker36.setAlpha((float) 1);
        java.awt.Stroke stroke40 = valueMarker36.getStroke();
        valueMarker2.setStroke(stroke40);
        java.awt.Paint paint42 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        boolean boolean47 = valueMarker44.equals((java.lang.Object) wildcardClass46);
        java.awt.Font font48 = valueMarker44.getLabelFont();
        java.awt.Paint paint49 = valueMarker44.getPaint();
        java.awt.Stroke stroke50 = valueMarker44.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) 100.0f, paint42, stroke50);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0.8f);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (-1L));
        java.lang.String str4 = valueMarker3.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker3.notifyListeners(markerChangeEvent5);
        boolean boolean7 = valueMarker1.equals((java.lang.Object) markerChangeEvent5);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker7.getLabelTextAnchor();
        valueMarker7.setValue((double) 0L);
        valueMarker7.setLabel("");
        float float14 = valueMarker7.getAlpha();
        java.awt.Paint paint15 = valueMarker7.getPaint();
        java.awt.Stroke stroke16 = valueMarker7.getStroke();
        valueMarker1.setOutlineStroke(stroke16);
        java.awt.Paint paint18 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint21 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker20.getLabelTextAnchor();
        java.awt.Paint paint24 = valueMarker20.getOutlinePaint();
        float float25 = valueMarker20.getAlpha();
        java.awt.Stroke stroke26 = valueMarker20.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker20.addChangeListener(markerChangeListener27);
        java.awt.Stroke stroke29 = valueMarker20.getStroke();
        java.awt.Stroke stroke30 = valueMarker20.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker20.removeChangeListener(markerChangeListener31);
        java.awt.Paint paint33 = valueMarker20.getPaint();
        java.awt.Paint paint34 = valueMarker20.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke37 = valueMarker36.getStroke();
        valueMarker36.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke42 = valueMarker41.getStroke();
        valueMarker36.setOutlineStroke(stroke42);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        valueMarker36.notifyListeners(markerChangeEvent44);
        java.awt.Paint paint46 = valueMarker36.getLabelPaint();
        valueMarker20.setOutlinePaint(paint46);
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke50 = valueMarker49.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType51 = valueMarker49.getLabelOffsetType();
        java.awt.Paint paint52 = valueMarker49.getPaint();
        valueMarker49.setLabel("hi!");
        valueMarker49.setValue((double) '#');
        valueMarker49.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = valueMarker49.getLabelOffset();
        valueMarker20.setLabelOffset(rectangleInsets59);
        valueMarker1.setLabelOffset(rectangleInsets59);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType62 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(lengthAdjustmentType51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(lengthAdjustmentType62);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.lang.String str3 = valueMarker1.getLabel();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        float float5 = valueMarker1.getAlpha();
        java.awt.Paint paint6 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke12 = valueMarker11.getStroke();
        valueMarker11.setValue((double) 0L);
        java.awt.Font font15 = valueMarker11.getLabelFont();
        java.awt.Paint paint16 = valueMarker11.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker11.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType17);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        float float12 = valueMarker7.getAlpha();
        java.awt.Stroke stroke13 = valueMarker7.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker7.addChangeListener(markerChangeListener14);
        java.awt.Stroke stroke16 = valueMarker7.getStroke();
        java.awt.Font font17 = valueMarker7.getLabelFont();
        java.awt.Stroke stroke18 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke18);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker11.getOutlinePaint();
        float float16 = valueMarker11.getAlpha();
        java.awt.Stroke stroke17 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke17);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker1.notifyListeners(markerChangeEvent21);
        java.awt.Paint paint23 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke24 = valueMarker1.getOutlineStroke();
        valueMarker1.setValue((double) 1L);
        java.lang.Class<?> wildcardClass27 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint3 = valueMarker2.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker2.getLabelOffsetType();
        java.lang.String str5 = valueMarker2.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint10 = valueMarker9.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker9.getLabelOffsetType();
        java.awt.Stroke stroke12 = valueMarker9.getOutlineStroke();
        double double13 = valueMarker9.getValue();
        valueMarker9.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker9.getLabelOffsetType();
        valueMarker2.setLabelOffsetType(lengthAdjustmentType16);
        java.awt.Paint paint18 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint21 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker20.getLabelTextAnchor();
        java.awt.Paint paint24 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker20.getLabelAnchor();
        float float26 = valueMarker20.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke29 = valueMarker28.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker28.getLabelTextAnchor();
        valueMarker28.setValue((double) 0L);
        valueMarker28.setLabel("");
        boolean boolean35 = valueMarker20.equals((java.lang.Object) "");
        java.awt.Stroke stroke36 = valueMarker20.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker38 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke39 = valueMarker38.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor40 = valueMarker38.getLabelTextAnchor();
        valueMarker38.setValue((double) 0L);
        valueMarker38.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor45 = valueMarker38.getLabelTextAnchor();
        java.lang.String str46 = valueMarker38.getLabel();
        java.lang.String str47 = valueMarker38.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker49 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj50 = new java.lang.Object();
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        boolean boolean52 = valueMarker49.equals((java.lang.Object) wildcardClass51);
        org.jfree.chart.text.TextAnchor textAnchor53 = valueMarker49.getLabelTextAnchor();
        java.awt.Stroke stroke54 = valueMarker49.getOutlineStroke();
        valueMarker38.setOutlineStroke(stroke54);
        java.awt.Paint paint56 = valueMarker38.getPaint();
        java.awt.Stroke stroke57 = valueMarker38.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType58 = valueMarker38.getLabelOffsetType();
        java.awt.Paint paint59 = valueMarker38.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        boolean boolean64 = valueMarker61.equals((java.lang.Object) wildcardClass63);
        java.awt.Paint paint65 = valueMarker61.getPaint();
        valueMarker61.setAlpha(0.0f);
        java.awt.Stroke stroke68 = valueMarker61.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker70 = new org.jfree.chart.plot.ValueMarker((double) 0.8f, paint18, stroke36, paint59, stroke68, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(textAnchor30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(textAnchor40);
        org.junit.Assert.assertNotNull(textAnchor45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(textAnchor53);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(lengthAdjustmentType58);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(stroke68);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker1.getLabelOffsetType();
        java.lang.String str6 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint3 = valueMarker2.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker2.getLabelTextAnchor();
        java.awt.Paint paint6 = valueMarker2.getOutlinePaint();
        java.awt.Paint paint7 = valueMarker2.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker2.removeChangeListener(markerChangeListener8);
        java.awt.Paint paint10 = valueMarker2.getLabelPaint();
        java.awt.Stroke stroke11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) 10, paint10, stroke11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        java.lang.String str13 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        valueMarker9.setLabel("");
        boolean boolean16 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker8.getLabelTextAnchor();
        java.awt.Stroke stroke11 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        java.awt.Font font13 = valueMarker1.getLabelFont();
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.addChangeListener(markerChangeListener15);
        double double17 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.addChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint6 = valueMarker5.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker5.addChangeListener(markerChangeListener7);
        valueMarker5.setLabel("");
        java.lang.String str11 = valueMarker5.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke14 = valueMarker13.getStroke();
        valueMarker13.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke19 = valueMarker18.getStroke();
        valueMarker13.setOutlineStroke(stroke19);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker13.notifyListeners(markerChangeEvent21);
        java.awt.Paint paint23 = valueMarker13.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker13.getLabelOffset();
        valueMarker5.setLabelOffset(rectangleInsets24);
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker5.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor26);
        float float28 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(textAnchor26);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.8f + "'", float28 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        float float7 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker8);
        java.lang.String str11 = valueMarker8.getLabel();
        java.awt.Paint paint12 = valueMarker8.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker8.getLabelAnchor();
        valueMarker8.setAlpha((float) 0);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker8.notifyListeners(markerChangeEvent16);
        valueMarker8.setValue(0.0d);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        valueMarker9.setLabel("");
        boolean boolean16 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker1.getLabelOffset();
        valueMarker1.setValue((double) (-1));
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint23 = valueMarker22.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker22.getLabelTextAnchor();
        java.awt.Paint paint26 = valueMarker22.getOutlinePaint();
        float float27 = valueMarker22.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker22.addChangeListener(markerChangeListener28);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker22.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 100L);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.String str13 = valueMarker12.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker12.removeChangeListener(markerChangeListener14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke18 = valueMarker17.getStroke();
        valueMarker17.setValue((double) 0L);
        java.awt.Font font21 = valueMarker17.getLabelFont();
        java.awt.Paint paint22 = valueMarker17.getLabelPaint();
        valueMarker12.setLabelPaint(paint22);
        valueMarker1.setOutlinePaint(paint22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor25 = valueMarker1.getLabelAnchor();
        java.lang.String str26 = valueMarker1.getLabel();
        java.awt.Paint paint27 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleAnchor25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker10.getLabelOffsetType();
        java.awt.Paint paint13 = valueMarker10.getPaint();
        valueMarker10.setLabel("hi!");
        valueMarker10.setValue((double) '#');
        valueMarker10.setAlpha((float) 0L);
        java.awt.Paint paint20 = valueMarker10.getPaint();
        valueMarker1.setLabelPaint(paint20);
        java.awt.Paint paint22 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint24 = valueMarker1.getLabelPaint();
        java.awt.Font font25 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = valueMarker1.getLabelOffset();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets2);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        java.awt.Stroke stroke7 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        java.awt.Font font11 = valueMarker1.getLabelFont();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker10.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets11);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker1.addChangeListener(markerChangeListener13);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        java.awt.Stroke stroke10 = null;
        valueMarker1.setOutlineStroke(stroke10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = valueMarker13.equals((java.lang.Object) wildcardClass15);
        java.awt.Paint paint17 = valueMarker13.getPaint();
        java.awt.Stroke stroke18 = valueMarker13.getStroke();
        valueMarker1.setStroke(stroke18);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        valueMarker1.notifyListeners(markerChangeEvent20);
        java.awt.Stroke stroke22 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke23 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(textAnchor24);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.lang.String str3 = valueMarker1.getLabel();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        java.awt.Paint paint10 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = valueMarker5.equals((java.lang.Object) wildcardClass7);
        java.awt.Paint paint9 = valueMarker5.getPaint();
        valueMarker5.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        valueMarker5.setLabelOffset(rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        double double18 = valueMarker1.getValue();
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0.8f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        float float25 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker7.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker7.getLabelTextAnchor();
        java.lang.Object obj14 = valueMarker7.clone();
        valueMarker7.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = valueMarker7.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets17);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor19 = valueMarker1.getLabelAnchor();
        java.lang.String str20 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(rectangleAnchor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        valueMarker9.setLabel("");
        boolean boolean16 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        double double24 = valueMarker1.getValue();
        valueMarker1.setValue(0.0d);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker1.notifyListeners(markerChangeEvent27);
        java.awt.Font font29 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(font29);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint10 = valueMarker9.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker9.getLabelTextAnchor();
        java.awt.Paint paint13 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint14 = valueMarker9.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint14);
        java.awt.Paint paint16 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker1.notifyListeners(markerChangeEvent17);
        float float19 = valueMarker1.getAlpha();
        java.lang.String str20 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        valueMarker2.setValue((double) 0L);
        java.awt.Font font6 = valueMarker2.getLabelFont();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint11 = valueMarker10.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker10.getLabelTextAnchor();
        java.awt.Paint paint14 = valueMarker10.getOutlinePaint();
        float float15 = valueMarker10.getAlpha();
        java.awt.Stroke stroke16 = valueMarker10.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 100L, paint8, stroke16);
        java.awt.Stroke stroke18 = valueMarker17.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker17.removeChangeListener(markerChangeListener19);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.String str2 = valueMarker1.getLabel();
        valueMarker1.setValue((double) (byte) -1);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        boolean boolean9 = valueMarker6.equals((java.lang.Object) wildcardClass8);
        java.awt.Paint paint10 = valueMarker6.getPaint();
        valueMarker6.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = valueMarker14.equals((java.lang.Object) wildcardClass16);
        java.awt.Stroke stroke18 = valueMarker14.getOutlineStroke();
        java.awt.Stroke stroke19 = valueMarker14.getOutlineStroke();
        valueMarker6.setStroke(stroke19);
        java.awt.Font font21 = valueMarker6.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker6.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor22);
        valueMarker1.setAlpha((float) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        float float6 = valueMarker1.getAlpha();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        valueMarker1.setValue((double) 10L);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker11.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor12);
        java.lang.Object obj14 = null;
        boolean boolean15 = valueMarker1.equals(obj14);
        java.lang.Object obj16 = null;
        boolean boolean17 = valueMarker1.equals(obj16);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setAlpha((float) 1);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        java.awt.Paint paint10 = valueMarker6.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint13 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        java.awt.Paint paint16 = valueMarker12.getOutlinePaint();
        valueMarker6.setLabelPaint(paint16);
        valueMarker1.setLabelPaint(paint16);
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        double double21 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke25 = valueMarker24.getStroke();
        valueMarker24.setValue((double) 0L);
        java.awt.Font font28 = valueMarker24.getLabelFont();
        java.awt.Paint paint29 = valueMarker24.getLabelPaint();
        java.awt.Paint paint30 = valueMarker24.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke33 = valueMarker32.getStroke();
        java.awt.Stroke stroke34 = valueMarker32.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 10, paint30, stroke34);
        valueMarker1.setOutlinePaint(paint30);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener37 = null;
        valueMarker1.removeChangeListener(markerChangeListener37);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke34);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker11.getOutlinePaint();
        float float16 = valueMarker11.getAlpha();
        java.awt.Stroke stroke17 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke17);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        double double21 = valueMarker20.getValue();
        java.awt.Stroke stroke22 = valueMarker20.getStroke();
        valueMarker1.setStroke(stroke22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker25.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = valueMarker25.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets28);
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        valueMarker1.setValue((double) (-1L));
        float float6 = valueMarker1.getAlpha();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        valueMarker8.setValue((double) 0L);
        java.awt.Font font12 = valueMarker8.getLabelFont();
        java.awt.Paint paint13 = valueMarker8.getLabelPaint();
        java.awt.Paint paint14 = valueMarker8.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker8.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint18 = valueMarker17.getOutlinePaint();
        valueMarker8.setOutlinePaint(paint18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker8.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor20);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.removeChangeListener(markerChangeListener22);
        java.lang.Object obj24 = valueMarker1.clone();
        java.awt.Paint paint25 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        valueMarker1.setLabel("");
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        valueMarker9.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker9.removeChangeListener(markerChangeListener13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint17 = valueMarker16.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker16.addChangeListener(markerChangeListener19);
        java.awt.Paint paint21 = valueMarker16.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker16.addChangeListener(markerChangeListener22);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker16.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker16.getLabelTextAnchor();
        java.awt.Font font26 = valueMarker16.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker16.getLabelAnchor();
        java.awt.Paint paint28 = valueMarker16.getLabelPaint();
        valueMarker9.setPaint(paint28);
        valueMarker1.setOutlinePaint(paint28);
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker11.getLabelAnchor();
        float float17 = valueMarker11.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker19.getLabelTextAnchor();
        valueMarker19.setValue((double) 0L);
        valueMarker19.setLabel("");
        boolean boolean26 = valueMarker11.equals((java.lang.Object) "");
        java.awt.Stroke stroke27 = valueMarker11.getStroke();
        java.awt.Stroke stroke28 = valueMarker11.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker11.notifyListeners(markerChangeEvent29);
        java.awt.Stroke stroke31 = valueMarker11.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker11.removeChangeListener(markerChangeListener32);
        float float34 = valueMarker11.getAlpha();
        java.lang.Class<?> wildcardClass35 = valueMarker11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.8f + "'", float34 == 0.8f);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke13 = valueMarker12.getStroke();
        valueMarker12.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke18 = valueMarker17.getStroke();
        valueMarker12.setOutlineStroke(stroke18);
        java.awt.Stroke stroke20 = valueMarker12.getOutlineStroke();
        float float21 = valueMarker12.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = valueMarker12.getLabelOffset();
        java.lang.Class<?> wildcardClass23 = rectangleInsets22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.util.RectangleInsets; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.util.RectangleInsets; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        valueMarker10.setValue((double) 0L);
        float float14 = valueMarker10.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker10.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint19 = valueMarker18.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker18.getLabelTextAnchor();
        valueMarker18.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor24 = valueMarker18.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = valueMarker26.getLabelOffset();
        valueMarker18.setLabelOffset(rectangleInsets27);
        java.awt.Paint paint29 = valueMarker18.getPaint();
        java.lang.Class<?> wildcardClass30 = paint29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray31 = valueMarker1.getListeners((java.lang.Class) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.awt.Color; cannot be cast to class [Ljava.util.EventListener; ([Ljava.awt.Color; is in module java.desktop of loader 'bootstrap'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(rectangleAnchor24);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        double double9 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        java.awt.Font font11 = valueMarker1.getLabelFont();
        java.lang.Class<?> wildcardClass12 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        double double6 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        double double9 = valueMarker1.getValue();
        float float10 = valueMarker1.getAlpha();
        valueMarker1.setLabel("");
        double double13 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint16 = valueMarker15.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker15.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker15.addChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker15.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker15.addChangeListener(markerChangeListener21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint25 = valueMarker24.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker24.getLabelTextAnchor();
        java.awt.Paint paint28 = valueMarker24.getOutlinePaint();
        java.awt.Paint paint29 = valueMarker24.getOutlinePaint();
        java.awt.Paint paint30 = valueMarker24.getLabelPaint();
        valueMarker15.setOutlinePaint(paint30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker15.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker10.getLabelOffsetType();
        java.awt.Paint paint13 = valueMarker10.getPaint();
        valueMarker10.setLabel("hi!");
        valueMarker10.setValue((double) '#');
        valueMarker10.setAlpha((float) 0L);
        java.awt.Paint paint20 = valueMarker10.getPaint();
        valueMarker1.setLabelPaint(paint20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke26 = valueMarker25.getStroke();
        valueMarker25.setValue((double) 0L);
        java.awt.Font font29 = valueMarker25.getLabelFont();
        java.awt.Paint paint30 = valueMarker25.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker25.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker25.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor32);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        float float4 = valueMarker1.getAlpha();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = valueMarker17.equals((java.lang.Object) wildcardClass19);
        java.awt.Paint paint21 = valueMarker17.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker17.notifyListeners(markerChangeEvent22);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker17.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke27 = valueMarker26.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker26.getLabelOffsetType();
        java.awt.Paint paint29 = valueMarker26.getPaint();
        valueMarker26.setLabel("hi!");
        valueMarker26.setValue((double) '#');
        valueMarker26.setAlpha((float) 0L);
        java.awt.Paint paint36 = valueMarker26.getPaint();
        valueMarker17.setLabelPaint(paint36);
        java.awt.Paint paint38 = valueMarker17.getOutlinePaint();
        valueMarker1.setPaint(paint38);
        java.awt.Font font40 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke43 = valueMarker42.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker42.getLabelTextAnchor();
        java.awt.Stroke stroke45 = valueMarker42.getOutlineStroke();
        java.awt.Paint paint46 = valueMarker42.getLabelPaint();
        java.awt.Font font47 = valueMarker42.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener48 = null;
        valueMarker42.addChangeListener(markerChangeListener48);
        java.awt.Paint paint50 = valueMarker42.getPaint();
        java.awt.Stroke stroke51 = valueMarker42.getStroke();
        valueMarker1.setStroke(stroke51);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(font40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(font47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(stroke51);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 100.0f);
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        valueMarker10.setValue((double) 0L);
        java.awt.Font font14 = valueMarker10.getLabelFont();
        java.awt.Paint paint15 = valueMarker10.getLabelPaint();
        java.awt.Paint paint16 = valueMarker10.getOutlinePaint();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker10.getLabelTextAnchor();
        java.awt.Paint paint18 = valueMarker10.getOutlinePaint();
        valueMarker1.setPaint(paint18);
        java.awt.Paint paint20 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.lang.String str9 = valueMarker1.getLabel();
        java.lang.String str10 = valueMarker1.getLabel();
        java.lang.String str11 = valueMarker1.getLabel();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        valueMarker1.setValue(0.0d);
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke4 = valueMarker3.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker3.getLabelTextAnchor();
        valueMarker3.setValue((double) 0L);
        valueMarker3.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke12 = valueMarker11.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker11.getLabelTextAnchor();
        valueMarker11.setValue((double) 0L);
        java.awt.Font font16 = valueMarker11.getLabelFont();
        valueMarker3.setLabelFont(font16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker19.getLabelTextAnchor();
        java.awt.Stroke stroke22 = valueMarker19.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint25 = valueMarker24.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker24.addChangeListener(markerChangeListener27);
        java.awt.Paint paint29 = valueMarker24.getLabelPaint();
        valueMarker19.setOutlinePaint(paint29);
        java.awt.Font font31 = valueMarker19.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker19.getLabelOffsetType();
        boolean boolean33 = valueMarker3.equals((java.lang.Object) valueMarker19);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker3.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType34);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType36 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) (byte) 1);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType34);
        org.junit.Assert.assertNotNull(lengthAdjustmentType36);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker7.getLabelAnchor();
        java.awt.Paint paint9 = valueMarker7.getOutlinePaint();
        java.awt.Stroke stroke10 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke10);
        double double12 = valueMarker1.getValue();
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        double double14 = valueMarker1.getValue();
        java.awt.Stroke stroke15 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker8.getLabelTextAnchor();
        java.awt.Stroke stroke11 = valueMarker8.getOutlineStroke();
        valueMarker1.setStroke(stroke11);
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        java.awt.Paint paint8 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke14 = valueMarker13.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker13.getLabelTextAnchor();
        valueMarker13.setValue((double) 0L);
        java.awt.Font font18 = valueMarker13.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke21 = valueMarker20.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker20.getLabelTextAnchor();
        java.awt.Stroke stroke23 = valueMarker20.getOutlineStroke();
        valueMarker13.setStroke(stroke23);
        valueMarker1.setOutlineStroke(stroke23);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint28 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        valueMarker1.notifyListeners(markerChangeEvent29);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        valueMarker1.notifyListeners(markerChangeEvent31);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        java.lang.String str9 = valueMarker1.getLabel();
        java.lang.String str10 = valueMarker1.getLabel();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke14 = valueMarker13.getStroke();
        valueMarker13.setValue((double) 0L);
        java.awt.Font font17 = valueMarker13.getLabelFont();
        java.awt.Paint paint18 = valueMarker13.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker13.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker13.addChangeListener(markerChangeListener21);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker13.getLabelAnchor();
        java.awt.Stroke stroke24 = valueMarker13.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke24);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker11.getLabelAnchor();
        java.awt.Paint paint13 = valueMarker11.getOutlinePaint();
        valueMarker1.setLabelPaint(paint13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker16.getLabelOffsetType();
        java.awt.Paint paint19 = valueMarker16.getPaint();
        valueMarker16.setLabel("hi!");
        float float22 = valueMarker16.getAlpha();
        java.awt.Font font23 = valueMarker16.getLabelFont();
        valueMarker1.setLabelFont(font23);
        java.awt.Paint paint25 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        valueMarker1.setValue((double) (-1L));
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        valueMarker10.setValue((double) 0L);
        float float14 = valueMarker10.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker10.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets15);
        java.lang.String str17 = valueMarker1.getLabel();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        java.awt.Font font19 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(0.0d);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint3 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) '#');
        java.awt.Stroke stroke2 = valueMarker1.getOutlineStroke();
        float float3 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) (byte) 1);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        valueMarker8.setValue((double) 0L);
        java.awt.Font font12 = valueMarker8.getLabelFont();
        java.awt.Paint paint13 = valueMarker8.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        boolean boolean18 = valueMarker15.equals((java.lang.Object) wildcardClass17);
        java.awt.Paint paint19 = valueMarker15.getPaint();
        java.lang.String str20 = valueMarker15.getLabel();
        java.awt.Paint paint21 = valueMarker15.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke24 = valueMarker23.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker23.getLabelTextAnchor();
        valueMarker23.setValue((double) 0L);
        valueMarker23.setLabel("");
        float float30 = valueMarker23.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker23.getLabelTextAnchor();
        java.awt.Font font32 = valueMarker23.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor33 = valueMarker23.getLabelAnchor();
        java.awt.Stroke stroke34 = valueMarker23.getOutlineStroke();
        valueMarker15.setStroke(stroke34);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) '#', paint13, stroke34);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = valueMarker36.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets37);
        java.awt.Stroke stroke39 = valueMarker1.getOutlineStroke();
        java.lang.String str40 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.8f + "'", float3 == 0.8f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor31);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(rectangleAnchor33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        double double7 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 1L);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor8);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setLabel("hi!");
        valueMarker1.setValue((double) (byte) 0);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint14 = valueMarker13.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint17 = valueMarker13.getOutlinePaint();
        float float18 = valueMarker13.getAlpha();
        java.awt.Stroke stroke19 = valueMarker13.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker13.addChangeListener(markerChangeListener20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker13.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker13.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor23);
        java.lang.String str25 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker11.getOutlinePaint();
        float float16 = valueMarker11.getAlpha();
        java.awt.Stroke stroke17 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke17);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker1.notifyListeners(markerChangeEvent21);
        java.awt.Paint paint23 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke24 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint25 = valueMarker1.getOutlinePaint();
        java.lang.String str26 = valueMarker1.getLabel();
        float float27 = valueMarker1.getAlpha();
        java.lang.String str28 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker1.notifyListeners(markerChangeEvent5);
        double double7 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        double double12 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint3 = valueMarker2.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker2.getLabelTextAnchor();
        java.awt.Paint paint6 = valueMarker2.getOutlinePaint();
        float float7 = valueMarker2.getAlpha();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker(0.0d, paint8, stroke11);
        java.awt.Font font13 = valueMarker12.getLabelFont();
        java.awt.Paint paint14 = valueMarker12.getOutlinePaint();
        java.awt.Stroke stroke15 = valueMarker12.getStroke();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker11.getOutlinePaint();
        float float16 = valueMarker11.getAlpha();
        java.awt.Stroke stroke17 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke17);
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        double double20 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        float float9 = valueMarker1.getAlpha();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint4 = valueMarker3.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker3.getLabelTextAnchor();
        valueMarker3.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker3.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker11.getLabelAnchor();
        java.awt.Paint paint13 = valueMarker11.getOutlinePaint();
        valueMarker3.setPaint(paint13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) '#');
        java.awt.Stroke stroke17 = valueMarker16.getOutlineStroke();
        valueMarker3.setOutlineStroke(stroke17);
        valueMarker1.setStroke(stroke17);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker1.addChangeListener(markerChangeListener22);
        java.lang.Class<?> wildcardClass24 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        float float12 = valueMarker7.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker7.addChangeListener(markerChangeListener13);
        java.awt.Stroke stroke15 = valueMarker7.getStroke();
        java.awt.Paint paint16 = valueMarker7.getLabelPaint();
        valueMarker1.setPaint(paint16);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.removeChangeListener(markerChangeListener18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke5 = valueMarker4.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker4.getLabelTextAnchor();
        valueMarker4.setValue((double) 0L);
        java.awt.Font font9 = valueMarker4.getLabelFont();
        valueMarker1.setLabelFont(font9);
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        java.lang.Class<?> wildcardClass13 = stroke12.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        java.awt.Stroke stroke9 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke14 = valueMarker13.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker13.getLabelOffsetType();
        java.awt.Paint paint16 = valueMarker13.getPaint();
        valueMarker13.setLabel("hi!");
        java.lang.String str19 = valueMarker13.getLabel();
        java.lang.String str20 = valueMarker13.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker13.notifyListeners(markerChangeEvent21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke25 = valueMarker24.getStroke();
        valueMarker24.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke30 = valueMarker29.getStroke();
        valueMarker24.setOutlineStroke(stroke30);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        valueMarker24.notifyListeners(markerChangeEvent32);
        java.awt.Paint paint34 = valueMarker24.getLabelPaint();
        java.awt.Paint paint35 = valueMarker24.getOutlinePaint();
        valueMarker13.setPaint(paint35);
        valueMarker1.setLabelPaint(paint35);
        java.awt.Paint paint38 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setPaint(paint38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.awt.Paint paint3 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint4 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        java.awt.Paint paint10 = valueMarker6.getOutlinePaint();
        float float11 = valueMarker6.getAlpha();
        java.awt.Paint paint12 = valueMarker6.getOutlinePaint();
        float float13 = valueMarker6.getAlpha();
        java.awt.Stroke stroke14 = valueMarker6.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker6.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker1.getLabelOffset();
        java.lang.String str5 = valueMarker1.getLabel();
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.lang.String str9 = valueMarker1.getLabel();
        java.lang.String str10 = valueMarker1.getLabel();
        java.lang.String str11 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker1.notifyListeners(markerChangeEvent15);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        float float11 = valueMarker1.getAlpha();
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        boolean boolean18 = valueMarker15.equals((java.lang.Object) wildcardClass17);
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker15.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke22 = valueMarker21.getStroke();
        valueMarker21.setValue((double) 0L);
        java.awt.Font font25 = valueMarker21.getLabelFont();
        java.awt.Paint paint26 = valueMarker21.getLabelPaint();
        java.awt.Paint paint27 = valueMarker21.getOutlinePaint();
        valueMarker15.setOutlinePaint(paint27);
        valueMarker15.setValue((double) 'a');
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker15.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets31);
        java.awt.Stroke stroke33 = valueMarker1.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker18.setLabel("");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker18.notifyListeners(markerChangeEvent21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker18.getLabelOffset();
        float float24 = valueMarker18.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker18.notifyListeners(markerChangeEvent25);
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker18.getLabelTextAnchor();
        boolean boolean28 = valueMarker1.equals((java.lang.Object) valueMarker18);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = valueMarker9.equals((java.lang.Object) wildcardClass11);
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker9.getLabelTextAnchor();
        java.awt.Stroke stroke14 = valueMarker9.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType15);
        valueMarker1.setAlpha((float) (byte) 0);
        float float19 = valueMarker1.getAlpha();
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.lang.String str9 = valueMarker1.getLabel();
        java.lang.String str10 = valueMarker1.getLabel();
        java.lang.String str11 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker16.getLabelOffsetType();
        java.awt.Paint paint19 = valueMarker16.getPaint();
        valueMarker16.setLabel("hi!");
        java.lang.String str22 = valueMarker16.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke25 = valueMarker24.getStroke();
        valueMarker24.setAlpha((float) 1);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint30 = valueMarker29.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker29.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker29.getLabelTextAnchor();
        java.awt.Paint paint33 = valueMarker29.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint36 = valueMarker35.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType37 = valueMarker35.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker35.getLabelTextAnchor();
        java.awt.Paint paint39 = valueMarker35.getOutlinePaint();
        valueMarker29.setLabelPaint(paint39);
        valueMarker24.setLabelPaint(paint39);
        java.awt.Paint paint42 = valueMarker24.getOutlinePaint();
        valueMarker16.setOutlinePaint(paint42);
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker16.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor44);
        java.lang.String str46 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
        org.junit.Assert.assertNotNull(textAnchor32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(lengthAdjustmentType37);
        org.junit.Assert.assertNotNull(textAnchor38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setAlpha(0.0f);
        valueMarker1.setLabel("");
        double double12 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint13 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setAlpha(0.0f);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke14 = valueMarker13.getStroke();
        valueMarker13.setValue((double) 0L);
        float float17 = valueMarker13.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker13.getLabelOffset();
        java.awt.Font font19 = valueMarker13.getLabelFont();
        valueMarker1.setLabelFont(font19);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint23 = valueMarker22.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker22.addChangeListener(markerChangeListener25);
        java.awt.Paint paint27 = valueMarker22.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker22.getLabelOffsetType();
        java.awt.Font font29 = valueMarker22.getLabelFont();
        double double30 = valueMarker22.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint33 = valueMarker32.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker32.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor35 = valueMarker32.getLabelTextAnchor();
        java.awt.Paint paint36 = valueMarker32.getOutlinePaint();
        valueMarker32.setValue((double) 1);
        float float39 = valueMarker32.getAlpha();
        valueMarker32.setAlpha((float) (byte) 1);
        java.awt.Stroke stroke42 = valueMarker32.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        boolean boolean47 = valueMarker44.equals((java.lang.Object) wildcardClass46);
        java.awt.Paint paint48 = valueMarker44.getPaint();
        valueMarker44.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker52 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
        boolean boolean55 = valueMarker52.equals((java.lang.Object) wildcardClass54);
        java.awt.Stroke stroke56 = valueMarker52.getOutlineStroke();
        java.awt.Stroke stroke57 = valueMarker52.getOutlineStroke();
        valueMarker44.setStroke(stroke57);
        java.awt.Paint paint59 = valueMarker44.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener60 = null;
        valueMarker44.removeChangeListener(markerChangeListener60);
        java.awt.Paint paint62 = valueMarker44.getLabelPaint();
        valueMarker32.setLabelPaint(paint62);
        valueMarker22.setPaint(paint62);
        valueMarker1.setLabelPaint(paint62);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(lengthAdjustmentType34);
        org.junit.Assert.assertNotNull(textAnchor35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.8f + "'", float39 == 0.8f);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(paint62);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke5 = valueMarker4.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker4.getLabelTextAnchor();
        java.awt.Stroke stroke7 = valueMarker4.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint10 = valueMarker9.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker9.addChangeListener(markerChangeListener12);
        java.awt.Paint paint14 = valueMarker9.getLabelPaint();
        valueMarker4.setOutlinePaint(paint14);
        java.awt.Font font16 = valueMarker4.getLabelFont();
        valueMarker1.setLabelFont(font16);
        float float18 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke13 = valueMarker12.getStroke();
        valueMarker12.setValue((double) 0L);
        java.awt.Font font16 = valueMarker12.getLabelFont();
        java.awt.Paint paint17 = valueMarker12.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker12.removeChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker12.getPaint();
        valueMarker1.setOutlinePaint(paint20);
        java.awt.Stroke stroke22 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.addChangeListener(markerChangeListener23);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke27 = valueMarker26.getStroke();
        valueMarker26.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker26.removeChangeListener(markerChangeListener30);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke34 = valueMarker33.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType35 = valueMarker33.getLabelOffsetType();
        java.awt.Paint paint36 = valueMarker33.getPaint();
        valueMarker33.setLabel("hi!");
        valueMarker33.setValue((double) '#');
        valueMarker33.setAlpha((float) 0L);
        java.awt.Paint paint43 = valueMarker33.getPaint();
        valueMarker26.setLabelPaint(paint43);
        valueMarker26.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker48 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke49 = valueMarker48.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor50 = valueMarker48.getLabelTextAnchor();
        valueMarker48.setValue((double) 0L);
        valueMarker48.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor55 = valueMarker48.getLabelTextAnchor();
        java.awt.Paint paint56 = valueMarker48.getPaint();
        valueMarker26.setOutlinePaint(paint56);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType58 = valueMarker26.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType58);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(lengthAdjustmentType35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(textAnchor50);
        org.junit.Assert.assertNotNull(textAnchor55);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(lengthAdjustmentType58);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 100L);
        valueMarker1.setLabel("hi!");
        valueMarker1.setValue(0.0d);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        boolean boolean22 = valueMarker19.equals((java.lang.Object) wildcardClass21);
        java.awt.Stroke stroke23 = valueMarker19.getOutlineStroke();
        java.awt.Stroke stroke24 = valueMarker19.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker19.addChangeListener(markerChangeListener25);
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker19.getLabelTextAnchor();
        java.lang.String str28 = valueMarker19.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker30.getLabelAnchor();
        float float32 = valueMarker30.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = valueMarker30.getLabelOffsetType();
        java.awt.Font font34 = valueMarker30.getLabelFont();
        valueMarker19.setLabelFont(font34);
        valueMarker1.setLabelFont(font34);
        java.lang.Class<?> wildcardClass37 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.8f + "'", float32 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType33);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        java.lang.String str6 = valueMarker1.getLabel();
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.removeChangeListener(markerChangeListener10);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(textAnchor9);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font11 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        boolean boolean17 = valueMarker14.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker14.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker21.getLabelAnchor();
        java.awt.Paint paint23 = valueMarker21.getOutlinePaint();
        valueMarker14.setLabelPaint(paint23);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker14.removeChangeListener(markerChangeListener25);
        java.lang.Class<?> wildcardClass27 = valueMarker14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray28 = valueMarker1.getListeners((java.lang.Class) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        java.lang.String str14 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker1.getLabelOffsetType();
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        valueMarker19.setValue((double) 0L);
        java.awt.Font font23 = valueMarker19.getLabelFont();
        java.awt.Paint paint24 = valueMarker19.getLabelPaint();
        java.lang.Class<?> wildcardClass25 = valueMarker19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray26 = valueMarker1.getListeners((java.lang.Class) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker11.getOutlinePaint();
        float float16 = valueMarker11.getAlpha();
        java.awt.Stroke stroke17 = valueMarker11.getStroke();
        valueMarker1.setOutlineStroke(stroke17);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.lang.String str12 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker14.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke22 = valueMarker21.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker21.getLabelOffsetType();
        java.awt.Paint paint24 = valueMarker21.getPaint();
        valueMarker21.setLabel("hi!");
        float float27 = valueMarker21.getAlpha();
        java.awt.Stroke stroke28 = valueMarker21.getOutlineStroke();
        java.awt.Paint paint29 = valueMarker21.getLabelPaint();
        valueMarker14.setLabelPaint(paint29);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker14.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor31);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.awt.Paint paint6 = null;
        valueMarker1.setOutlinePaint(paint6);
        double double8 = valueMarker1.getValue();
        float float9 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint13 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        java.awt.Paint paint16 = valueMarker12.getOutlinePaint();
        float float17 = valueMarker12.getAlpha();
        java.awt.Paint paint18 = valueMarker12.getOutlinePaint();
        float float19 = valueMarker12.getAlpha();
        java.awt.Stroke stroke20 = valueMarker12.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker12.getLabelOffsetType();
        java.awt.Paint paint22 = valueMarker12.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke25 = valueMarker24.getStroke();
        valueMarker24.setValue((double) 0L);
        java.awt.Font font28 = valueMarker24.getLabelFont();
        java.awt.Paint paint29 = valueMarker24.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker24.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener32 = null;
        valueMarker24.addChangeListener(markerChangeListener32);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor34 = valueMarker24.getLabelAnchor();
        java.awt.Stroke stroke35 = valueMarker24.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker(0.800000011920929d, paint22, stroke35);
        boolean boolean37 = valueMarker1.equals((java.lang.Object) paint22);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.8f + "'", float17 == 0.8f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(rectangleAnchor34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setLabel("hi!");
        valueMarker1.setValue((double) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker9.notifyListeners(markerChangeEvent10);
        valueMarker9.setValue((double) (-1L));
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        valueMarker15.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke21 = valueMarker20.getStroke();
        valueMarker15.setOutlineStroke(stroke21);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker15.notifyListeners(markerChangeEvent23);
        java.awt.Paint paint25 = valueMarker15.getLabelPaint();
        java.lang.String str26 = valueMarker15.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker15.notifyListeners(markerChangeEvent27);
        boolean boolean29 = valueMarker9.equals((java.lang.Object) markerChangeEvent27);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        double double8 = valueMarker1.getValue();
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        valueMarker1.setAlpha(0.8f);
        java.awt.Paint paint14 = valueMarker1.getPaint();
        double double15 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("");
        double double7 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint5 = valueMarker4.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker4.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker4.getLabelTextAnchor();
        java.awt.Paint paint8 = valueMarker4.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker4.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker4.getLabelTextAnchor();
        java.lang.Object obj11 = valueMarker4.clone();
        valueMarker4.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets14);
        java.lang.String str16 = valueMarker1.getLabel();
        valueMarker1.setLabel("hi!");
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        java.awt.Stroke stroke14 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = valueMarker16.equals((java.lang.Object) wildcardClass18);
        java.awt.Stroke stroke20 = valueMarker16.getOutlineStroke();
        java.awt.Stroke stroke21 = valueMarker16.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener22 = null;
        valueMarker16.addChangeListener(markerChangeListener22);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        boolean boolean28 = valueMarker25.equals((java.lang.Object) wildcardClass27);
        java.awt.Paint paint29 = valueMarker25.getPaint();
        valueMarker25.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker25.getLabelTextAnchor();
        valueMarker16.setLabelTextAnchor(textAnchor32);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker16.addChangeListener(markerChangeListener34);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = valueMarker16.getLabelOffset();
        java.lang.String str37 = valueMarker16.getLabel();
        java.awt.Paint paint38 = valueMarker16.getPaint();
        valueMarker1.setLabelPaint(paint38);
        java.awt.Paint paint40 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(textAnchor32);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker14.getLabelPaint();
        valueMarker1.setLabelPaint(paint19);
        java.awt.Stroke stroke21 = valueMarker1.getStroke();
        java.awt.Paint paint22 = valueMarker1.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke24 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        boolean boolean10 = valueMarker7.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker7.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker14.getLabelAnchor();
        java.awt.Paint paint16 = valueMarker14.getOutlinePaint();
        valueMarker7.setLabelPaint(paint16);
        valueMarker1.setPaint(paint16);
        java.awt.Stroke stroke19 = valueMarker1.getOutlineStroke();
        float float20 = valueMarker1.getAlpha();
        double double21 = valueMarker1.getValue();
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker1.getLabelTextAnchor();
        java.lang.Object obj23 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.8f + "'", float20 == 0.8f);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = valueMarker9.equals((java.lang.Object) wildcardClass11);
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        java.awt.Stroke stroke14 = valueMarker9.getOutlineStroke();
        valueMarker1.setStroke(stroke14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker19.getLabelTextAnchor();
        valueMarker19.setValue((double) 0L);
        java.awt.Font font24 = valueMarker19.getLabelFont();
        valueMarker1.setLabelFont(font24);
        double double26 = valueMarker1.getValue();
        float float27 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        java.lang.String str7 = valueMarker1.getLabel();
        java.lang.String str8 = valueMarker1.getLabel();
        float float9 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker7.getLabelTextAnchor();
        valueMarker7.setValue((double) 0L);
        valueMarker7.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker7.getLabelTextAnchor();
        java.lang.String str15 = valueMarker7.getLabel();
        java.lang.String str16 = valueMarker7.getLabel();
        java.lang.String str17 = valueMarker7.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker7.addChangeListener(markerChangeListener18);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker7.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType20);
        double double22 = valueMarker1.getValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelOffset(rectangleInsets23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        java.awt.Paint paint11 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        float float9 = valueMarker1.getAlpha();
        java.lang.Object obj10 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        valueMarker1.setLabel("");
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        valueMarker9.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke15 = valueMarker14.getStroke();
        valueMarker9.setOutlineStroke(stroke15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker9.notifyListeners(markerChangeEvent17);
        java.awt.Paint paint19 = valueMarker9.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker9.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets20);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = valueMarker12.equals((java.lang.Object) wildcardClass14);
        java.awt.Font font16 = valueMarker12.getLabelFont();
        java.lang.String str17 = valueMarker12.getLabel();
        java.awt.Paint paint18 = valueMarker12.getPaint();
        valueMarker1.setOutlinePaint(paint18);
        java.lang.Object obj20 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        java.awt.Paint paint3 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        double double9 = valueMarker7.getValue();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) double9);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = valueMarker5.equals((java.lang.Object) wildcardClass7);
        java.awt.Paint paint9 = valueMarker5.getPaint();
        valueMarker5.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker5.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker14.getLabelOffset();
        valueMarker5.setLabelOffset(rectangleInsets15);
        valueMarker1.setLabelOffset(rectangleInsets15);
        double double18 = valueMarker1.getValue();
        valueMarker1.setLabel("");
        java.awt.Stroke stroke21 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke22 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker1.notifyListeners(markerChangeEvent23);
        java.awt.Paint paint25 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        java.awt.Font font28 = valueMarker27.getLabelFont();
        valueMarker1.setLabelFont(font28);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        java.lang.Object obj9 = valueMarker1.clone();
        valueMarker1.setValue(0.0d);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint10 = valueMarker9.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker9.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker9.getLabelTextAnchor();
        java.awt.Paint paint13 = valueMarker9.getOutlinePaint();
        java.awt.Paint paint14 = valueMarker9.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint14);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker1.notifyListeners(markerChangeEvent16);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = valueMarker1.getLabelOffset();
        java.lang.String str12 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        valueMarker9.setLabel("");
        boolean boolean16 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        java.awt.Font font23 = valueMarker1.getLabelFont();
        valueMarker1.setAlpha(0.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker15.getLabelOffsetType();
        java.awt.Paint paint18 = valueMarker15.getPaint();
        valueMarker15.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint23 = valueMarker22.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker22.getLabelTextAnchor();
        java.awt.Paint paint26 = valueMarker22.getOutlinePaint();
        float float27 = valueMarker22.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker22.addChangeListener(markerChangeListener28);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker22.getLabelAnchor();
        valueMarker15.setLabelAnchor(rectangleAnchor30);
        valueMarker13.setLabelAnchor(rectangleAnchor30);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = valueMarker13.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType33);
        java.awt.Paint paint35 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) 'a');
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker37.getLabelOffsetType();
        valueMarker37.setLabel("hi!");
        java.awt.Paint paint41 = valueMarker37.getLabelPaint();
        valueMarker1.setOutlinePaint(paint41);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(lengthAdjustmentType38);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.lang.String str6 = valueMarker1.getLabel();
        java.lang.Object obj7 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1.0f);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        valueMarker5.setValue((double) 0L);
        java.awt.Font font9 = valueMarker5.getLabelFont();
        java.awt.Paint paint10 = valueMarker5.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint13 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker12.getLabelOffsetType();
        java.awt.Stroke stroke15 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10, paint10, stroke15);
        valueMarker1.setLabelPaint(paint10);
        java.awt.Paint paint18 = valueMarker1.getLabelPaint();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(textAnchor19);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = valueMarker14.equals((java.lang.Object) wildcardClass16);
        java.awt.Font font18 = valueMarker14.getLabelFont();
        valueMarker1.setLabelFont(font18);
        valueMarker1.setLabel("hi!");
        java.lang.String str22 = valueMarker1.getLabel();
        java.awt.Paint paint23 = valueMarker1.getPaint();
        java.awt.Font font24 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener25 = null;
        valueMarker1.removeChangeListener(markerChangeListener25);
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) '#');
        java.awt.Stroke stroke29 = valueMarker28.getOutlineStroke();
        float float30 = valueMarker28.getAlpha();
        valueMarker28.setValue((double) (byte) 1);
        valueMarker28.setLabel("hi!");
        java.awt.Stroke stroke35 = valueMarker28.getOutlineStroke();
        valueMarker1.setStroke(stroke35);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.8f + "'", float30 == 0.8f);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        valueMarker1.setValue((double) 1);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        java.awt.Stroke stroke10 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint13 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        valueMarker16.setValue((double) 0L);
        java.awt.Font font20 = valueMarker16.getLabelFont();
        java.awt.Paint paint21 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker16.getLabelOffsetType();
        valueMarker12.setLabelOffsetType(lengthAdjustmentType22);
        java.awt.Paint paint24 = valueMarker12.getPaint();
        valueMarker1.setLabelPaint(paint24);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        java.awt.Paint paint5 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke6 = null;
        valueMarker1.setOutlineStroke(stroke6);
        java.lang.Object obj8 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker4.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets5);
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        boolean boolean7 = valueMarker4.equals((java.lang.Object) wildcardClass6);
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker4.getLabelTextAnchor();
        java.awt.Stroke stroke9 = valueMarker4.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker4.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker4.getPaint();
        valueMarker2.setOutlinePaint(paint11);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = valueMarker14.equals((java.lang.Object) wildcardClass16);
        java.awt.Paint paint18 = valueMarker14.getPaint();
        valueMarker14.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = valueMarker22.equals((java.lang.Object) wildcardClass24);
        java.awt.Stroke stroke26 = valueMarker22.getOutlineStroke();
        java.awt.Stroke stroke27 = valueMarker22.getOutlineStroke();
        valueMarker14.setStroke(stroke27);
        java.awt.Font font29 = valueMarker14.getLabelFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker14.getLabelOffset();
        org.jfree.chart.text.TextAnchor textAnchor31 = valueMarker14.getLabelTextAnchor();
        java.awt.Stroke stroke32 = valueMarker14.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker(100.0d);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        java.awt.Paint paint37 = valueMarker36.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor38 = valueMarker36.getLabelAnchor();
        java.awt.Stroke stroke39 = valueMarker36.getStroke();
        java.awt.Paint paint40 = valueMarker36.getLabelPaint();
        valueMarker34.setPaint(paint40);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (short) -1);
        org.jfree.chart.plot.ValueMarker valueMarker45 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke46 = valueMarker45.getStroke();
        valueMarker45.setValue((double) 0L);
        java.awt.Font font49 = valueMarker45.getLabelFont();
        java.awt.Paint paint50 = valueMarker45.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener51 = null;
        valueMarker45.removeChangeListener(markerChangeListener51);
        java.awt.Paint paint53 = valueMarker45.getPaint();
        valueMarker43.setPaint(paint53);
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        boolean boolean59 = valueMarker56.equals((java.lang.Object) wildcardClass58);
        java.awt.Stroke stroke60 = valueMarker56.getOutlineStroke();
        valueMarker43.setOutlineStroke(stroke60);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint11, stroke32, paint40, stroke60, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(textAnchor31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(rectangleAnchor38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(stroke60);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setLabel("hi!");
        valueMarker1.setValue((double) (byte) 0);
        java.lang.String str12 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker14.addChangeListener(markerChangeListener17);
        java.awt.Paint paint19 = valueMarker14.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker14.addChangeListener(markerChangeListener20);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker14.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker14.getLabelTextAnchor();
        java.awt.Font font24 = valueMarker14.getLabelFont();
        valueMarker1.setLabelFont(font24);
        valueMarker1.setAlpha(0.8f);
        java.awt.Paint paint28 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke31 = valueMarker30.getStroke();
        valueMarker30.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker30.removeChangeListener(markerChangeListener34);
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke38 = valueMarker37.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType39 = valueMarker37.getLabelOffsetType();
        java.awt.Paint paint40 = valueMarker37.getPaint();
        valueMarker37.setLabel("hi!");
        valueMarker37.setValue((double) '#');
        valueMarker37.setAlpha((float) 0L);
        java.awt.Paint paint47 = valueMarker37.getPaint();
        valueMarker30.setLabelPaint(paint47);
        valueMarker1.setPaint(paint47);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(lengthAdjustmentType39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        valueMarker1.setLabel("hi!");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker1.notifyListeners(markerChangeEvent5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint9 = valueMarker8.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker8.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker8.getLabelTextAnchor();
        java.awt.Paint paint12 = valueMarker8.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker14.getLabelTextAnchor();
        java.awt.Paint paint18 = valueMarker14.getOutlinePaint();
        valueMarker8.setLabelPaint(paint18);
        valueMarker1.setPaint(paint18);
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        java.awt.Font font24 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke25 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        valueMarker1.setLabel("");
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker2.getLabelAnchor();
        float float4 = valueMarker2.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener6 = null;
        valueMarker2.addChangeListener(markerChangeListener6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker2.notifyListeners(markerChangeEvent8);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker11.notifyListeners(markerChangeEvent12);
        float float14 = valueMarker11.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint17 = valueMarker16.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker16.getLabelTextAnchor();
        valueMarker11.setLabelTextAnchor(textAnchor19);
        java.awt.Paint paint21 = valueMarker11.getLabelPaint();
        java.awt.Font font22 = valueMarker11.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker11.getLabelAnchor();
        java.awt.Stroke stroke24 = valueMarker11.getStroke();
        boolean boolean25 = valueMarker2.equals((java.lang.Object) valueMarker11);
        java.awt.Paint paint26 = valueMarker11.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint30 = valueMarker29.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = valueMarker29.getLabelOffset();
        java.awt.Paint paint32 = valueMarker29.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke35 = valueMarker34.getStroke();
        valueMarker34.setValue((double) 0L);
        valueMarker34.setValue((double) 1);
        java.awt.Stroke stroke40 = valueMarker34.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker41 = new org.jfree.chart.plot.ValueMarker((double) (byte) 0, paint32, stroke40);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        valueMarker43.notifyListeners(markerChangeEvent44);
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        boolean boolean50 = valueMarker47.equals((java.lang.Object) wildcardClass49);
        java.awt.Paint paint51 = valueMarker47.getPaint();
        valueMarker47.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor54 = valueMarker47.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = valueMarker56.getLabelOffset();
        valueMarker47.setLabelOffset(rectangleInsets57);
        valueMarker43.setLabelOffset(rectangleInsets57);
        double double60 = valueMarker43.getValue();
        valueMarker43.setLabel("");
        java.awt.Stroke stroke63 = valueMarker43.getOutlineStroke();
        float float64 = valueMarker43.getAlpha();
        double double65 = valueMarker43.getValue();
        java.awt.Paint paint66 = valueMarker43.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker68 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke69 = valueMarker68.getStroke();
        valueMarker68.setAlpha((float) 1);
        java.awt.Stroke stroke72 = valueMarker68.getStroke();
        java.awt.Font font73 = valueMarker68.getLabelFont();
        java.awt.Stroke stroke74 = valueMarker68.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker76 = new org.jfree.chart.plot.ValueMarker((double) 10.0f, paint26, stroke40, paint66, stroke74, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(textAnchor54);
        org.junit.Assert.assertNotNull(rectangleInsets57);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertNotNull(stroke63);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.8f + "'", float64 == 0.8f);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertNotNull(stroke72);
        org.junit.Assert.assertNotNull(font73);
        org.junit.Assert.assertNotNull(stroke74);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        valueMarker1.setValue((double) (-1L));
        double double6 = valueMarker1.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        valueMarker8.setLabel("hi!");
        java.awt.Font font11 = valueMarker8.getLabelFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker8.notifyListeners(markerChangeEvent12);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker15.getLabelTextAnchor();
        java.awt.Stroke stroke18 = valueMarker15.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint21 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker20.addChangeListener(markerChangeListener23);
        java.awt.Paint paint25 = valueMarker20.getLabelPaint();
        valueMarker15.setOutlinePaint(paint25);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker15.notifyListeners(markerChangeEvent27);
        java.lang.Object obj29 = valueMarker15.clone();
        valueMarker15.setLabel("hi!");
        java.awt.Paint paint32 = valueMarker15.getOutlinePaint();
        valueMarker8.setLabelPaint(paint32);
        boolean boolean34 = valueMarker1.equals((java.lang.Object) paint32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        valueMarker2.setValue((double) 0L);
        java.awt.Font font6 = valueMarker2.getLabelFont();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        java.awt.Stroke stroke12 = valueMarker10.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) 10, paint8, stroke12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker13.removeChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0.0f);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = valueMarker9.equals((java.lang.Object) wildcardClass11);
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        java.awt.Stroke stroke14 = valueMarker9.getOutlineStroke();
        valueMarker1.setStroke(stroke14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker1.removeChangeListener(markerChangeListener16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker19.getLabelTextAnchor();
        valueMarker19.setValue((double) 0L);
        java.awt.Font font24 = valueMarker19.getLabelFont();
        valueMarker1.setLabelFont(font24);
        double double26 = valueMarker1.getValue();
        double double27 = valueMarker1.getValue();
        java.awt.Stroke stroke28 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker6.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 100L);
        java.lang.String str11 = valueMarker1.getLabel();
        float float12 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setLabel("hi!");
        valueMarker1.setValue((double) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker14.getLabelTextAnchor();
        java.awt.Paint paint18 = valueMarker14.getOutlinePaint();
        valueMarker14.setValue((double) 1);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        boolean boolean26 = valueMarker23.equals((java.lang.Object) wildcardClass25);
        java.awt.Paint paint27 = valueMarker23.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker23.getLabelTextAnchor();
        valueMarker14.setLabelTextAnchor(textAnchor28);
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker14.getLabelTextAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker14.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor31);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker1.addChangeListener(markerChangeListener33);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(textAnchor28);
        org.junit.Assert.assertNotNull(textAnchor30);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        valueMarker2.setValue((double) 0L);
        java.awt.Font font6 = valueMarker2.getLabelFont();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint10 = valueMarker9.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker9.getLabelOffsetType();
        java.awt.Stroke stroke12 = valueMarker9.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10, paint7, stroke12);
        valueMarker13.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker13.addChangeListener(markerChangeListener16);
        valueMarker13.setValue((double) 100);
        java.awt.Stroke stroke20 = valueMarker13.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker10.getLabelOffsetType();
        java.awt.Paint paint13 = valueMarker10.getPaint();
        valueMarker10.setLabel("hi!");
        valueMarker10.setValue((double) '#');
        valueMarker10.setAlpha((float) 0L);
        java.awt.Paint paint20 = valueMarker10.getPaint();
        valueMarker1.setLabelPaint(paint20);
        java.awt.Font font22 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint25 = valueMarker24.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = valueMarker24.getLabelOffset();
        java.lang.Object obj27 = null;
        boolean boolean28 = valueMarker24.equals(obj27);
        java.lang.String str29 = valueMarker24.getLabel();
        java.awt.Stroke stroke30 = valueMarker24.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke30);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint3 = valueMarker2.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker2.getLabelOffsetType();
        java.lang.String str5 = valueMarker2.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker2.getLabelAnchor();
        java.awt.Paint paint7 = valueMarker2.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        valueMarker10.setValue((double) 0L);
        java.awt.Font font14 = valueMarker10.getLabelFont();
        java.awt.Paint paint15 = valueMarker10.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint18 = valueMarker17.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker17.getLabelOffsetType();
        java.awt.Stroke stroke20 = valueMarker17.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10, paint15, stroke20);
        valueMarker21.setLabel("hi!");
        java.lang.String str24 = valueMarker21.getLabel();
        java.awt.Stroke stroke25 = valueMarker21.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        java.awt.Paint paint28 = valueMarker27.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker27.getLabelAnchor();
        java.awt.Stroke stroke30 = valueMarker27.getStroke();
        java.awt.Paint paint31 = valueMarker27.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = valueMarker27.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint35 = valueMarker34.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType36 = valueMarker34.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor37 = valueMarker34.getLabelTextAnchor();
        valueMarker34.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor40 = valueMarker34.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor43 = valueMarker42.getLabelAnchor();
        java.awt.Paint paint44 = valueMarker42.getOutlinePaint();
        java.awt.Stroke stroke45 = valueMarker42.getStroke();
        valueMarker34.setOutlineStroke(stroke45);
        java.awt.Stroke stroke47 = valueMarker34.getOutlineStroke();
        java.awt.Paint paint48 = valueMarker34.getOutlinePaint();
        valueMarker27.setLabelPaint(paint48);
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint52 = valueMarker51.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener53 = null;
        valueMarker51.addChangeListener(markerChangeListener53);
        float float55 = valueMarker51.getAlpha();
        valueMarker51.setValue((double) 1L);
        java.awt.Stroke stroke58 = valueMarker51.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker61 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        boolean boolean64 = valueMarker61.equals((java.lang.Object) wildcardClass63);
        java.awt.Paint paint65 = valueMarker61.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent66 = null;
        valueMarker61.notifyListeners(markerChangeEvent66);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType68 = valueMarker61.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker70 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke71 = valueMarker70.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType72 = valueMarker70.getLabelOffsetType();
        java.awt.Paint paint73 = valueMarker70.getPaint();
        valueMarker70.setLabel("hi!");
        valueMarker70.setValue((double) '#');
        valueMarker70.setAlpha((float) 0L);
        java.awt.Paint paint80 = valueMarker70.getPaint();
        valueMarker61.setLabelPaint(paint80);
        java.awt.Paint paint82 = valueMarker61.getOutlinePaint();
        java.awt.Paint paint83 = valueMarker61.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker85 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint86 = valueMarker85.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType87 = valueMarker85.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor88 = valueMarker85.getLabelTextAnchor();
        java.awt.Paint paint89 = valueMarker85.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor90 = valueMarker85.getLabelAnchor();
        float float91 = valueMarker85.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener92 = null;
        valueMarker85.removeChangeListener(markerChangeListener92);
        java.awt.Stroke stroke94 = valueMarker85.getStroke();
        java.awt.Stroke stroke95 = valueMarker85.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker96 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint83, stroke95);
        valueMarker51.setOutlineStroke(stroke95);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker99 = new org.jfree.chart.plot.ValueMarker(1.0d, paint7, stroke25, paint48, stroke95, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(lengthAdjustmentType36);
        org.junit.Assert.assertNotNull(textAnchor37);
        org.junit.Assert.assertNotNull(rectangleAnchor40);
        org.junit.Assert.assertNotNull(rectangleAnchor43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.8f + "'", float55 == 0.8f);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(lengthAdjustmentType68);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertNotNull(lengthAdjustmentType72);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertNotNull(paint80);
        org.junit.Assert.assertNotNull(paint82);
        org.junit.Assert.assertNotNull(paint83);
        org.junit.Assert.assertNotNull(paint86);
        org.junit.Assert.assertNotNull(lengthAdjustmentType87);
        org.junit.Assert.assertNotNull(textAnchor88);
        org.junit.Assert.assertNotNull(paint89);
        org.junit.Assert.assertNotNull(rectangleAnchor90);
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + 0.8f + "'", float91 == 0.8f);
        org.junit.Assert.assertNotNull(stroke94);
        org.junit.Assert.assertNotNull(stroke95);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setAlpha(0.0f);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = valueMarker13.equals((java.lang.Object) wildcardClass15);
        java.awt.Paint paint17 = valueMarker13.getPaint();
        valueMarker13.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker13.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker22.getLabelOffset();
        valueMarker13.setLabelOffset(rectangleInsets23);
        java.lang.String str25 = valueMarker13.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke28 = valueMarker27.getStroke();
        valueMarker27.setValue((double) 0L);
        float float31 = valueMarker27.getAlpha();
        java.awt.Paint paint32 = valueMarker27.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = valueMarker27.getLabelOffset();
        valueMarker13.setLabelOffset(rectangleInsets33);
        valueMarker1.setLabelOffset(rectangleInsets33);
        double double36 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.8f + "'", float31 == 0.8f);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.lang.String str6 = valueMarker1.getLabel();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        valueMarker1.setAlpha((float) 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker2.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker2.addChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker8.getLabelTextAnchor();
        valueMarker8.setValue((double) 0L);
        float float13 = valueMarker8.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        boolean boolean20 = valueMarker17.equals((java.lang.Object) wildcardClass19);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker17.getLabelTextAnchor();
        java.awt.Stroke stroke22 = valueMarker17.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker17.getLabelOffsetType();
        java.awt.Paint paint24 = valueMarker17.getPaint();
        valueMarker15.setOutlinePaint(paint24);
        valueMarker8.setOutlinePaint(paint24);
        valueMarker2.setLabelPaint(paint24);
        java.awt.Stroke stroke28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint24, stroke28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        valueMarker1.setAlpha((float) (short) 0);
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke12 = valueMarker11.getStroke();
        valueMarker11.setValue((double) 0L);
        java.awt.Font font15 = valueMarker11.getLabelFont();
        java.awt.Paint paint16 = valueMarker11.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint19 = valueMarker18.getOutlinePaint();
        valueMarker11.setPaint(paint19);
        valueMarker1.setLabelPaint(paint19);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        float float12 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke5 = valueMarker4.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker4.getLabelTextAnchor();
        valueMarker4.setValue((double) 0L);
        java.awt.Font font9 = valueMarker4.getLabelFont();
        valueMarker1.setLabelFont(font9);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        java.lang.String str7 = valueMarker1.getLabel();
        java.lang.String str8 = valueMarker1.getLabel();
        valueMarker1.setAlpha(0.0f);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        valueMarker9.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke15 = valueMarker14.getStroke();
        valueMarker9.setOutlineStroke(stroke15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker9.notifyListeners(markerChangeEvent17);
        boolean boolean19 = valueMarker1.equals((java.lang.Object) valueMarker9);
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke22 = valueMarker21.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker21.getLabelTextAnchor();
        java.awt.Stroke stroke24 = valueMarker21.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint27 = valueMarker26.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker26.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker26.addChangeListener(markerChangeListener29);
        java.awt.Paint paint31 = valueMarker26.getLabelPaint();
        valueMarker21.setOutlinePaint(paint31);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        valueMarker21.notifyListeners(markerChangeEvent33);
        java.lang.Class<?> wildcardClass35 = valueMarker21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 100);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke4 = valueMarker3.getStroke();
        valueMarker3.setValue((double) 0L);
        java.awt.Font font7 = valueMarker3.getLabelFont();
        java.awt.Paint paint8 = valueMarker3.getLabelPaint();
        java.awt.Paint paint9 = valueMarker3.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke14 = valueMarker13.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker13.getLabelOffsetType();
        java.awt.Paint paint16 = valueMarker13.getPaint();
        valueMarker13.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint21 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker20.getLabelTextAnchor();
        java.awt.Paint paint24 = valueMarker20.getOutlinePaint();
        float float25 = valueMarker20.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker20.addChangeListener(markerChangeListener26);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor28 = valueMarker20.getLabelAnchor();
        valueMarker13.setLabelAnchor(rectangleAnchor28);
        valueMarker11.setLabelAnchor(rectangleAnchor28);
        valueMarker3.setLabelAnchor(rectangleAnchor28);
        valueMarker1.setLabelAnchor(rectangleAnchor28);
        java.awt.Paint paint33 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.8f + "'", float25 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor28);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.lang.String str4 = valueMarker1.getLabel();
        java.awt.Font font5 = valueMarker1.getLabelFont();
        float float6 = valueMarker1.getAlpha();
        float float7 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        valueMarker9.setLabel("");
        boolean boolean16 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker1.getLabelOffsetType();
        java.lang.String str19 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        boolean boolean24 = valueMarker21.equals((java.lang.Object) wildcardClass23);
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker21.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker27 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke28 = valueMarker27.getStroke();
        valueMarker27.setValue((double) 0L);
        java.awt.Font font31 = valueMarker27.getLabelFont();
        java.awt.Paint paint32 = valueMarker27.getLabelPaint();
        java.awt.Paint paint33 = valueMarker27.getOutlinePaint();
        valueMarker21.setOutlinePaint(paint33);
        java.lang.Class<?> wildcardClass35 = valueMarker21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray36 = valueMarker1.getListeners((java.lang.Class) wildcardClass35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.String str13 = valueMarker12.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker12.removeChangeListener(markerChangeListener14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = valueMarker12.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint19 = valueMarker18.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker18.getLabelTextAnchor();
        java.awt.Paint paint22 = valueMarker18.getOutlinePaint();
        float float23 = valueMarker18.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker18.addChangeListener(markerChangeListener24);
        java.awt.Stroke stroke26 = valueMarker18.getStroke();
        java.awt.Paint paint27 = valueMarker18.getLabelPaint();
        valueMarker12.setPaint(paint27);
        valueMarker1.setPaint(paint27);
        valueMarker1.setValue((double) 1);
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setLabel("hi!");
        valueMarker1.setValue((double) (byte) 0);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.removeChangeListener(markerChangeListener14);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.addChangeListener(markerChangeListener17);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        double double5 = valueMarker1.getValue();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        valueMarker9.setLabel("hi!");
        java.awt.Font font12 = valueMarker9.getLabelFont();
        valueMarker1.setLabelFont(font12);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 100L);
        java.awt.Font font11 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        boolean boolean17 = valueMarker14.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker14.getLabelAnchor();
        valueMarker14.setValue((double) (short) 1);
        java.awt.Paint paint21 = valueMarker14.getOutlinePaint();
        java.awt.Font font22 = valueMarker14.getLabelFont();
        java.awt.Paint paint23 = valueMarker14.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        boolean boolean28 = valueMarker25.equals((java.lang.Object) wildcardClass27);
        java.awt.Paint paint29 = valueMarker25.getPaint();
        valueMarker25.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker33 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        boolean boolean36 = valueMarker33.equals((java.lang.Object) wildcardClass35);
        java.awt.Stroke stroke37 = valueMarker33.getOutlineStroke();
        java.awt.Stroke stroke38 = valueMarker33.getOutlineStroke();
        valueMarker25.setStroke(stroke38);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener40 = null;
        valueMarker25.removeChangeListener(markerChangeListener40);
        org.jfree.chart.plot.ValueMarker valueMarker43 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke44 = valueMarker43.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor45 = valueMarker43.getLabelTextAnchor();
        valueMarker43.setValue((double) 0L);
        valueMarker43.setLabel("");
        float float50 = valueMarker43.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor51 = valueMarker43.getLabelTextAnchor();
        java.awt.Font font52 = valueMarker43.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor53 = valueMarker43.getLabelAnchor();
        java.awt.Stroke stroke54 = valueMarker43.getOutlineStroke();
        valueMarker25.setOutlineStroke(stroke54);
        org.jfree.chart.plot.ValueMarker valueMarker56 = new org.jfree.chart.plot.ValueMarker((double) 100.0f, paint23, stroke54);
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = valueMarker56.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets57);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(textAnchor45);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.8f + "'", float50 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor51);
        org.junit.Assert.assertNotNull(font52);
        org.junit.Assert.assertNotNull(rectangleAnchor53);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(rectangleInsets57);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint3 = valueMarker2.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker2.getLabelTextAnchor();
        java.awt.Paint paint6 = valueMarker2.getOutlinePaint();
        java.awt.Font font7 = valueMarker2.getLabelFont();
        java.awt.Paint paint8 = valueMarker2.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        valueMarker10.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        valueMarker10.setOutlineStroke(stroke16);
        java.awt.Stroke stroke18 = valueMarker10.getOutlineStroke();
        float float19 = valueMarker10.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker10.getLabelOffset();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint24 = valueMarker23.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker23.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor26 = valueMarker23.getLabelTextAnchor();
        valueMarker23.setLabel("");
        double double29 = valueMarker23.getValue();
        java.awt.Stroke stroke30 = valueMarker23.getOutlineStroke();
        valueMarker10.setOutlineStroke(stroke30);
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (byte) 0, paint8, stroke30);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType33 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker32.setLabelOffsetType(lengthAdjustmentType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'adj' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(textAnchor26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.addChangeListener(markerChangeListener9);
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint3 = valueMarker2.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker2.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker2.getLabelTextAnchor();
        java.awt.Paint paint6 = valueMarker2.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker2.getLabelAnchor();
        float float8 = valueMarker2.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker10.getLabelTextAnchor();
        valueMarker10.setValue((double) 0L);
        valueMarker10.setLabel("");
        boolean boolean17 = valueMarker2.equals((java.lang.Object) "");
        java.awt.Stroke stroke18 = valueMarker2.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker2.getLabelOffsetType();
        valueMarker2.setAlpha(0.0f);
        java.awt.Paint paint22 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint25 = valueMarker24.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker24.addChangeListener(markerChangeListener27);
        java.awt.Paint paint29 = valueMarker24.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener30 = null;
        valueMarker24.addChangeListener(markerChangeListener30);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor32 = valueMarker24.getLabelAnchor();
        java.awt.Font font33 = valueMarker24.getLabelFont();
        java.awt.Stroke stroke34 = valueMarker24.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) 1.0f, paint22, stroke34);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleAnchor32);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(stroke34);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) -1);
        org.jfree.chart.plot.ValueMarker valueMarker4 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke5 = valueMarker4.getStroke();
        valueMarker4.setValue((double) 0L);
        java.awt.Font font8 = valueMarker4.getLabelFont();
        java.awt.Paint paint9 = valueMarker4.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        java.awt.Stroke stroke14 = valueMarker11.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10, paint9, stroke14);
        valueMarker1.setOutlinePaint(paint9);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke19 = valueMarker18.getStroke();
        valueMarker18.setValue((double) 0L);
        float float22 = valueMarker18.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker18.notifyListeners(markerChangeEvent23);
        valueMarker18.setLabel("hi!");
        valueMarker18.setValue((double) (byte) 0);
        valueMarker18.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker18.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor31);
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        java.awt.Stroke stroke7 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        java.awt.Paint paint14 = valueMarker1.getPaint();
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke18 = valueMarker17.getStroke();
        valueMarker17.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke23 = valueMarker22.getStroke();
        valueMarker17.setOutlineStroke(stroke23);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker17.notifyListeners(markerChangeEvent25);
        java.awt.Paint paint27 = valueMarker17.getLabelPaint();
        valueMarker1.setOutlinePaint(paint27);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor29 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleAnchor29);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        boolean boolean10 = valueMarker1.equals((java.lang.Object) valueMarker8);
        java.lang.String str11 = valueMarker8.getLabel();
        java.awt.Paint paint12 = valueMarker8.getOutlinePaint();
        java.awt.Font font13 = valueMarker8.getLabelFont();
        java.awt.Stroke stroke14 = valueMarker8.getOutlineStroke();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker6.addChangeListener(markerChangeListener9);
        java.awt.Paint paint11 = valueMarker6.getLabelPaint();
        valueMarker1.setOutlinePaint(paint11);
        java.awt.Font font13 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        java.lang.String str15 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke18 = valueMarker17.getStroke();
        valueMarker17.setValue((double) 0L);
        java.awt.Font font21 = valueMarker17.getLabelFont();
        java.awt.Paint paint22 = valueMarker17.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker17.removeChangeListener(markerChangeListener23);
        java.awt.Paint paint25 = valueMarker17.getPaint();
        valueMarker1.setPaint(paint25);
        java.lang.Object obj27 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        valueMarker1.notifyListeners(markerChangeEvent5);
        double double7 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.addChangeListener(markerChangeListener11);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        valueMarker1.setLabelPaint(paint11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker1.removeChangeListener(markerChangeListener15);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.removeChangeListener(markerChangeListener17);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint14 = valueMarker13.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker13.getLabelTextAnchor();
        java.awt.Paint paint17 = valueMarker13.getOutlinePaint();
        valueMarker13.setValue((double) 1);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker13.notifyListeners(markerChangeEvent21);
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        java.awt.Font font25 = valueMarker24.getLabelFont();
        valueMarker13.setLabelFont(font25);
        valueMarker1.setLabelFont(font25);
        org.jfree.chart.text.TextAnchor textAnchor28 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(textAnchor28);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1.0f));
        float float2 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8f + "'", float2 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (-1));
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        valueMarker1.notifyListeners(markerChangeEvent4);
        java.lang.Object obj6 = valueMarker1.clone();
        valueMarker1.setValue((double) 100L);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = valueMarker9.equals((java.lang.Object) wildcardClass11);
        java.awt.Stroke stroke13 = valueMarker9.getOutlineStroke();
        java.awt.Stroke stroke14 = valueMarker9.getOutlineStroke();
        valueMarker1.setStroke(stroke14);
        java.awt.Font font16 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.lang.String str9 = valueMarker1.getLabel();
        java.lang.String str10 = valueMarker1.getLabel();
        java.lang.String str11 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker16.getLabelOffsetType();
        java.awt.Paint paint19 = valueMarker16.getPaint();
        valueMarker16.setLabel("hi!");
        java.lang.String str22 = valueMarker16.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke25 = valueMarker24.getStroke();
        valueMarker24.setAlpha((float) 1);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint30 = valueMarker29.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker29.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker29.getLabelTextAnchor();
        java.awt.Paint paint33 = valueMarker29.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint36 = valueMarker35.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType37 = valueMarker35.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker35.getLabelTextAnchor();
        java.awt.Paint paint39 = valueMarker35.getOutlinePaint();
        valueMarker29.setLabelPaint(paint39);
        valueMarker24.setLabelPaint(paint39);
        java.awt.Paint paint42 = valueMarker24.getOutlinePaint();
        valueMarker16.setOutlinePaint(paint42);
        org.jfree.chart.text.TextAnchor textAnchor44 = valueMarker16.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor44);
        double double46 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener47 = null;
        valueMarker1.removeChangeListener(markerChangeListener47);
        valueMarker1.setValue(0.800000011920929d);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
        org.junit.Assert.assertNotNull(textAnchor32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(lengthAdjustmentType37);
        org.junit.Assert.assertNotNull(textAnchor38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(textAnchor44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint13 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        java.awt.Paint paint16 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker12.getLabelAnchor();
        float float18 = valueMarker12.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker12.removeChangeListener(markerChangeListener19);
        java.awt.Stroke stroke21 = valueMarker12.getStroke();
        java.awt.Stroke stroke22 = valueMarker12.getStroke();
        valueMarker1.setStroke(stroke22);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.8f + "'", float18 == 0.8f);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke22);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((-1.0d));
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint4 = valueMarker3.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = valueMarker3.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor6 = valueMarker3.getLabelTextAnchor();
        valueMarker3.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker3.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker11.getLabelAnchor();
        java.awt.Paint paint13 = valueMarker11.getOutlinePaint();
        valueMarker3.setPaint(paint13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) '#');
        java.awt.Stroke stroke17 = valueMarker16.getOutlineStroke();
        valueMarker3.setOutlineStroke(stroke17);
        valueMarker1.setStroke(stroke17);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor22 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint24 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(lengthAdjustmentType5);
        org.junit.Assert.assertNotNull(textAnchor6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(rectangleAnchor22);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint10 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setLabelPaint(paint10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Stroke stroke4 = valueMarker1.getOutlineStroke();
        double double5 = valueMarker1.getValue();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.removeChangeListener(markerChangeListener7);
        float float9 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        float float11 = valueMarker1.getAlpha();
        java.awt.Stroke stroke12 = valueMarker1.getStroke();
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        valueMarker1.setAlpha((float) 0);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) ' ');
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker19.getLabelTextAnchor();
        valueMarker19.setValue((double) 0L);
        valueMarker19.setLabel("");
        float float26 = valueMarker19.getAlpha();
        java.awt.Paint paint27 = valueMarker19.getPaint();
        java.awt.Paint paint28 = valueMarker19.getPaint();
        valueMarker17.setPaint(paint28);
        java.awt.Stroke stroke30 = valueMarker17.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint33 = valueMarker32.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker32.addChangeListener(markerChangeListener34);
        float float36 = valueMarker32.getAlpha();
        valueMarker32.setValue((double) 1L);
        java.awt.Stroke stroke39 = valueMarker32.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        boolean boolean45 = valueMarker42.equals((java.lang.Object) wildcardClass44);
        java.awt.Paint paint46 = valueMarker42.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent47 = null;
        valueMarker42.notifyListeners(markerChangeEvent47);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType49 = valueMarker42.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke52 = valueMarker51.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType53 = valueMarker51.getLabelOffsetType();
        java.awt.Paint paint54 = valueMarker51.getPaint();
        valueMarker51.setLabel("hi!");
        valueMarker51.setValue((double) '#');
        valueMarker51.setAlpha((float) 0L);
        java.awt.Paint paint61 = valueMarker51.getPaint();
        valueMarker42.setLabelPaint(paint61);
        java.awt.Paint paint63 = valueMarker42.getOutlinePaint();
        java.awt.Paint paint64 = valueMarker42.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker66 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint67 = valueMarker66.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType68 = valueMarker66.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor69 = valueMarker66.getLabelTextAnchor();
        java.awt.Paint paint70 = valueMarker66.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor71 = valueMarker66.getLabelAnchor();
        float float72 = valueMarker66.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener73 = null;
        valueMarker66.removeChangeListener(markerChangeListener73);
        java.awt.Stroke stroke75 = valueMarker66.getStroke();
        java.awt.Stroke stroke76 = valueMarker66.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker77 = new org.jfree.chart.plot.ValueMarker((double) (short) 10, paint64, stroke76);
        valueMarker32.setOutlineStroke(stroke76);
        valueMarker17.setOutlineStroke(stroke76);
        java.awt.Paint paint80 = valueMarker17.getPaint();
        valueMarker1.setLabelPaint(paint80);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.8f + "'", float26 == 0.8f);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.8f + "'", float36 == 0.8f);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(lengthAdjustmentType49);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(lengthAdjustmentType53);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(lengthAdjustmentType68);
        org.junit.Assert.assertNotNull(textAnchor69);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertNotNull(rectangleAnchor71);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.8f + "'", float72 == 0.8f);
        org.junit.Assert.assertNotNull(stroke75);
        org.junit.Assert.assertNotNull(stroke76);
        org.junit.Assert.assertNotNull(paint80);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke11 = valueMarker10.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker10.getLabelOffsetType();
        java.awt.Paint paint13 = valueMarker10.getPaint();
        valueMarker10.setLabel("hi!");
        valueMarker10.setValue((double) '#');
        valueMarker10.setAlpha((float) 0L);
        java.awt.Paint paint20 = valueMarker10.getPaint();
        valueMarker1.setLabelPaint(paint20);
        java.awt.Paint paint22 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint23 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint24 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint27 = valueMarker26.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType28 = valueMarker26.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker26.addChangeListener(markerChangeListener29);
        java.awt.Paint paint31 = valueMarker26.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker26.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker26.removeChangeListener(markerChangeListener33);
        java.awt.Stroke stroke35 = valueMarker26.getOutlineStroke();
        org.jfree.chart.text.TextAnchor textAnchor36 = valueMarker26.getLabelTextAnchor();
        boolean boolean37 = valueMarker1.equals((java.lang.Object) textAnchor36);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(lengthAdjustmentType28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(textAnchor36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke4 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        valueMarker9.setLabel("");
        boolean boolean16 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        float float19 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        float float7 = valueMarker1.getAlpha();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        boolean boolean14 = valueMarker11.equals((java.lang.Object) wildcardClass13);
        java.awt.Paint paint15 = valueMarker11.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        valueMarker11.notifyListeners(markerChangeEvent16);
        valueMarker11.setAlpha(0.0f);
        java.awt.Paint paint20 = valueMarker11.getOutlinePaint();
        java.awt.Stroke stroke21 = valueMarker11.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke21);
        org.jfree.chart.plot.ValueMarker valueMarker25 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke26 = valueMarker25.getStroke();
        valueMarker25.setValue((double) 0L);
        java.awt.Font font29 = valueMarker25.getLabelFont();
        java.awt.Paint paint30 = valueMarker25.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint33 = valueMarker32.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker32.getLabelOffsetType();
        java.awt.Stroke stroke35 = valueMarker32.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (byte) 10, paint30, stroke35);
        valueMarker36.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener39 = null;
        valueMarker36.addChangeListener(markerChangeListener39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = valueMarker36.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets41);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(lengthAdjustmentType34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(rectangleInsets41);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker5.notifyListeners(markerChangeEvent6);
        float float8 = valueMarker5.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint11 = valueMarker10.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker10.getLabelTextAnchor();
        valueMarker5.setLabelTextAnchor(textAnchor13);
        valueMarker1.setLabelTextAnchor(textAnchor13);
        java.lang.Object obj16 = valueMarker1.clone();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke3 = valueMarker2.getStroke();
        valueMarker2.setValue((double) 0L);
        java.awt.Font font6 = valueMarker2.getLabelFont();
        java.awt.Paint paint7 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = valueMarker9.equals((java.lang.Object) wildcardClass11);
        java.awt.Paint paint13 = valueMarker9.getPaint();
        java.lang.String str14 = valueMarker9.getLabel();
        java.awt.Paint paint15 = valueMarker9.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke18 = valueMarker17.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor19 = valueMarker17.getLabelTextAnchor();
        valueMarker17.setValue((double) 0L);
        valueMarker17.setLabel("");
        float float24 = valueMarker17.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker17.getLabelTextAnchor();
        java.awt.Font font26 = valueMarker17.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor27 = valueMarker17.getLabelAnchor();
        java.awt.Stroke stroke28 = valueMarker17.getOutlineStroke();
        valueMarker9.setStroke(stroke28);
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) '#', paint7, stroke28);
        float float31 = valueMarker30.getAlpha();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(textAnchor19);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.8f + "'", float24 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(rectangleAnchor27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font11 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint13 = valueMarker1.getLabelPaint();
        java.awt.Paint paint14 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        float float3 = valueMarker1.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.addChangeListener(markerChangeListener5);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        valueMarker1.notifyListeners(markerChangeEvent7);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker11.getLabelAnchor();
        java.lang.String str13 = valueMarker11.getLabel();
        java.awt.Paint paint14 = valueMarker11.getPaint();
        java.awt.Stroke stroke15 = valueMarker11.getStroke();
        java.awt.Paint paint16 = valueMarker11.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint19 = valueMarker18.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker18.getLabelTextAnchor();
        valueMarker18.setLabel("");
        double double24 = valueMarker18.getValue();
        java.awt.Stroke stroke25 = valueMarker18.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((-1.0d), paint16, stroke25);
        valueMarker1.setLabelPaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker29 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke30 = valueMarker29.getStroke();
        valueMarker29.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker29.removeChangeListener(markerChangeListener33);
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke37 = valueMarker36.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker36.getLabelOffsetType();
        java.awt.Paint paint39 = valueMarker36.getPaint();
        valueMarker36.setLabel("hi!");
        valueMarker36.setValue((double) '#');
        valueMarker36.setAlpha((float) 0L);
        java.awt.Paint paint46 = valueMarker36.getPaint();
        valueMarker29.setLabelPaint(paint46);
        valueMarker29.setLabel("");
        java.lang.String str50 = valueMarker29.getLabel();
        java.awt.Stroke stroke51 = valueMarker29.getStroke();
        java.awt.Stroke stroke52 = valueMarker29.getOutlineStroke();
        valueMarker1.setStroke(stroke52);
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.8f + "'", float3 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType4);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(lengthAdjustmentType38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        float float5 = valueMarker1.getAlpha();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        boolean boolean11 = valueMarker8.equals((java.lang.Object) wildcardClass10);
        java.awt.Paint paint12 = valueMarker8.getPaint();
        valueMarker8.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker8.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor15);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        boolean boolean21 = valueMarker18.equals((java.lang.Object) wildcardClass20);
        java.awt.Paint paint22 = valueMarker18.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        valueMarker18.notifyListeners(markerChangeEvent23);
        java.awt.Paint paint25 = valueMarker18.getOutlinePaint();
        valueMarker1.setPaint(paint25);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker1.addChangeListener(markerChangeListener27);
        java.lang.Class<?> wildcardClass29 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        valueMarker1.setLabel("hi!");
        valueMarker1.setLabel("");
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = valueMarker1.getLabelOffset();
        double double14 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.addChangeListener(markerChangeListener3);
        float float5 = valueMarker1.getAlpha();
        valueMarker1.setValue((double) 1L);
        java.awt.Stroke stroke8 = valueMarker1.getOutlineStroke();
        double double9 = valueMarker1.getValue();
        java.awt.Paint paint10 = null;
        valueMarker1.setOutlinePaint(paint10);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        valueMarker1.setValue((double) (-1L));
        float float6 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint9 = valueMarker8.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker8.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker8.addChangeListener(markerChangeListener11);
        java.awt.Paint paint13 = valueMarker8.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker8.addChangeListener(markerChangeListener14);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker8.addChangeListener(markerChangeListener16);
        valueMarker8.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke22 = valueMarker21.getStroke();
        valueMarker21.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker26 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke27 = valueMarker26.getStroke();
        valueMarker21.setOutlineStroke(stroke27);
        valueMarker8.setStroke(stroke27);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = valueMarker8.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker32 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke33 = valueMarker32.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType34 = valueMarker32.getLabelOffsetType();
        java.awt.Paint paint35 = valueMarker32.getPaint();
        valueMarker32.setLabel("hi!");
        float float38 = valueMarker32.getAlpha();
        java.awt.Font font39 = valueMarker32.getLabelFont();
        valueMarker8.setLabelFont(font39);
        org.jfree.chart.plot.ValueMarker valueMarker42 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke43 = valueMarker42.getStroke();
        valueMarker42.setAlpha((float) 1);
        java.awt.Stroke stroke46 = valueMarker42.getStroke();
        valueMarker8.setStroke(stroke46);
        valueMarker1.setOutlineStroke(stroke46);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = valueMarker1.getLabelOffset();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor50 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType51 = valueMarker1.getLabelOffsetType();
        float float52 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(lengthAdjustmentType34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.8f + "'", float38 == 0.8f);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(rectangleAnchor50);
        org.junit.Assert.assertNotNull(lengthAdjustmentType51);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.8f + "'", float52 == 0.8f);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        float float12 = valueMarker7.getAlpha();
        java.awt.Stroke stroke13 = valueMarker7.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker7.addChangeListener(markerChangeListener14);
        java.awt.Stroke stroke16 = valueMarker7.getStroke();
        java.awt.Font font17 = valueMarker7.getLabelFont();
        java.awt.Stroke stroke18 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke18);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.removeChangeListener(markerChangeListener23);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        valueMarker1.setLabel("hi!");
        java.awt.Font font4 = valueMarker1.getLabelFont();
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(textAnchor7);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke13 = valueMarker12.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker12.getLabelTextAnchor();
        valueMarker12.setValue((double) 0L);
        java.awt.Font font17 = valueMarker12.getLabelFont();
        valueMarker9.setLabelFont(font17);
        valueMarker1.setLabelFont(font17);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        valueMarker9.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke15 = valueMarker14.getStroke();
        valueMarker9.setOutlineStroke(stroke15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker9.notifyListeners(markerChangeEvent17);
        boolean boolean19 = valueMarker1.equals((java.lang.Object) valueMarker9);
        java.lang.String str20 = valueMarker9.getLabel();
        java.awt.Stroke stroke21 = valueMarker9.getOutlineStroke();
        java.awt.Paint paint22 = valueMarker9.getLabelPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        valueMarker9.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker9.removeChangeListener(markerChangeListener13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker16.getLabelOffsetType();
        java.awt.Paint paint19 = valueMarker16.getPaint();
        valueMarker16.setLabel("hi!");
        valueMarker16.setValue((double) '#');
        valueMarker16.setAlpha((float) 0L);
        java.awt.Paint paint26 = valueMarker16.getPaint();
        valueMarker9.setLabelPaint(paint26);
        valueMarker9.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint32 = valueMarker31.getOutlinePaint();
        boolean boolean34 = valueMarker31.equals((java.lang.Object) 0.0f);
        float float35 = valueMarker31.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker31.getLabelAnchor();
        java.awt.Stroke stroke37 = valueMarker31.getStroke();
        valueMarker9.setStroke(stroke37);
        valueMarker1.setOutlineStroke(stroke37);
        java.awt.Font font40 = valueMarker1.getLabelFont();
        valueMarker1.setValue((double) 1L);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.8f + "'", float35 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        valueMarker1.setAlpha((float) 1L);
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor8);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        java.lang.String str6 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (-1));
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        boolean boolean13 = valueMarker10.equals((java.lang.Object) wildcardClass12);
        java.awt.Stroke stroke14 = valueMarker10.getOutlineStroke();
        java.awt.Stroke stroke15 = valueMarker10.getOutlineStroke();
        valueMarker10.setAlpha((float) (short) 0);
        java.awt.Paint paint18 = valueMarker10.getLabelPaint();
        valueMarker8.setPaint(paint18);
        double double20 = valueMarker8.getValue();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker8.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets21);
        double double23 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        float float12 = valueMarker7.getAlpha();
        java.awt.Stroke stroke13 = valueMarker7.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker7.addChangeListener(markerChangeListener14);
        java.awt.Stroke stroke16 = valueMarker7.getStroke();
        java.awt.Font font17 = valueMarker7.getLabelFont();
        java.awt.Stroke stroke18 = valueMarker7.getStroke();
        valueMarker1.setStroke(stroke18);
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = valueMarker1.getLabelOffset();
        valueMarker1.setAlpha(1.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker1.removeChangeListener(markerChangeListener26);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener28 = null;
        valueMarker1.addChangeListener(markerChangeListener28);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        valueMarker2.setValue((double) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker2.getLabelAnchor();
        valueMarker2.setAlpha(0.0f);
        java.awt.Paint paint8 = valueMarker2.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint11 = valueMarker10.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker10.getLabelTextAnchor();
        java.awt.Paint paint14 = valueMarker10.getOutlinePaint();
        java.awt.Paint paint15 = valueMarker10.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener16 = null;
        valueMarker10.removeChangeListener(markerChangeListener16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        valueMarker10.setStroke(stroke20);
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1, paint8, stroke20);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setAlpha((float) 1);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        java.awt.Paint paint10 = valueMarker6.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint13 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        java.awt.Paint paint16 = valueMarker12.getOutlinePaint();
        valueMarker6.setLabelPaint(paint16);
        valueMarker1.setLabelPaint(paint16);
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        java.awt.Font font21 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setAlpha(1.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(textAnchor13);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 1);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker7.setValue((double) 0L);
        float float11 = valueMarker7.getAlpha();
        java.awt.Paint paint12 = valueMarker7.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        boolean boolean17 = valueMarker14.equals((java.lang.Object) wildcardClass16);
        java.awt.Paint paint18 = valueMarker14.getPaint();
        valueMarker14.setAlpha(0.0f);
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker14.getLabelTextAnchor();
        valueMarker7.setLabelTextAnchor(textAnchor21);
        java.lang.Class<?> wildcardClass23 = valueMarker7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray24 = valueMarker1.getListeners((java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.chart.plot.ValueMarker valueMarker2 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint3 = valueMarker2.getOutlinePaint();
        boolean boolean5 = valueMarker2.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker2.getLabelAnchor();
        valueMarker2.setValue((double) (short) 1);
        java.awt.Paint paint9 = valueMarker2.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker2.notifyListeners(markerChangeEvent10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke14 = valueMarker13.getStroke();
        valueMarker13.setAlpha((float) 1);
        org.jfree.chart.plot.ValueMarker valueMarker18 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint19 = valueMarker18.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker18.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker18.getLabelTextAnchor();
        java.awt.Paint paint22 = valueMarker18.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker24 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint25 = valueMarker24.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker24.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor27 = valueMarker24.getLabelTextAnchor();
        java.awt.Paint paint28 = valueMarker24.getOutlinePaint();
        valueMarker18.setLabelPaint(paint28);
        valueMarker13.setLabelPaint(paint28);
        java.awt.Paint paint31 = valueMarker13.getOutlinePaint();
        java.awt.Paint paint32 = valueMarker13.getOutlinePaint();
        double double33 = valueMarker13.getValue();
        org.jfree.chart.plot.ValueMarker valueMarker36 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke37 = valueMarker36.getStroke();
        valueMarker36.setValue((double) 0L);
        java.awt.Font font40 = valueMarker36.getLabelFont();
        java.awt.Paint paint41 = valueMarker36.getLabelPaint();
        java.awt.Paint paint42 = valueMarker36.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker44 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke45 = valueMarker44.getStroke();
        java.awt.Stroke stroke46 = valueMarker44.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker47 = new org.jfree.chart.plot.ValueMarker((double) 10, paint42, stroke46);
        valueMarker13.setOutlinePaint(paint42);
        valueMarker2.setOutlinePaint(paint42);
        org.jfree.chart.plot.ValueMarker valueMarker51 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        boolean boolean54 = valueMarker51.equals((java.lang.Object) wildcardClass53);
        java.awt.Paint paint55 = valueMarker51.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent56 = null;
        valueMarker51.notifyListeners(markerChangeEvent56);
        valueMarker51.setAlpha(0.0f);
        java.awt.Paint paint60 = valueMarker51.getOutlinePaint();
        java.lang.String str61 = valueMarker51.getLabel();
        java.awt.Stroke stroke62 = valueMarker51.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker63 = new org.jfree.chart.plot.ValueMarker((double) 0.8f, paint42, stroke62);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType64 = valueMarker63.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor65 = valueMarker63.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(textAnchor27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(font40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertNotNull(lengthAdjustmentType64);
        org.junit.Assert.assertNotNull(textAnchor65);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        valueMarker1.setValue((double) 0);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor4 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker6.getLabelTextAnchor();
        valueMarker6.setValue((double) 0L);
        valueMarker6.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker6.getLabelTextAnchor();
        java.lang.String str14 = valueMarker6.getLabel();
        java.lang.String str15 = valueMarker6.getLabel();
        java.lang.String str16 = valueMarker6.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker6.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker6.addChangeListener(markerChangeListener19);
        java.awt.Font font21 = valueMarker6.getLabelFont();
        valueMarker1.setLabelFont(font21);
        org.junit.Assert.assertNotNull(rectangleAnchor4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor3 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        double double7 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleAnchor3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        valueMarker9.setLabel("");
        boolean boolean16 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        valueMarker1.notifyListeners(markerChangeEvent19);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener21 = null;
        valueMarker1.removeChangeListener(markerChangeListener21);
        java.awt.Stroke stroke23 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener24 = null;
        valueMarker1.removeChangeListener(markerChangeListener24);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.removeChangeListener(markerChangeListener8);
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint13 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener15 = null;
        valueMarker12.addChangeListener(markerChangeListener15);
        java.awt.Paint paint17 = valueMarker12.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker12.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType19);
        java.awt.Paint paint21 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        java.awt.Stroke stroke9 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint14 = valueMarker13.getOutlinePaint();
        boolean boolean16 = valueMarker13.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker13.getLabelAnchor();
        valueMarker13.setValue((double) (short) 1);
        java.awt.Paint paint20 = valueMarker13.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint20);
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke24 = valueMarker23.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker23.getLabelOffsetType();
        java.awt.Paint paint26 = valueMarker23.getPaint();
        valueMarker23.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint31 = valueMarker30.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType32 = valueMarker30.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker30.getLabelTextAnchor();
        java.awt.Paint paint34 = valueMarker30.getOutlinePaint();
        float float35 = valueMarker30.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker30.addChangeListener(markerChangeListener36);
        java.awt.Stroke stroke38 = valueMarker30.getStroke();
        java.awt.Paint paint39 = valueMarker30.getLabelPaint();
        valueMarker23.setOutlinePaint(paint39);
        java.awt.Stroke stroke41 = valueMarker23.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        valueMarker23.notifyListeners(markerChangeEvent42);
        java.awt.Paint paint44 = valueMarker23.getOutlinePaint();
        valueMarker1.setPaint(paint44);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(lengthAdjustmentType32);
        org.junit.Assert.assertNotNull(textAnchor33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.8f + "'", float35 == 0.8f);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setAlpha((float) 1);
        java.awt.Stroke stroke5 = valueMarker1.getStroke();
        java.awt.Font font6 = valueMarker1.getLabelFont();
        java.awt.Paint paint7 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        valueMarker9.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker9.removeChangeListener(markerChangeListener13);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType18 = valueMarker16.getLabelOffsetType();
        java.awt.Paint paint19 = valueMarker16.getPaint();
        valueMarker16.setLabel("hi!");
        valueMarker16.setValue((double) '#');
        valueMarker16.setAlpha((float) 0L);
        java.awt.Paint paint26 = valueMarker16.getPaint();
        valueMarker9.setLabelPaint(paint26);
        valueMarker9.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker31 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke32 = valueMarker31.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor33 = valueMarker31.getLabelTextAnchor();
        valueMarker31.setValue((double) 0L);
        valueMarker31.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor38 = valueMarker31.getLabelTextAnchor();
        java.awt.Paint paint39 = valueMarker31.getPaint();
        valueMarker9.setOutlinePaint(paint39);
        valueMarker1.setPaint(paint39);
        java.awt.Font font42 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(lengthAdjustmentType18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(textAnchor33);
        org.junit.Assert.assertNotNull(textAnchor38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(font42);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        float float3 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.removeChangeListener(markerChangeListener4);
        java.awt.Stroke stroke6 = valueMarker1.getStroke();
        java.lang.Object obj7 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.8f + "'", float3 == 0.8f);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        float float7 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker9.getLabelTextAnchor();
        valueMarker9.setValue((double) 0L);
        valueMarker9.setLabel("");
        boolean boolean16 = valueMarker1.equals((java.lang.Object) "");
        java.awt.Stroke stroke17 = valueMarker1.getStroke();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = valueMarker1.getLabelOffset();
        java.lang.Object obj20 = valueMarker1.clone();
        valueMarker1.setLabel("");
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType23 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType23);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint11);
        java.awt.Stroke stroke13 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        valueMarker15.setValue((double) 0L);
        java.awt.Font font19 = valueMarker15.getLabelFont();
        java.awt.Paint paint20 = valueMarker15.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker15.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType21);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener23 = null;
        valueMarker1.removeChangeListener(markerChangeListener23);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.lang.String str12 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        valueMarker1.notifyListeners(markerChangeEvent13);
        float float15 = valueMarker1.getAlpha();
        float float16 = valueMarker1.getAlpha();
        java.awt.Font font17 = valueMarker1.getLabelFont();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.removeChangeListener(markerChangeListener18);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.8f + "'", float16 == 0.8f);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setAlpha((float) 1);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        java.awt.Paint paint10 = valueMarker6.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint13 = valueMarker12.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker12.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker12.getLabelTextAnchor();
        java.awt.Paint paint16 = valueMarker12.getOutlinePaint();
        valueMarker6.setLabelPaint(paint16);
        valueMarker1.setLabelPaint(paint16);
        java.awt.Paint paint19 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke22 = valueMarker21.getStroke();
        valueMarker21.setValue((double) 0L);
        java.awt.Font font25 = valueMarker21.getLabelFont();
        java.awt.Paint paint26 = valueMarker21.getLabelPaint();
        valueMarker1.setLabelPaint(paint26);
        java.awt.Stroke stroke28 = valueMarker1.getOutlineStroke();
        valueMarker1.setAlpha((float) 1L);
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        valueMarker1.notifyListeners(markerChangeEvent12);
        java.awt.Paint paint14 = valueMarker1.getLabelPaint();
        java.awt.Stroke stroke15 = valueMarker1.getStroke();
        double double16 = valueMarker1.getValue();
        java.awt.Paint paint17 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener18 = null;
        valueMarker1.removeChangeListener(markerChangeListener18);
        java.awt.Paint paint20 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        boolean boolean13 = valueMarker10.equals((java.lang.Object) wildcardClass12);
        java.awt.Paint paint14 = valueMarker10.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        valueMarker10.notifyListeners(markerChangeEvent15);
        valueMarker10.setAlpha(0.0f);
        java.awt.Paint paint19 = valueMarker10.getOutlinePaint();
        valueMarker1.setLabelPaint(paint19);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker6.setValue((double) 0L);
        java.awt.Font font10 = valueMarker6.getLabelFont();
        java.awt.Paint paint11 = valueMarker6.getLabelPaint();
        valueMarker1.setLabelPaint(paint11);
        valueMarker1.setValue((double) (byte) -1);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        java.lang.String str13 = valueMarker1.getLabel();
        java.lang.Object obj14 = valueMarker1.clone();
        valueMarker1.setLabel("hi!");
        java.lang.Object obj17 = null;
        boolean boolean18 = valueMarker1.equals(obj17);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        float float4 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint7 = valueMarker6.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType8 = valueMarker6.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker6.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.awt.Font font12 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker1.getLabelAnchor();
        java.awt.Paint paint14 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font16 = valueMarker1.getLabelFont();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.8f + "'", float4 == 0.8f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(lengthAdjustmentType8);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        java.lang.String str7 = valueMarker1.getLabel();
        java.lang.String str8 = valueMarker1.getLabel();
        float float9 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        java.awt.Paint paint12 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(textAnchor11);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = valueMarker1.getLabelOffset();
        float float13 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke15 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) (-1.0f));
        float float19 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        boolean boolean25 = valueMarker22.equals((java.lang.Object) wildcardClass24);
        java.awt.Paint paint26 = valueMarker22.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        valueMarker22.notifyListeners(markerChangeEvent27);
        valueMarker22.setAlpha(0.0f);
        java.awt.Paint paint31 = valueMarker22.getOutlinePaint();
        java.lang.String str32 = valueMarker22.getLabel();
        java.awt.Stroke stroke33 = valueMarker22.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke33);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        valueMarker1.setValue((double) 1);
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        java.awt.Paint paint12 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        float float8 = valueMarker1.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor11 = valueMarker1.getLabelAnchor();
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        valueMarker16.setValue((double) 0L);
        java.awt.Font font20 = valueMarker16.getLabelFont();
        java.awt.Paint paint21 = valueMarker16.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor23 = valueMarker16.getLabelAnchor();
        valueMarker16.setValue((double) 100L);
        java.awt.Font font26 = valueMarker16.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker28 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint29 = valueMarker28.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType30 = valueMarker28.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener31 = null;
        valueMarker28.addChangeListener(markerChangeListener31);
        java.awt.Paint paint33 = valueMarker28.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener34 = null;
        valueMarker28.addChangeListener(markerChangeListener34);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor36 = valueMarker28.getLabelAnchor();
        valueMarker16.setLabelAnchor(rectangleAnchor36);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType38 = valueMarker16.getLabelOffsetType();
        boolean boolean39 = valueMarker1.equals((java.lang.Object) valueMarker16);
        java.lang.Class class40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray41 = valueMarker1.getListeners(class40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleAnchor11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(rectangleAnchor23);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(lengthAdjustmentType30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleAnchor36);
        org.junit.Assert.assertNotNull(lengthAdjustmentType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        valueMarker1.setValue((double) (-1L));
        double double6 = valueMarker1.getValue();
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        valueMarker9.setValue((double) 0L);
        float float13 = valueMarker9.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker9.getLabelOffset();
        java.awt.Font font15 = valueMarker9.getLabelFont();
        java.awt.Font font16 = valueMarker9.getLabelFont();
        java.awt.Paint paint17 = valueMarker9.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke20 = valueMarker19.getStroke();
        valueMarker19.setValue((double) 0L);
        java.awt.Font font23 = valueMarker19.getLabelFont();
        java.awt.Paint paint24 = valueMarker19.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker19.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor26 = valueMarker19.getLabelAnchor();
        valueMarker19.setValue((double) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = valueMarker19.getLabelOffset();
        valueMarker9.setLabelOffset(rectangleInsets29);
        valueMarker1.setLabelOffset(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(rectangleAnchor26);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker8.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker8.getPaint();
        valueMarker8.setLabel("hi!");
        valueMarker8.setValue((double) '#');
        valueMarker8.setAlpha((float) 0L);
        java.awt.Paint paint18 = valueMarker8.getPaint();
        valueMarker1.setLabelPaint(paint18);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke24 = valueMarker23.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker23.getLabelTextAnchor();
        valueMarker23.setValue((double) 0L);
        valueMarker23.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor30 = valueMarker23.getLabelTextAnchor();
        java.awt.Paint paint31 = valueMarker23.getPaint();
        valueMarker1.setOutlinePaint(paint31);
        java.awt.Paint paint33 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(textAnchor30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) (short) 1);
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        java.awt.Font font9 = valueMarker1.getLabelFont();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        java.awt.Stroke stroke11 = valueMarker1.getStroke();
        double double12 = valueMarker1.getValue();
        java.awt.Font font13 = valueMarker1.getLabelFont();
        java.lang.String str14 = valueMarker1.getLabel();
        java.awt.Paint paint15 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.lang.String str9 = valueMarker1.getLabel();
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = valueMarker12.equals((java.lang.Object) wildcardClass14);
        org.jfree.chart.text.TextAnchor textAnchor16 = valueMarker12.getLabelTextAnchor();
        java.awt.Stroke stroke17 = valueMarker12.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke17);
        java.awt.Paint paint19 = valueMarker1.getPaint();
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType21 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint22 = valueMarker1.getPaint();
        java.lang.String str23 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(textAnchor16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor7 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor10 = valueMarker9.getLabelAnchor();
        java.awt.Paint paint11 = valueMarker9.getOutlinePaint();
        valueMarker1.setPaint(paint11);
        java.awt.Paint paint13 = valueMarker1.getPaint();
        java.lang.String str14 = valueMarker1.getLabel();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke18 = valueMarker17.getStroke();
        valueMarker17.setValue((double) 0L);
        float float21 = valueMarker17.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        valueMarker17.notifyListeners(markerChangeEvent22);
        valueMarker17.setLabel("hi!");
        valueMarker17.setValue((double) (byte) 0);
        valueMarker17.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor30 = valueMarker17.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor30);
        java.lang.String str32 = valueMarker1.getLabel();
        java.awt.Paint paint33 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(rectangleAnchor7);
        org.junit.Assert.assertNotNull(rectangleAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(rectangleAnchor15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.8f + "'", float21 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint11 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        java.lang.Object obj14 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor8 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) 100L);
        java.lang.String str11 = valueMarker1.getLabel();
        java.lang.String str12 = valueMarker1.getLabel();
        double double13 = valueMarker1.getValue();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(rectangleAnchor8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        double double2 = valueMarker1.getValue();
        java.awt.Stroke stroke3 = valueMarker1.getStroke();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker5.notifyListeners(markerChangeEvent6);
        float float8 = valueMarker5.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker10 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint11 = valueMarker10.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType12 = valueMarker10.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker10.getLabelTextAnchor();
        valueMarker5.setLabelTextAnchor(textAnchor13);
        java.awt.Paint paint15 = valueMarker5.getLabelPaint();
        java.awt.Font font16 = valueMarker5.getLabelFont();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker5.getLabelAnchor();
        java.lang.String str18 = valueMarker5.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType19 = valueMarker5.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType19);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.8f + "'", float8 == 0.8f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(lengthAdjustmentType12);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(lengthAdjustmentType19);
        org.junit.Assert.assertNotNull(textAnchor23);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker7.setValue((double) 0L);
        java.awt.Font font11 = valueMarker7.getLabelFont();
        java.awt.Paint paint12 = valueMarker7.getLabelPaint();
        java.awt.Paint paint13 = valueMarker7.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint13);
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint16 = valueMarker1.getPaint();
        double double17 = valueMarker1.getValue();
        java.awt.Stroke stroke18 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.String str2 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener3 = null;
        valueMarker1.removeChangeListener(markerChangeListener3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        float float12 = valueMarker7.getAlpha();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener13 = null;
        valueMarker7.addChangeListener(markerChangeListener13);
        java.awt.Stroke stroke15 = valueMarker7.getStroke();
        java.awt.Paint paint16 = valueMarker7.getLabelPaint();
        valueMarker1.setPaint(paint16);
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke20 = valueMarker1.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke23 = valueMarker22.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor24 = valueMarker22.getLabelTextAnchor();
        valueMarker22.setValue((double) 0L);
        valueMarker22.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker22.getLabelTextAnchor();
        java.lang.String str30 = valueMarker22.getLabel();
        java.lang.String str31 = valueMarker22.getLabel();
        java.lang.String str32 = valueMarker22.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener33 = null;
        valueMarker22.addChangeListener(markerChangeListener33);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener35 = null;
        valueMarker22.addChangeListener(markerChangeListener35);
        java.awt.Font font37 = valueMarker22.getLabelFont();
        valueMarker1.setLabelFont(font37);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(textAnchor24);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(font37);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        float float6 = valueMarker1.getAlpha();
        java.awt.Stroke stroke7 = valueMarker1.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener8 = null;
        valueMarker1.addChangeListener(markerChangeListener8);
        java.awt.Stroke stroke10 = valueMarker1.getStroke();
        java.awt.Stroke stroke11 = valueMarker1.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.removeChangeListener(markerChangeListener12);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener14 = null;
        valueMarker1.addChangeListener(markerChangeListener14);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.8f + "'", float6 == 0.8f);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setLabel("hi!");
        valueMarker1.setValue((double) (byte) 0);
        valueMarker1.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker1.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        boolean boolean19 = valueMarker16.equals((java.lang.Object) wildcardClass18);
        java.awt.Paint paint20 = valueMarker16.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        valueMarker16.notifyListeners(markerChangeEvent21);
        valueMarker16.setAlpha(0.0f);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker16.getLabelOffsetType();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType26 = valueMarker16.getLabelOffsetType();
        boolean boolean27 = valueMarker1.equals((java.lang.Object) lengthAdjustmentType26);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(lengthAdjustmentType26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        java.lang.String str7 = valueMarker1.getLabel();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        valueMarker9.setAlpha((float) 1);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint15 = valueMarker14.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType16 = valueMarker14.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker14.getLabelTextAnchor();
        java.awt.Paint paint18 = valueMarker14.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker20 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint21 = valueMarker20.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType22 = valueMarker20.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor23 = valueMarker20.getLabelTextAnchor();
        java.awt.Paint paint24 = valueMarker20.getOutlinePaint();
        valueMarker14.setLabelPaint(paint24);
        valueMarker9.setLabelPaint(paint24);
        java.awt.Paint paint27 = valueMarker9.getOutlinePaint();
        valueMarker1.setOutlinePaint(paint27);
        org.jfree.chart.text.TextAnchor textAnchor29 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        valueMarker1.notifyListeners(markerChangeEvent30);
        java.awt.Stroke stroke32 = valueMarker1.getOutlineStroke();
        valueMarker1.setAlpha((float) (byte) 0);
        java.awt.Paint paint35 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener36 = null;
        valueMarker1.removeChangeListener(markerChangeListener36);
        java.awt.Stroke stroke38 = valueMarker1.getStroke();
        java.awt.Stroke stroke39 = null;
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setStroke(stroke39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(lengthAdjustmentType16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(lengthAdjustmentType22);
        org.junit.Assert.assertNotNull(textAnchor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(textAnchor29);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = valueMarker3.equals((java.lang.Object) wildcardClass5);
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker3.getLabelTextAnchor();
        java.awt.Stroke stroke8 = valueMarker3.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker3.getLabelOffsetType();
        java.awt.Paint paint10 = valueMarker3.getPaint();
        valueMarker1.setOutlinePaint(paint10);
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke14 = valueMarker13.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor15 = valueMarker13.getLabelTextAnchor();
        valueMarker13.setValue((double) 0L);
        valueMarker13.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker21 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        boolean boolean24 = valueMarker21.equals((java.lang.Object) wildcardClass23);
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker21.getLabelTextAnchor();
        java.awt.Stroke stroke26 = valueMarker21.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType27 = valueMarker21.getLabelOffsetType();
        valueMarker13.setLabelOffsetType(lengthAdjustmentType27);
        valueMarker13.setAlpha((float) (byte) 0);
        float float31 = valueMarker13.getAlpha();
        java.lang.Class<?> wildcardClass32 = valueMarker13.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray33 = valueMarker1.getListeners((java.lang.Class) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Lorg.jfree.chart.plot.ValueMarker; cannot be cast to class [Ljava.util.EventListener; ([Lorg.jfree.chart.plot.ValueMarker; is in unnamed module of loader 'app'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(textAnchor15);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(lengthAdjustmentType27);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker8.getLabelAnchor();
        java.awt.Paint paint10 = valueMarker8.getOutlinePaint();
        valueMarker1.setLabelPaint(paint10);
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker1.getLabelTextAnchor();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker1.getLabelOffsetType();
        java.lang.Object obj14 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(lengthAdjustmentType6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.lang.Object obj5 = valueMarker1.clone();
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) (short) 1);
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        float float11 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.8f + "'", float11 == 0.8f);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Stroke stroke5 = valueMarker1.getOutlineStroke();
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        valueMarker1.setAlpha((float) (short) 0);
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        java.lang.String str10 = valueMarker1.getLabel();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        double double12 = valueMarker1.getValue();
        double double13 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        valueMarker1.notifyListeners(markerChangeEvent14);
        org.jfree.chart.plot.ValueMarker valueMarker17 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker17.setLabel("hi!");
        org.jfree.chart.event.MarkerChangeListener markerChangeListener20 = null;
        valueMarker17.addChangeListener(markerChangeListener20);
        org.jfree.chart.text.TextAnchor textAnchor22 = valueMarker17.getLabelTextAnchor();
        java.awt.Paint paint23 = valueMarker17.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = valueMarker17.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets24);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(textAnchor22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        float float7 = valueMarker1.getAlpha();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        float float10 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor13 = valueMarker12.getLabelAnchor();
        float float14 = valueMarker12.getAlpha();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker12.getLabelOffsetType();
        java.awt.Font font16 = valueMarker12.getLabelFont();
        boolean boolean17 = valueMarker1.equals((java.lang.Object) valueMarker12);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.8f + "'", float10 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.8f + "'", float14 == 0.8f);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker6 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke7 = valueMarker6.getStroke();
        valueMarker1.setOutlineStroke(stroke7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        valueMarker1.notifyListeners(markerChangeEvent9);
        java.awt.Paint paint11 = valueMarker1.getLabelPaint();
        java.awt.Paint paint12 = valueMarker1.getOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            valueMarker1.setAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.text.TextAnchor textAnchor2 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke3 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(textAnchor2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.lang.String str6 = valueMarker1.getLabel();
        java.awt.Paint paint7 = valueMarker1.getPaint();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        valueMarker1.setAlpha((float) (short) 1);
        java.lang.String str11 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10);
        float float2 = valueMarker1.getAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.8f + "'", float2 == 0.8f);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        float float5 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = valueMarker1.getLabelOffset();
        java.awt.Font font7 = valueMarker1.getLabelFont();
        java.awt.Font font8 = valueMarker1.getLabelFont();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke12 = valueMarker11.getStroke();
        valueMarker11.setValue((double) 0L);
        java.awt.Font font15 = valueMarker11.getLabelFont();
        java.awt.Paint paint16 = valueMarker11.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType17 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor18 = valueMarker11.getLabelAnchor();
        valueMarker11.setValue((double) 100L);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = valueMarker11.getLabelOffset();
        valueMarker1.setLabelOffset(rectangleInsets21);
        float float23 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.8f + "'", float5 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(lengthAdjustmentType17);
        org.junit.Assert.assertNotNull(rectangleAnchor18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.8f + "'", float23 == 0.8f);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker(100.0d);
        org.jfree.chart.plot.ValueMarker valueMarker3 = new org.jfree.chart.plot.ValueMarker((double) (short) 0);
        java.awt.Paint paint4 = valueMarker3.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker3.getLabelAnchor();
        java.awt.Stroke stroke6 = valueMarker3.getStroke();
        java.awt.Paint paint7 = valueMarker3.getLabelPaint();
        valueMarker1.setPaint(paint7);
        org.jfree.chart.text.TextAnchor textAnchor9 = valueMarker1.getLabelTextAnchor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(textAnchor9);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        valueMarker1.setValue((double) 0L);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener5 = null;
        valueMarker1.removeChangeListener(markerChangeListener5);
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint9 = valueMarker8.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = valueMarker8.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor11 = valueMarker8.getLabelTextAnchor();
        valueMarker8.setLabel("");
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker8.getLabelAnchor();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor17 = valueMarker16.getLabelAnchor();
        java.awt.Paint paint18 = valueMarker16.getOutlinePaint();
        java.awt.Stroke stroke19 = valueMarker16.getStroke();
        valueMarker8.setOutlineStroke(stroke19);
        valueMarker1.setOutlineStroke(stroke19);
        double double22 = valueMarker1.getValue();
        java.awt.Stroke stroke23 = valueMarker1.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(lengthAdjustmentType10);
        org.junit.Assert.assertNotNull(textAnchor11);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleAnchor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
        java.lang.Object obj4 = null;
        boolean boolean5 = valueMarker1.equals(obj4);
        java.lang.String str6 = valueMarker1.getLabel();
        java.lang.Class<?> wildcardClass7 = valueMarker1.getClass();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint6 = valueMarker5.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker5.getLabelOffsetType();
        java.awt.Stroke stroke8 = valueMarker5.getOutlineStroke();
        valueMarker1.setOutlineStroke(stroke8);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener10 = null;
        valueMarker1.addChangeListener(markerChangeListener10);
        java.awt.Stroke stroke12 = valueMarker1.getOutlineStroke();
        float float13 = valueMarker1.getAlpha();
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        valueMarker1.notifyListeners(markerChangeEvent6);
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (-1));
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = valueMarker13.equals((java.lang.Object) wildcardClass15);
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        java.awt.Stroke stroke18 = valueMarker13.getOutlineStroke();
        valueMarker13.setAlpha((float) (short) 0);
        java.awt.Paint paint21 = valueMarker13.getLabelPaint();
        valueMarker11.setPaint(paint21);
        valueMarker1.setPaint(paint21);
        java.awt.Paint paint24 = valueMarker1.getLabelPaint();
        valueMarker1.setAlpha(0.0f);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker1.addChangeListener(markerChangeListener27);
        java.lang.String str29 = valueMarker1.getLabel();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor6 = valueMarker1.getLabelAnchor();
        double double7 = valueMarker1.getValue();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        valueMarker1.notifyListeners(markerChangeEvent8);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleAnchor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.String str2 = valueMarker1.getLabel();
        java.awt.Font font3 = valueMarker1.getLabelFont();
        valueMarker1.setLabel("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = valueMarker9.equals((java.lang.Object) wildcardClass11);
        org.jfree.chart.text.TextAnchor textAnchor13 = valueMarker9.getLabelTextAnchor();
        java.awt.Stroke stroke14 = valueMarker9.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType15 = valueMarker9.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType15);
        valueMarker1.setLabel("hi!");
        java.awt.Stroke stroke19 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType20 = valueMarker1.getLabelOffsetType();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textAnchor13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(lengthAdjustmentType15);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(lengthAdjustmentType20);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent2 = null;
        valueMarker1.notifyListeners(markerChangeEvent2);
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint5 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener2 = null;
        valueMarker1.addChangeListener(markerChangeListener2);
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        valueMarker5.setValue((double) 0L);
        java.awt.Font font9 = valueMarker5.getLabelFont();
        java.awt.Paint paint10 = valueMarker5.getLabelPaint();
        java.awt.Paint paint11 = valueMarker5.getOutlinePaint();
        valueMarker1.setPaint(paint11);
        java.awt.Stroke stroke13 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor14 = valueMarker1.getLabelAnchor();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor15 = valueMarker1.getLabelAnchor();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleAnchor14);
        org.junit.Assert.assertNotNull(rectangleAnchor15);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        org.jfree.chart.text.TextAnchor textAnchor5 = valueMarker1.getLabelTextAnchor();
        java.awt.Stroke stroke6 = valueMarker1.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getLabelPaint();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener11 = null;
        valueMarker1.removeChangeListener(markerChangeListener11);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(textAnchor5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint4 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        float float7 = valueMarker1.getAlpha();
        java.awt.Paint paint8 = valueMarker1.getLabelPaint();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        valueMarker1.notifyListeners(markerChangeEvent10);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.8f + "'", float7 == 0.8f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        valueMarker1.setLabel("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = valueMarker1.getLabelOffset();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint8 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType9 = valueMarker7.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor10 = valueMarker7.getLabelTextAnchor();
        java.awt.Paint paint11 = valueMarker7.getOutlinePaint();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor12 = valueMarker7.getLabelAnchor();
        float float13 = valueMarker7.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker15 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke16 = valueMarker15.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor17 = valueMarker15.getLabelTextAnchor();
        valueMarker15.setValue((double) 0L);
        valueMarker15.setLabel("");
        boolean boolean22 = valueMarker7.equals((java.lang.Object) "");
        java.awt.Stroke stroke23 = valueMarker7.getStroke();
        java.awt.Stroke stroke24 = valueMarker7.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        valueMarker7.notifyListeners(markerChangeEvent25);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener27 = null;
        valueMarker7.removeChangeListener(markerChangeListener27);
        java.awt.Stroke stroke29 = valueMarker7.getOutlineStroke();
        valueMarker1.setStroke(stroke29);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(lengthAdjustmentType9);
        org.junit.Assert.assertNotNull(textAnchor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleAnchor12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.8f + "'", float13 == 0.8f);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textAnchor17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0.8f);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = valueMarker1.getLabelOffset();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint17 = valueMarker16.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = valueMarker16.getLabelOffset();
        valueMarker16.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker22 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint23 = valueMarker22.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType24 = valueMarker22.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor25 = valueMarker22.getLabelTextAnchor();
        java.awt.Paint paint26 = valueMarker22.getOutlinePaint();
        float float27 = valueMarker22.getAlpha();
        java.awt.Stroke stroke28 = valueMarker22.getStroke();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker22.addChangeListener(markerChangeListener29);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker22.getLabelAnchor();
        valueMarker16.setLabelAnchor(rectangleAnchor31);
        org.jfree.chart.plot.ValueMarker valueMarker34 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke35 = valueMarker34.getStroke();
        valueMarker16.setStroke(stroke35);
        valueMarker1.setStroke(stroke35);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(lengthAdjustmentType24);
        org.junit.Assert.assertNotNull(textAnchor25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.8f + "'", float27 == 0.8f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10.0f);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor2 = valueMarker1.getLabelAnchor();
        float float3 = valueMarker1.getAlpha();
        org.jfree.chart.plot.ValueMarker valueMarker5 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke6 = valueMarker5.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor7 = valueMarker5.getLabelTextAnchor();
        valueMarker5.setValue((double) 0L);
        valueMarker5.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor12 = valueMarker5.getLabelTextAnchor();
        java.lang.String str13 = valueMarker5.getLabel();
        java.awt.Paint paint14 = valueMarker5.getPaint();
        valueMarker1.setLabelPaint(paint14);
        java.awt.Paint paint16 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(rectangleAnchor2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.8f + "'", float3 == 0.8f);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textAnchor7);
        org.junit.Assert.assertNotNull(textAnchor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener7 = null;
        valueMarker1.addChangeListener(markerChangeListener7);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor9 = valueMarker1.getLabelAnchor();
        java.awt.Font font10 = valueMarker1.getLabelFont();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue((double) 0.8f);
        java.awt.Paint paint14 = valueMarker1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleAnchor9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(lengthAdjustmentType11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) wildcardClass3);
        java.awt.Font font5 = valueMarker1.getLabelFont();
        java.awt.Paint paint6 = valueMarker1.getPaint();
        valueMarker1.setAlpha(0.8f);
        float float9 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.8f + "'", float9 == 0.8f);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint6 = valueMarker1.getOutlinePaint();
        java.awt.Paint paint7 = valueMarker1.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker9 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke10 = valueMarker9.getStroke();
        valueMarker9.setValue((double) 0L);
        org.jfree.chart.plot.ValueMarker valueMarker14 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke15 = valueMarker14.getStroke();
        valueMarker9.setOutlineStroke(stroke15);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        valueMarker9.notifyListeners(markerChangeEvent17);
        boolean boolean19 = valueMarker1.equals((java.lang.Object) valueMarker9);
        java.lang.String str20 = valueMarker9.getLabel();
        java.awt.Stroke stroke21 = valueMarker9.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke24 = valueMarker23.getStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker23.getLabelOffsetType();
        java.awt.Paint paint26 = valueMarker23.getPaint();
        valueMarker23.setLabel("hi!");
        float float29 = valueMarker23.getAlpha();
        java.awt.Stroke stroke30 = valueMarker23.getOutlineStroke();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType31 = valueMarker23.getLabelOffsetType();
        boolean boolean32 = valueMarker9.equals((java.lang.Object) valueMarker23);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.8f + "'", float29 == 0.8f);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(lengthAdjustmentType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.lang.String str9 = valueMarker1.getLabel();
        java.awt.Paint paint10 = valueMarker1.getPaint();
        java.awt.Font font11 = valueMarker1.getLabelFont();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.lang.String str9 = valueMarker1.getLabel();
        java.lang.String str10 = valueMarker1.getLabel();
        java.lang.String str11 = valueMarker1.getLabel();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener12 = null;
        valueMarker1.addChangeListener(markerChangeListener12);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType14 = valueMarker1.getLabelOffsetType();
        java.awt.Paint paint15 = valueMarker1.getLabelPaint();
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(lengthAdjustmentType14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        boolean boolean4 = valueMarker1.equals((java.lang.Object) 0.0f);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor5 = valueMarker1.getLabelAnchor();
        valueMarker1.setValue((double) (short) 1);
        java.awt.Paint paint8 = valueMarker1.getOutlinePaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener9 = null;
        valueMarker1.removeChangeListener(markerChangeListener9);
        double double11 = valueMarker1.getValue();
        float float12 = valueMarker1.getAlpha();
        valueMarker1.setValue(100.0d);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleAnchor5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.8f + "'", float12 == 0.8f);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke2 = valueMarker1.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor3 = valueMarker1.getLabelTextAnchor();
        valueMarker1.setValue((double) 0L);
        valueMarker1.setLabel("");
        org.jfree.chart.text.TextAnchor textAnchor8 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint9 = valueMarker1.getPaint();
        valueMarker1.setLabel("hi!");
        org.jfree.chart.plot.ValueMarker valueMarker13 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = valueMarker13.equals((java.lang.Object) wildcardClass15);
        java.awt.Stroke stroke17 = valueMarker13.getOutlineStroke();
        java.awt.Stroke stroke18 = valueMarker13.getOutlineStroke();
        valueMarker13.setAlpha((float) (short) 0);
        java.awt.Paint paint21 = valueMarker13.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke24 = valueMarker23.getStroke();
        valueMarker23.setValue((double) 0L);
        java.awt.Font font27 = valueMarker23.getLabelFont();
        java.awt.Paint paint28 = valueMarker23.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker30 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint31 = valueMarker30.getOutlinePaint();
        valueMarker23.setPaint(paint31);
        valueMarker13.setLabelPaint(paint31);
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker((double) (-1));
        org.jfree.chart.plot.ValueMarker valueMarker37 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.lang.Object obj38 = new java.lang.Object();
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        boolean boolean40 = valueMarker37.equals((java.lang.Object) wildcardClass39);
        java.awt.Stroke stroke41 = valueMarker37.getOutlineStroke();
        java.awt.Stroke stroke42 = valueMarker37.getOutlineStroke();
        valueMarker37.setAlpha((float) (short) 0);
        java.awt.Paint paint45 = valueMarker37.getLabelPaint();
        valueMarker35.setPaint(paint45);
        valueMarker13.setPaint(paint45);
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType48 = valueMarker13.getLabelOffsetType();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor49 = valueMarker13.getLabelAnchor();
        valueMarker1.setLabelAnchor(rectangleAnchor49);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertNotNull(textAnchor8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(lengthAdjustmentType48);
        org.junit.Assert.assertNotNull(rectangleAnchor49);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener4 = null;
        valueMarker1.addChangeListener(markerChangeListener4);
        java.awt.Paint paint6 = valueMarker1.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType7 = valueMarker1.getLabelOffsetType();
        double double8 = valueMarker1.getValue();
        java.awt.Paint paint9 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker11 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint12 = valueMarker11.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker11.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker11.getLabelTextAnchor();
        java.awt.Paint paint15 = valueMarker11.getOutlinePaint();
        java.awt.Paint paint16 = valueMarker11.getOutlinePaint();
        valueMarker1.setLabelPaint(paint16);
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) (-1));
        org.jfree.chart.util.RectangleAnchor rectangleAnchor20 = valueMarker19.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor21 = valueMarker19.getLabelTextAnchor();
        valueMarker1.setLabelTextAnchor(textAnchor21);
        valueMarker1.setLabel("");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(lengthAdjustmentType7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleAnchor20);
        org.junit.Assert.assertNotNull(textAnchor21);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        org.jfree.chart.text.TextAnchor textAnchor4 = valueMarker1.getLabelTextAnchor();
        java.awt.Paint paint5 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker8 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke9 = valueMarker8.getStroke();
        valueMarker8.setValue((double) 0L);
        java.awt.Font font12 = valueMarker8.getLabelFont();
        java.awt.Paint paint13 = valueMarker8.getLabelPaint();
        java.awt.Paint paint14 = valueMarker8.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker16 = new org.jfree.chart.plot.ValueMarker((double) (byte) 100);
        java.awt.Stroke stroke17 = valueMarker16.getStroke();
        java.awt.Stroke stroke18 = valueMarker16.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker19 = new org.jfree.chart.plot.ValueMarker((double) 10, paint14, stroke18);
        valueMarker1.setOutlineStroke(stroke18);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor21 = valueMarker1.getLabelAnchor();
        float float22 = valueMarker1.getAlpha();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(textAnchor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleAnchor21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.8f + "'", float22 == 0.8f);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) 10L);
        java.awt.Paint paint2 = valueMarker1.getPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = valueMarker1.getLabelOffset();
        java.awt.Paint paint4 = valueMarker1.getOutlinePaint();
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (byte) 1);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        java.awt.Paint paint9 = valueMarker7.getOutlinePaint();
        java.awt.Paint paint10 = valueMarker7.getLabelPaint();
        org.jfree.chart.plot.ValueMarker valueMarker12 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke13 = valueMarker12.getStroke();
        org.jfree.chart.text.TextAnchor textAnchor14 = valueMarker12.getLabelTextAnchor();
        valueMarker12.setValue((double) 0L);
        valueMarker12.setLabel("");
        float float19 = valueMarker12.getAlpha();
        org.jfree.chart.text.TextAnchor textAnchor20 = valueMarker12.getLabelTextAnchor();
        java.awt.Font font21 = valueMarker12.getLabelFont();
        org.jfree.chart.plot.ValueMarker valueMarker23 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint24 = valueMarker23.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType25 = valueMarker23.getLabelOffsetType();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener26 = null;
        valueMarker23.addChangeListener(markerChangeListener26);
        java.awt.Paint paint28 = valueMarker23.getLabelPaint();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener29 = null;
        valueMarker23.addChangeListener(markerChangeListener29);
        org.jfree.chart.util.RectangleAnchor rectangleAnchor31 = valueMarker23.getLabelAnchor();
        org.jfree.chart.text.TextAnchor textAnchor32 = valueMarker23.getLabelTextAnchor();
        valueMarker12.setLabelTextAnchor(textAnchor32);
        java.awt.Stroke stroke34 = valueMarker12.getOutlineStroke();
        org.jfree.chart.plot.ValueMarker valueMarker35 = new org.jfree.chart.plot.ValueMarker(100.0d, paint10, stroke34);
        java.lang.Class<?> wildcardClass36 = paint10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.util.EventListener[] eventListenerArray37 = valueMarker1.getListeners((java.lang.Class) wildcardClass36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.awt.Color; cannot be cast to class [Ljava.util.EventListener; ([Ljava.awt.Color; is in module java.desktop of loader 'bootstrap'; [Ljava.util.EventListener; is in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(textAnchor14);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.8f + "'", float19 == 0.8f);
        org.junit.Assert.assertNotNull(textAnchor20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(lengthAdjustmentType25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleAnchor31);
        org.junit.Assert.assertNotNull(textAnchor32);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jfree.chart.plot.ValueMarker valueMarker1 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Paint paint2 = valueMarker1.getOutlinePaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType3 = valueMarker1.getLabelOffsetType();
        valueMarker1.setValue(10.0d);
        org.jfree.chart.plot.ValueMarker valueMarker7 = new org.jfree.chart.plot.ValueMarker((double) (short) 10);
        java.awt.Stroke stroke8 = valueMarker7.getStroke();
        valueMarker7.setValue((double) 0L);
        java.awt.Font font11 = valueMarker7.getLabelFont();
        java.awt.Paint paint12 = valueMarker7.getLabelPaint();
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType13 = valueMarker7.getLabelOffsetType();
        valueMarker1.setLabelOffsetType(lengthAdjustmentType13);
        float float15 = valueMarker1.getAlpha();
        org.jfree.chart.util.RectangleAnchor rectangleAnchor16 = valueMarker1.getLabelAnchor();
        org.jfree.chart.event.MarkerChangeListener markerChangeListener17 = null;
        valueMarker1.addChangeListener(markerChangeListener17);
        org.jfree.chart.event.MarkerChangeListener markerChangeListener19 = null;
        valueMarker1.addChangeListener(markerChangeListener19);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(lengthAdjustmentType3);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(lengthAdjustmentType13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.8f + "'", float15 == 0.8f);
        org.junit.Assert.assertNotNull(rectangleAnchor16);
    }
}

