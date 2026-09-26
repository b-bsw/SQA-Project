package org.joda.time.format;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.junit.Before;
import org.junit.Test;

public class DateTimeFormatterBuilderTest {

    private DateTimeFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new DateTimeFormatterBuilder();
    }

    @Test
    public void testAppendPatternFormatsDate() {
        DateTimeFormatter formatter = builder.appendPattern("yyyy-MM-dd").toFormatter();
        DateTime date = new DateTime(2020, 6, 5, 0, 0, 0, 0, DateTimeZone.UTC);
        assertEquals("2020-06-05", formatter.print(date));
    }

    @Test
    public void testAppendLiteralAndDecimalFormats() {
        DateTimeFormatter formatter = builder
                .appendDecimal(DateTimeFieldType.dayOfMonth(), 2, 2)
                .appendLiteral("/")
                .appendDecimal(DateTimeFieldType.monthOfYear(), 2, 2)
                .toFormatter();
        DateTime date = new DateTime(2020, 6, 5, 0, 0, 0, 0, DateTimeZone.UTC);
        assertEquals("05/06", formatter.print(date));
    }

    @Test
    public void testAppendPatternParsesDate() {
        DateTimeFormatter formatter = builder.appendPattern("yyyy-MM-dd").toFormatter();
        MutableDateTime date = formatter.parseMutableDateTime("2020-06-05");
        assertEquals(2020, date.getYear());
        assertEquals(6, date.getMonthOfYear());
        assertEquals(5, date.getDayOfMonth());
    }

    @Test
    public void testAppendDecimalParses() {
        DateTimeFormatter formatter = builder
                .appendDecimal(DateTimeFieldType.dayOfMonth(), 1, 2)
                .toFormatter();
        MutableDateTime date = formatter.parseMutableDateTime("07");
        assertEquals(7, date.getDayOfMonth());
    }

    @Test
    public void testBuilderMethodsReturnThis() {
        assertSame(builder, builder.appendLiteral('x'));
        assertSame(builder, builder.appendMillisOfSecond(3));
    }

    @Test(expected = NullPointerException.class)
    public void testAppendLiteralNullThrows() {
        builder.appendLiteral((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimalNullFieldThrows() {
        builder.appendDecimal(null, 2, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendDecimalMaxLessThanMinThrows() {
        builder.appendDecimal(DateTimeFieldType.dayOfMonth(), 2, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFractionTooManyDigitsThrows() {
        builder.appendFraction(DateTimeFieldType.millisOfSecond(), 1, 19);
    }
}