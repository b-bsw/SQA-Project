:
package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class OptionBuilderTest {

    @Before
    public void resetBuilder() {
        try {
            OptionBuilder.create();
        } catch (IllegalArgumentException expected) {
            // Expected when no long option was configured; resets builder state.
        }
    }

    @Test
    public void testCreateCharDefaults() {
        Option opt = OptionBuilder.create('a');

        assertEquals("a", opt.getOpt());
        assertNull(opt.getLongOpt());
        assertNull(opt.getDescription());
        assertFalse(opt.isRequired());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        assertNull(opt.getType());
        assertTrue(opt.getValueSeparator() == (char) 0);
        assertEquals("arg", opt.getArgName());
    }

    @Test
    public void testCreateStringOpt() {
        Option opt = OptionBuilder.withLongOpt("see").create("c");

        assertEquals("c", opt.getOpt());
        assertEquals("see", opt.getLongOpt());
    }

    @Test
    public void testCreateWithLongOptAndDescription() {
        Option opt = OptionBuilder.withLongOpt("long")
                .withDescription("desc")
                .create('a');

        assertEquals("long", opt.getLongOpt());
        assertEquals("desc", opt.getDescription());
    }

    @Test
    public void testCreateWithArgNameTypeRequired() {
        Option opt = OptionBuilder.withArgName("myArg")
                .isRequired()
                .withType(Integer.class)
                .create('b');

        assertEquals("myArg", opt.getArgName());
        assertTrue(opt.isRequired());
        assertSame(Integer.class, opt.getType());
    }

    @Test
    public void testCreateHasArg() {
        Option opt = OptionBuilder.hasArg().create('a');

        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasArg());
    }

    @Test
    public void testCreateHasArgBoolean() {
        Option opt = OptionBuilder.hasArg(true).create('a');
        assertEquals(1, opt.getArgs());

        opt = OptionBuilder.hasArg(false).create('b');
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        assertFalse(opt.hasArg());
    }

    @Test
    public void testCreateHasArgs() {
        Option opt = OptionBuilder.hasArgs().create('a');
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());

        opt = OptionBuilder.hasArgs(3).create('b');
        assertEquals(3, opt.getArgs());

        opt = OptionBuilder.hasArgs(0).create('c');
        assertEquals(0, opt.getArgs());
    }

    @Test
    public void testCreateOptionalArgs() {
        Option opt = OptionBuilder.hasOptionalArg().create('a');
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasOptionalArg());

        opt = OptionBuilder.hasOptionalArgs().create('b');
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
        assertTrue(opt.hasOptionalArg());

        opt = OptionBuilder.hasOptionalArgs(2).create('c');
        assertEquals(2, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    @Test
    public void testCreateWithValueSeparator() {
        Option opt = OptionBuilder.withValueSeparator().create('a');
        assertTrue(opt.getValueSeparator() == '=');

        opt = OptionBuilder.withValueSeparator(':').create('b');
        assertTrue(opt.getValueSeparator() == ':');
    }

    @Test
    public void testCreateWithNullValues() {
        Option opt = OptionBuilder.withLongOpt(null)
                .withDescription(null)
                .withType(null)
                .withArgName(null)
                .create('x');

        assertNull(opt.getLongOpt());
        assertNull(opt.getDescription());
        assertNull(opt.getType());
        assertNull(opt.getArgName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithoutLongOptThrows() {
        OptionBuilder.create();
    }

    @Test
    public void testCreateWithLongOptNoShortOpt() {
        Option opt = OptionBuilder.withLongOpt("long").create();

        assertNull(opt.getOpt());
        assertEquals("long", opt.getLongOpt());

        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException after builder reset");
        } catch (IllegalArgumentException expected) {
            assertEquals("must specify longopt", expected.getMessage());
        }
    }
}