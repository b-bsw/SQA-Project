package org.apache.commons.cli;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OptionBuilderTest {

    @Before
    public void setUp() {
        // Force a reset after any previous test that may have left state behind.
        OptionBuilder.create("reset");
    }

    @Test
    public void testCreateCharOption() {
        Option option = OptionBuilder.create('x');

        assertNotNull(option);
        assertEquals("x", option.getOpt());
    }

    @Test
    public void testCreateWithAllProperties() {
        OptionBuilder.withLongOpt("long");
        OptionBuilder.withDescription("desc");
        OptionBuilder.withArgName("argName");
        OptionBuilder.isRequired();
        OptionBuilder.hasArg();
        OptionBuilder.withType(String.class);
        OptionBuilder.withValueSeparator(':');

        Option option = OptionBuilder.create("opt");

        assertNotNull(option);
        assertEquals("opt", option.getOpt());
        assertEquals("long", option.getLongOpt());
        assertEquals("desc", option.getDescription());
        assertEquals("argName", option.getArgName());
        assertTrue(option.isRequired());
        assertEquals(1, option.getArgs());
        assertEquals(String.class, option.getType());
        assertEquals(':', option.getValueSeparator());
        assertFalse(option.hasOptionalArg());
    }

    @Test
    public void testResetAfterCreateClearsState() {
        // First build an Option with non-default values.
        OptionBuilder.withLongOpt("long");
        OptionBuilder.withDescription("desc");
        OptionBuilder.withArgName("argName");
        OptionBuilder.isRequired();
        OptionBuilder.hasArg();
        OptionBuilder.withType(String.class);
        OptionBuilder.withValueSeparator(':');
        OptionBuilder.hasOptionalArg();

        Option first = OptionBuilder.create("first");

        assertNotNull(first);
        assertEquals("long", first.getLongOpt());
        assertEquals("desc", first.getDescription());
        assertEquals("argName", first.getArgName());
        assertTrue(first.isRequired());
        assertEquals(1, first.getArgs());
        assertEquals(String.class, first.getType());
        assertEquals(':', first.getValueSeparator());
        assertTrue(first.hasOptionalArg());

        // The builder state must be reset, so the next Option must use defaults.
        Option second = OptionBuilder.create("second");

        assertNotNull(second);
        assertNull(second.getLongOpt());
        assertNull(second.getDescription());
        assertNull(second.getArgName());
        assertFalse(second.isRequired());
        assertEquals(Option.UNINITIALIZED, second.getArgs());
        assertNull(second.getType());
        assertEquals(0, second.getValueSeparator());
        assertFalse(second.hasOptionalArg());
    }

    @Test
    public void testCreateNoArgRequiresLongOpt() {
        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException because no long option was set");
        } catch (IllegalArgumentException expected) {
            // expected
        }
    }
}