package org.joda.time.field;

import static org.junit.Assert.*;
import org.junit.Test;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

public class UnsupportedDurationFieldTest {

    @Test
    public void testGetInstance() {
        DurationFieldType type = DurationFieldType.years();
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(type);
        assertNotNull(field1);
        assertEquals(type, field1.getType());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(type);
        assertSame(field1, field2);
    }

    @Test
    public void testGetType() {
        DurationFieldType type = DurationFieldType.months();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals(type, field.getType());
    }

    @Test
    public void testGetName() {
        DurationFieldType type = DurationFieldType.days();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);
        assertEquals(type.getName(), field.getName());
    }

    @Test
    public void testIsSupported() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        assertFalse(field.isSupported());
    }

    @Test
    public void testIsPrecise() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertTrue(field.isPrecise());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        field.getValue(1000L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.months());
        field.getValueAsLong(1000L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueLongLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getValue(1000L, 500L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetValueAsLongLongLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        field.getValueAsLong(1000L, 500L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisInt() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        field.getMillis(5);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
        field.getMillis(5L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisIntLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
        field.getMillis(5, 100L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetMillisLongLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        field.getMillis(5L, 100L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddLongInt() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        field.add(1000L, 5);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddLongLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.months());
        field.add(1000L, 5L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifference() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.days());
        field.getDifference(1000L, 500L);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetDifferenceAsLong() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
        field.getDifferenceAsLong(1000L, 500L);
    }

    @Test
    public void testGetUnitMillis() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.hours());
        assertEquals(0L, field.getUnitMillis());
    }

    @Test
    public void testCompareTo() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertEquals(0, field.compareTo(field));
        DurationField supportedField = new DurationField() {
            public DurationFieldType getType() { return DurationFieldType.years(); }
            public String getName() { return "years"; }
            public boolean isSupported() { return true; }
            public boolean isPrecise() { return true; }
            public int getValue(long duration) { return 0; }
            public long getValueAsLong(long duration) { return 0L; }
            public int getValue(long duration, long instant) { return 0; }
            public long getValueAsLong(long duration, long instant) { return 0L; }
            public long getMillis(int value) { return 0L; }
            public long getMillis(long value) { return 0L; }
            public long getMillis(int value, long instant) { return 0L; }
            public long getMillis(long value, long instant) { return 0L; }
            public long add(long instant, int value) { return 0L; }
            public long add(long instant, long value) { return 0L; }
            public int getDifference(long minuendInstant, long subtrahendInstant) { return 0; }
            public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { return 0L; }
            public long getUnitMillis() { return 0L; }
            public int compareTo(DurationField durationField) { return 0; }
            public boolean equals(Object obj) { return false; }
            public int hashCode() { return 0; }
            public String toString() { return ""; }
        };
        assertEquals(1, field.compareTo(supportedField));
    }

    @Test
    public void testEquals() {
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.years());
        UnsupportedDurationField field2 = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertEquals(field1, field2);
        assertTrue(field1.equals(field1));
        assertFalse(field1.equals(null));
        assertFalse(field1.equals("string"));
    }

    @Test
    public void testEqualsWithNullName() {
        DurationFieldType nullNameType = new DurationFieldType("nullField") {
            public String getName() { return null; }
        };
        UnsupportedDurationField field1 = UnsupportedDurationField.getInstance(DurationFieldType.years());
        UnsupportedDurationField field2 = new UnsupportedDurationField(nullNameType) {};
        assertFalse(field1.equals(field2));
        assertFalse(field2.equals(field1));
    }

    @Test
    public void testHashCode() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertEquals(field.getName().hashCode(), field.hashCode());
    }

    @Test
    public void testToString() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertEquals("UnsupportedDurationField[years]", field.toString());
    }

    @Test
    public void testReadResolve() {
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(DurationFieldType.years());
        assertSame(field, field.readResolve());
    }
}