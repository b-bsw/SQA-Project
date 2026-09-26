package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.junit.Test;

public class DefaultParserTest {

    @Test
    public void testParseNullArguments() throws Exception {
        Options options = new Options();
        CommandLine cl = new DefaultParser().parse(options, (String[]) null);
        assertNotNull(cl);
        assertEquals(0, cl.getArgs().length);
    }

    @Test
    public void testParseNullProperties() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "desc"));
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a"}, (Properties) null);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testFourArgParseUsesProperties() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "desc"));
        Properties props = new Properties();
        props.setProperty("a", "true");
        CommandLine cl = new DefaultParser().parse(options, null, props, false);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testShortOption() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "desc"));
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testShortOptionWithEqualsValue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "bravo", true, "desc"));
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-b=value"});
        assertEquals("value", cl.getOptionValue("b"));
    }

    @Test
    public void testShortOptionWithSeparateValue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "bravo", true, "desc"));
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-b", "value"});
        assertEquals("value", cl.getOptionValue("b"));
    }

    @Test
    public void testShortOptionConcatenated() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "desc"));
        options.addOption(new Option("c", "charlie", false, "desc"));
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-ac"});
        assertTrue(cl.hasOption("a"));
        assertTrue(cl.hasOption("c"));
    }

    @Test
    public void testLongOption() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "desc"));
        CommandLine cl = new DefaultParser().parse(options, new String[]{"--verbose"});
        assertTrue(cl.hasOption("v"));
    }

    @Test
    public void testLongOptionAbbreviated() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "desc"));
        CommandLine cl = new DefaultParser().parse(options, new String[]{"--verb"});
        assertTrue(cl.hasOption("v"));
    }

    @Test
    public void testLongOptionWithEquals() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", "verbose", true, "desc"));
        CommandLine cl = new DefaultParser().parse(options, new String[]{"--verbose=value"});
        assertEquals("value", cl.getOptionValue("v"));
    }

    @Test
    public void testSingleDashLongOption() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "desc"));
        CommandLine cl = new DefaultParser().parse(options, new String[]{"-verbose"});
        assertTrue(cl.hasOption("v"));
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnknownShortOptionThrows() throws Exception {
        new DefaultParser().parse(new Options(), new String[]{"-z"});
    }

    @Test(expected = UnrecognizedOptionException.class)
    public void testUnknownLongOptionThrows() throws Exception {
        new DefaultParser().parse(new Options(), new String[]{"--z"});
    }

    @Test(expected = AmbiguousOptionException.class)
    public void testAmbiguousLongOptionThrows() throws Exception {
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "desc"));
        options.addOption(new Option("b", "verbatim", false, "desc"));
        new DefaultParser().parse(options, new String[]{"--verb"});
    }

    @Test(expected = MissingOptionException.class)
    public void testMissingRequiredOptionThrows() throws Exception {
        Options options = new Options();
        Option required = new Option("r", "required", false, "desc");
        required.setRequired(true);
        options.addOption(required);
        new DefaultParser().parse(options, new String[0]);
    }

    @Test(expected = MissingArgumentException.class)
    public void testMissingArgumentExceptionThrows() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "bravo", true, "desc"));
        new DefaultParser().parse(options, new String[]{"-b"});
    }

    @Test
    public void testRequiredOptionGroupWithOneSelectedOptionDoesNotThrow() throws Exception {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(new Option("a", "alpha", false, "desc"));
        group.addOption(new Option("b", "beta", false, "desc"));
        group.setRequired(true);
        options.addOptionGroup(group);

        CommandLine cl = new DefaultParser().parse(options, new String[]{"-a"});
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testStopAtNonOption() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "desc"));

        CommandLine cl = new DefaultParser().parse(options, new String[]{"arg", "-a"}, true);
        assertEquals("arg", cl.getArgs()[0]);
        assertEquals("-a", cl.getArgs()[1]);
        assertFalse(cl.hasOption("a"));
    }

    @Test
    public void testNonOptionAddedToArgsWithoutStop() throws Exception {
        CommandLine cl = new DefaultParser().parse(new Options(), new String[]{"plain"});
        assertEquals("plain", cl.getArgs()[0]);
    }

    @Test
    public void testDoubleDash() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "desc"));

        CommandLine cl = new DefaultParser().parse(options, new String[]{"--", "-a"});
        assertFalse(cl.hasOption("a"));
        assertEquals("-a", cl.getArgs()[0]);
    }

    @Test
    public void testPropertiesAddNoArgOptionWhenValueTrue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "desc"));
        Properties props = new Properties();
        props.setProperty("a", "true");

        CommandLine cl = new DefaultParser().parse(options, null, props);
        assertTrue(cl.hasOption("a"));
    }

    @Test
    public void testPropertiesDoesNotAddNoArgOptionWhenValueFalse() throws Exception {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "desc"));
        Properties props = new Properties();
        props.setProperty("a", "false");

        CommandLine cl = new DefaultParser().parse(options, null, props);
        assertFalse(cl.hasOption("a"));
    }

    @Test
    public void testPropertiesSetsArgOptionValue() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "bravo", true, "desc"));
        Properties props = new Properties();
        props.setProperty("b", "value");

        CommandLine cl = new DefaultParser().parse(options, null, props);
        assertEquals("value", cl.getOptionValue("b"));
    }

    @Test
    public void testQuotedValueStripsQuotes() throws Exception {
        Options options = new Options();
        options.addOption(new Option("b", "bravo", true, "desc"));

        CommandLine cl = new DefaultParser().parse(options, new String[]{"-b", "\"quoted\""});
        assertEquals("quoted", cl.getOptionValue("b"));
    }
}