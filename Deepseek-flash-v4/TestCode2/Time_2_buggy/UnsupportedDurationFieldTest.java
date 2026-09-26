package org.joda.time.field;

import junit.framework.TestCase;
import org.joda.time.DurationFieldType;

public class UnsupportedDurationFieldTest extends TestCase {

    private UnsupportedDurationField millisField;

    protected void setUp() {
        millisField = UnsupportedDurationField.getInstance(DurationFieldType.millis());
    }

    public void testGetInstanceCaches() {
        assertSame(millisField, UnsupportedDurationField.getInstance(DurationFieldType.millis()));
        assertNotSame(millisField, UnsupportedDurationField.getInstance(DurationFieldType.years()));

        UnsupportedDurationField nullField = UnsupportedDurationField.getInstance(null);
        assertNotNull(nullField);
        assertNull(nullField.getType());
        assertSame(nullField, UnsupportedDurationField.getInstance(null));
    }

    public void testTypeAndName() {
        DurationFieldType type = DurationFieldType.years();
        UnsupportedDurationField field = UnsupportedDurationField.getInstance(type);

        assertSame(type, field.getType());
        assertEquals(type.getName(), field.getName());
    }

    public void testAccessors() {
        assertFalse(millisField.isSupported());
        assertTrue(millisField.isPrecise());
        assertEquals(0L, millisField.getUnitMillis());
    }

    public void testCompareTo() {
        assertEquals(0, millisField.compareTo(millisField));
        assertEquals(0, millisField.compareTo(null));
    }

    public void testEquals() {
        assertTrue(millisField.equals(millisField));
        assertTrue(millisField.equals(UnsupportedDurationField.getInstance(DurationFieldType.millis())));

        assertFalse(millisField.equals(null));
        assertFalse(millisField.equals("not a duration field"));
        assertFalse(millisField.equals(UnsupportedDurationField.getInstance(DurationFieldType.years())));
    }

    public void testHashCode() {
        assertEquals(millisField.getName().hashCode(), millisField.hashCode());
    }

    public void testToString() {
        DurationFieldType years = DurationFieldType.years();
        assertEquals(
                "UnsupportedDurationField[" + years.getName() + "]",
                UnsupportedDurationField.getInstance(years).toString());
    }

    public void testUnsupportedOperationsThrow() {
        assertUnsupported(() -> millisField.getValue(1000L));
        assertUnsupported(() -> millisField.getValueAsLong(1000L));
        assertUnsupported(() -> millisField.getValue(1000L, 2000L));
        assertUnsupported(() -> millisField.getValueAsLong(1000L, 2000L));

        assertUnsupported(() -> millisField.getMillis(1));
        assertUnsupported(() -> millisField.getMillis(1L));
        assertUnsupported(() -> millisField.getMillis(1, 2000L));
        assertUnsupported(() -> millisField.getMillis(1L, 2000L));

        assertUnsupported(() -> millisField.add(1000L, 1));
        assertUnsupported(() -> millisField.add(1000L, 1L));

        assertUnsupported(() -> millisField.getDifference(1000L, 2000L));
        assertUnsupported(() -> millisField.getDifferenceAsLong(1000L, 2000L));
    }

    private void assertUnsupported(UnsupportedCall call) {
        try {
            call.run();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertNotNull(e.getMessage());
        }
    }

    private interface UnsupportedCall {
        void run();
    }
}