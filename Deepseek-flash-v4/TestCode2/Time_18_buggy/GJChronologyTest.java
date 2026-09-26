package org.joda.time.chrono;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.ReadableInstant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GJChronologyTest {

    private static final DateTimeZone DEFAULT_ZONE = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    private DateTimeZone originalZone;

    @Before
    public void setUp() {
        originalZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DEFAULT_ZONE);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalZone);
    }

    @Test
    public void testGetInstanceUTC() {
        GJChronology chronology = GJChronology.getInstanceUTC();
        assertNotNull(chronology);
        assertEquals(DateTimeZone.UTC, chronology.getZone());
        assertEquals(4, chronology.getMinimumDaysInFirstWeek());
        assertNotNull(chronology.getGregorianCutover());
    }

    @Test
    public void testGetInstanceDefaultZone() {
        GJChronology chronology = GJChronology.getInstance();
        assertEquals(DateTimeZone.getDefault(), chronology.getZone());
        assertEquals(4, chronology.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testGetInstanceWithZoneAndCutover() {
        Instant cutover = new Instant(1234567890L);
        GJChronology chronology = GJChronology.getInstance(PARIS, cutover, 1);

        assertEquals(PARIS, chronology.getZone());
        assertEquals(cutover, chronology.getGregorianCutover());
        assertEquals(1, chronology.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testNullZoneUsesDefault() {
        GJChronology chronology = GJChronology.getInstance(
                (DateTimeZone) null,
                new Instant(123456789L),
                2);

        assertEquals(DateTimeZone.getDefault(), chronology.getZone());
        assertEquals(2, chronology.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testNullCutoverUsesDefault() {
        GJChronology chronology = GJChronology.getInstance(PARIS, (ReadableInstant) null, 3);

        assertEquals(GJChronology.getInstanceUTC().getGregorianCutover(),
                chronology.getGregorianCutover());
        assertEquals(3, chronology.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testWithZoneSameZone() {
        GJChronology utc = GJChronology.getInstanceUTC();
        assertSame(utc, utc.withZone(DateTimeZone.UTC));
    }

    @Test
    public void testWithZoneDifferentZone() {
        GJChronology utc = GJChronology.getInstanceUTC();
        GJChronology paris = (GJChronology) utc.withZone(PARIS);

        assertEquals(PARIS, paris.getZone());
        assertEquals(utc.getGregorianCutover(), paris.getGregorianCutover());
        assertEquals(utc.getMinimumDaysInFirstWeek(), paris.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testWithUTC() {
        GJChronology paris = GJChronology.getInstance(PARIS, new Instant(123456789L), 1);
        GJChronology utc = (GJChronology) paris.withUTC();

        assertEquals(DateTimeZone.UTC, utc.getZone());
        assertEquals(paris.getGregorianCutover(), utc.getGregorianCutover());
        assertEquals(paris.getMinimumDaysInFirstWeek(), utc.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testWithZoneNullUsesDefault() {
        GJChronology utc = GJChronology.getInstanceUTC();
        GJChronology result = (GJChronology) utc.withZone(null);

        assertEquals(DateTimeZone.getDefault(), result.getZone());
    }

    @Test
    public void testEqualsAndHashCode() {
        GJChronology a = GJChronology.getInstanceUTC();
        GJChronology b = GJChronology.getInstance(DateTimeZone.UTC, (ReadableInstant) null, 4);

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());

        GJChronology c = GJChronology.getInstance(DateTimeZone.UTC, (ReadableInstant) null, 1);
        assertFalse(a.equals(c));
    }

    @Test
    public void testToString() {
        GJChronology chronology = GJChronology.getInstanceUTC();
        assertNotNull(chronology.toString());
        assertTrue(chronology.toString().length() > 0);
    }

    @Test
    public void testGetDateTimeMillisRoundTrip() {
        GJChronology chronology = GJChronology.getInstanceUTC();
        int millisOfDay = 10 * 3600000 + 30 * 60000;

        long millis = chronology.getDateTimeMillis(2004, 2, 29, millisOfDay);

        assertEquals(2004, chronology.year().get(millis));
        assertEquals(2, chronology.monthOfYear().get(millis));
        assertEquals(29, chronology.dayOfMonth().get(millis));
        assertEquals(millisOfDay, chronology.millisOfDay().get(millis));
    }

    @Test
    public void testPreCutoverDateUsesJulianCalendar() {
        GJChronology chronology = GJChronology.getInstanceUTC();

        long millis = chronology.getDateTimeMillis(1500, 2, 29, 0);

        assertEquals(1500, chronology.year().get(millis));
        assertEquals(2, chronology.monthOfYear().get(millis));
        assertEquals(29, chronology.dayOfMonth().get(millis));
    }

    @Test
    public void testPostCutoverDateUsesGregorianRules() {
        GJChronology chronology = GJChronology.getInstanceUTC();

        try {
            chronology.getDateTimeMillis(1700, 2, 29, 0);
            fail("Expected IllegalArgumentException for 1700-02-29 in the Gregorian calendar");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }

    @Test
    public void testLeapYearSelection() {
        GJChronology chronology = GJChronology.getInstanceUTC();

        long julianLeap = chronology.getDateTimeMillis(1500, 2, 28, 0);
        long gregorianNonLeap = chronology.getDateTimeMillis(1700, 2, 28, 0);

        assertTrue(chronology.year().isLeap(julianLeap));
        assertFalse(chronology.year().isLeap(gregorianNonLeap));

        assertEquals(366, chronology.dayOfYear().getMaximumValue(julianLeap));
        assertEquals(365, chronology.dayOfYear().getMaximumValue(gregorianNonLeap));
    }

    @Test
    public void testCutoverBoundary() {
        GJChronology chronology = GJChronology.getInstanceUTC();
        long cutover = chronology.getGregorianCutover().getMillis();

        assertEquals(cutover, chronology.getDateTimeMillis(1582, 10, 15, 0));
        assertEquals(1582, chronology.year().get(cutover));
    }

    @Test
    public void testAddAndDifference() {
        GJChronology chronology = GJChronology.getInstanceUTC();

        long start = chronology.getDateTimeMillis(2000, 1, 1, 0);
        long end = chronology.getDateTimeMillis(2004, 1, 1, 0);

        assertEquals(4, chronology.year().getDifference(end, start));
        assertEquals(4L, chronology.year().getDifferenceAsLong(end, start));

        long added = chronology.year().add(start, 4);
        assertEquals(2004, chronology.year().get(added));
    }
}