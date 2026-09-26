package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class DefaultParserTest {

    private DefaultParser parser;

    @Before
    public void setUp() {
        parser = new DefaultParser();
    }

    @After
    public void tearDown() {
        parser = null;
    }

    @Test
    public void testParseNullArguments() throws Exception {
        Options options = new Options();
        CommandLine cl = parser.parse(options, (String[]) null);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
        assertEquals(0, cl.getOptions().length);
    }

    @Test
    public void testParseEmptyArguments() throws Exception {
        Options options = new Options();
        CommandLine cl = parser.parse(options, new String[0]);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testShortOptionWithValue() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file");
        CommandLine cl = parser.parse(options, new String[]{"-f", "bar"});
        assertTrue(cl.hasOption("f"));
        assertEquals("bar", cl.getOptionValue("f"));
    }

    @Test
    public void testShortOptionWithEqualsValue() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file");
        CommandLine cl = parser.parse(options, new String[]{"-f=bar"});
        assertEquals("bar", cl.getOptionValue("f"));
    }

    @Test
    public void testShortOptionAttachedValue() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file");
        CommandLine cl = parser.parse(options, new String[]{"-fbar"});
        assertEquals("bar", cl.getOptionValue("f"));
    }

    @Test
    public void testLongOptionWithValue() throws Exception {
        Options options = new Options();
        options.addOption("f", "file", true, "file");
        CommandLine cl = parser.parse(options, new String[]{"--file", "bar"});
        assertEquals("bar", cl.getOptionValue("f"));
    }

    @Test
    public void testLongOptionWithEqualsValue() throws Exception {
        Options options = new Options();
        options.addOption("f", "file", true, "file");
        CommandLine cl = parser.parse(options, new String[]{"--file=bar"});
        assertEquals("bar", cl.getOptionValue("f"));
    }

    @Test
    public void testLongOptionUniquePrefix() throws Exception {
        Options options = new Options();
        options.addOption("f", "foo", true, "foo");
        CommandLine cl = parser.parse(options, new String[]{"--fo=bar"});
        assertEquals("bar", cl.getOptionValue("f"));
    }

    @Test
    public void testConcatenatedShortOptions() throws Exception {
        Options options = new Options();
        options.addOption("a", false, "a");
        options.addOption("b", false, "b");
        CommandLine cl = parser.parse(options, new String[]{"-ab"});
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("b"));
    }

    @Test
    public void testNegativeNumberAsArgumentValue() throws Exception {
        Options options = new Options();
        options.addOption("n", "number", true, "number");
        CommandLine cl = parser.parse(options, new String[]{"-n", "-1"});
        assertEquals("-1", cl.getOptionValue("n"));
    }

    @Test
    public void testDoubleDashStopsParsing() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file");
        CommandLine cl = parser.parse(options, new String[]{"--", "-f", "bar"});
        assertFalse(cl.hasOption("f"));
        assertArrayEquals(new String[]{"-f", "bar"}, cl.getArgs());
    }

    @Test
    public void testStopAtNonOptionWithUnknownOption() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file");
        CommandLine cl = parser.parse(options, new String[]{"-x", "-f", "bar"}, true);
        assertFalse(cl.hasOption("f"));
        assertArrayEquals(new String[]{"-x", "-f", "bar"}, cl.getArgs());
    }

    @Test
    public void testPropertiesProvideValue() throws Exception {
        Options options = new Options();
        options.addOption("f", "file", true, "file");
        Properties props = new Properties();
        props.setProperty("f", "prop");
        CommandLine cl = parser.parse(options, null, props);
        assertEquals("prop", cl.getOptionValue("f"));
    }

    @Test
    public void testCommandLineOverridesProperty() throws Exception {
        Options options = new Options();
        options.addOption("f", "file", true, "file");
        Properties props = new Properties();
        props.setProperty("f", "prop");
        CommandLine cl = parser.parse(options, new String[]{"-f", "arg"}, props);
        assertEquals("arg", cl.getOptionValue("f"));
    }

    @Test
    public void testPropertiesFlagEnabled() throws Exception {
        Options options = new Options();
        options.addOption("v", "verbose", false, "verbose");
        Properties props = new Properties();
        props.setProperty("v", "true");
        CommandLine cl = parser.parse(options, null, props);
        assertTrue(cl.hasOption("v"));
    }

    @Test
    public void testPropertiesFlagDisabled() throws Exception {
        Options options = new Options();
        options.addOption("v", "verbose", false, "verbose");
        Properties props = new Properties();
        props.setProperty("v", "false");
        CommandLine cl = parser.parse(options, null, props);
        assertFalse(cl.hasOption("v"));
    }

    @Test
    public void testNullProperties() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file");
        CommandLine cl = parser.parse(options, new String[]{"-f", "arg"}, (Properties) null);
        assertEquals("arg", cl.getOptionValue("f"));
    }

    @Test(expected = MissingOptionException.class)
    public void testMissingRequiredOption() throws Exception {
        Options options = new Options();
        Option f = new Option("f", "file", true, "file");
        f.setRequired(true);
        options.addOption(f);
        parser.parse(options, new String[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testMissingArgument() throws Exception {
        Options options = new Options();
        options.addOption("f", true, "file");
        parser.parse(options, new String[]{"-f"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnrecognizedOption() throws Exception {
        Options options = new Options();
        parser.parse(options, new String[]{"-x"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testAmbiguousLongOption() throws Exception {
        Options options = new Options();
        options.addOption("f", "foo", false, "foo");
        options.addOption("g", "foobar", false, "foobar");
        parser.parse(options, new String[]{"--fo"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testPropertiesUnknownOption() throws Exception {
        Options options = new Options();
        Properties props = new Properties();
        props.setProperty("x", "y");
        parser.parse(options, null, props);
    }

    @Test(expected = MissingOptionException.class)
    public void testMissingRequiredGroup() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", false, "a"));
        group.addOption(new Option("b", false, "b"));
        options.addOptionGroup(group);
        parser.parse(options, new String[0]);
    }

    @Test
    public void testOptionGroupSelectedDoesNotThrow() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("a", false, "a"));
        group.addOption(new Option("b", false, "b"));
        options.addOptionGroup(group);
        CommandLine cl = parser.parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
    }
}