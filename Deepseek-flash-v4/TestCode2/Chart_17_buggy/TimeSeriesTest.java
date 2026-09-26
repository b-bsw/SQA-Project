package org.jfree.data.time;

import static org.junit.Assert.*;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.jfree.data.general.SeriesException;

public class TimeSeriesTest {

    private TimeSeries series;

    @Before
    public void setUp() {
        series = new TimeSeries("Test");
    }

    @Test
    public void testConstructorDefaultValues() {
        assertEquals("Test", series.getKey());
        assertEquals("Time", series.getDomainDescription());
        assertEquals("Value", series.getRangeDescription());
        assertEquals(Day.class, series.getTimePeriodClass());
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testConstructorWithPeriodClass() {
        TimeSeries s = new TimeSeries("Test", Minute.class);
        assertEquals(Minute.class, s.getTimePeriodClass());
    }

    @Test
    public void testSetGetDomainDescription() {
        series.setDomainDescription("New Domain");
        assertEquals("New Domain", series.getDomainDescription());
    }

    @Test
    public void testSetGetRangeDescription() {
        series.setRangeDescription("New Range");
        assertEquals("New Range", series.getRangeDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegativeThrows() {
        series.setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCountTrimsOldest() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    @Test
    public void testSetMaximumItemCountZeroClearsAll() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.setMaximumItemCount(0);
        assertEquals(0, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegativeThrows() {
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testMaximumItemAgeDefault() {
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
    }

    @Test
    public void testSetMaximumItemAgeTrimsOldItems() {
        series.setMaximumItemAge(1);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    @Test
    public void testRemoveAgedItemsMultipleRemovals() {
        series.setMaximumItemAge(0);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(3, 1, 2020), series.getTimePeriod(0));
    }

    @Test
    public void testAddFirstItem() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 10.0);
        assertEquals(1, series.getItemCount());
        assertEquals(10.0, series.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddInsertsInSortedOrder() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(3, 1, 2020);
        Day dMid = new Day(2, 1, 2020);
        series.add(d1, 1.0);
        series.add(d2, 3.0);
        series.add(dMid, 2.0);
        assertEquals(3, series.getItemCount());
        assertEquals(d1, series.getTimePeriod(0));
        assertEquals(dMid, series.getTimePeriod(1));
        assertEquals(d2, series.getTimePeriod(2));
    }

    @Test(expected = SeriesException.class)
    public void testAddDuplicateThrows() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        series.add(d, 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItemThrows() {
        series.add((TimeSeriesDataItem) null);
    }

    @Test(expected = SeriesException.class)
    public void testAddWrongTimePeriodClassThrows() {
        series.add(new Hour(1, new Day(1, 1, 2020)), 1.0);
    }

    @Test
    public void testAddOrUpdateNewItem() {
        Day d = new Day(1, 1, 2020);
        assertNull(series.addOrUpdate(d, 5.0));
        assertEquals(5.0, series.getValue(d).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateExistingItem() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        TimeSeriesDataItem old = series.addOrUpdate(d, 2.0);
        assertNotNull(old);
        assertEquals(1.0, old.getValue().doubleValue(), 0.0);
        assertEquals(2.0, series.getValue(d).doubleValue(), 0.0);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testUpdateByPeriod() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        series.update(d, 9.0);
        assertEquals(9.0, series.getValue(d).doubleValue(), 0.0);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateByPeriodNotFoundThrows() {
        series.update(new Day(1, 1, 2020), 1.0);
    }

    @Test
    public void testUpdateByIndex() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.update(0, 42.0);
        assertEquals(42.0, series.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testDeletePeriod() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        series.delete(d1);
        assertEquals(1, series.getItemCount());
        assertEquals(d2, series.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteRangeInvalidThrows() {
        series.delete(1, 0);
    }

    @Test
    public void testDeleteRange() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        series.delete(1, 2);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(1, 1, 2020), series.getTimePeriod(0));
    }

    @Test
    public void testClear() {
        series.add(new Day(1, 1, 2020), 1.0);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexNullThrows() {
        series.getIndex(null);
    }

    @Test
    public void testGetIndexExistingPeriod() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        assertEquals(0, series.getIndex(d));
        assertTrue(series.getIndex(new Day(2, 1, 2020)) < 0);
    }

    @Test
    public void testGetValueByPeriod() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 7.0);
        assertEquals(7.0, series.getValue(d).doubleValue(), 0.0);
    }

    @Test
    public void testGetValueByMissingPeriodReturnsNull() {
        assertNull(series.getValue(new Day(1, 1, 2020)));
    }

    @Test
    public void testGetDataItemByPeriodFound() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        assertNotNull(series.getDataItem(d));
        assertEquals(d, series.getDataItem(d).getPeriod());
    }

    @Test
    public void testGetDataItemByPeriodNotFound() {
        assertNull(series.getDataItem(new Day(1, 1, 2020)));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItemNegativeIndexThrows() {
        series.getDataItem(-1);
    }

    @Test
    public void testGetTimePeriods() {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        Collection periods = series.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(d1));
        assertTrue(periods.contains(d2));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        Day d1 = new Day(1, 1, 2020);
        TimeSeries other = new TimeSeries("Other");
        other.add(d1, 10.0);
        other.add(new Day(2, 1, 2020), 20.0);
        other.add(new Day(3, 1, 2020), 30.0);
        series.add(d1, 1.0);
        Collection unique = series.getTimePeriodsUniqueToOtherSeries(other);
        assertEquals(2, unique.size());
        assertTrue(unique.contains(new Day(2, 1, 2020)));
        assertTrue(unique.contains(new Day(3, 1, 2020)));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeriesEmptyOther() {
        TimeSeries other = new TimeSeries("Other");
        Collection unique = series.getTimePeriodsUniqueToOtherSeries(other);
        assertTrue(unique.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNextTimePeriodEmptyThrows() {
        series.getNextTimePeriod();
    }

    @Test
    public void testGetNextTimePeriod() {
        Day d = new Day(1, 1, 2020);
        series.add(d, 1.0);
        assertEquals(new Day(2, 1, 2020), series.getNextTimePeriod());
    }

    @Test
    public void testCreateCopyRange() throws Exception {
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        series.add(new Day(3, 1, 2020), 3.0);
        TimeSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
        assertEquals(new Day(1, 1, 2020), copy.getTimePeriod(0));
        assertEquals(new Day(2, 1, 2020), copy.getTimePeriod(1));
    }

    @Test
    public void testCreateCopyByPeriodRange() throws Exception {
        Day d1 = new Day(1, 1, 2020);
        Day d2 = new Day(2, 1, 2020);
        series.add(d1, 1.0);
        series.add(d2, 2.0);
        TimeSeries copy = series.createCopy(d1, d2);
        assertEquals(2, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyNegativeStartThrows() throws Exception {
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyNullStartThrows() throws Exception {
        series.createCopy(null, new Day(1, 1, 2020));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyNullEndThrows() throws Exception {
        series.createCopy(new Day(1, 1, 2020), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyStartAfterEndThrows() throws Exception {
        series.createCopy(new Day(2, 1, 2020), new Day(1, 1, 2020));
    }

    @Test
    public void testCreateCopyEmptyRangeReturnsEmpty() throws Exception {
        TimeSeries copy = series.createCopy(new Day(1, 1, 2020), new Day(2, 1, 2020));
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testAddAndOrUpdate() {
        TimeSeries other = new TimeSeries("Other");
        Day d1 = new Day(1, 1, 2020);
        other.add(d1, 1.0);
        other.add(new Day(2, 1, 2020), 2.0);
        series.add(d1, 10.0);
        TimeSeries overwritten = series.addAndOrUpdate(other);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(10.0, overwritten.getValue(0).doubleValue(), 0.0);
        assertEquals(1.0, series.getValue(d1).doubleValue(), 0.0);
    }

    @Test
    public void testGetItemsReturnsUnmodifiableList() {
        series.add(new Day(1, 1, 2020), 1.0);
        try {
            series.getItems().add(new TimeSeriesDataItem(new Day(2, 1, 2020), 2.0));
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testClone() throws Exception {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries clone = (TimeSeries) series.clone();
        assertNotSame(series, clone);
        assertEquals(series, clone);
        assertEquals(series.hashCode(), clone.hashCode());
    }

    @Test
    public void testEqualsAndHashCode() {
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeries other = new TimeSeries("Test");
        other.add(new Day(1, 1, 2020), 1.0);
        assertEquals(series, other);
        assertEquals(series.hashCode(), other.hashCode());
    }

    @Test
    public void testEqualsDifferentObjects() {
        assertFalse(series.equals(new Object()));
        TimeSeries other = new TimeSeries("Other");
        assertFalse(series.equals(other));
    }
}