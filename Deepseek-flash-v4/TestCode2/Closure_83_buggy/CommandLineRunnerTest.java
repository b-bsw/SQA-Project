package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ResourceBundle;

@RunWith(JUnit4.class)
public class CommandLineRunnerTest {

    private ByteArrayOutputStream errContent;
    private PrintStream errStream;

    @Before
    public void setUp() {
        errContent = new ByteArrayOutputStream();
        errStream = new PrintStream(errContent);
    }

    @Test
    public void testShouldRunCompilerInvalidConfig() {
        String[] args = new String[]{"--invalid_flag"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertFalse("shouldRunCompiler should be false for invalid config", runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompilerHelpFlag() {
        String[] args = new String[]{"--help"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertFalse("shouldRunCompiler should be false for --help flag", runner.shouldRunCompiler());
        String output = errContent.toString();
        assertTrue("Output should contain usage information", output.contains("Usage"));
    }

    @Test
    public void testShouldRunCompilerVersionFlag() {
        String[] args = new String[]{"--version"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true for --version flag", runner.shouldRunCompiler());
        String output = errContent.toString();
        assertTrue("Output should contain version info", output.contains("Closure Compiler"));
    }

    @Test
    public void testValidMinimalConfig() {
        String[] args = new String[]{"--js", "test.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true for valid minimal config", runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanOptionHandlerTrueValues() throws Exception {
        String[] args = new String[]{"--debug", "true"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanOptionHandlerFalseValues() throws Exception {
        String[] args = new String[]{"--debug", "false"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanOptionHandlerNullParam() throws Exception {
        String[] args = new String[]{"--debug"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testBooleanOptionHandlerInvalidString() throws Exception {
        String[] args = new String[]{"--debug", "unknown"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testConfigWithEqualsSeparatedArgs() {
        String[] args = new String[]{"--js=test.js", "--compilation_level=ADVANCED_OPTIMIZATIONS"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testCreateOptionsBasic() {
        String[] args = new String[]{"--js", "test.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        CompilerOptions options = runner.createOptions();
        assertNotNull("Options should not be null", options);
    }

    @Test
    public void testCreateOptionsDebug() {
        String[] args = new String[]{"--js", "test.js", "--debug"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        CompilerOptions options = runner.createOptions();
        assertNotNull("Options should not be null", options);
    }

    @Test
    public void testCreateOptionsWithFormatting() {
        String[] args = new String[]{"--js", "test.js", "--formatting", "PRETTY_PRINT"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        CompilerOptions options = runner.createOptions();
        assertNotNull("Options should not be null", options);
        assertTrue("prettyPrint should be true", options.prettyPrint);
    }

    @Test
    public void testFlagsThirdPartyWithExterns() {
        String[] args = new String[]{"--js", "test.js", "--third_party"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testEmptyArgs() {
        String[] args = new String[]{};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true for empty args", runner.shouldRunCompiler());
    }

    @Test
    public void testMultipleJsFiles() {
        String[] args = new String[]{"--js", "a.js", "--js", "b.js", "--js", "c.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testMultipleModuleFiles() {
        String[] args = new String[]{"--module", "mod1:1", "--module", "mod2:1:mod1", "--js", "a.js", "--js", "b.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testCreateExternsWithCustomExternsOnly() throws Exception {
        String[] args = new String[]{"--js", "test.js", "--use_only_custom_externs"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testCreateExternsNormal() throws Exception {
        String[] args = new String[]{"--js", "test.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testOutputManifestFlag() {
        String[] args = new String[]{"--js", "test.js", "--output_manifest", "manifest.txt"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testClosureEntryPoint() {
        String[] args = new String[]{"--js", "test.js", "--closure_entry_point", "myapp.start"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testManageClosureDependencies() {
        String[] args = new String[]{"--js", "test.js", "--manage_closure_dependencies"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testProcessClosurePrimitivesFalse() {
        String[] args = new String[]{"--js", "test.js", "--process_closure_primitives", "false"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testConfigWithAllWarningLevels() {
        String[] args = new String[]{"--js", "test.js", "--warning_level", "QUIET"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testCreateSourceMapFlag() {
        String[] args = new String[]{"--js", "test.js", "--create_source_map", "mapfile"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, errStream);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
    }

    @Test
    public void testVersionFlagWithPrintStream() {
        PrintStream err = new PrintStream(errContent);
        String[] args = new String[]{"--version"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, err);
        assertTrue("shouldRunCompiler should be true", runner.shouldRunCompiler());
        String output = errContent.toString();
        assertTrue("Output should contain version info", output.contains("Closure Compiler"));
    }
}