package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Properties;

import org.junit.Test;

public class ParserTest {

    private static class TestParser extends Parser {
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments;
        }
    }

    @Test
    public void testParseBasicOptionsAndArguments() throws Exception {
        Options options = new Options();
        Option a = new Option("a", "a", false, "a option");
        Option b = new Option("b", "b", true, "b option");
        options.addOption(a);
        options.addOption(b);

        CommandLine cli = new TestParser().parse(
                options, new String[] {"-a", "positional", "-b", "value"});

        assertNotNull(cli);
        assertTrue(cli.hasOption("a"));
        assertTrue(cli.hasOption("b"));
        assertEquals("value", cli.getOptionValue("b"));
        assertArrayEquals(new String[] {"positional"}, cli.getArgs());
    }

    @Test
    public void testParseNullArguments() throws Exception {
        CommandLine cli = new TestParser().parse(new Options(), (String[]) null);

        assertNotNull(cli);
        assertEquals(0, cli.getArgs().length);
    }

    @Test
    public void testParseStopAtNonOptionWithLeadingPositional() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "a", false, "a option"));

        CommandLine cli = new TestParser().parse(
                options, new String[] {"pos", "-a"}, null, true);

        assertFalse(cli.hasOption("a"));
        assertArrayEquals(new String[] {"pos", "-a"}, cli.getArgs());
    }

    @Test
    public void testParseStopAtNonOptionAfterOption() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "a", false, "a option"));

        CommandLine cli = new TestParser().parse(
                options, new String[] {"-a", "pos"}, null, true);

        assertTrue(cli.hasOption("a"));
        assertArrayEquals(new String[] {"pos"}, cli.getArgs());
    }

    @Test
    public void testParseDoubleDashStopsOptionProcessing() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "a", false, "a option"));

        CommandLine cli = new TestParser().parse(
                options, new String[] {"--", "-a"}, null, false);

        assertFalse(cli.hasOption("a"));
        assertArrayEquals(new String[] {"-a"}, cli.getArgs());
    }

    @Test
    public void testParseSingleDashAsArgument() throws Exception {
        CommandLine cli = new TestParser().parse(
                new Options(), new String[] {"-"}, null, false);

        assertArrayEquals(new String[] {"-"}, cli.getArgs());
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseUnknownOptionThrows() throws Exception {
        new TestParser().parse(new Options(), new String[] {"-x"});
    }

    @Test(expected = MissingOptionException.class)
    public void testParseRequiredOptionMissingThrows() throws Exception {
        Option req = new Option("r", "r", false, "required");
        req.setRequired(true);

        Options options = new Options();
        options.addOption(req);

        new TestParser().parse(options, new String[] {});
    }

    @Test
    public void testParseRequiredOptionPresentPasses() throws Exception {
        Option req = new Option("r", "r", false, "required");
        req.setRequired(true);

        Options options = new Options();
        options.addOption(req);

        CommandLine cli = new TestParser().parse(options, new String[] {"-r"});

        assertTrue(cli.hasOption("r"));
    }

    @Test
    public void testParseAddsOptionFromProperties() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "b", true, "b option"));

        Properties props = new Properties();
        props.setProperty("b", "value");

        CommandLine cli = new TestParser().parse(options, new String[0], props, false);

        assertTrue(cli.hasOption("b"));
        assertEquals("value", cli.getOptionValue("b"));
    }

    @Test
    public void testProcessPropertiesAddsValueForArgOption() {
        TestParser parser = new TestParser();

        Options options = new Options();
        Option b = new Option("b", "b", true, "b option");
        options.addOption(b);

        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("b", "value");

        parser.processProperties(props);

        assertTrue(parser.cmd.hasOption("b"));
        assertEquals("value", parser.cmd.getOptionValue("b"));
    }

    @Test
    public void testProcessPropertiesAddsFlagWhenValueIsYes() {
        TestParser parser = new TestParser();

        Options options = new Options();
        Option f = new Option("f", "f", false, "flag");
        options.addOption(f);

        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("f", "yes");

        parser.processProperties(props);

        assertTrue(parser.cmd.hasOption("f"));
    }

    @Test
    public void testProcessPropertiesDoesNotAddFlagWhenValueIsNo() {
        TestParser parser = new TestParser();

        Options options = new Options();
        Option f = new Option("f", "f", false, "flag");
        options.addOption(f);

        parser.setOptions(options);
        parser.cmd = new CommandLine();

        Properties props = new Properties();
        props.setProperty("f", "no");

        parser.processProperties(props);

        assertFalse(parser.cmd.hasOption("f"));
    }

    @Test
    public void testProcessPropertiesNullIsSafe() {
        TestParser parser = new TestParser();
        parser.setOptions(new Options());
        parser.cmd = new CommandLine();

        parser.processProperties(null);

        assertNotNull(parser.cmd);
    }

    @Test
    public void testProcessArgsAddsValuesAndStopsAtOption() throws Exception {
        TestParser parser = new TestParser();

        Options options = new Options();
        Option arg = new Option("a", "a", true, "arg");
        options.addOption(arg);
        options.addOption(new Option("b", "b", false, "b option"));

        parser.setOptions(options);

        ListIterator<String> iter = Arrays.asList(new String[] {"value", "-b"}).listIterator();

        parser.processArgs(arg, iter);

        assertArrayEquals(new String[] {"value"}, arg.getValues());
    }

    @Test(expected = MissingArgumentException.class)
    public void testProcessArgsMissingArgumentThrows() throws Exception {
        TestParser parser = new TestParser();

        Options options = new Options();
        Option arg = new Option("a", "a", true, "arg");
        options.addOption(arg);

        parser.setOptions(options);

        parser.processArgs(arg, Collections.<String>emptyListIterator());
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testProcessOptionUnrecognizedThrows() throws Exception {
        TestParser parser = new TestParser();
        parser.setOptions(new Options());

        parser.processOption("-z", Collections.<String>emptyListIterator());
    }
}