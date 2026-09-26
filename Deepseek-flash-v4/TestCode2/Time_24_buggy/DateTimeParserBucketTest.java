package org.joda.time.format;

import static org.junit.Assert.*;

import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class DateTimeParserBucketTest {

    private static final DateTimeZone UTC = DateTimeZone.UTC;

    private DateTimeParserBucket createUtcBucket() {
        return new DateTimeParserBucket(0L, ISOChronology.getInstanceUTC(), Locale.US);
    }

    @Test
    public void testConstructorDefaults() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeParserBucket bucket = new DateTimeParserBucket(123L, chrono, null);

        assertSame(chrono, bucket.getChronology());
        assertEquals(Locale.getDefault(), bucket.getLocale());
        assertNull(bucket.getZone());
        assertEquals(0, bucket.getOffset());
        assertNull(bucket.getPivotYear());
        assertEquals(123L, bucket.computeMillis());
    }

    @Test
    public void testNonUtcChronologyConvertsToUtcAndRemembersZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");
        Chronology chrono = ISOChronology.getInstance(zone);

        DateTimeParserBucket bucket = new DateTimeParserBucket(0L, chrono, Locale.US);

        assertSame(ISOChronology.getInstanceUTC(), bucket.getChronology());
        assertEquals(zone, bucket.getZone());
    }

    @Test
    public void testSetZoneAndOffset() {
        DateTimeParserBucket bucket = createUtcBucket();
        DateTimeZone zone = DateTimeZone.forID("Europe/London");

        bucket.setZone(zone);
        assertEquals(zone, bucket.getZone());

        bucket.setOffset(1234);
        assertEquals(1234, bucket.getOffset());
        assertNull(bucket.getZone());

        bucket.setZone(DateTimeZone.UTC);
        assertEquals(0, bucket.getOffset());
        assertNull(bucket.getZone());
    }

    @Test
    public void testPivotYearCanBeSetAndCleared() {
        DateTimeParserBucket bucket = createUtcBucket();

        assertNull(bucket.getPivotYear());

        bucket.setPivotYear(2030);
        assertEquals(Integer.valueOf(2030), bucket.getPivotYear());

        bucket.setPivotYear(null);
        assertNull(bucket.getPivotYear());
    }

    @Test
    public void testComputeMillisHonoursOffset() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(100000L, ISOChronology.getInstanceUTC(), Locale.US);

        assertEquals(100000L, bucket.computeMillis());

        bucket.setOffset(999L);
        assertEquals(100000L - 999L, bucket.computeMillis());
    }

    @Test
    public void testComputeMillisSetsSavedFields() {
        DateTimeParserBucket bucket = createUtcBucket();

        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);
        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveField(ISOChronology.getInstanceUTC().year(), 2004);
        bucket.saveField(DateTimeFieldType.hourOfDay(), 10);
        bucket.saveField(DateTimeFieldType.minuteOfHour(), 30);

        long expected = new DateTime(2004, 6, 15, 10, 30, 0, 0, UTC).getMillis();

        assertEquals(expected, bucket.computeMillis());
        assertEquals(expected, bucket.computeMillis(true));
    }

    @Test
    public void testSaveFieldText() {
        DateTimeParserBucket bucket = createUtcBucket();

        bucket.saveField(DateTimeFieldType.year(), "2005", Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.monthOfYear(), "6", Locale.ENGLISH);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), "7", Locale.ENGLISH);

        long expected = new DateTime(2005, 6, 7, 0, 0, 0, UTC).getMillis();

        assertEquals(expected, bucket.computeMillis());
    }

    @Test
    public void testMonthDayOnlyUsesDefaultYear() {
        DateTimeParserBucket bucket = createUtcBucket();

        bucket.saveField(DateTimeFieldType.monthOfYear(), 2);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 29);

        long expected = new DateTime(2000, 2, 29, 0, 0, 0, UTC).getMillis();

        assertEquals(expected, bucket.computeMillis());
    }

    @Test
    public void testConstructorDefaultYearUsedForMonthDay() {
        DateTimeParserBucket bucket = new DateTimeParserBucket(
                0L, ISOChronology.getInstanceUTC(), Locale.US, null, 1999);

        bucket.saveField(DateTimeFieldType.monthOfYear(), 3);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 15);

        long expected = new DateTime(1999, 3, 15, 0, 0, 0, UTC).getMillis();

        assertEquals(expected, bucket.computeMillis());
    }

    @Test
    public void testSaveStateRestoreKeepsFieldsSavedBeforeState() {
        DateTimeParserBucket bucket = createUtcBucket();

        bucket.saveField(DateTimeFieldType.year(), 2005);
        Object state = bucket.saveState();

        bucket.saveField(DateTimeFieldType.monthOfYear(), 6);
        bucket.saveField(DateTimeFieldType.dayOfMonth(), 1);

        assertTrue(bucket.restoreState(state));

        long expected = new DateTime(2005, 1, 1, 0, 0, 0, UTC).getMillis();

        assertEquals(expected, bucket.computeMillis());
    }

    @Test
    public void testSaveStateAllowsExpansionAndRestore() {
        DateTimeParserBucket bucket = createUtcBucket();
        Object state = bucket.saveState();

        for (int i = 0; i < 9; i++) {
            bucket.saveField(DateTimeFieldType.year(), 2010);
        }

        assertEquals(2010, new DateTime(bucket.computeMillis(), UTC).getYear());

        assertTrue(bucket.restoreState(state));
        assertEquals(1970, new DateTime(bucket.computeMillis(), UTC).getYear());
    }

    @Test
    public void testRestoreStateRejectsInvalidObject() {
        DateTimeParserBucket bucket = createUtcBucket();

        assertFalse(bucket.restoreState(null));
        assertFalse(bucket.restoreState(new Object()));
    }

    @Test
    public void testInvalidFieldValueThrows() {
        DateTimeParserBucket bucket = createUtcBucket();
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13);

        try {
            bucket.computeMillis();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testInvalidFieldValueWithTextContainsText() {
        DateTimeParserBucket bucket = createUtcBucket();
        bucket.saveField(DateTimeFieldType.monthOfYear(), 13);

        try {
            bucket.computeMillis(false, "bad-date");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Cannot parse"));
            assertTrue(e.getMessage().contains("bad-date"));
        }
    }
}