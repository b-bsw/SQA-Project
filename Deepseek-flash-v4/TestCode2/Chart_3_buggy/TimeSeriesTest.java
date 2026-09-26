package org.jfree.data.time;

import static org.junit.Assert.*;
import org.junit.Test;
import org.jfree.data.general.SeriesException;
import java.util.Collection;

public class TimeSeriesTest {

    private TimeSeries createSampleSeries(int count) {
        TimeSeries series = new TimeSeries("Test");
        for (int i = 1; i <= count; i++) {
            series.add(new Day(i, 1, 2020), i);
        }
        return series;
    }

    @Test
    public void testConstructor() {
        TimeSeries series = new TimeSeries("Test");
        assertEquals("Test", series.getKey());
        assertEquals("Time", series.getDomainDescription());
        assertEquals("Value", series.getRangeDescription());
        assertEquals(0, series.getItemCount());
        assertTrue(series.getItems().isEmpty());
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
        assertTrue(Double.isNaN(series.getMinY()));
        assertTrue(Double.isNaN(series.getMaxY()));
        assertNull(series.getTimePeriodClass());
    }

    @Test
    public void testConstructorWithDescriptions() {
        TimeSeries series = new TimeSeries("Test", "Domain", "Range");
        assertEquals("Domain", series.getDomainDescription());
        assertEquals("Range", series.getRangeDescription());
    }

    @Test
    public void testSetDescription() {
        TimeSeries series = new TimeSeries("Test");
        series.setDomainDescription("D");
        series.setRangeDescription("R");
        assertEquals("D", series.getDomainDescription());
        assertEquals("R", series.getRangeDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegative() {
        new TimeSeries("Test").setMaximumItemCount(-1);
    }

    @Test
    public void testSetMaximumItemCountRemovesOldest() {
        TimeSeries series = createSampleSeries(5);
        series.setMaximumItemCount(3);
        assertEquals(3, series.getItemCount());
        assertEquals(new Day(3, 1, 2020), series.getTimePeriod(0));
        assertEquals(3.0, series.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testSetMaximumItemCountToZero() {
        TimeSeries series = createSampleSeries(3);
        series.setMaximumItemCount(0);
        assertEquals(0, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegative() {
        new TimeSeries("Test").setMaximumItemAge(-1);
    }

    @Test
    public void testSetMaximumItemAgeRemovesOldItems() {
        TimeSeries series = createSampleSeries(3);
        series.setMaximumItemAge(1);
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testAddMaintainsSortedOrder() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(3, 1, 2020), 3.0);
        series.add(new Day(1, 1, 2020), 1.0);
        series.add(new Day(2, 1, 2020), 2.0);
        assertEquals(3, series.getItemCount());
        assertEquals(new Day(1, 1, 2020), series.getTimePeriod(0));
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(1));
        assertEquals(new Day(3, 1, 2020), series.getTimePeriod(2));
    }

    @Test
    public void testAddUpdatesTimePeriodClass() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 1.0);
        assertEquals(Day.class, series.getTimePeriodClass());
    }

    @Test
    public void testAddNullItemThrowsIllegalArgumentException() {
        TimeSeries series = new TimeSeries("Test");
        try {
            series.add((TimeSeriesDataItem) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddDuplicatePeriodThrowsSeriesException() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 1.0);
        try {
            series.add(new Day(1, 1, 2020), 2.0);
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            // expected
        }
    }

    @Test
    public void testAddWrongPeriodClassThrowsSeriesException() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 1.0);
        try {
            series.add(new Year(2020), 2.0);
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            assertTrue(e.getMessage().contains("expecting"));
        }
    }

    @Test
    public void testAddOrUpdateNewPeriodReturnsNull() {
        TimeSeries series = new TimeSeries("Test");
        TimeSeriesDataItem old = series.addOrUpdate(new Day(1, 1, 2020), 1.0);
        assertNull(old);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddOrUpdateExistingPeriodReturnsOldValue() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 1.0);
        TimeSeriesDataItem old = series.addOrUpdate(new Day(1, 1, 2020), 2.0);
        assertNotNull(old);
        assertEquals(1.0, old.getValue().doubleValue(), 0.0);
        assertEquals(1, series.getItemCount());
        assertEquals(2.0, series.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateNullValueClearsExisting() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 1.0);
        series.addOrUpdate(new Day(1, 1, 2020), (Number) null);
        assertNull(series.getValue(0));
    }

    @Test
    public void testAddAndOrUpdate() {
        TimeSeries series1 = createSampleSeries(2);
        TimeSeries series2 = new TimeSeries("Test2");
        series2.add(new Day(2, 1, 2020), 20.0);
        series2.add(new Day(3, 1, 2020), 30.0);

        TimeSeries overwritten = series1.addAndOrUpdate(series2);

        assertEquals(3, series1.getItemCount());
        assertEquals(20.0, series1.getValue(new Day(2, 1, 2020)).doubleValue(), 0.0);
        assertEquals(30.0, series1.getValue(new Day(3, 1, 2020)).doubleValue(), 0.0);
        assertNotNull(overwritten);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(2.0, overwritten.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testUpdateExistingPeriod() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 1.0);
        series.update(new Day(1, 1, 2020), 5.0);
        assertEquals(5.0, series.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testUpdateMissingPeriodThrowsSeriesException() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 1.0);
        try {
            series.update(new Day(2, 1, 2020), 2.0);
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            // expected
        }
    }

    @Test
    public void testGetValueByPeriod() {
        TimeSeries series = createSampleSeries(2);
        assertEquals(1.0, series.getValue(new Day(1, 1, 2020)).doubleValue(), 0.0);
        assertEquals(2.0, series.getValue(new Day(2, 1, 2020)).doubleValue(), 0.0);
    }

    @Test
    public void testGetDataItemByPeriod() {
        TimeSeries series = createSampleSeries(2);
        TimeSeriesDataItem item = series.getDataItem(new Day(1, 1, 2020));
        assertNotNull(item);
        assertEquals(1.0, item.getValue().doubleValue(), 0.0);
        assertNull(series.getDataItem(new Day(3, 1, 2020)));
    }

    @Test
    public void testGetDataItemReturnsClone() {
        TimeSeries series = createSampleSeries(1);
        assertNotSame(series.getDataItem(0), series.getDataItem(0));
    }

    @Test
    public void testGetTimePeriods() {
        TimeSeries series = createSampleSeries(3);
        Collection<RegularTimePeriod> periods = series.getTimePeriods();
        assertEquals(3, periods.size());
        assertTrue(periods.contains(new Day(1, 1, 2020)));
        assertTrue(periods.contains(new Day(3, 1, 2020)));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        TimeSeries series1 = new TimeSeries("S1");
        series1.add(new Day(1, 1, 2020), 1.0);
        series1.add(new Day(2, 1, 2020), 2.0);

        TimeSeries series2 = new TimeSeries("S2");
        series2.add(new Day(2, 1, 2020), 20.0);
        series2.add(new Day(3, 1, 2020), 30.0);

        Collection<RegularTimePeriod> unique = series1.getTimePeriodsUniqueToOtherSeries(series2);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(new Day(3, 1, 2020)));
    }

    @Test
    public void testDeleteRange() {
        TimeSeries series = createSampleSeries(5);
        series.delete(1, 3);
        assertEquals(2, series.getItemCount());
        assertEquals(new Day(1, 1, 2020), series.getTimePeriod(0));
        assertEquals(new Day(5, 1, 2020), series.getTimePeriod(1));
    }

    @Test
    public void testDeleteByPeriod() {
        TimeSeries series = createSampleSeries(2);
        series.delete(new Day(1, 1, 2020));
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(2, 1, 2020), series.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteInvalidRange() {
        createSampleSeries(3).delete(2, 1);
    }

    @Test
    public void testCreateCopyIntRange() {
        TimeSeries series = createSampleSeries(5);
        TimeSeries copy = series.createCopy(1, 3);
        assertEquals(3, copy.getItemCount());
        assertEquals(new Day(2, 1, 2020), copy.getTimePeriod(0));
        assertEquals(4.0, copy.getValue(2).doubleValue(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyNegativeStart() {
        createSampleSeries(3).createCopy(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyStartAfterEnd() {
        createSampleSeries(3).createCopy(2, 1);
    }

    @Test
    public void testCreateCopyPeriodRange() {
        TimeSeries series = createSampleSeries(3);
        TimeSeries copy = series.createCopy(new Day(1, 1, 2020), new Day(2, 1, 2020));
        assertEquals(2, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodRangeNullStart() {
        createSampleSeries(3).createCopy(null, new Day(1, 1, 2020));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodRangeNullEnd() {
        createSampleSeries(3).createCopy(new Day(1, 1, 2020), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyPeriodRangeStartAfterEnd() {
        createSampleSeries(3).createCopy(new Day(2, 1, 2020), new Day(1, 1, 2020));
    }

    @Test
    public void testClear() {
        TimeSeries series = createSampleSeries(3);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testCloneIsIndependent() throws Exception {
        TimeSeries series = createSampleSeries(1);
        TimeSeries clone = (TimeSeries) series.clone();
        assertNotSame(series, clone);
        assertEquals(series, clone);
        clone.add(new Day(2, 1, 2020), 2.0);
        assertEquals(1, series.getItemCount());
        assertEquals(2, clone.getItemCount());
    }

    @Test
    public void testGetMinMaxBounds() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), 5.0);
        series.add(new Day(2, 1, 2020), 10.0);
        series.add(new Day(3, 1, 2020), 1.0);

        assertEquals(1.0, series.getMinY(), 0.0);
        assertEquals(10.0, series.getMaxY(), 0.0);

        series.update(0, 100.0);
        assertEquals(100.0, series.getMaxY(), 0.0);

        series.update(0, -5.0);
        assertEquals(-5.0, series.getMinY(), 0.0);
    }

    @Test
    public void testAddNaNValue() {
        TimeSeries series = new TimeSeries("Test");
        series.add(new Day(1, 1, 2020), Double.NaN);
        assertTrue(Double.isNaN(series.getMinY()));
        series.add(new Day(2, 1, 2020), 5.0);
        assertEquals(5.0, series.getMinY(), 0.0);
    }

    @Test
    public void testGetItemsUnmodifiable() {
        TimeSeries series = createSampleSeries(1);
        try {
            series.getItems().add(new TimeSeriesDataItem(new Day(2, 1, 2020), 2.0));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        TimeSeries s1 = new TimeSeries("Test");
        TimeSeries s2 = new TimeSeries("Test");
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(new Day(1, 1, 2020), 1.0);
        assertFalse(s1.equals(s2));
        s2.add(new Day(1, 1, 2020), 1.0);
        assertTrue(s1.equals(s2));

        assertFalse(s1.equals(null));
        assertFalse(s1.equals(""));
    }
}