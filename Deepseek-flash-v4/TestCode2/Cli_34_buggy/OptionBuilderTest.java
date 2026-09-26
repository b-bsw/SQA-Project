package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class OptionBuilderTest {

    @Before
    public void setUp() {
        OptionBuilder.withLongOpt("__reset__");
        try {
            OptionBuilder.create();
        } catch (IllegalArgumentException e) {
            // Reset is always performed in a finally block.
        }
    }

    @Test
    public void testCreateCharWithAllSettings() {
        Option opt = OptionBuilder.withLongOpt("long")
                .withDescription("description")
                .isRequired(true)
                .hasArg()
                .withArgName("arg")
                .withValueSeparator(':')
                .withType(String.class)
                .create('a');

        assertEquals("a", opt.getOpt());
        assertEquals("long", opt.getLongOpt());
        assertEquals("description", opt.getDescription());
        assertTrue("should be required", opt.isRequired());
        assertTrue("should have arg", opt.hasArg());
        assertEquals("arg", opt.getArgName());
        assertEquals(':', opt.getValueSeparator());
        assertEquals(String.class, opt.getType());
        assertEquals(1, opt.getArgs());
    }

    @Test
    public void testHasArgBoolean() {
        Option optTrue = OptionBuilder.hasArg(true).create('t');
        assertEquals(1, optTrue.getArgs());
        assertTrue(optTrue.hasArg());

        Option optFalse = OptionBuilder.hasArg(false).create('f');
        assertEquals(Option.UNINITIALIZED, optFalse.getArgs());
        assertFalse(optFalse.hasArg());
    }

    @Test
    public void testHasArgs() {
        Option opt = OptionBuilder.hasArgs().create('u');
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testHasArgsInt() {
        Option opt = OptionBuilder.hasArgs(3).create('n');
        assertEquals(3, opt.getArgs());
        assertTrue(opt.hasArgs());
    }

    @Test
    public void testHasOptionalArg() {
        Option opt = OptionBuilder.hasOptionalArg().create('o');
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    @Test
    public void testHasOptionalArgs() {
        Option opt = OptionBuilder.hasOptionalArgs().create('p');
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    @Test
    public void testHasOptionalArgsInt() {
        Option opt = OptionBuilder.hasOptionalArgs(2).create('q');
        assertEquals(2, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    @Test
    public void testHasArgsZeroBoundary() {
        Option opt = OptionBuilder.hasArgs(0).create('z');
        assertEquals(0, opt.getArgs());
    }

    @Test
    public void testCreateWithLongOpt() {
        Option opt = OptionBuilder.withLongOpt("long").create();
        assertNull(opt.getOpt());
        assertEquals("long", opt.getLongOpt());
    }

    @Test
    public void testCreateWithoutLongOptThrows() {
        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test
    public void testCreateWithValueSeparator() {
        Option opt = OptionBuilder.withValueSeparator().create('=');
        assertEquals('=', opt.getValueSeparator());
    }

    @Test
    public void testCreateWithValueSeparatorChar() {
        Option opt = OptionBuilder.withValueSeparator(';').create('v');
        assertEquals(';', opt.getValueSeparator());
    }

    @Test
    public void testCreateWithNullTypeArgNameAndEmptyDescription() {
        Option opt = OptionBuilder.withType(null)
                .withArgName(null)
                .withDescription("")
                .create('z');
        assertNull(opt.getType());
        assertNull(opt.getArgName());
        assertEquals("", opt.getDescription());
    }

    @Test
    public void testCreateWithNullLongOpt() {
        Option opt = OptionBuilder.withLongOpt(null).create('n');
        assertNull(opt.getLongOpt());
    }

    @Test
    public void testCreateInvalidOptThrowsAndResets() {
        OptionBuilder.withLongOpt("bad").hasArg(true);
        try {
            OptionBuilder.create("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected.
        }

        Option opt = OptionBuilder.create('r');
        assertNotNull(opt);
        assertEquals("r", opt.getOpt());
        assertNull(opt.getLongOpt());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
    }

    @Test
    public void testBuilderMethodsReturnSameInstance() {
        OptionBuilder first = OptionBuilder.withDescription("a");
        OptionBuilder second = OptionBuilder.withDescription("b");
        assertSame(first, second);
    }

    @Test
    public void testStateIsResetAfterCreate() {
        OptionBuilder.withLongOpt("x")
                .hasArg(true)
                .withValueSeparator(';')
                .isRequired(true)
                .withType(Integer.class);
        Option created = OptionBuilder.create('c');
        assertNotNull(created);

        try {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException after reset");
        } catch (IllegalArgumentException e) {
            assertEquals("must specify longopt", e.getMessage());
        }

        Option next = OptionBuilder.create('d');
        assertNull(next.getLongOpt());
        assertFalse(next.isRequired());
        assertEquals(Option.UNINITIALIZED, next.getArgs());
        assertEquals((char) 0, next.getValueSeparator());
        assertNull(next.getType());
    }
}