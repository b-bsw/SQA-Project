package org.apache.commons.cli;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PosixParserTest {

    private Options createOptions() {
        Options options = new Options();

        // option แบบไม่มีค่า
        options.addOption(new Option("a", false, "option a"));
        options.addOption(new Option("b", false, "option b"));

        // option แบบรับค่าได้
        options.addOption(new Option("D", true, "define property"));

        // option ที่ชื่อยาวว่า foo
        options.addOption(new Option("f", "foo", false, "foo option"));

        return options;
    }

    @Test
    public void testFlattenEmptyArguments() {
        PosixParser parser = new PosixParser();

        assertArrayEquals(new String[0],
                parser.flatten(new Options(), new String[0], false));

        assertArrayEquals(new String[0],
                parser.flatten(new Options(), new String[0], true));
    }

    @Test
    public void testFlattenLongTokens() {
        PosixParser parser = new PosixParser();

        assertArrayEquals(new String[]{"--foo"},
                parser.flatten(new Options(), new String[]{"--foo"}, false));

        assertArrayEquals(new String[]{"--foo", "bar"},
                parser.flatten(new Options(), new String[]{"--foo=bar"}, false));
    }

    @Test
    public void testFlattenSingleHyphen() {
        PosixParser parser = new PosixParser();

        assertArrayEquals(new String[]{"-"},
                parser.flatten(new Options(), new String[]{"-"}, false));

        assertArrayEquals(new String[]{"-"},
                parser.flatten(new Options(), new String[]{"-"}, true));
    }

    @Test
    public void testFlattenRecognizedOptionToken() {
        PosixParser parser = new PosixParser();
        Options options = createOptions();

        assertArrayEquals(new String[]{"-a"},
                parser.flatten(options, new String[]{"-a"}, false));

        assertArrayEquals(new String[]{"-a"},
                parser.flatten(options, new String[]{"-a"}, true));
    }

    @Test
    public void testFlattenUnknownOptionStopsAtNonOption() {
        PosixParser parser = new PosixParser();
        Options options = createOptions();

        // option ที่ไม่รู้จัก เมื่อ stopAtNonOption = true
        assertArrayEquals(new String[]{"foo", "bar"},
                parser.flatten(options, new String[]{"-x", "foo", "bar"}, true));
    }

    @Test
    public void testFlattenUnknownOptionIgnoredWhenNotStopping() {
        PosixParser parser = new PosixParser();
        Options options = createOptions();

        // option ที่ไม่รู้จัก เมื่อ stopAtNonOption = false จะไม่ทำให้หยุด
        assertArrayEquals(new String[0],
                parser.flatten(options, new String[]{"-x"}, false));
    }

    @Test
    public void testFlattenNonOptionStopsAndGobblesRest() {
        PosixParser parser = new PosixParser();

        // เมื่อเจอ non-option และ stopAtNonOption = true
        assertArrayEquals(new String[]{"--", "foo", "bar"},
                parser.flatten(new Options(), new String[]{"foo", "bar"}, true));
    }

    @Test
    public void testFlattenNonOptionWhenNotStopping() {
        PosixParser parser = new PosixParser();

        assertArrayEquals(new String[]{"foo", "bar"},
                parser.flatten(new Options(), new String[]{"foo", "bar"}, false));
    }

    @Test
    public void testFlattenOptionArgumentAsNextToken() {
        PosixParser parser = new PosixParser();
        Options options = createOptions();

        // option ที่รับค่า โดยค่าอยู่คนละ token
        assertArrayEquals(new String[]{"-D", "value"},
                parser.flatten(options, new String[]{"-D", "value"}, true));
    }

    @Test
    public void testFlattenBurstOptionWithAttachedArgument() {
        PosixParser parser = new PosixParser();
        Options options = createOptions();

        // option แบบติดกับค่าของมัน: -Dvalue
        assertArrayEquals(new String[]{"-D", "value"},
                parser.flatten(options, new String[]{"-Dvalue"}, false));
    }

    @Test
    public void testFlattenBurstOptionMultipleOptions() {
        PosixParser parser = new PosixParser();
        Options options = createOptions();

        // short option รวมกัน: -ab
        assertArrayEquals(new String[]{"-a", "-b"},
                parser.flatten(options, new String[]{"-ab"}, false));
    }

    @Test
    public void testFlattenBurstOptionUnknownTokenNotStopping() {
        PosixParser parser = new PosixParser();
        Options options = createOptions();

        // -a เป็น option ที่รู้จัก แต่ -ax ไม่รู้จักทั้งหมด
        assertArrayEquals(new String[]{"-a", "-ax"},
                parser.flatten(options, new String[]{"-ax"}, false));
    }

    @Test
    public void testFlattenBurstOptionUnknownTokenStopping() {
        PosixParser parser = new PosixParser();
        Options options = createOptions();

        // เจอส่วนที่รู้จัก -a ก่อน เจอ x ซึ่งไม่รู้จัก และ stopAtNonOption = true
        assertArrayEquals(new String[]{"-a", "--", "x"},
                parser.flatten(options, new String[]{"-ax"}, true));
    }

    @Test
    public void testFlattenFullMultiCharOption() {
        PosixParser parser = new PosixParser();
        Options options = createOptions();

        // option ชื่อยาว foo: -foo
        assertArrayEquals(new String[]{"-foo"},
                parser.flatten(options, new String[]{"-foo"}, false));
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenNullArgumentsThrowsNullPointer() {
        new PosixParser().flatten(new Options(), null, false);
    }
}