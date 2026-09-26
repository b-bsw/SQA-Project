package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class ParserTest {

    private static class TestParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) throws ParseException {
            if (arguments == null) {
                return new String[0];
            }
            return arguments.clone();
        }
    }

    private TestParser parser;

    @Before
    public void setUp() {
        parser = new TestParser();
    }

    @Test
    public void testParseNullArgumentsReturnsCommandLine() throws Exception {
        Options options = new Options();
        CommandLine cmd = parser.parse(options, (String[]) null);

        assertNotNull(cmd);
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseOptionWithValue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", true, "desc"));

        CommandLine cmd = parser.parse(options, new String[] {"-a", "value"});

        assertTrue(cmd.hasOption("a"));
        assertEquals("value", cmd.getOptionValue("a"));
        assertEquals(0, cmd.getArgs().length);
    }

    @Test
    public void testParseArgument() throws Exception {
        CommandLine cmd = parser.parse(new Options(), new String[] {"foo"});

        assertArrayEquals(new String[] {"foo"}, cmd.getArgs());
    }

    @Test
    public void testParseDoubleDashTreatsRestAsArguments() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "desc"));

        CommandLine cmd = parser.parse(options, new String[] {"--", "-a", "value"});

        assertFalse(cmd.hasOption("a"));
        assertArrayEquals(new String[] {"-a", "value"}, cmd.getArgs());
    }

    @Test
    public void testParseSingleDashAsArgumentWhenNotStopping() throws Exception {
        CommandLine cmd = parser.parse(new Options(), new String[] {"-"}, false);

        assertArrayEquals(new String[] {"-"}, cmd.getArgs());
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseUnknownOptionThrows() throws Exception {
        parser.parse(new Options(), new String[] {"-x"});
    }

    @Test
    public void testParseStopAtNonOptionUnknownAddsRemaining() throws Exception {
        CommandLine cmd = parser.parse(new Options(), new String[] {"-x", "foo", "bar"}, true);

        assertArrayEquals(new String[] {"-x", "foo", "bar"}, cmd.getArgs());
    }

    @Test
    public void testParseStopAtNonOptionKnownOptionStillProcessed() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "desc"));

        CommandLine cmd = parser.parse(options, new String[] {"-a", "foo"}, true);

        assertTrue(cmd.hasOption("a"));
        assertArrayEquals(new String[] {"foo"}, cmd.getArgs());
    }

    @Test
    public void testParseStopAtNonOptionArgumentStopsProcessing() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "desc"));

        CommandLine cmd = parser.parse(options, new String[] {"foo", "-a"}, true);

        assertFalse(cmd.hasOption("a"));
        assertArrayEquals(new String[] {"foo", "-a"}, cmd.getArgs());
    }

    @Test
    public void testParseWithRequiredOptionPresent() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "desc");
        required.setRequired(true);
        options.addOption(required);

        CommandLine cmd = parser.parse(options, new String[] {"-r"});

        assertTrue(cmd.hasOption("r"));
    }

    @Test(expected = MissingOptionException.class)
    public void testParseWithMissingRequiredOptionThrows() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "desc");
        required.setRequired(true);
        options.addOption(required);

        parser.parse(options, new String[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testParseMissingOptionArgumentThrows() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", true, "desc"));

        parser.parse(options, new String[] {"-a"});
    }

    @Test
    public void testParsePropertiesSetOptionValue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", true, "desc"));

        Properties properties = new Properties();
        properties.setProperty("v", "prop");

        CommandLine cmd = parser.parse(options, new String[0], properties, false);

        assertTrue(cmd.hasOption("v"));
        assertEquals("prop", cmd.getOptionValue("v"));
    }

    @Test
    public void testParsePropertiesAddsFlagForTrue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("f", "desc"));

        Properties properties = new Properties();
        properties.setProperty("f", "true");

        CommandLine cmd = parser.parse(options, new String[0], properties, false);

        assertTrue(cmd.hasOption("f"));
    }

    @Test
    public void testParsePropertiesDoesNotAddFlagForFalse() throws Exception {
        Options options = new Options();
        options.addOption(new Option("f", "desc"));

        Properties properties = new Properties();
        properties.setProperty("f", "false");

        CommandLine cmd = parser.parse(options, new String[0], properties, false);

        assertFalse(cmd.hasOption("f"));
    }

    @Test
    public void testParsePropertiesDoesNotOverrideCommandLineValue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", true, "desc"));

        Properties properties = new Properties();
        properties.setProperty("v", "prop");

        CommandLine cmd = parser.parse(options, new String[] {"-v", "cmd"}, properties, false);

        assertEquals("cmd", cmd.getOptionValue("v"));
    }
}