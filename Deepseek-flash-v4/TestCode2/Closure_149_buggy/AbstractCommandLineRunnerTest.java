package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class AbstractCommandLineRunnerTest {

    private static class TestCompiler extends Compiler {
        private Node root;
        private SourceMap sourceMap;
        private VariableMap variableMap;
        private VariableMap propertyMap;
        private FunctionalInformationMap functionalInformationMap;
        private JSModuleGraph moduleGraph;
        private List<CompilerInput> inputsInOrder;

        TestCompiler() {
            super();
        }

        void setRoot(Node r) { this.root = r; }
        @Override public Node getRoot() { return root; }
        void setSourceMap(SourceMap sm) { this.sourceMap = sm; }
        @Override public SourceMap getSourceMap() { return sourceMap; }
        void setVariableMap(VariableMap vm) { this.variableMap = vm; }
        @Override public VariableMap getVariableMap() { return variableMap; }
        void setPropertyMap(VariableMap pm) { this.propertyMap = pm; }
        @Override public VariableMap getPropertyMap() { return propertyMap; }
        void setFunctionalInformationMap(FunctionalInformationMap fim) { this.functionalInformationMap = fim; }
        @Override public FunctionalInformationMap getFunctionalInformationMap() { return functionalInformationMap; }
        void setModuleGraph(JSModuleGraph g) { this.moduleGraph = g; }
        @Override public JSModuleGraph getModuleGraph() { return moduleGraph; }
        void setInputsInOrder(List<CompilerInput> inputs) { this.inputsInOrder = inputs; }
        @Override public List<CompilerInput> getInputsInOrder() { return inputsInOrder; }
    }

    private static class TestOptions extends CompilerOptions {
        String jsOutputFile = "";
        String sourceMapOutputPath = null;
        String externExportsPath = null;
        @Override public boolean isEmpty() { return jsOutputFile.isEmpty(); }
    }

    private static class TestRunner extends AbstractCommandLineRunner<TestCompiler, TestOptions> {
        TestRunner(PrintStream out, PrintStream err) {
            super(out, err);
        }
        @Override protected TestCompiler createCompiler() { return new TestCompiler(); }
        @Override protected TestOptions createOptions() { return new TestOptions(); }
        // Expose protected method for testing
        @Override public int processResults(Result result, JSModule[] modules, TestOptions options)
                throws FlagUsageException, IOException {
            return super.processResults(result, modules, options);
        }
        // Expose protected method for testing
        @Override public List<JSSourceFile> createExterns() throws FlagUsageException, IOException {
            return super.createExterns();
        }
        // Expose protected method for testing
        @Override public String expandSourceMapPath(TestOptions options, JSModule forModule) {
            return super.expandSourceMapPath(options, forModule);
        }
        // Expose protected method for testing
        @Override public String expandManifest(JSModule forModule) {
            return super.expandManifest(forModule);
        }
        // Expose protected for testing
        @Override public void printModuleGraphManifestTo(JSModuleGraph graph, Appendable out) throws IOException {
            super.printModuleGraphManifestTo(graph, out);
        }
        // Expose for testing
        public Charset getInputCharset() throws FlagUsageException {
            return super.getInputCharset();
        }
    }

    private TestRunner runner;
    private ByteArrayOutputStream outContent;
    private PrintStream outStream;
    private ByteArrayOutputStream errContent;
    private PrintStream errStream;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        outStream = new PrintStream(outContent);
        errContent = new ByteArrayOutputStream();
        errStream = new PrintStream(errContent);
        runner = new TestRunner(outStream, errStream);
    }

    @After
    public void tearDown() {
        outStream.close();
        errStream.close();
    }

    @Test
    public void testCreateDefineReplacements_booleanTrue() {
        CompilerOptions options = new TestOptions();
        List<String> defs = Arrays.asList("DEF=true");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
        // No direct assertion, but no exception expected
    }

    @Test
    public void testCreateDefineReplacements_booleanFalse() {
        CompilerOptions options = new TestOptions();
        List<String> defs = Arrays.asList("DEF=false");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test
    public void testCreateDefineReplacements_stringSingleQuotes() {
        CompilerOptions options = new TestOptions();
        List<String> defs = Arrays.asList("DEF='hello'");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test
    public void testCreateDefineReplacements_stringDoubleQuotes() {
        CompilerOptions options = new TestOptions();
        List<String> defs = Arrays.asList("DEF=\"world\"");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test
    public void testCreateDefineReplacements_doubleValue() {
        CompilerOptions options = new TestOptions();
        List<String> defs = Arrays.asList("DEF=3.14");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test(expected = RuntimeException.class)
    public void testCreateDefineReplacements_invalidSyntax() {
        CompilerOptions options = new TestOptions();
        List<String> defs = Arrays.asList("=value");
        AbstractCommandLineRunner.createDefineReplacements(defs, options);
    }

    @Test
    public void testCreateInputs_normalFiles() throws Exception {
        List<String> files = Arrays.asList("test.js", "main.js");
        List<JSSourceFile> inputs = AbstractCommandLineRunner.createInputs(files, false);
        assertEquals(2, inputs.size());
        assertEquals("test.js", inputs.get(0).getName());
        assertEquals("main.js", inputs.get(1).getName());
    }

    @Test
    public void testCreateInputs_stdinAllowed() throws Exception {
        List<String> files = Arrays.asList("-");
        List<JSSourceFile> inputs = AbstractCommandLineRunner.createInputs(files, true);
        assertEquals(1, inputs.size());
        assertEquals("stdin", inputs.get(0).getName());
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateInputs_stdinNotAllowed() throws Exception {
        List<String> files = Arrays.asList("-");
        AbstractCommandLineRunner.createInputs(files, false);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateInputs_stdinTwice() throws Exception {
        List<String> files = Arrays.asList("-", "-");
        AbstractCommandLineRunner.createInputs(files, true);
    }

    @Test
    public void testCreateSourceInputs_emptyListUsesStdin() throws Exception {
        List<String> empty = Collections.emptyList();
        List<JSSourceFile> inputs = AbstractCommandLineRunner.createSourceInputs(empty);
        assertEquals(1, inputs.size());
        assertEquals("stdin", inputs.get(0).getName());
    }

    @Test
    public void testCreateExternInputs_emptyListReturnsDevNull() throws Exception {
        List<String> empty = Collections.emptyList();
        List<JSSourceFile> externs = AbstractCommandLineRunner.createExternInputs(empty);
        assertEquals(1, externs.size());
        assertEquals("/dev/null", externs.get(0).getName());
    }

    @Test
    public void testCreateJsModules_validSpec() throws Exception {
        List<String> specs = Arrays.asList("mod1:2:dep1,dep2");
        List<String> jsFiles = Arrays.asList("a.js", "b.js");
        JSModule[] modules = AbstractCommandLineRunner.createJsModules(specs, jsFiles);
        assertEquals(1, modules.length);
        assertEquals("mod1", modules[0].getName());
        assertEquals(2, modules[0].getInputs().size());
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_invalidPartsCount() throws Exception {
        List<String> specs = Arrays.asList("mod1");
        List<String> jsFiles = Arrays.asList("a.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_invalidModuleName() throws Exception {
        List<String> specs = Arrays.asList("123:1");
        List<String> jsFiles = Arrays.asList("a.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_duplicateModuleName() throws Exception {
        List<String> specs = Arrays.asList("mod:1", "mod:1");
        List<String> jsFiles = Arrays.asList("a.js", "b.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_notEnoughJsFiles() throws Exception {
        List<String> specs = Arrays.asList("mod:3");
        List<String> jsFiles = Arrays.asList("a.js", "b.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_tooManyJsFiles() throws Exception {
        List<String> specs = Arrays.asList("mod:1");
        List<String> jsFiles = Arrays.asList("a.js", "b.js");
        AbstractCommandLineRunner.createJsModules(specs, jsFiles);
    }

    @Test
    public void testParseModuleWrappers_valid() throws Exception {
        JSModule module = new JSModule("test");
        JSModule[] modules = new JSModule[]{module};
        List<String> specs = Arrays.asList("test:wrap(%s)");
        Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
        assertEquals("wrap(%s)", wrappers.get("test"));
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappers_missingColon() throws Exception {
        JSModule module = new JSModule("test");
        JSModule[] modules = new JSModule[]{module};
        List<String> specs = Arrays.asList("test");
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappers_unknownModule() throws Exception {
        JSModule module = new JSModule("test");
        JSModule[] modules = new JSModule[]{module};
        List<String> specs = Arrays.asList("unknown:wrap(%s)");
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappers_missingPlaceholder() throws Exception {
        JSModule module = new JSModule("test");
        JSModule[] modules = new JSModule[]{module};
        List<String> specs = Arrays.asList("test:wrap");
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test
    public void testWriteOutput_withPlaceholder() throws IOException {
        StringBuilder out = new StringBuilder();
        AbstractCommandLineRunner.writeOutput(out, null, "code", "prefix%s suffix", "%s");
        assertEquals("prefixcode suffix\n", out.toString());
    }

    @Test
    public void testWriteOutput_withoutPlaceholder() throws IOException {
        StringBuilder out = new StringBuilder();
        AbstractCommandLineRunner.writeOutput(out, null, "code", "nowrapper", "%s");
        assertEquals("code\n", out.toString());
    }

    @Test
    public void testWriteOutput_prefixOnly() throws IOException {
        StringBuilder out = new StringBuilder();
        AbstractCommandLineRunner.writeOutput(out, null, "code", "prefix%s", "%s");
        assertEquals("prefixcode\n", out.toString());
    }

    @Test
    public void testWriteOutput_suffixOnly() throws IOException {
        StringBuilder out = new StringBuilder();
        AbstractCommandLineRunner.writeOutput(out, null, "code", "%ssuffix", "%s");
        assertEquals("codesuffix\n", out.toString());
    }

    @Test
    public void testGetInputCharset_valid() throws Exception {
        runner.getCommandLineConfig().setCharset("UTF-8");
        assertEquals(Charsets.UTF_8, runner.getInputCharset());
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testGetInputCharset_invalid() throws Exception {
        runner.getCommandLineConfig().setCharset("invalid-charset");
        runner.getInputCharset();
    }

    @Test
    public void testExit_flagUsageException() {
        AbstractCommandLineRunner.RunTimeStats stats = runner.new RunTimeStats();
        Throwable error = new AbstractCommandLineRunner.FlagUsageException("test flag error");
        runner.exit(stats, error);
        String errOutput = errContent.toString();
        assertTrue(errOutput.contains("test flag error"));
    }

    @Test
    public void testExit_otherThrowable() {
        AbstractCommandLineRunner.RunTimeStats stats = runner.new RunTimeStats();
        Throwable error = new RuntimeException("test runtime exception");
        runner.exit(stats, error);
        String errOutput = errContent.toString();
        assertTrue(errOutput.contains("java.lang.RuntimeException: test runtime exception"));
    }

    @Test
    public void testExit_nullError() {
        AbstractCommandLineRunner.RunTimeStats stats = runner.new RunTimeStats();
        runner.exit(stats, null);
        // No output expected, no exception
    }

    @Test
    public void testProcessResults_computePhaseOrderingReturnsZero() throws Exception {
        runner.getCommandLineConfig().setComputePhaseOrdering(true);
        int result = runner.processResults(null, null, null);
        assertEquals(0, result);
    }

    @Test
    public void testProcessResults_printPassGraphRootNull() throws Exception {
        runner.getCommandLineConfig().setPrintPassGraph(true);
        TestCompiler compiler = runner.createCompiler();
        compiler.setRoot(null);
        // We need to set the compiler via reflection? Actually we can override doRun.
        // Since processResults uses compiler field, we need to set it.
        // Let's use reflection or set via a method? We'll create a helper.
        // Instead, we'll test the static logic indirectly via the runner.
        // For now, we just test that processResults returns 1 when root null.
        // We'll use a different approach: create a subclass that exposes compiler.
        // But we already have access to compiler via getCompiler()? That's protected.
        // We'll set via reflection for simplicity.
        try {
            java.lang.reflect.Field compilerField = AbstractCommandLineRunner.class.getDeclaredField("compiler");
            compilerField.setAccessible(true);
            compilerField.set(runner, compiler);
        } catch (Exception e) {
            fail("Reflection failed: " + e.getMessage());
        }
        int result = runner.processResults(new Result(), null, null);
        assertEquals(1, result);
    }

    @Test
    public void testExpandSourceMapPath_emptyPathReturnsNull() {
        TestOptions options = new TestOptions();
        options.sourceMapOutputPath = "";
        String path = runner.expandSourceMapPath(options, null);
        assertNull(path);
    }

    @Test
    public void testExpandManifest_emptyManifestReturnsNull() {
        runner.getCommandLineConfig().setOutputManifest("");
        String manifest = runner.expandManifest(null);
        assertNull(manifest);
    }

    @Test
    public void testCreateExterns_usesConfigExterns() throws Exception {
        List<String> externFiles = Arrays.asList("extern1.js", "extern2.js");
        runner.getCommandLineConfig().setExterns(externFiles);
        List<JSSourceFile> externs = runner.createExterns();
        assertEquals(2, externs.size());
        assertEquals("extern1.js", externs.get(0).getName());
        assertEquals("extern2.js", externs.get(1).getName());
    }

    @Test
    public void testPrintModuleGraphManifestTo() throws Exception {
        // Create a simple module graph
        JSModule moduleA = new JSModule("A");
        JSModule moduleB = new JSModule("B");
        moduleB.addDependency(moduleA);
        JSModuleGraph graph = new JSModuleGraph(new JSModule[]{moduleA, moduleB});
        StringBuilder sb = new StringBuilder();
        runner.printModuleGraphManifestTo(graph, sb);
        String output = sb.toString();
        assertTrue(output.contains("{A}"));
        assertTrue(output.contains("{B:A}"));
    }
}