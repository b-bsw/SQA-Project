package org.jfree.chart.plot;

import static org.junit.Assert.*;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;

import org.junit.Before;
import org.junit.Test;

public class ValueMarkerTest {

    private static final double EPSILON = 0.000000001;

    private static final Paint PAINT = Color.RED;
    private static final Paint OTHER_PAINT = Color.BLUE;
    private static final Paint OUTLINE_PAINT = Color.GREEN;
    private static final Paint OTHER_OUTLINE_PAINT = Color.YELLOW;

    private static final Stroke STROKE = new BasicStroke(1.0f);
    private static final Stroke OTHER_STROKE = new BasicStroke(2.0f);
    private static final Stroke OUTLINE_STROKE = new BasicStroke(3.0f);
    private static final Stroke OTHER_OUTLINE_STROKE = new BasicStroke(4.0f);

    private ValueMarker marker;

    @Before
    public void setUp() {
        marker = new ValueMarker(10.0, PAINT, STROKE,
                OUTLINE_PAINT, OUTLINE_STROKE, 0.5f);
    }

    @Test
    public void testSingleValueConstructor() {
        ValueMarker m = new ValueMarker(42.5);
        assertEquals(42.5, m.getValue(), EPSILON);
    }

    @Test
    public void testThreeArgConstructor() {
        ValueMarker m = new ValueMarker(2.5, PAINT, STROKE);
        assertEquals(2.5, m.getValue(), EPSILON);
        assertEquals(new ValueMarker(2.5, PAINT, STROKE), m);
    }

    @Test
    public void testSixArgConstructor() {
        ValueMarker m = new ValueMarker(-7.0, PAINT, STROKE,
                OUTLINE_PAINT, OUTLINE_STROKE, 0.25f);
        assertEquals(-7.0, m.getValue(), EPSILON);
    }

    @Test
    public void testSetValue() {
        marker.setValue(0.0);
        assertEquals(0.0, marker.getValue(), EPSILON);

        marker.setValue(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, marker.getValue(), 0.0);

        marker.setValue(Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, marker.getValue(), 0.0);
    }

    @Test
    public void testEquals() {
        assertTrue(marker.equals(marker));
        assertFalse(marker.equals(null));
        assertFalse(marker.equals("not a marker"));

        ValueMarker same = new ValueMarker(10.0, PAINT, STROKE,
                OUTLINE_PAINT, OUTLINE_STROKE, 0.5f);
        assertEquals(marker, same);

        assertFalse(marker.equals(new ValueMarker(11.0, PAINT, STROKE,
                OUTLINE_PAINT, OUTLINE_STROKE, 0.5f)));
        assertFalse(marker.equals(new ValueMarker(10.0, OTHER_PAINT, STROKE,
                OUTLINE_PAINT, OUTLINE_STROKE, 0.5f)));
        assertFalse(marker.equals(new ValueMarker(10.0, PAINT, OTHER_STROKE,
                OUTLINE_PAINT, OUTLINE_STROKE, 0.5f)));
        assertFalse(marker.equals(new ValueMarker(10.0, PAINT, STROKE,
                OTHER_OUTLINE_PAINT, OUTLINE_STROKE, 0.5f)));
        assertFalse(marker.equals(new ValueMarker(10.0, PAINT, STROKE,
                OUTLINE_PAINT, OTHER_OUTLINE_STROKE, 0.5f)));
        assertFalse(marker.equals(new ValueMarker(10.0, PAINT, STROKE,
                OUTLINE_PAINT, OUTLINE_STROKE, 0.25f)));
    }

    @Test
    public void testConstructorRejectsNullPaintAndStroke() {
        try {
            new ValueMarker(1.0, null, STROKE);
            fail("Expected IllegalArgumentException for null paint.");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            new ValueMarker(1.0, PAINT, null);
            fail("Expected IllegalArgumentException for null stroke.");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}