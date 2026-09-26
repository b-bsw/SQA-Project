package org.joda.time;

import static org.junit.Assert.*;
import java.util.Locale;
import org.junit.Test;

public class PartialTest {

    @Test
    public void testEmptyConstructor() {
        Partial p = new Partial();
        assertEquals(0, p.size());
        assertEquals(0, p.getValues().length);
        assertNotNull(p.getChronology());
        assertNull(p.getFormatter());
        assertEquals("[]", p.toStringList());
    }

    @Test
    public void testSingleFieldConstructorAndAccessors() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(1, p.size());
        assertEquals(DateTimeFieldType.monthOfYear(), p.getFieldType(0));
        assertEquals(6, p.getValue(0));
        assertArrayEquals(new int[] {6}, p.getValues());
    }

    @Test
    public void testAccessorsReturnCopies() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);

        int[] values = p.getValues();
        values[0] = 99;
        assertEquals(6, p.getValue(0));

        DateTimeFieldType[] types = p.getFieldTypes();
        types[0] = DateTimeFieldType.year();
        assertEquals(DateTimeFieldType.monthOfYear(), p.getFieldType(0));
    }

    @Test
    public void testTypesAndValuesConstructor() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        };
        int[] values = new int[] {2005, 12};

        Partial p = new Partial(types, values);
        assertEquals(2, p.size());
        assertEquals(2005, p.getValue(0));
        assertEquals(12, p.getValue(1));
        assertArrayEquals(types, p.getFieldTypes());
        assertArrayEquals(values, p.getValues());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullFieldType() {
        new Partial((DateTimeFieldType) null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidValue() {
        new Partial(DateTimeFieldType.monthOfYear(), 13);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullTypesArray() {
        new Partial((DateTimeFieldType[]) null, new int[] {1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullValuesArray() {
        new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.monthOfYear()},
            (int[]) null
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLengthMismatch() {
        new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.monthOfYear()},
            new int[] {1, 2}
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullTypeElement() {
        new Partial(new DateTimeFieldType[] {null}, new int[] {1});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnorderedTypes() {
        new Partial(
            new DateTimeFieldType[] {
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.year()
            },
            new int[] {1, 2005}
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateTypes() {
        new Partial(
            new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.year()
            },
            new int[] {2005, 2006}
        );
    }

    @Test
    public void testWithAddsAndReplaces() {
        Partial empty = new Partial();

        Partial added = empty.with(DateTimeFieldType.monthOfYear(), 6);
        assertEquals(1, added.size());
        assertEquals(6, added.getValue(0));

        Partial replaced = added.with(DateTimeFieldType.monthOfYear(), 7);
        assertEquals(7, replaced.getValue(0));
        assertNotSame(added, replaced);

        Partial multi = added.with(DateTimeFieldType.dayOfMonth(), 20);
        assertEquals(2, multi.size());
        assertEquals(20, multi.getValue(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithNullField() {
        new Partial().with((DateTimeFieldType) null, 6);
    }

    @Test
    public void testWithFieldAdded() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 1);

        Partial added = p.withFieldAdded(DurationFieldType.months(), 2);
        assertEquals(3, added.getValue(0));
        assertSame(p, p.withFieldAdded(DurationFieldType.months(), 0));
    }

    @Test
    public void testWithFieldAddWrapped() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 12);
        Partial wrapped = p.withFieldAddWrapped(DurationFieldType.months(), 1);
        assertEquals(1, wrapped.getValue(0));
    }

    @Test
    public void testWithPeriodAddedPlusMinus() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 5);

        Period period = new Period(0, 3, 0, 0, 0, 0, 0, 0);
        Partial plus = p.plus(period);
        Partial minus = p.minus(period);

        assertEquals(8, plus.getValue(0));
        assertEquals(2, minus.getValue(0));
        assertSame(p, p.withPeriodAdded(null, 1));
        assertSame(p, p.withPeriodAdded(period, 0));
    }

    @Test
    public void testWithPeriodAddedMultipleFields() {
        Partial start = new Partial(
            new DateTimeFieldType[] {
                DateTimeFieldType.monthOfYear(),
                DateTimeFieldType.dayOfMonth()
            },
            new int[] {1, 1}
        );

        Partial result = start.plus(new Period(0, 1, 0, 2, 0, 0, 0, 0));
        assertEquals(2, result.getValue(0));
        assertEquals(3, result.getValue(1));
    }

    @Test
    public void testWithout() {
        Partial p = new Partial(
            new DateTimeFieldType[] {
                DateTimeFieldType.year(),
                DateTimeFieldType.monthOfYear()
            },
            new int[] {2005, 12}
        );

        Partial removed = p.without(DateTimeFieldType.monthOfYear());
        assertEquals(1, removed.size());
        assertEquals(2005, removed.getValue(0));

        assertSame(p, p.without(DateTimeFieldType.dayOfMonth()));
    }

    @Test
    public void testIsMatch() {
        Partial month = new Partial(DateTimeFieldType.monthOfYear(), 6);

        assertTrue(month.isMatch(new DateTime(2005, 6, 30, 0, 0)));
        assertFalse(month.isMatch(new DateTime(2005, 7, 1, 0, 0)));

        assertTrue(month.isMatch(new Partial(DateTimeFieldType.monthOfYear(), 6)));
        assertFalse(month.isMatch(new Partial(DateTimeFieldType.monthOfYear(), 7)));
    }

    @Test
    public void testToStringAndLocalePath() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 12);

        assertEquals("12", p.toString("MM"));
        assertEquals("12", p.toString("MM", Locale.ENGLISH));
        assertTrue(p.toStringList().contains("monthOfYear=12"));
    }

    @Test
    public void testProperty() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 1);
        Partial.Property property = p.property(DateTimeFieldType.monthOfYear());

        assertEquals(1, property.get());
        assertEquals(3, property.addToCopy(2).getValue(0));
        assertEquals(2, property.addWrapFieldToCopy(13).getValue(0));
        assertEquals(5, property.setCopy(5).getValue(0));
        assertEquals(12, property.withMaximumValue().getValue(0));
        assertEquals(1, property.withMinimumValue().getValue(0));
    }

    @Test
    public void testWithChronologyRetainFields() {
        Partial p = new Partial(DateTimeFieldType.monthOfYear(), 6);
        Partial converted = p.withChronologyRetainFields(ISOChronology.getInstanceUTC());

        assertEquals(6, converted.getValue(0));
        assertNotNull(converted.getChronology());
    }
}