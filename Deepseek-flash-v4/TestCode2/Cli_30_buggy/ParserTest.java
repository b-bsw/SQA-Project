package org.apache.commons.cli;

import static org.junit.Assert.*;

import java.util.Properties;

import org.junit.Test;

public class ParserTest {

    private static class TestParser extends Parser {
        private String[] flattenResult;

        @Override
        protected String[] flatten(Options options, String[] arguments, boolean stopAtNonOption) {
            if (flattenResult != null) {
                return flattenResult;
            }
            return arguments == null ? new String[0] : arguments;
        }

        void setFlattenResult(String[] flattenResult) {
            this.flattenResult = flattenResult;
        }
    }

    private Options createOptions() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "beta", true, "beta option");
        return options;
    }

    @Test
    public void testParseOptionWithValue() throws Exception {
        CommandLine line = new TestParser().parse(createOptions(), new String[]{"-b", "value"});

        assertTrue(line.hasOption("b"));
        assertEquals("value", line.getOptionValue("b"));
    }

    @Test
    public void testParseDoubleDashTreatsFollowingAsArgs() throws Exception {
        CommandLine line = new TestParser().parse(createOptions(), new String[]{"--", "-b", "foo"});

        assertFalse(line.hasOption("b"));
        assertArrayEquals(new String[]{"-b", "foo"}, line.getArgs());
    }

    @Test
    public void testParseStopAtNonOption() throws Exception {
        CommandLine line = new TestParser()
                .parse(createOptions(), new String[]{"foo", "-a"}, (Properties) null, true);

        assertFalse(line.hasOption("a"));
        assertArrayEquals(new String[]{"foo", "-a"}, line.getArgs());
    }

    @Test
    public void testParseSingleDashIsAddedAsArgument() throws Exception {
        CommandLine line = new TestParser()
                .parse(createOptions(), new String[]{"-"}, (Properties) null, false);

        assertArrayEquals(new String[]{"-"}, line.getArgs());
    }

    @Test
    public void testParseSingleDashStopsWhenStopAtNonOption() throws Exception {
        CommandLine line = new TestParser()
                .parse(createOptions(), new String[]{"-"}, (Properties) null, true);

        assertEquals(0, line.getArgs().length);
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testParseUnknownOptionThrows() throws Exception {
        new TestParser().parse(createOptions(), new String[]{"-z"});
    }

    @Test(expected = MissingArgumentException.class)
    public void testParseMissingArgumentThrows() throws Exception {
        new TestParser().parse(createOptions(), new String[]{"-b", "-a"});
    }

    @Test(expected = MissingOptionException.class)
    public void testParseMissingRequiredOptionThrows() throws Exception {
        Option option = new Option("r", "required option");
        option.setRequired(true);

        Options options = new Options();
        options.addOption(option);

        new TestParser().parse(options, new String[0]);
    }

    @Test
    public void testParseProvidedRequiredOption() throws Exception {
        Option option = new Option("r", "required option");
        option.setRequired(true);

        Options options = new Options();
        options.addOption(option);

        CommandLine line = new TestParser().parse(options, new String[]{"-r"});

        assertTrue(line.hasOption("r"));
    }

    @Test
    public void testParseNullArguments() throws Exception {
        CommandLine line = new TestParser().parse(createOptions(), (String[]) null);

        assertEquals(0, line.getArgs().length);
    }

    @Test
    public void testPropertiesAddOptionWithValue() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("b", "propValue");

        CommandLine line = new TestParser().parse(createOptions(), new String[0], properties, false);

        assertTrue(line.hasOption("b"));
        assertEquals("propValue", line.getOptionValue("b"));
    }

    @Test
    public void testPropertiesTrueAddsOption() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("a", "true");

        CommandLine line = new TestParser().parse(createOptions(), new String[0], properties, false);

        assertTrue(line.hasOption("a"));
    }

    @Test
    public void testPropertiesFalseDoesNotAddOption() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("a", "false");

        CommandLine line = new TestParser().parse(createOptions(), new String[0], properties, false);

        assertFalse(line.hasOption("a"));
    }

    @Test
    public void testCommandLineValueTakesPrecedenceOverProperties() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("b", "propValue");

        CommandLine line = new TestParser()
                .parse(createOptions(), new String[]{"-b", "cmdValue"}, properties, false);

        assertEquals("cmdValue", line.getOptionValue("b"));
    }

    @Test
    public void testRequiredOptionGroupSelected() throws Exception {
        Option g1 = new Option("g1", false, "group option 1");
        Option g2 = new Option("g2", false, "group option 2");

        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(g1);
        group.addOption(g2);

        Options options = new Options();
        options.addOptionGroup(group);

        CommandLine line = new TestParser().parse(options, new String[]{"-g1"});

        assertTrue(line.hasOption("g1"));
        assertFalse(line.hasOption("g2"));
    }
}