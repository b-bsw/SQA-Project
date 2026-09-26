package org.jfree.data.time;

import static org.junit.Assert.*;
import org.junit.Test;

public class TimePeriodValuesTest {

    private TimePeriod p(long start, long end) {
        return new SimpleTimePeriod(start, end);
    }

    private void assertBounds(TimePeriodValues s,
                              int minStart, int maxStart,
                              int minMiddle, int maxMiddle,
                              int minEnd, int maxEnd) {
        assertEquals("minStart", minStart, s.getMinStartIndex());
        assertEquals("maxStart", maxStart, s.getMaxStartIndex());
        assertEquals("minMiddle", minMiddle, s.getMinMiddleIndex());
        assertEquals("maxMiddle", maxMiddle, s.getMaxMiddleIndex());
        assertEquals("minEnd", minEnd, s.getMinEndIndex());
        assertEquals("maxEnd", maxEnd, s.getMaxEndIndex());
    }

    @Test
    public void testInitialState() {
        TimePeriodValues s = new TimePeriodValues("S");
        assertEquals(0, s.getItemCount());
        assertEquals("Time", s.getDomainDescription());
        assertEquals("Value", s.getRangeDescription());
        assertBounds(s, -1, -1, -1, -1, -1, -1);
    }

    @Test
    public void testDescriptionSettersAndGetters() {
        TimePeriodValues s = new TimePeriodValues("S", "Domain", "Range");
        assertEquals("Domain", s.getDomainDescription());
        assertEquals("Range", s.getRangeDescription());

        s.setDomainDescription("D2");
        s.setRangeDescription(null);
        assertEquals("D2", s.getDomainDescription());
        assertNull(s.getRangeDescription());
    }

    @Test
    public void testDataAccessors() {
        TimePeriodValues s = new TimePeriodValues("S");
        TimePeriod period = p(2020, 2030);
        s.add(period, 5.0);

        assertEquals(1, s.getItemCount());
        assertSame(period, s.getTimePeriod(0));
        assertSame(period, s.getDataItem(0).getPeriod());
        assertEquals(5.0, s.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddWithNullNumberValue() {
        TimePeriodValues s = new TimePeriodValues("S");
        s.add(p(1000, 2000), (Number) null);
        assertEquals(1, s.getItemCount());
        assertNull(s.getValue(0));
    }

    @Test
    public void testAddUpdatesBounds() {
        TimePeriodValues s = new TimePeriodValues("S");

        s.add(p(2020, 2030), 1.0); // index 0
        s.add(p(2019, 2025), 2.0); // index 1
        s.add(p(2021, 2040), 3.0); // index 2

        assertEquals(3, s.getItemCount());
        assertBounds(s, 1, 2, 1, 2, 1, 2);
    }

    @Test
    public void testUpdateValue() {
        TimePeriodValues s = new TimePeriodValues("S");
        s.add(p(2020, 2030), 1.0);

        s.update(0, 42.0);

        assertEquals(42.0, s.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testDeleteRecalculatesBounds() {
        TimePeriodValues s = new TimePeriodValues("S");
        s.add(p(2020, 2030), 1.0); // index 0
        s.add(p(2019, 2025), 2.0); // index 1
        s.add(p(2021, 2040), 3.0); // index 2

        s.delete(1, 1);

        assertEquals(2, s.getItemCount());
        assertEquals(2020L, s.getTimePeriod(0).getStart().getTime());
        assertEquals(2021L, s.getTimePeriod(1).getStart().getTime());
        assertBounds(s, 0, 1, 0, 1, 0, 1);
    }

    @Test
    public void testDeleteRange() {
        TimePeriodValues s = new TimePeriodValues("S");
        s.add(p(1, 2), 1.0);
        s.add(p(2, 3), 2.0);
        s.add(p(3, 4), 3.0);
        s.add(p(4, 5), 4.0);

        s.delete(1, 2);

        assertEquals(2, s.getItemCount());
        assertEquals(1L, s.getTimePeriod(0).getStart().getTime());
        assertEquals(4L, s.getTimePeriod(1).getStart().getTime());
        assertEquals(0, s.getMinStartIndex());
        assertEquals(1, s.getMaxStartIndex());
    }

    @Test
    public void testEqualsAndHashCode() {
        TimePeriodValues a = new TimePeriodValues("S", "D", "R");
        TimePeriodValues b = new TimePeriodValues("S", "D", "R");

        assertTrue(a.equals(a));
        assertFalse(a.equals(null));
        assertFalse(a.equals(""));

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());

        a.add(p(1, 2), 1.0);
        b.add(p(1, 2), 1.0);
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());

        b.update(0, 2.0);
        assertFalse(a.equals(b));

        b.update(0, 1.0);
        b.setDomainDescription("X");
        assertFalse(a.equals(b));

        b.setDomainDescription("D");
        b.setRangeDescription("X");
        assertFalse(a.equals(b));
    }

    @Test
    public void testClone() throws Exception {
        TimePeriodValues s = new TimePeriodValues("S", "D", "R");
        s.add(p(1, 2), 1.0);

        TimePeriodValues clone = (TimePeriodValues) s.clone();

        assertNotSame(s, clone);
        assertEquals(s, clone);
        assertEquals(s.hashCode(), clone.hashCode());
    }

    @Test
    public void testCreateCopyEmpty() {
        TimePeriodValues s = new TimePeriodValues("S");
        TimePeriodValues copy = s.createCopy(0, 0);
        assertNotNull(copy);
        assertEquals(0, copy.getItemCount());
    }

    @Test
    public void testCreateCopyCopiesSubset() {
        TimePeriodValues s = new TimePeriodValues("S", "D", "R");
        s.add(p(1, 2), 1.0);
        s.add(p(2, 3), 2.0);
        s.add(p(3, 4), 3.0);

        TimePeriodValues copy = s.createCopy(1, 2);

        assertNotSame(s, copy);
        assertEquals(2, copy.getItemCount());
        assertEquals(2L, copy.getTimePeriod(0).getStart().getTime());
        assertEquals(3L, copy.getTimePeriod(1).getStart().getTime());

        copy.update(0, 99.0);
        assertEquals(2.0, s.getValue(1).doubleValue(), 0.0);
    }

    @Test
    public void testInitialBoundsRemainNegativeWhenEmpty() {
        TimePeriodValues s = new TimePeriodValues("S");
        assertBounds(s, -1, -1, -1, -1, -1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItemRejected() {
        TimePeriodValues s = new TimePeriodValues("S");
        s.add((TimePeriodValue) null);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItemOutOfBounds() {
        new TimePeriodValues("S").getDataItem(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testUpdateOutOfBounds() {
        new TimePeriodValues("S").update(0, 1.0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteOutOfBounds() {
        new TimePeriodValues("S").delete(0, 0);
    }
}