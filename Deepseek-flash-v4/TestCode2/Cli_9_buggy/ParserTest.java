package org.apache.commons.cli;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Properties;

public class ParserTest {

    private TestParser parser;

    @Before
    public void setUp() {
        parser = new TestParser();
    }

    @Test
    public void testParseNullArguments() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, (String[]) null);
        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseEmptyArguments() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha flag"));
        parser.setFlattened(new String[0]);

        CommandLine cmd = parser.parse(options, new String[0]);

        assertNotNull(cmd);
        assertFalse(cmd.hasOption("a"));
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseFlagOption() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha flag"));
        parser.setFlattened(new String[]{"-a"});

        CommandLine cmd = parser.parse(options, new String[0]);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParseOptionWithArgument() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "beta", true, "requires value"));
        parser.setFlattened(new String[]{"-b", "value"});

        CommandLine cmd = parser.parse(options, new String[0]);

        assertTrue(cmd.hasOption("b"));
        assertEquals("value", cmd.getOptionValue("b"));
    }

    @Test
    public void testParseDoubleDashTreatsRestAsArgs() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha flag"));
        parser.setFlattened(new String[]{"--", "-a", "--", "bar"});

        CommandLine cmd = parser.parse(options, new String[0]);

        assertArrayEquals(new String[]{"-a", "bar"}, cmd.getArgs());
        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParseSingleDashStopsWhenStopAtNonOption() throws Exception {
        Options options = new Options();
        parser.setFlattened(new String[]{"-", "foo"});

        CommandLine cmd = parser.parse(options, new String[0], true);

        assertArrayEquals(new String[]{"foo"}, cmd.getArgs());
    }

    @Test
    public void testParseStopAtNonOptionTreatsUnknownOptionAsArg() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha flag"));
        parser.setFlattened(new String[]{"-x", "foo"});

        CommandLine cmd = parser.parse(options, new String[0], true);

        assertArrayEquals(new String[]{"-x", "foo"}, cmd.getArgs());
        assertFalse(cmd.hasOption("x"));
    }

    @Test
    public void testParseStopAtNonOptionStopsAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha flag"));
        parser.setFlattened(new String[]{"foo", "-a"});

        CommandLine cmd = parser.parse(options, new String[0], true);

        assertArrayEquals(new String[]{"foo", "-a"}, cmd.getArgs());
        assertFalse(cmd.hasOption("a"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseUnrecognizedOptionThrows() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha flag"));
        parser.setFlattened(new String[]{"-x"});

        parser.parse(options, new String[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testParseMissingArgumentForOptionThrows() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "beta", true, "requires value"));
        parser.setFlattened(new String[]{"-b"});

        parser.parse(options, new String[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testParseOptionArgumentMissingBeforeOtherOptionThrows() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "beta", true, "requires value"));
        options.addOption(new Option("a", "alpha", false, "alpha flag"));
        parser.setFlattened(new String[]{"-b", "-a"});

        parser.parse(options, new String[0]);
    }

    @Test
    public void testParseMissingRequiredOptionMessageSingular() {
        Options options = new Options();
        Option req = new Option("r", "required", false, "required option");
        req.setRequired(true);
        options.addOption(req);
        parser.setFlattened(new String[0]);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().startsWith("Missing required option:"));
        }
    }

    @Test
    public void testParseMissingMultipleRequiredOptionsUsesPlural() {
        Options options = new Options();

        Option r1 = new Option("r", "req1", false, "required 1");
        r1.setRequired(true);
        options.addOption(r1);

        Option r2 = new Option("s", "req2", false, "required 2");
        r2.setRequired(true);
        options.addOption(r2);

        parser.setFlattened(new String[0]);

        try {
            parser.parse(options, new String[0]);
            fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            assertTrue(e.getMessage().startsWith("Missing required options:"));
        }
    }

    @Test
    public void testParsePropertiesSuppliesOptionValue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "beta", true, "requires value"));

        Properties props = new Properties();
        props.setProperty("b", "valueFromProps");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("b"));
        assertEquals("valueFromProps", cmd.getOptionValue("b"));
    }

    @Test
    public void testParsePropertiesEnablesFlag() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha flag"));

        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertTrue(cmd.hasOption("a"));
    }

    @Test
    public void testParsePropertiesIgnoresFalseFlag() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha flag"));

        Properties props = new Properties();
        props.setProperty("a", "false");

        CommandLine cmd = parser.parse(options, new String[0], props);

        assertFalse(cmd.hasOption("a"));
    }

    @Test
    public void testParseOptionInRequiredGroupSelectsIt() throws Exception {
        Option a = new Option("a", "alpha option");
        Option c = new Option("c", "charlie option");

        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(a);
        group.addOption(c);

        Options options = new Options();
        options.addOptionGroup(group);

        parser.setFlattened(new String[]{"-a"});
        CommandLine cmd = parser.parse(options, new String[0]);

        assertTrue(cmd.hasOption("a"));
        assertSame(a, group.getSelected());
    }

    private static final class TestParser extends Parser {
        private String[] flattened = new String[0];

        void setFlattened(String[] flattened) {
            this.flattened = flattened;
        }

        @Override
        protected String[] flatten(Options options, String[] arguments, boolean stopAtNonOption) {
            return flattened;
        }
    }
}