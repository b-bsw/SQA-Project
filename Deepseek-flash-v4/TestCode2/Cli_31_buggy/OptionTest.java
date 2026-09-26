package org.apache.commons.cli;

import static org.junit.Assert.*;

import org.junit.Test;

public class OptionTest {

    @Test
    public void testConstructorsAndDefaults() {
        Option o = new Option("o", "option", false, "desc");

        assertEquals("o", o.getOpt());
        assertEquals("option", o.getLongOpt());
        assertEquals("desc", o.getDescription());
        assertEquals("arg", o.getArgName());
        assertTrue(o.hasArgName());
        assertTrue(o.hasLongOpt());
        assertFalse(o.hasArg());
        assertFalse(o.hasArgs());
        assertFalse(o.hasOptionalArg());
        assertFalse(o.isRequired());
        assertEquals(Option.UNINITIALIZED, o.getArgs());
        assertEquals('o', o.getId());
        assertEquals("o", o.getKey());
        assertFalse(o.hasValueSeparator());
    }

    @Test
    public void testTwoArgAndHasArgConstructors() {
        Option a = new Option("x", "desc");
        assertNull(a.getLongOpt());
        assertFalse(a.hasLongOpt());
        assertFalse(a.hasArg());

        Option b = new Option("v", true, "desc");
        assertTrue(b.hasArg());
        assertFalse(b.hasArgs());
        assertEquals(1, b.getArgs());
    }

    @Test
    public void testNullOptUsesLongOptForKey() {
        Option o = new Option(null, "long", false, "desc");

        assertNull(o.getOpt());
        assertEquals("long", o.getLongOpt());
        assertEquals("long", o.getKey());
        assertEquals('l', o.getId());
        assertTrue(o.hasLongOpt());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidOptionNameRejected() {
        new Option("bad opt", "desc");
    }

    @Test
    public void testHasArgAndHasArgsBoundaries() {
        Option o = new Option("x", false, "desc");

        assertFalse(o.hasArg());
        assertFalse(o.hasArgs());

        o.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(o.hasArg());
        assertTrue(o.hasArgs());

        o.setArgs(2);
        assertTrue(o.hasArg());
        assertTrue(o.hasArgs());

        o.setArgs(1);
        assertTrue(o.hasArg());
        assertFalse(o.hasArgs());

        o.setArgs(0);
        assertFalse(o.hasArg());
        assertFalse(o.hasArgs());
    }

    @Test
    public void testSettersAndGetters() {
        Option o = new Option("s", "long", false, "orig");

        o.setDescription("new desc");
        o.setLongOpt("long2");
        o.setRequired(true);
        o.setType(String.class);
        o.setOptionalArg(true);

        assertEquals("new desc", o.getDescription());
        assertEquals("long2", o.getLongOpt());
        assertTrue(o.isRequired());
        assertSame(String.class, o.getType());
        assertTrue(o.hasOptionalArg());

        o.setArgName(null);
        assertNull(o.getArgName());
        assertFalse(o.hasArgName());

        o.setArgName("");
        assertEquals("", o.getArgName());
        assertFalse(o.hasArgName());

        o.setArgName("value");
        assertEquals("value", o.getArgName());
        assertTrue(o.hasArgName());
    }

    @Test
    public void testValueSeparatorBoundaries() {
        Option o = new Option("v", false, "desc");

        assertFalse(o.hasValueSeparator());
        o.setValueSeparator('=');
        assertEquals('=', o.getValueSeparator());
        assertTrue(o.hasValueSeparator());

        o.setValueSeparator('\0');
        assertFalse(o.hasValueSeparator());
    }

    @Test
    public void testAddSingleValue() {
        Option o = new Option("f", true, "file");

        o.addValueForProcessing("foo");

        assertEquals("foo", o.getValue());
        assertEquals("foo", o.getValue(0));
        assertEquals("foo", o.getValue("default"));
        assertArrayEquals(new String[]{"foo"}, o.getValues());
        assertEquals(1, o.getValuesList().size());
    }

    @Test
    public void testGetDefaultValueWhenNoValue() {
        Option o = new Option("d", false, "desc");

        assertNull(o.getValue());
        assertNull(o.getValues());
        assertEquals("default", o.getValue("default"));
        assertTrue(o.getValuesList().isEmpty());
    }

    @Test
    public void testEmptyStringValueIsPreserved() {
        Option o = new Option("e", true, "desc");

        o.addValueForProcessing("");

        assertEquals("", o.getValue());
        assertEquals("", o.getValue("default"));
        assertNotNull(o.getValues());
        assertEquals(1, o.getValues().length);
    }

    @Test
    public void testAddMultipleValuesWhenUnlimitedArgs() {
        Option o = new Option("m", true, "multi");
        o.setArgs(Option.UNLIMITED_VALUES);

        o.addValueForProcessing("one");
        o.addValueForProcessing("two");

        assertEquals("one", o.getValue(0));
        assertEquals("two", o.getValue(1));
        assertEquals(2, o.getValuesList().size());
        assertArrayEquals(new String[]{"one", "two"}, o.getValues());
    }

    @Test
    public void testAddTooManyValuesThrows() {
        Option o = new Option("s", true, "single");

        o.addValueForProcessing("one");

        try {
            o.addValueForProcessing("two");
            fail("Expected RuntimeException when adding too many values");
        } catch (RuntimeException expected) {
            // expected
        }
    }

    @Test
    public void testAddValueToNoArgOptionThrows() {
        Option o = new Option("n", false, "no args");

        try {
            o.addValueForProcessing("value");
            fail("Expected RuntimeException when adding value to no-arg option");
        } catch (RuntimeException expected) {
            // expected
        }
    }

    @Test
    public void testValueSeparatorSplitsValuesWhenUnlimited() {
        Option o = new Option("p", true, "props");
        o.setArgs(Option.UNLIMITED_VALUES);
        o.setValueSeparator('=');

        o.addValueForProcessing("a=b=c");

        assertArrayEquals(new String[]{"a", "b", "c"}, o.getValues());
    }

    @Test
    public void testValueSeparatorStopsAtFixedLimit() {
        Option o = new Option("p", true, "props");
        o.setArgs(2);
        o.setValueSeparator('=');

        o.addValueForProcessing("a=b=c");

        assertArrayEquals(new String[]{"a", "b=c"}, o.getValues());
    }

    @Test
    public void testGetValueOutOfBoundsThrows() {
        Option o = new Option("x", true, "desc");

        try {
            o.getValue(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            // expected
        }
    }

    @Test
    public void testEqualsAndHashCode() {
        Option alpha1 = new Option("a", "alpha", false, "one");
        Option alpha2 = new Option("a", "alpha", true, "two");

        assertTrue(alpha1.equals(alpha1));
        assertEquals(alpha1, alpha2);
        assertEquals(alpha1.hashCode(), alpha2.hashCode());
        assertFalse(alpha1.equals(null));
        assertFalse(alpha1.equals("not an option"));

        Option null1 = new Option(null, null, false, "n");
        Option null2 = new Option(null, null, true, "n");

        assertEquals(null1, null2);
        assertEquals(null1.hashCode(), null2.hashCode());
        assertFalse(alpha1.equals(null1));
    }

    @Test
    public void testCloneHasIndependentValuesList() {
        Option o = new Option("c", "clone", true, "desc");
        o.setArgs(Option.UNLIMITED_VALUES);
        o.setValueSeparator(':');
        o.addValueForProcessing("value");

        Option clone = (Option) o.clone();

        assertEquals(o, clone);
        assertEquals(o.getValuesList(), clone.getValuesList());
        assertNotSame(o.getValuesList(), clone.getValuesList());

        clone.addValueForProcessing("second");

        assertEquals(1, o.getValuesList().size());
        assertEquals(2, clone.getValuesList().size());
    }
}