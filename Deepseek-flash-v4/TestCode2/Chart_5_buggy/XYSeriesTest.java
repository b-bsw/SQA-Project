package org.jfree.data.xy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.junit.Before;
import org.junit.Test;

public class XYSeriesTest {

    private TestSeriesChangeListener listener;

    @Before
    public void setUp() {
        listener = new TestSeriesChangeListener();
    }

    private void assertEventCount(int expected) {
        assertEquals(expected, listener.count);
    }

    @Test
    public void testConstructorDefaults() {
        XYSeries s = new XYSeries("S");
        assertEquals(0, s.getItemCount());
        assertTrue(s.getAutoSort());
        assertTrue(s.getAllowDuplicateXValues());
        assertEquals(Integer.MAX_VALUE, s.getMaximumItemCount());
        assertTrue(s.getItems().isEmpty());
    }

    @Test
    public void testAddSortsDataByXValue() {
        XYSeries s = new XYSeries("S");
        s.add(2.0, 20.0);
        s.add(1.0, 10.0);
        s.add(3.0, 30.0);

        assertEquals(3, s.getItemCount());
        assertEquals(1, s.getX(0).intValue());
        assertEquals(2, s.getX(1).intValue());
        assertEquals(3, s.getX(2).intValue());
        assertEquals(20, s.getY(1).intValue());
    }

    @Test
    public void testAddDuplicateXValueAllowedByDefault() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);
        s.add(1.0, 20.0);

        assertEquals(2, s.getItemCount());
        assertEquals(10, s.getY(0).intValue());
        assertEquals(20, s.getY(1).intValue());
    }

    @Test
    public void testAddDuplicateXValueThrowsWhenNotAllowed() {
        XYSeries s = new XYSeries("S", true, false);
        s.add(1.0, 10.0);

        try {
            s.add(1.0, 20.0);
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            // expected
        }

        assertEquals(1, s.getItemCount());
        assertEquals(10, s.getY(0).intValue());
    }

    @Test
    public void testUnorderedDuplicateXValueThrows() {
        XYSeries s = new XYSeries("S", false, false);
        s.add(2.0, 20.0);
        s.add(1.0, 10.0);

        try {
            s.add(2.0, 999.0);
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            // expected
        }

        assertEquals(2, s.getItemCount());
        assertEquals(20, s.getY(0).intValue());
        assertEquals(10, s.getY(1).intValue());
    }

    @Test
    public void testAddNullXThrowsIllegalArgumentException() {
        XYSeries s = new XYSeries("S");
        Number x = null;

        try {
            s.add(x, new Integer(1));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        assertEquals(0, s.getItemCount());
    }

    @Test
    public void testAddNullItemThrowsIllegalArgumentException() {
        XYSeries s = new XYSeries("S");

        try {
            s.add((XYDataItem) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddNullYPermitted() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, (Number) null);

        assertEquals(1, s.getItemCount());
        assertEquals(1, s.getX(0).intValue());
        assertNull(s.getY(0));
    }

    @Test
    public void testAddNotifyFlagControlsEvent() {
        XYSeries s = new XYSeries("S");
        s.addChangeListener(listener);

        s.add(1.0, 10.0, false);
        assertEquals(0, listener.count);

        s.add(2.0, 20.0, true);
        assertEquals(1, listener.count);
    }

    @Test
    public void testSetMaximumItemCountRemovesOldestItems() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        s.add(3.0, 30.0);

        s.addChangeListener(listener);
        s.setMaximumItemCount(2);

        assertEquals(2, s.getItemCount());
        assertEquals(2, s.getX(0).intValue());
        assertEquals(3, s.getX(1).intValue());
        assertEquals(1, listener.count);
    }

    @Test
    public void testSetMaximumItemCountRejectsNegative() {
        XYSeries s = new XYSeries("S");

        try {
            s.setMaximumItemCount(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetItemsReturnsUnmodifiableList() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);

        List items = s.getItems();
        try {
            items.add(new XYDataItem(new Integer(2), new Integer(20)));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testDeleteRangeRemovesItemsAndFiresEvent() {
        XYSeries s = new XYSeries("S");
        s.add(0.0, 0.0);
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        s.add(3.0, 30.0);

        s.addChangeListener(listener);
        s.delete(1, 2);

        assertEquals(2, s.getItemCount());
        assertEquals(0, s.getX(0).intValue());
        assertEquals(3, s.getX(1).intValue());
        assertEquals(1, listener.count);
    }

    @Test
    public void testClearWithItemsRemovesAndFiresEvent() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);

        s.addChangeListener(listener);
        s.clear();

        assertEquals(0, s.getItemCount());
        assertEquals(1, listener.count);
    }

    @Test
    public void testClearEmptyDoesNotFireEvent() {
        XYSeries s = new XYSeries("S");
        s.addChangeListener(listener);

        s.clear();

        assertEquals(0, s.getItemCount());
        assertEquals(0, listener.count);
    }

    @Test
    public void testRemoveIndex() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        s.add(3.0, 30.0);

        s.addChangeListener(listener);
        XYDataItem removed = s.remove(1);

        assertNotNull(removed);
        assertEquals(20, removed.getY().intValue());
        assertEquals(2, s.getItemCount());
        assertEquals(1, s.getX(0).intValue());
        assertEquals(3, s.getX(1).intValue());
        assertEquals(1, listener.count);
    }

    @Test
    public void testRemoveByXValue() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        s.add(3.0, 30.0);

        s.addChangeListener(listener);
        XYDataItem removed = s.remove(new Integer(2));

        assertNotNull(removed);
        assertEquals(2, removed.getX().intValue());
        assertEquals(2, s.getItemCount());
        assertEquals(1, s.getX(0).intValue());
        assertEquals(3, s.getX(1).intValue());
        assertEquals(1, listener.count);
    }

    @Test
    public void testIndexOfUsesBinarySearchWhenSorted() {
        XYSeries s = new XYSeries("S");
        s.add(10.0, 0.0);
        s.add(20.0, 0.0);
        s.add(30.0, 0.0);

        assertEquals(1, s.indexOf(new Integer(20)));
        assertTrue(s.indexOf(new Integer(25)) < 0);
    }

    @Test
    public void testIndexOfUsesLinearSearchWhenNotSorted() {
        XYSeries s = new XYSeries("S", false, true);
        s.add(2.0, 0.0);
        s.add(1.0, 0.0);

        assertEquals(0, s.indexOf(new Integer(2)));
        assertEquals(1, s.indexOf(new Integer(1)));
        assertEquals(-1, s.indexOf(new Integer(3)));
    }

    @Test
    public void testGetDataItemAndXY() {
        XYSeries s = new XYSeries("S");
        s.add(7.0, (Number) null);

        XYDataItem item = s.getDataItem(0);
        assertNotNull(item);
        assertEquals(7, item.getX().intValue());
        assertNull(item.getY());

        assertEquals(7, s.getX(0).intValue());
        assertNull(s.getY(0));
    }

    @Test
    public void testUpdateByIndex() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);

        s.addChangeListener(listener);
        s.updateByIndex(1, new Integer(22));

        assertEquals(22, s.getY(1).intValue());
        assertEquals(1, listener.count);
    }

    @Test
    public void testUpdateByXValue() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);

        s.addChangeListener(listener);
        s.update(new Integer(2), new Integer(22));

        assertEquals(22, s.getY(1).intValue());
        assertEquals(1, listener.count);
    }

    @Test
    public void testUpdateByXValueMissingThrows() {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);

        try {
            s.update(new Integer(9), new Integer(90));
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            // expected
        }
    }

    @Test
    public void testAddOrUpdateUpdatesExistingItem() {
        XYSeries s = new XYSeries("S", true, false);
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);

        s.addChangeListener(listener);
        XYDataItem overwritten = s.addOrUpdate(new Integer(2), new Integer(22));

        assertNotNull(overwritten);
        assertEquals(20, overwritten.getY().intValue());
        assertEquals(2, s.getItemCount());
        assertEquals(22, s.getY(1).intValue());
        assertEquals(1, listener.count);
    }

    @Test
    public void testAddOrUpdateAddsNewItemInSortedPosition() {
        XYSeries s = new XYSeries("S", true, false);
        s.add(2.0, 20.0);
        s.add(4.0, 40.0);

        s.addChangeListener(listener);
        XYDataItem overwritten = s.addOrUpdate(new Integer(3), new Integer(30));

        assertNull(overwritten);
        assertEquals(3, s.getItemCount());
        assertEquals(2, s.getX(0).intValue());
        assertEquals(3, s.getX(1).intValue());
        assertEquals(4, s.getX(2).intValue());
        assertEquals(1, listener.count);
    }

    @Test
    public void testAddOrUpdateWithDuplicateXAllowedAddsItem() {
        XYSeries s = new XYSeries("S", true, true);
        s.add(1.0, 10.0);

        s.addChangeListener(listener);
        XYDataItem overwritten = s.addOrUpdate(new Integer(1), new Integer(11));

        assertNull(overwritten);
        assertEquals(2, s.getItemCount());
        assertEquals(1, listener.count);
    }

    @Test
    public void testAddOrUpdateNullXThrowsIllegalArgumentException() {
        XYSeries s = new XYSeries("S");

        try {
            s.addOrUpdate((Number) null, new Integer(1));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToArray() {
        XYSeries s = new XYSeries("S");
        s.add(1.5, 10.0);
        s.add(2.5, (Number) null);

        double[][] array = s.toArray();

        assertEquals(2, array.length);
        assertEquals(1.5, array[0][0], 0.0001);
        assertEquals(10.0, array[0][1], 0.0001);
        assertEquals(2.5, array[1][0], 0.0001);
        assertTrue(Double.isNaN(array[1][1]));
    }

    @Test
    public void testToArrayEmpty() {
        XYSeries s = new XYSeries("S");
        assertEquals(0, s.toArray().length);
    }

    @Test
    public void testCloneIsDeepListCopy() throws Exception {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);

        XYSeries clone = (XYSeries) s.clone();

        assertNotSame(s, clone);
        assertEquals(s, clone);

        clone.add(3.0, 30.0);

        assertEquals(2, s.getItemCount());
        assertEquals(3, clone.getItemCount());
    }

    @Test
    public void testCreateCopyRange() throws Exception {
        XYSeries s = new XYSeries("S");
        s.add(1.0, 10.0);
        s.add(2.0, 20.0);
        s.add(3.0, 30.0);
        s.add(4.0, 40.0);

        XYSeries copy = s.createCopy(1, 2);

        assertNotNull(copy);
        assertEquals(2, copy.getItemCount());
        assertEquals(2, copy.getX(0).intValue());
        assertEquals(3, copy.getX(1).intValue());
        assertEquals(4, s.getItemCount());
    }

    @Test
    public void testEqualsAndHashCode() {
        XYSeries s1 = new XYSeries("S", true, true);
        s1.add(1.0, 10.0);
        s1.setMaximumItemCount(10);

        XYSeries s2 = new XYSeries("S", true, true);
        s2.add(1.0, 10.0);
        s2.setMaximumItemCount(10);

        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());
        assertTrue(s1.equals(s1));
        assertFalse(s1.equals(null));
        assertFalse(s1.equals("S"));

        XYSeries diff;

        diff = new XYSeries("T", true, true);
        diff.add(1.0, 10.0);
        diff.setMaximumItemCount(10);
        assertFalse(s1.equals(diff));

        diff = new XYSeries("S", false, true);
        diff.add(1.0, 10.0);
        diff.setMaximumItemCount(10);
        assertFalse(s1.equals(diff));

        diff = new XYSeries("S", true, false);
        diff.add(1.0, 10.0);
        diff.setMaximumItemCount(10);
        assertFalse(s1.equals(diff));

        diff = new XYSeries("S", true, true);
        diff.add(1.0, 99.0);
        diff.setMaximumItemCount(10);
        assertFalse(s1.equals(diff));

        diff = new XYSeries("S", true, true);
        diff.add(1.0, 10.0);
        diff.setMaximumItemCount(11);
        assertFalse(s1.equals(diff));
    }

    private static class TestSeriesChangeListener implements SeriesChangeListener {
        int count;

        @Override
        public void seriesChanged(SeriesChangeEvent event) {
            count++;
        }
    }
}