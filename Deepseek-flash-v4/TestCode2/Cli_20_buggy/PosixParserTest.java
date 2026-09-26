package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class PosixParserTest {

    private Options options;
    private PosixParser parser;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
    }

    @Test
    public void testFlattenEmptyArguments() {
        assertArrayEquals(new String[0], parser.flatten(options, new String[0], false));
        assertArrayEquals(new String[0], parser.flatten(options, new String[0], true));
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenNullArguments() {
        parser.flatten(options, null, false);
    }

    @Test
    public void testFlattenSingleHyphen() {
        assertArrayEquals(new String[]{"-"}, parser.flatten(options, new String[]{"-"}, false));
    }

    @Test
    public void testFlattenLongOption() {
        assertArrayEquals(new String[]{"--foo"}, parser.flatten(options, new String[]{"--foo"}, false));
    }

    @Test
    public void testFlattenLongOptionWithValue() {
        assertArrayEquals(new String[]{"--foo", "bar"}, parser.flatten(options, new String[]{"--foo=bar"}, false));
        assertArrayEquals(new String[]{"--foo", ""}, parser.flatten(options, new String[]{"--foo="}, false));
    }

    @Test
    public void testFlattenNonOptionWithoutStop() {
        assertArrayEquals(new String[]{"foo"}, parser.flatten(options, new String[]{"foo"}, false));
    }

    @Test
    public void testFlattenNonOptionWithStop() {
        assertArrayEquals(new String[]{"--", "foo"}, parser.flatten(options, new String[]{"foo"}, true));
    }

    @Test
    public void testFlattenSingleCharOption() {
        options.addOption("a", false, "a");
        assertArrayEquals(new String[]{"-a"}, parser.flatten(options, new String[]{"-a"}, false));
    }

    @Test
    public void testFlattenUnknownOptionWithStop() {
        assertArrayEquals(new String[]{"-x", "foo"}, parser.flatten(options, new String[]{"-x", "foo"}, true));
    }

    @Test
    public void testFlattenUnknownOptionWithoutStop() {
        assertArrayEquals(new String[]{"-x"}, parser.flatten(options, new String[]{"-x"}, false));
    }

    @Test
    public void testFlattenOptionArgumentWithStop() {
        options.addOption("b", true, "b arg");
        assertArrayEquals(new String[]{"-b", "value"}, parser.flatten(options, new String[]{"-b", "value"}, true));
    }

    @Test
    public void testBurstSingleCharOptions() {
        options.addOption("a", false, "a");
        options.addOption("b", false, "b");
        options.addOption("c", false, "c");
        assertArrayEquals(new String[]{"-a", "-b", "-c"}, parser.flatten(options, new String[]{"-abc"}, false));
    }

    @Test
    public void testBurstTokenWithArgumentInRemainder() {
        options.addOption("a", true, "a arg");
        assertArrayEquals(new String[]{"-a", "bc"}, parser.flatten(options, new String[]{"-abc"}, false));
    }

    @Test
    public void testBurstTokenStopsAtNonOption() {
        options.addOption("a", false, "a");
        assertArrayEquals(new String[]{"-a", "--", "bc"}, parser.flatten(options, new String[]{"-abc"}, true));
    }

    @Test
    public void testBurstTokenIgnoresUnknownWhenNotStopping() {
        options.addOption("a", false, "a");
        assertArrayEquals(new String[]{"-a", "-abc"}, parser.flatten(options, new String[]{"-abc"}, false));
    }

    @Test
    public void testBurstTokenStopGobblesRemainingTokens() {
        options.addOption("a", false, "a");
        assertArrayEquals(
                new String[]{"-a", "--", "bc", "x", "y"},
                parser.flatten(options, new String[]{"-abc", "x", "y"}, true));
    }

    @Test
    public void testFlattenEmptyStringToken() {
        assertArrayEquals(new String[]{""}, parser.flatten(options, new String[]{""}, false));
        assertArrayEquals(new String[]{"--", ""}, parser.flatten(options, new String[]{""}, true));
    }

    @Test
    public void testFlattenMultiCharOptionName() {
        options.addOption("f", "foo", false, "foo option");
        assertArrayEquals(new String[]{"-foo"}, parser.flatten(options, new String[]{"-foo"}, false));
    }

    @Test
    public void testFlattenResetsStateBetweenCalls() {
        options.addOption("a", false, "a");
        assertArrayEquals(new String[]{"-a"}, parser.flatten(options, new String[]{"-a"}, false));

        Options empty = new Options();
        assertArrayEquals(new String[]{"foo"}, parser.flatten(empty, new String[]{"foo"}, false));
    }
}