ใน single code block.package org.joda.time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MutableDateTimeTest {

    private DateTimeZone originalZone;

    @Before
    public void setUp() {
        originalZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalZone);
    }

    @Test
    public void testConstructors() {
        assertNotNull(new MutableDateTime());
        assertNotNull(new MutableDateTime(DateTimeZone.UTC));
        assertNotNull(new MutableDateTime((Chronology) null));
        assertNotNull(new MutableDateTime(1000L));
        assertNotNull(new MutableDateTime(1000L, DateTimeZone.UTC));
        assertNotNull(new MutableDateTime(1000L, (Chronology) null));
        assertNotNull(new MutableDateTime((Object) "2000-01-01"));
        assertNotNull(new MutableDateTime((Object) "2000-01-01", DateTimeZone.UTC));
        assertNotNull(new MutableDateTime((Object) "2000-01-01", (Chronology) null));
        assertNotNull(new MutableDateTime(2000, 1, 1, 0, 0, 0, 0));
        assertNotNull(new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC));
        assertNotNull(new MutableDateTime(2000, 1, 1, 0, 0, 0, 0, (Chronology) null));
    }

    @Test(expected = NullPointerException.class)
    public void testNowWithNullZone() {
        MutableDateTime.now((DateTimeZone) null);
    }

    @Test(expected = NullPointerException.class)
    public void testNowWithNullChronology() {
        MutableDateTime.now((Chronology) null);
    }

    @Test
    public void testNow() {
        assertNotNull(MutableDateTime.now());
        assertNotNull(MutableDateTime.now(DateTimeZone.UTC));
        assertNotNull(MutableDateTime.now(ISOChronology.getInstanceUTC()));
    }

    @Test
    public void testParse() {
        MutableDateTime dt = MutableDateTime.parse("2020-06-15T12:30:00.000Z");
        assertEquals(2020, dt.getYear());
        assertEquals(6, dt.getMonthOfYear());
        assertEquals(15, dt.getDayOfMonth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseInvalidString() {
        MutableDateTime.parse("not-a-date");
    }

    @Test
    public void testSetRounding() {
        MutableDateTime dt = new MutableDateTime(1000L);
        DateTimeField yearField = dt.getChronology().year();
        dt.setRounding(yearField, MutableDateTime.ROUND_FLOOR);
        assertEquals(yearField, dt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_FLOOR, dt.getRoundingMode());

        dt.setRounding(null, MutableDateTime.ROUND_NONE);
        assertNull(dt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, dt.getRoundingMode());

        dt.setRounding(null, MutableDateTime.ROUND_FLOOR);
        assertNull(dt.getRoundingField());
        assertEquals(MutableDateTime.ROUND_NONE, dt.getRoundingMode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRoundingInvalidModeLow() {
        MutableDateTime dt = new MutableDateTime();
        dt.setRounding(dt.getChronology().year(), -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRoundingInvalidModeHigh() {
        MutableDateTime dt = new MutableDateTime();
        dt.setRounding(dt.getChronology().year(), 6);
    }

    @Test
    public void testSetMillisRoundingModes() {
        long instant = new DateTime(2000, 6, 15, 12, 30, 45, 500, DateTimeZone.UTC).getMillis();
        MutableDateTime dt = new MutableDateTime(instant, DateTimeZone.UTC);
        DateTimeField yearField = dt.getChronology().year();

        dt.setRounding(yearField, MutableDateTime.ROUND_NONE);
        dt.setMillis(instant);
        assertEquals(instant, dt.getMillis());

        dt.setRounding(yearField, MutableDateTime.ROUND_FLOOR);
        dt.setMillis(instant);
        long floorMillis = new DateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(floorMillis, dt.getMillis());

        dt.setRounding(yearField, MutableDateTime.ROUND_CEILING);
        dt.setMillis(instant);
        long ceilMillis = new DateTime(2001, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        assertEquals(ceilMillis, dt.getMillis());
    }

    @Test
    public void testSetMillisWithReadableInstant() {
        MutableDateTime dt = new MutableDateTime();
        dt.setMillis(new DateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC));
        assertEquals(2000, dt.getYear());
    }

    @Test(expected = NullPointerException.class)
    public void testSetMillisReadableInstantNull() {
        new MutableDateTime().setMillis((ReadableInstant) null);
    }

    @Test
    public void testAddDuration() {
        MutableDateTime dt = new MutableDateTime(1000L);
        dt.add(500L);
        assertEquals(1500L, dt.getMillis());

        dt.add((ReadableDuration) null);
        assertEquals(1500L, dt.getMillis());

        dt.add(new Duration(1000L), 2);
        assertEquals(3500L, dt.getMillis());
    }

    @Test
    public void testAddPeriod() {
        MutableDateTime dt = new MutableDateTime(0L);
        dt.add(Period.days(1), 1);
        assertEquals(86400000L, dt.getMillis());

        dt.add((ReadablePeriod) null, 1);
        assertEquals(86400000L, dt.getMillis());
    }

    @Test
    public void testSetZone() {
        MutableDateTime dt = new MutableDateTime(1000L, DateTimeZone.UTC);
        dt.setZone(DateTimeZone.forOffsetHours(1));
        assertEquals(DateTimeZone.forOffsetHours(1), dt.getZone());

        dt.setZone(null);
        assertEquals(DateTimeZone.UTC, dt.getZone());
    }

    @Test
    public void testSetZoneRetainFields() {
        MutableDateTime dt = new MutableDateTime(86400000L, DateTimeZone.UTC);
        dt.setZoneRetainFields(DateTimeZone.forID("America/New_York"));
        assertEquals(DateTimeZone.forID("America/New_York"), dt.getZone());
    }

    @Test
    public void testSetDate() {
        MutableDateTime dt = new MutableDateTime(1000L);
        dt.setDate(2000, 1, 1);
        assertEquals(2000, dt.getYear());
        assertEquals(1, dt.getMonthOfYear());
        assertEquals(1, dt.getDayOfMonth());
    }

    @Test
    public void testSetTime() {
        MutableDateTime dt = new MutableDateTime(1000L);
        dt.setTime(12, 30, 0, 0);
        assertEquals(12, dt.getHourOfDay());
        assertEquals(30, dt.getMinuteOfHour());
    }

    @Test
    public void testSetDateTime() {
        MutableDateTime dt = new MutableDateTime();
        dt.setDateTime(2000, 1, 1, 12, 0, 0, 0);
        assertEquals(2000, dt.getYear());
        assertEquals(12, dt.getHourOfDay());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPropertyNullType() {
        new MutableDateTime().property(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetFieldTypeNull() {
        new MutableDateTime().set(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDurationFieldTypeNull() {
        new MutableDateTime().add((DurationFieldType) null, 1);
    }

    @Test
    public void testProperty() {
        MutableDateTime dt = new MutableDateTime(1000L);
        Property prop = dt.property(DateTimeFieldType.year());
        assertNotNull(prop);
        assertEquals(dt, prop.getMutableDateTime());

        prop.add(1);
        int expectedYear = new DateTime(1000L, DateTimeZone.UTC).getYear() + 1;
        assertEquals(expectedYear, dt.getYear());

        long baseMillis = new DateTime(2000, 1, 1, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        dt.setMillis(baseMillis);
        prop.set(2000);
        assertEquals(2000, dt.getYear());
    }

    @Test
    public void testPropertyRoundModes() {
        long instant = new DateTime(2000, 1, 15, 0, 0, 0, 0, DateTimeZone.UTC).getMillis();
        MutableDateTime dt = new MutableDateTime(instant);
        Property monthProp = dt.monthOfYear();

        long before = dt.getMillis();
        monthProp.roundFloor();
        assertTrue(dt.getMillis() <= before);

        dt.setMillis(before);
        monthProp.roundCeiling();
        assertTrue(dt.getMillis() >= before);

        dt.setMillis(before);
        monthProp.roundHalfFloor();
        assertNotEquals(before, dt.getMillis());

        dt.setMillis(before);
        monthProp.roundHalfCeiling();
        assertNotEquals(before, dt.getMillis());

        dt.setMillis(before);
        monthProp.roundHalfEven();
        assertNotEquals(before, dt.getMillis());
    }

    @Test
    public void testCloneAndCopy() {
        MutableDateTime original = new MutableDateTime(1000L);
        MutableDateTime cloned = (MutableDateTime) original.clone();
        assertEquals(original.getMillis(), cloned.getMillis());
        assertNotSame(original, cloned);

        MutableDateTime copied = original.copy();
        assertEquals(original.getMillis(), copied.getMillis());
        assertNotSame(original, copied);
    }

    @Test
    public void testToString() {
        MutableDateTime dt = new MutableDateTime(0L, DateTimeZone.UTC);
        assertEquals("1970-01-01T00:00:00.000Z", dt.toString());
    }

    @Test
    public void testSetYear() {
        MutableDateTime dt = new MutableDateTime(0L);
        dt.setYear(2000);
        assertEquals(2000, dt.getYear());
    }

    @Test
    public void testAddYears() {
        MutableDateTime dt = new MutableDateTime(0L);
        dt.addYears(1);
        assertEquals(1971, dt.getYear());
    }
}