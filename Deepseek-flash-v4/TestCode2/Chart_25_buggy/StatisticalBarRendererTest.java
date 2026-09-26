package org.jfree.chart.renderer.category;

import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;

public class StatisticalBarRendererTest {

    @Test
    public void testConstructorDefaults() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        assertSame(Color.gray, renderer.getErrorIndicatorPaint());
        assertNotNull(renderer.getErrorIndicatorStroke());
        assertEquals(0.5f, renderer.getErrorIndicatorStroke().getLineWidth(), 0.0f);
    }

    @Test
    public void testSetGetErrorIndicatorPaint() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Paint paint = Color.RED;
        renderer.setErrorIndicatorPaint(paint);
        assertSame(paint, renderer.getErrorIndicatorPaint());

        renderer.setErrorIndicatorPaint(null);
        assertNull(renderer.getErrorIndicatorPaint());
    }

    @Test
    public void testSetGetErrorIndicatorStroke() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        Stroke stroke = new BasicStroke(2.0f);
        renderer.setErrorIndicatorStroke(stroke);
        assertSame(stroke, renderer.getErrorIndicatorStroke());

        renderer.setErrorIndicatorStroke(null);
        assertNull(renderer.getErrorIndicatorStroke());
    }

    @Test
    public void testEquals() {
        StatisticalBarRenderer renderer1 = new StatisticalBarRenderer();
        StatisticalBarRenderer renderer2 = new StatisticalBarRenderer();

        assertTrue(renderer1.equals(renderer1));
        assertTrue(renderer1.equals(renderer2));
        assertFalse(renderer1.equals(null));
        assertFalse(renderer1.equals(new Object()));

        renderer2.setErrorIndicatorPaint(Color.RED);
        assertFalse(renderer1.equals(renderer2));
        renderer1.setErrorIndicatorPaint(Color.RED);
        assertTrue(renderer1.equals(renderer2));

        Stroke stroke = new BasicStroke(2.0f);
        renderer2.setErrorIndicatorStroke(stroke);
        assertFalse(renderer1.equals(renderer2));
        renderer1.setErrorIndicatorStroke(stroke);
        assertTrue(renderer1.equals(renderer2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDrawItemRejectsNonStatisticalDataset() {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.drawItem(null, null, null, null, null, null, null, 0, 0, 0);
    }

    @Test
    public void testSerialization() throws Exception {
        StatisticalBarRenderer renderer = new StatisticalBarRenderer();
        renderer.setErrorIndicatorPaint(Color.RED);
        renderer.setErrorIndicatorStroke(new BasicStroke(2.0f));

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(renderer);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        StatisticalBarRenderer copy = (StatisticalBarRenderer) in.readObject();
        in.close();

        assertEquals(renderer, copy);
    }
}