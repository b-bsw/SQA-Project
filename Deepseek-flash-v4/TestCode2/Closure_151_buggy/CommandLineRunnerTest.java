package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommandLineRunnerTest {

    @Test
    public void testEmptyArgs() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testValidArgs() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--js", "a.js"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testHelpFlag() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--help"});
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testInvalidFlag() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--undefined"});
        assertFalse(runner.shouldRunCompiler());
    }

    @Test(expected = NullPointerException.class)
    public void testNullArgs() {
        new CommandLineRunner(null);
    }

    @Test
    public void testBooleanFlagNoValue() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--debug"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanFlagTrue() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--debug", "true"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanFlagFalse() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--debug", "false"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanFlagInvalid() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--debug", "foo"});
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testArgWithEquals() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--js=a.js"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testArgWithQuotes() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--js=\"a.js\""});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testArgWithSingleQuotes() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--js='a.js'"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testMultipleFlags() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--js", "a.js", "--js", "b.js"});
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCreateOptionsNoCrash() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
    }
}