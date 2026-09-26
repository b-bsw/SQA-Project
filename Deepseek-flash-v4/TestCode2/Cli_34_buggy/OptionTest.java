package org.apache.commons.cli;

import static org.junit.Assert.*;

import org.junit.Test;

public class OptionTest {

    @Test
    public void testConstructorSetsBasicFields() {
        Option opt = new Option("a", "desc");
        assertEquals("a", opt.getOpt());
        assertEquals("desc", opt.getDescription());
        assertNull(opt.getLongOpt());
        assertFalse(opt.hasLongOpt());
        assertFalse(opt.hasArg());
        assertFalse(opt.hasArgs());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        assertNull(opt.getArgName());
        assertFalse(opt.hasArgName());
        assertNull(opt.getType());
    }

    @Test
    public void testConstructorHasArgSetsArgsToOne() {
        Option opt = new Option("b", true, "desc");
        assertTrue(opt.hasArg());
        assertEquals(1, opt.getArgs());
    }

    @Test
    public void testConstructorWithLongOpt() {
        Option opt = new Option("c", "long", false, "desc");
        assertEquals("c", opt.getOpt());
        assertEquals("long", opt.getLongOpt());
        assertTrue(opt.hasLongOpt());
        assertFalse(opt.hasArg());
    }

    @Test
    public void testConstructorWithNullOptUsesLongOptForKey() {
        Option opt = new Option(null, "long", false, "desc");
        assertNull(opt.getOpt());
        assertEquals("long", opt.getKey());
    }

    @Test
    public void testKeyAndId() {
        Option opt = new Option("ab", true, "desc");
        assertEquals("ab", opt.getKey());
        assertEquals('a', opt.getId());
    }

    @Test
    public void testSetType() {
        Option opt = new Option("a", "desc");
        assertNull(opt.getType());
        opt.setType(Integer.class);
        assertEquals(Integer.class, opt.getType());
    }

    @Test
    public void testSetLongOpt() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasLongOpt());
        opt.setLongOpt("long");
        assertTrue(opt.hasLongOpt());
        assertEquals("long", opt.getLongOpt());
    }

    @Test
    public void testOptionalArg() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasOptionalArg());
        opt.setOptionalArg(true);
        assertTrue(opt.hasOptionalArg());
    }

    @Test
    public void testRequired() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.isRequired());
        opt.setRequired(true);
        assertTrue(opt.isRequired());
    }

    @Test
    public void testArgName() {
        Option opt = new Option("a", "desc");
        opt.setArgName("arg");
        assertEquals("arg", opt.getArgName());
        assertTrue(opt.hasArgName());

        opt.setArgName(null);
        assertNull(opt.getArgName());
        assertFalse(opt.hasArgName());

        opt.setArgName("");
        assertFalse(opt.hasArgName());
    }

    @Test
    public void testHasArgBoundaries() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasArg());

        opt.setArgs(0);
        assertFalse(opt.hasArg());

        opt.setArgs(1);
        assertTrue(opt.hasArg());

        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.hasArg());
    }

    @Test
    public void testHasArgsBoundaries() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasArgs());

        opt.setArgs(1);
        assertFalse(opt.hasArgs());

        opt.setArgs(2);
        assertTrue(opt.hasArgs());

        opt.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testSetArgsAndGetArgs() {
        Option opt = new Option("a", "desc");
        opt.setArgs(5);
        assertEquals(5, opt.getArgs());

        opt.setArgs(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
    }

    @Test
    public void testValueSeparator() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasValueSeparator());
        assertEquals(0, opt.getValueSeparator());

        opt.setValueSeparator('=');
        assertTrue(opt.hasValueSeparator());
        assertEquals('=', opt.getValueSeparator());
    }

    @Test
    public void testGetValueWithNoValuesReturnsNullAndDefault() {
        Option opt = new Option("a", "desc");
        assertNull(opt.getValue());
        assertEquals("default", opt.getValue("default"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueWithIndexZeroThrows() {
        Option opt = new Option("a", "desc");
        opt.getValue(0);
    }

    @Test
    public void testGetValueByIndexIsOneBased() {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("first");
        assertEquals("first", opt.getValue(1));
    }

    @Test
    public void testGetValueWithDefaultWhenValuePresent() {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("present");
        assertEquals("present", opt.getValue("default"));
    }

    @Test
    public void testGetValuesWhenNoValuesReturnsNull() {
        Option opt = new Option("a", "desc");
        assertNull(opt.getValues());
    }

    @Test
    public void testAddValueForProcessingStoresValues() {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("value");

        assertEquals("value", opt.getValue());
        assertFalse(opt.hasNoValues());
        assertArrayEquals(new String[] {"value"}, opt.getValues());
        assertEquals(1, opt.getValuesList().size());
    }

    @Test(expected = RuntimeException.class)
    public void testAddValueForProcessingWhenNoArgsAllowed() {
        Option opt = new Option("a", "desc");
        opt.addValueForProcessing("value");
    }

    @Test
    public void testAddValueForProcessingRejectsWhenListFull() {
        Option opt = new Option("a", true, "desc");
        opt.addValueForProcessing("first");

        try {
            opt.addValueForProcessing("second");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Cannot add value, list full.", e.getMessage());
        }
    }

    @Test
    public void testAddValueForProcessingWithSeparatorAndFiniteLimit() {
        Option opt = new Option("D", true, "desc");
        opt.setValueSeparator('=');
        opt.setArgs(2);

        opt.addValueForProcessing("key=value=extra");

        assertEquals("key", opt.getValue(1));
        assertEquals("value=extra", opt.getValue(2));
        assertEquals(2, opt.getValuesList().size());
    }

    @Test
    public void testAddValueForProcessingWithSeparatorAndUnlimitedValues() {
        Option opt = new Option("D", true, "desc");
        opt.setValueSeparator('=');
        opt.setArgs(Option.UNLIMITED_VALUES);

        opt.addValueForProcessing("a=b=c=d");

        assertArrayEquals(new String[] {"a", "b", "c", "d"}, opt.getValues());
    }

    @Test
    public void testAddValuePublicIsUnsupported() {
        Option opt = new Option("a", true, "desc");

        try {
            opt.addValue("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testHasMoreArgsWithNoArgOption() {
        Option opt = new Option("a", "desc");
        assertFalse(opt.hasMoreArgs());
    }

    @Test
    public void testHasMoreArgsBeforeAndAfterFull() {
        Option opt = new Option("a", true, "desc");
        assertTrue(opt.hasMoreArgs());

        opt.addValueForProcessing("value");
        assertFalse(opt.hasMoreArgs());
    }

    @Test
    public void testEqualsAndHashCode() {
        Option a = new Option("a", "long", true, "desc");
        Option b = new Option("a", "long", false, "other");

        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        assertEquals(a, a);
        assertFalse(a.equals(null));
        assertFalse(a.equals(new Object()));

        Option differentOpt = new Option("c", "long", true, "desc");
        assertFalse(a.equals(differentOpt));

        Option differentLong = new Option("a", "diff", true, "desc");
        assertFalse(a.equals(differentLong));
    }

    @Test
    public void testCloneCopiesValuesList() throws Exception {
        Option original = new Option("a", "desc");
        original.setArgs(Option.UNLIMITED_VALUES);
        original.addValueForProcessing("first");

        Option clone = (Option) original.clone();

        assertNotSame(original, clone);
        assertEquals(original, clone);
        assertEquals(1, clone.getValuesList().size());

        original.addValueForProcessing("second");

        assertEquals(2, original.getValuesList().size());
        assertEquals(1, clone.getValuesList().size());
    }
}