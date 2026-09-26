package org.jfree.data.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.List;

import org.jfree.data.general.SeriesException;
import org.junit.Before;
import org.junit.Test;

public class TimeSeriesTest {

    private TimeSeries series;
    private Day d1;
    private Day d2;
    private Day d3;
    private Day d4;
    private Day d5;

    @Before
    public void setUp() {
        d1 = new Day(1, 1, 2020);
        d2 = new Day(2, 1, 2020);
        d3 = new Day(3, 1, 2020);
        d4 = new Day(4, 1, 2020);
        d5 = new Day(5, 1, 2020);
        series = new TimeSeries("Test");
    }

    @Test
    public void testConstructorDefaults() {
        TimeSeries ts = new TimeSeries("Test");
        assertEquals("Time", ts.getDomainDescription());
        assertEquals("Value", ts.getRangeDescription());
        assertEquals(Day.class, ts.getTimePeriodClass());
        assertEquals(0, ts.getItemCount());
        assertNotNull(ts.getItems());
        assertEquals(0, ts.getItems().size());
    }

    @Test
    public void testSetDomainAndRangeDescription() {
        series.setDomainDescription("Domain");
        series.setRangeDescription("Range");
        assertEquals("Domain", series.getDomainDescription());
        assertEquals("Range", series.getRangeDescription());
    }

    @Test
    public void testGetItemsReturnsUnmodifiableList() {
        series.add(d1, 1.0);
        List items = series.getItems();
        assertEquals(1, items.size());
        try {
            items.add(new TimeSeriesDataItem(d2, 2.0));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetMaximumItemCountRejectsNegative() {
        try {
            series.setMaximumItemCount(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetMaximumItemCountTrimsOldest() {
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        series.add(d3, 3.0);
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(d2, series.getTimePeriod(0));
        assertEquals(d3, series.getTimePeriod(1));
    }

    @Test
    public void testSetMaximumItemAgeRejectsNegative() {
        try {
            series.setMaximumItemAge(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetMaximumItemAgeRemovesAgedItems() {
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        series.setMaximumItemAge(0);
        assertEquals(1, series.getItemCount());
        assertEquals(d2, series.getTimePeriod(0));
    }

    @Test
    public void testAddItemsSortsChronologically() {
        series.add(d3, 3.0);
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        assertEquals(3, series.getItemCount());
        assertEquals(d1, series.getTimePeriod(0));
        assertEquals(d2, series.getTimePeriod(1));
        assertEquals(d3, series.getTimePeriod(2));
    }

    @Test
    public void testAddDuplicateThrowsSeriesException() {
        series.add(d1, 1.0);
        try {
            series.add(d1, 2.0);
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            // expected
        }
    }

    @Test
    public void testAddOrUpdateAddsNewAndUpdatesExisting() {
        TimeSeriesDataItem old = series.addOrUpdate(d1, 10.0);
        assertNull(old);
        assertEquals(1, series.getItemCount());
        assertEquals(10.0, series.getValue(d1).doubleValue(), 0.0);

        old = series.addOrUpdate(d1, 20.0);
        assertNotNull(old);
        assertEquals(10.0, old.getValue().doubleValue(), 0.0);
        assertEquals(20.0, series.getValue(d1).doubleValue(), 0.0);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddOrUpdateRejectsNullPeriod() {
        try {
            series.addOrUpdate(null, 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testUpdateExistingAndMissingValues() {
        series.add(d1, 1.0);
        series.update(d1, 30.0);
        assertEquals(30.0, series.getValue(d1).doubleValue(), 0.0);

        try {
            series.update(d2, 99.0);
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            // expected
        }
    }

    @Test
    public void testUpdateByIndex() {
        series.add(d1, 1.0);
        series.update(0, 5.0);
        assertEquals(5.0, series.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testDeleteByPeriodAndIndexRange() {
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        series.add(d3, 3.0);
        series.add(d4, 4.0);

        series.delete(d2);
        assertEquals(3, series.getItemCount());
        assertEquals(d1, series.getTimePeriod(0));
        assertEquals(d3, series.getTimePeriod(1));

        series.delete(1, 2);
        assertEquals(1, series.getItemCount());
        assertEquals(d1, series.getTimePeriod(0));
    }

    @Test
    public void testDeleteRangeRejectsInvalidArgs() {
        try {
            series.delete(2, 1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetIndexRejectsNull() {
        try {
            series.getIndex(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetIndexAndGetValueForPeriod() {
        series.add(d1, 10.0);
        series.add(d3, 30.0);

        assertEquals(0, series.getIndex(d1));
        assertEquals(1, series.getIndex(d3));
        assertTrue(series.getIndex(d2) < 0);

        assertEquals(10.0, series.getValue(d1).doubleValue(), 0.0);
        assertEquals(30.0, series.getValue(1).doubleValue(), 0.0);
        assertNull(series.getValue(d2));
    }

    @Test
    public void testGetTimePeriodsCollection() {
        series.add(d2, 2.0);
        series.add(d1, 1.0);
        Collection periods = series.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(d1));
        assertTrue(periods.contains(d2));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        TimeSeries other = new TimeSeries("Other");
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        other.add(d2, 2.0);
        other.add(d3, 3.0);

        Collection unique = series.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(d3));
    }

    @Test
    public void testGetNextTimePeriod() {
        series.add(d1, 1.0);
        RegularTimePeriod next = series.getNextTimePeriod();
        assertEquals(new Day(2, 1, 2020), next);
    }

    @Test
    public void testGetDataItemByPeriod() {
        series.add(d1, 1.0);
        assertNotNull(series.getDataItem(d1));
        assertNull(series.getDataItem(d2));
    }

    @Test
    public void testClone() throws Exception {
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        TimeSeries clone = (TimeSeries) series.clone();
        assertNotSame(series, clone);
        assertEquals(series, clone);

        series.add(d3, 3.0);
        assertFalse(series.equals(clone));
        assertEquals(2, clone.getItemCount());
    }

    @Test
    public void testCreateCopyByIndex() throws Exception {
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        series.add(d3, 3.0);
        series.add(d4, 4.0);

        TimeSeries copy = series.createCopy(1, 3);
        assertEquals(3, copy.getItemCount());
        assertEquals(d2, copy.getTimePeriod(0));
        assertEquals(d4, copy.getTimePeriod(2));
    }

    @Test
    public void testCreateCopyByIndexRejectsNegativeStart() {
        try {
            series.createCopy(-1, 0);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    public void testCreateCopyByPeriodRange() throws Exception {
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        series.add(d3, 3.0);
        series.add(d4, 4.0);
        series.add(d5, 5.0);

        TimeSeries copy = series.createCopy(d2, d4);
        assertEquals(3, copy.getItemCount());
        assertEquals(d2, copy.getTimePeriod(0));
        assertEquals(d4, copy.getTimePeriod(2));
    }

    @Test
    public void testCreateCopyByPeriodRejectsInvalidArgs() throws Exception {
        series.add(d1, 1.0);
        try {
            series.createCopy(null, d2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }

        try {
            series.createCopy(d2, d1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        TimeSeries s1 = new TimeSeries("Test");
        TimeSeries s2 = new TimeSeries("Test");
        s1.add(d1, 1.0);
        s2.add(d1, 1.0);
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s2.add(d2, 2.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testAddAndOrUpdateWithSeries() {
        TimeSeries other = new TimeSeries("Other");
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        other.add(d2, 20.0);
        other.add(d3, 30.0);

        TimeSeries overwritten = series.addAndOrUpdate(other);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(d2, overwritten.getTimePeriod(0));
        assertEquals(2.0, overwritten.getValue(0).doubleValue(), 0.0);

        assertEquals(3, series.getItemCount());
        assertEquals(20.0, series.getValue(d2).doubleValue(), 0.0);
        assertEquals(30.0, series.getValue(d3).doubleValue(), 0.0);
    }

    @Test
    public void testMaximumItemCountEnforcedOnAdd() {
        series.setMaximumItemCount(2);
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        series.add(d3, 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(d2, series.getTimePeriod(0));
        assertEquals(d3, series.getTimePeriod(1));
    }

    @Test
    public void testDeleteNonExistentPeriodDoesNothing() {
        series.add(d1, 1.0);
        series.delete(d2);
        assertEquals(1, series.getItemCount());
        assertEquals(d1, series.getTimePeriod(0));
    }

    @Test
    public void testGetValueByInvalidIndexThrowsException() {
        series.add(d1, 1.0);
        try {
            series.getValue(5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
}