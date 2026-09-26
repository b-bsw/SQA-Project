package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CommandLineRunnerTest {

    private CommandLineRunner createRunner(String... args) {
        return new CommandLineRunner(args,
            new PrintStream(new ByteArrayOutputStream(), true),
            new PrintStream(new ByteArrayOutputStream(), true));
    }

    private CommandLineRunner createRunner(
        String[] args, ByteArrayOutputStream out, ByteArrayOutputStream err) {
        return new CommandLineRunner(args,
            new PrintStream(out, true),
            new PrintStream(err, true));
    }

    @Test
    public void testNoArgsIsValid() {
        assertTrue(createRunner().shouldRunCompiler());
    }

    @Test
    public void testUnknownFlagInvalidatesConfig() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        CommandLineRunner runner = createRunner(
            new String[] {"--totally_unknown_flag"},
            new ByteArrayOutputStream(), err);

        assertFalse(runner.shouldRunCompiler());
        assertTrue(err.toString().contains("totally_unknown_flag"));
    }

    @Test
    public void testHelpFlagPrintsUsageAndInvalidatesConfig() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        CommandLineRunner runner = createRunner(
            new String[] {"--help"},
            new ByteArrayOutputStream(), err);

        assertFalse(runner.shouldRunCompiler());
        assertTrue(err.toString().contains("--help"));
    }

    @Test
    public void testVersionFlagPrintsVersionAndKeepsConfigValid() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        CommandLineRunner runner = createRunner(
            new String[] {"--version"},
            new ByteArrayOutputStream(), err);

        assertTrue(runner.shouldRunCompiler());
        assertTrue(err.toString().contains("Version:"));
    }

    @Test
    public void testValidFlagFileIsProcessed() throws Exception {
        File flagFile = File.createTempFile("closure", ".flags");
        try {
            try (FileWriter writer = new FileWriter(flagFile)) {
                writer.write("--js foo.js");
            }

            ByteArrayOutputStream err = new ByteArrayOutputStream();
            CommandLineRunner runner = createRunner(
                new String[] {"--flagfile=" + flagFile.getAbsolutePath()},
                new ByteArrayOutputStream(), err);

            assertTrue(runner.shouldRunCompiler());
        } finally {
            flagFile.delete();
        }
    }

    @Test
    public void testFlagFileCannotContainFlagFileOption() throws Exception {
        File flagFile = File.createTempFile("closure", ".flags");
        try {
            try (FileWriter writer = new FileWriter(flagFile)) {
                writer.write("--flagfile other.flags");
            }

            ByteArrayOutputStream err = new ByteArrayOutputStream();
            CommandLineRunner runner = createRunner(
                new String[] {"--flagfile=" + flagFile.getAbsolutePath()},
                new ByteArrayOutputStream(), err);

            assertFalse(runner.shouldRunCompiler());
            assertTrue(err.toString().contains("cannot contain"));
        } finally {
            flagFile.delete();
        }
    }

    @Test
    public void testMissingFlagFileReportsReadError() {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        String missingPath = new File(
            "missing-flags-" + System.nanoTime() + ".flags").getAbsolutePath();

        CommandLineRunner runner = createRunner(
            new String[] {"--flagfile=" + missingPath},
            new ByteArrayOutputStream(), err);

        assertFalse(runner.shouldRunCompiler());
        assertTrue(err.toString().contains("read error"));
    }

    @Test
    public void testProcessArgsSplitsEqualsAndStripsQuotes() throws Exception {
        CommandLineRunner runner = createRunner();
        List<String> result = invokeProcessArgs(runner,
            new String[] {"--js='a b.js'", "--output_wrapper=%output%", "--debug"});

        assertEquals(
            Arrays.asList("--js", "a b.js", "--output_wrapper=%output%", "--debug"),
            result);
    }

    @Test
    public void testCreateOptionsUsesDefaults() {
        CompilerOptions options = createRunner().createOptions();

        assertNotNull(options);
        assertFalse(options.prettyPrint);
        assertFalse(options.printInputDelimiter);
        assertTrue(options.closurePass);
    }

    @Test
    public void testCreateOptionsAppliesFormattingAndClosurePass() {
        CommandLineRunner runner = createRunner(
            "--formatting=PRETTY_PRINT",
            "--formatting=PRINT_INPUT_DELIMITER",
            "--process_closure_primitives=false",
            "--debug",
            "--generate_exports");

        CompilerOptions options = runner.createOptions();

        assertNotNull(options);
        assertTrue(options.prettyPrint);
        assertTrue(options.printInputDelimiter);
        assertFalse(options.closurePass);
    }

    @Test
    public void testCreateCompilerReturnsNonNull() {
        assertNotNull(createRunner().createCompiler());
    }

    @Test
    public void testCreateExternsRespectsUseOnlyCustomExterns() throws Exception {
        CommandLineRunner runner = createRunner("--use_only_custom_externs");
        assertNotNull(runner.createExterns());
    }

    @Test
    public void testGetDefaultExternsLoadsExpectedExterns() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();

        assertNotNull(externs);
        assertEquals(38, externs.size());
        for (JSSourceFile extern : externs) {
            assertNotNull(extern);
        }
    }

    @Test
    public void testBooleanOptionHandlerNoParameterAddsTrue() throws Exception {
        RecordingSetter setter = new RecordingSetter();
        Object handler = newBooleanOptionHandler(setter);

        assertEquals(0, invokeParse(handler, new TestParameters()));
        assertEquals(Arrays.asList(Boolean.TRUE), setter.values);
    }

    @Test
    public void testBooleanOptionHandlerAcceptsTrueAndFalseValues() throws Exception {
        String[] trueValues = {"true", "on", "yes", "1"};
        for (String value : trueValues) {
            RecordingSetter setter = new RecordingSetter();
            assertEquals(1,
                invokeParse(newBooleanOptionHandler(setter), new TestParameters(value)));
            assertEquals(Arrays.asList(Boolean.TRUE), setter.values);
        }

        String[] falseValues = {"false", "off", "no", "0"};
        for (String value : falseValues) {
            RecordingSetter setter = new RecordingSetter();
            assertEquals(1,
                invokeParse(newBooleanOptionHandler(setter), new TestParameters(value)));
            assertEquals(Arrays.asList(Boolean.FALSE), setter.values);
        }
    }

    @Test
    public void testBooleanOptionHandlerInvalidValueFallsBackToTrue() throws Exception {
        RecordingSetter setter = new RecordingSetter();
        Object handler = newBooleanOptionHandler(setter);

        assertEquals(0, invokeParse(handler, new TestParameters("not-a-boolean")));
        assertEquals(Arrays.asList(Boolean.TRUE), setter.values);
    }

    @SuppressWarnings("unchecked")
    private List<String> invokeProcessArgs(CommandLineRunner runner, String[] args)
        throws Exception {
        Method method =
            CommandLineRunner.class.getDeclaredMethod("processArgs", String[].class);
        method.setAccessible(true);
        return (List<String>) method.invoke(runner, (Object) args);
    }

    private Object newBooleanOptionHandler(RecordingSetter setter) throws Exception {
        Class<?> handlerClass = Class.forName(
            "com.google.javascript.jscomp.CommandLineRunner$Flags$BooleanOptionHandler");
        Constructor<?> constructor = handlerClass.getDeclaredConstructor(
            CmdLineParser.class, OptionDef.class, Setter.class);
        constructor.setAccessible(true);
        return constructor.newInstance(null, null, setter);
    }

    private int invokeParse(Object handler, Parameters parameters) throws Exception {
        Method method = handler.getClass().getDeclaredMethod(
            "parseArguments", Parameters.class);
        method.setAccessible(true);
        return (Integer) method.invoke(handler, parameters);
    }

    private static class RecordingSetter implements Setter<Boolean> {
        private final List<Boolean> values = new ArrayList<Boolean>();

        @Override
        public void addValue(Boolean value) {
            values.add(value);
        }

        @Override
        public Class<Boolean> getType() {
            return Boolean.class;
        }

        @Override
        public boolean isMultiValued() {
            return false;
        }
    }

    private static class TestParameters implements Parameters {
        private final String[] params;

        TestParameters(String... params) {
            this.params = params;
        }

        @Override
        public int size() {
            return params.length;
        }

        @Override
        public String getParameter(int idx) {
            return (idx >= 0 && idx < params.length) ? params[idx] : null;
        }

        @Override
        public Iterator<String> iterator() {
            return Arrays.asList(params).iterator();
        }
    }
}