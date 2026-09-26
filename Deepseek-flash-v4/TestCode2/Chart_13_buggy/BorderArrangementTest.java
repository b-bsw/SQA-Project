package org.jfree.chart.block;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BorderArrangementTest {

    private BorderArrangement arrangement;
    private BlockContainer container;
    private Graphics2D g2;

    private static class MockBlock implements Block {
        private Size2D arrangedSize;
        private Rectangle2D bounds;
        private Size2D arrangedResult;

        public MockBlock(Size2D arrangedResult) {
            this.arrangedResult = arrangedResult;
        }

        @Override
        public Size2D arrange(Graphics2D g2, RectangleConstraint constraint) {
            return arrangedResult;
        }

        @Override
        public void draw(Graphics2D g2, Rectangle2D area) {
        }

        @Override
        public void setBounds(Rectangle2D bounds) {
            this.bounds = bounds;
        }

        public Rectangle2D getBounds() {
            return bounds;
        }

        @Override
        public Object draw(Graphics2D g2, Rectangle2D area, Object param) {
            return null;
        }

        public Size2D getArrangedSize() {
            return arrangedSize;
        }
    }

    @Before
    public void setUp() {
        arrangement = new BorderArrangement();
        container = new BlockContainer(arrangement);
        g2 = null;
    }

    @Test
    public void testClear() {
        arrangement.add(new MockBlock(new Size2D(10, 10)), RectangleEdge.TOP);
        arrangement.clear();
        assertNull(arrangement.topBlock);
        assertNull(arrangement.bottomBlock);
        assertNull(arrangement.leftBlock);
        assertNull(arrangement.rightBlock);
        assertNull(arrangement.centerBlock);
    }

    @Test
    public void testEquals_SameObject() {
        assertTrue(arrangement.equals(arrangement));
    }

    @Test
    public void testEquals_NullObject() {
        assertFalse(arrangement.equals(null));
    }

    @Test
    public void testEquals_WrongType() {
        assertFalse(arrangement.equals("string"));
    }

    @Test
    public void testEquals_DifferentTopBlock() {
        BorderArrangement arr1 = new BorderArrangement();
        BorderArrangement arr2 = new BorderArrangement();
        arr1.add(new MockBlock(new Size2D(10, 10)), RectangleEdge.TOP);
        assertFalse(arr1.equals(arr2));
    }

    @Test
    public void testEquals_EqualArrangements() {
        BorderArrangement arr1 = new BorderArrangement();
        BorderArrangement arr2 = new BorderArrangement();
        arr1.add(new MockBlock(new Size2D(10, 10)), RectangleEdge.TOP);
        arr2.add(new MockBlock(new Size2D(10, 10)), RectangleEdge.TOP);
        arr1.add(new MockBlock(new Size2D(5, 5)), RectangleEdge.BOTTOM);
        arr2.add(new MockBlock(new Size2D(5, 5)), RectangleEdge.BOTTOM);
        assertTrue(arr1.equals(arr2));
    }

    @Test
    public void testAddNullKey() {
        MockBlock block = new MockBlock(new Size2D(20, 20));
        arrangement.add(block, null);
        assertSame(block, arrangement.centerBlock);
    }

    @Test
    public void testAddTopEdge() {
        MockBlock block = new MockBlock(new Size2D(10, 10));
        arrangement.add(block, RectangleEdge.TOP);
        assertSame(block, arrangement.topBlock);
    }

    @Test
    public void testAddBottomEdge() {
        MockBlock block = new MockBlock(new Size2D(10, 10));
        arrangement.add(block, RectangleEdge.BOTTOM);
        assertSame(block, arrangement.bottomBlock);
    }

    @Test
    public void testAddLeftEdge() {
        MockBlock block = new MockBlock(new Size2D(10, 10));
        arrangement.add(block, RectangleEdge.LEFT);
        assertSame(block, arrangement.leftBlock);
    }

    @Test
    public void testAddRightEdge() {
        MockBlock block = new MockBlock(new Size2D(10, 10));
        arrangement.add(block, RectangleEdge.RIGHT);
        assertSame(block, arrangement.rightBlock);
    }

    @Test
    public void testArrangeNN_EmptyContainer() {
        Size2D result = arrangement.arrangeNN(container, g2);
        assertEquals(0.0, result.getWidth(), 0.0001);
        assertEquals(0.0, result.getHeight(), 0.0001);
    }

    @Test
    public void testArrangeNN_OnlyCenter() {
        MockBlock center = new MockBlock(new Size2D(30, 40));
        arrangement.add(center, null);
        Size2D result = arrangement.arrangeNN(container, g2);
        assertEquals(30.0, result.getWidth(), 0.0001);
        assertEquals(40.0, result.getHeight(), 0.0001);
        assertNotNull(center.getBounds());
        assertEquals(0.0, center.getBounds().getX(), 0.0001);
        assertEquals(0.0, center.getBounds().getY(), 0.0001);
        assertEquals(30.0, center.getBounds().getWidth(), 0.0001);
        assertEquals(40.0, center.getBounds().getHeight(), 0.0001);
    }

    @Test
    public void testArrangeNN_TopAndBottom() {
        MockBlock top = new MockBlock(new Size2D(100, 20));
        MockBlock bottom = new MockBlock(new Size2D(80, 15));
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        Size2D result = arrangement.arrangeNN(container, g2);
        assertEquals(100.0, result.getWidth(), 0.0001);
        assertEquals(35.0, result.getHeight(), 0.0001);
        assertNotNull(top.getBounds());
        assertEquals(0.0, top.getBounds().getX(), 0.0001);
        assertEquals(0.0, top.getBounds().getY(), 0.0001);
        assertEquals(100.0, top.getBounds().getWidth(), 0.0001);
        assertEquals(20.0, top.getBounds().getHeight(), 0.0001);
        assertNotNull(bottom.getBounds());
        assertEquals(0.0, bottom.getBounds().getY(), 0.0001);
        assertEquals(100.0, bottom.getBounds().getWidth(), 0.0001);
        assertEquals(15.0, bottom.getBounds().getHeight(), 0.0001);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_WidthNoneHeightFixed() {
        RectangleConstraint constraint = new RectangleConstraint(
                LengthConstraintType.NONE, 0.0, null,
                LengthConstraintType.FIXED, 50.0, null);
        arrangement.arrange(container, g2, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_WidthRangeHeightNone() {
        RectangleConstraint constraint = new RectangleConstraint(
                LengthConstraintType.RANGE, 0.0, new Range(10, 100),
                LengthConstraintType.NONE, 0.0, null);
        arrangement.arrange(container, g2, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void testArrange_WidthRangeHeightFixed() {
        RectangleConstraint constraint = new RectangleConstraint(
                LengthConstraintType.RANGE, 0.0, new Range(10, 100),
                LengthConstraintType.FIXED, 50.0, null);
        arrangement.arrange(container, g2, constraint);
    }
}