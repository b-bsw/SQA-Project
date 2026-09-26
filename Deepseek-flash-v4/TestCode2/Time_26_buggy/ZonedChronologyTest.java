package org.joda.time.chrono;

import junit.framework.TestCase;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;

public class ZonedChronologyTest extends TestCase {

    private Chronology utc() {
        return ISOChronology.getInstanceUTC();
    }

    public void testGetInstanceNullBase() {
        try {
            ZonedChronology.getInstance(null, DateTimeZone.UTC);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    public void testGetInstanceNullZone() {
        try {
            ZonedChronology.getInstance(utc(), null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    public void testGetInstanceNormal() {
        Chronology base = utc();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(base, zone);
        assertNotNull(zc);
        assertSame(zone, zc.getZone());
        assertSame(base, zc.withUTC());
    }

    public void testWithZone() {
        Chronology base = utc();
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        ZonedChronology zc = ZonedChronology.getInstance(base, zone);

        assertSame(zc, zc.withZone(zone));
        assertSame(base, zc.withZone(DateTimeZone.UTC));

        DateTimeZone otherZone = DateTimeZone.forOffsetHours(5);
        ZonedChronology zoned = (ZonedChronology) zc.withZone(otherZone);
        assertNotNull(zoned);
        assertSame(otherZone, zoned.getZone());
        assertSame(base, zoned.withUTC());
    }

    public void testEqualsHashCodeToString() {
        Chronology base = utc();
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        ZonedChronology zc1 = ZonedChronology.getInstance(base, zone);
        ZonedChronology zc2 = ZonedChronology.getInstance(base, zone);

        assertEquals(zc1, zc2);
        assertEquals(zc1.hashCode(), zc2.hashCode());
        assertFalse(zc1.equals(null));
        assertFalse(zc1.equals("not a chronology"));

        ZonedChronology zc3 = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(4));
        assertFalse(zc1.equals(zc3));

        assertEquals("ZonedChronology[" + base + ", " + zone.getID() + "]", zc1.toString());
    }

    public void testGetDateTimeMillisFixedOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(utc(), zone);

        long expected = utc().getDateTimeMillis(2009, 12, 31, 23, 0, 0, 0);
        assertEquals(expected, zc.getDateTimeMillis(2010, 1, 1, 0, 0, 0, 0));
        assertEquals(expected, zc.getDateTimeMillis(2010, 1, 1, 0));
    }

    public void testGetDateTimeMillisRejectsDstGap() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        ZonedChronology zc = ZonedChronology.getInstance(utc(), ny);

        try {
            zc.getDateTimeMillis(2010, 3, 14, 2, 30, 0, 0);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    public void testUseTimeArithmetic() {
        Chronology base = utc();
        assertTrue(ZonedChronology.useTimeArithmetic(base.hours()));
        assertFalse(ZonedChronology.useTimeArithmetic(base.days()));
        assertFalse(ZonedChronology.useTimeArithmetic(null));
    }

    public void testZonedDurationFieldAddAndPrecision() {
        Chronology base = utc();
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        ZonedChronology zc = ZonedChronology.getInstance(base, zone);

        DurationField hours = zc.hours();
        assertEquals(DateTimeConstants.MILLIS_PER_HOUR, hours.getUnitMillis());
        assertTrue(hours.isPrecise());

        long instant = base.getDateTimeMillis(2010, 1, 1, 0, 0, 0, 0);
        assertEquals(instant + DateTimeConstants.MILLIS_PER_HOUR, hours.add(instant, 1));

        ZonedChronology nyZc = ZonedChronology.getInstance(base, DateTimeZone.forID("America/New_York"));
        assertFalse(nyZc.days().isPrecise());
    }

    public void testZonedDurationFieldOverflow() {
        ZonedChronology zc = ZonedChronology.getInstance(utc(), DateTimeZone.forOffsetHours(1));

        try {
            zc.hours().add(Long.MAX_VALUE, 0);
            fail("expected ArithmeticException");
        } catch (ArithmeticException e) {
            assertNotNull(e.getMessage());
        }
    }

    public void testZonedDateTimeFieldGetAddSet() {
        Chronology base = utc();
        ZonedChronology zc = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(1));
        long instant = base.getDateTimeMillis(2010, 1, 1, 0, 0, 0, 0);

        DateTimeField hourOfDay = zc.hourOfDay();
        assertEquals(1, hourOfDay.get(instant));
        assertEquals(instant + 2L * DateTimeConstants.MILLIS_PER_HOUR, hourOfDay.add(instant, 2));

        DateTimeField monthOfYear = zc.monthOfYear();
        long febFromAdd = monthOfYear.add(instant, 1);
        assertEquals(base.getDateTimeMillis(2010, 2, 1, 0, 0, 0, 0), febFromAdd);

        long febFromSet = monthOfYear.set(instant, 2);
        assertEquals(2, monthOfYear.get(febFromSet));
    }

    public void testZonedDateTimeFieldSetRejectsDstGap() {
        DateTimeZone ny = DateTimeZone.forID("America/New_York");
        ZonedChronology zc = ZonedChronology.getInstance(utc(), ny);
        long instant = zc.getDateTimeMillis(2010, 3, 14, 1, 30, 0, 0);

        try {
            zc.hourOfDay().set(instant, 2);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }
}