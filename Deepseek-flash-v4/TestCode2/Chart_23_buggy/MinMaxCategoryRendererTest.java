package org.jfree.chart.renderer.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.Stroke;
import javax.swing.Icon;

import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.junit.Before;
import org.junit.Test;

public class MinMaxCategoryRendererTest {

    private MinMaxCategoryRenderer renderer;
    private ChangeListener listener;

    @Before
    public void setUp() {
        renderer = new MinMaxCategoryRenderer();
        listener = new ChangeListener();
        renderer.addChangeListener(listener);
    }

    @Test
    public void testDefaults() {
        assertFalse(renderer.isDrawLines());
        assertEquals(Color.black, renderer.getGroupPaint());
        assertEquals(new BasicStroke(1.0f), renderer.getGroupStroke());
        assertNotNull(renderer.getObjectIcon());
        assertNotNull(renderer.getMinIcon());
        assertNotNull(renderer.getMaxIcon());
    }

    @Test
    public void testSetDrawLinesFiresEventOnlyWhenChanged() {
        renderer.setDrawLines(false);
        assertEquals(0, listener.count);

        renderer.setDrawLines(true);
        assertTrue(renderer.isDrawLines());
        assertEquals(1, listener.count);

        renderer.setDrawLines(true);
        assertEquals(1, listener.count);

        renderer.setDrawLines(false);
        assertFalse(renderer.isDrawLines());
        assertEquals(2, listener.count);
    }

    @Test
    public void testSetGroupPaint() {
        Paint red = Color.RED;
        renderer.setGroupPaint(red);
        assertSame(red, renderer.getGroupPaint());
        assertEquals(1, listener.count);
    }

    @Test
    public void testSetGroupPaintNull() {
        try {
            renderer.setGroupPaint(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'paint' argument.", e.getMessage());
            assertEquals(0, listener.count);
        }
    }

    @Test
    public void testSetGroupStroke() {
        Stroke stroke = new BasicStroke(2.0f);
        renderer.setGroupStroke(stroke);
        assertSame(stroke, renderer.getGroupStroke());
        assertEquals(1, listener.count);
    }

    @Test
    public void testSetGroupStrokeNull() {
        try {
            renderer.setGroupStroke(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'stroke' argument.", e.getMessage());
            assertEquals(0, listener.count);
        }
    }

    @Test
    public void testSetObjectIcon() {
        Icon icon = new TestIcon(8, 8);
        renderer.setObjectIcon(icon);
        assertSame(icon, renderer.getObjectIcon());
        assertEquals(1, listener.count);
    }

    @Test
    public void testSetObjectIconNull() {
        Icon old = renderer.getObjectIcon();
        try {
            renderer.setObjectIcon(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'icon' argument.", e.getMessage());
            assertEquals(0, listener.count);
            assertSame(old, renderer.getObjectIcon());
        }
    }

    @Test
    public void testSetMinIcon() {
        Icon icon = new TestIcon(3, 3);
        renderer.setMinIcon(icon);
        assertSame(icon, renderer.getMinIcon());
        assertEquals(1, listener.count);
    }

    @Test
    public void testSetMinIconNull() {
        Icon old = renderer.getMinIcon();
        try {
            renderer.setMinIcon(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'icon' argument.", e.getMessage());
            assertEquals(0, listener.count);
            assertSame(old, renderer.getMinIcon());
        }
    }

    @Test
    public void testSetMaxIcon() {
        Icon icon = new TestIcon(5, 5);
        renderer.setMaxIcon(icon);
        assertSame(icon, renderer.getMaxIcon());
        assertEquals(1, listener.count);
    }

    @Test
    public void testSetMaxIconNull() {
        Icon old = renderer.getMaxIcon();
        try {
            renderer.setMaxIcon(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'icon' argument.", e.getMessage());
            assertEquals(0, listener.count);
            assertSame(old, renderer.getMaxIcon());
        }
    }

    @Test
    public void testEquals() {
        MinMaxCategoryRenderer r1 = new MinMaxCategoryRenderer();
        MinMaxCategoryRenderer r2 = new MinMaxCategoryRenderer();

        r2.setObjectIcon(r1.getObjectIcon());
        r2.setMinIcon(r1.getMinIcon());
        r2.setMaxIcon(r1.getMaxIcon());

        assertEquals(r1, r2);
        assertFalse(r1.equals(null));
        assertFalse(r1.equals("not a renderer"));

        r2.setDrawLines(true);
        assertFalse(r1.equals(r2));

        r2.setDrawLines(false);
        r2.setGroupPaint(Color.RED);
        assertFalse(r1.equals(r2));
    }

    private static class TestIcon implements Icon {
        private final int width;
        private final int height;

        TestIcon(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
        }

        @Override
        public int getIconWidth() {
            return width;
        }

        @Override
        public int getIconHeight() {
            return height;
        }
    }

    private static class ChangeListener implements RendererChangeListener {
        int count;

        @Override
        public void rendererChanged(RendererChangeEvent event) {
            count++;
        }
    }
}