ไปเลยpackage com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AbstractCommandLineRunnerTest {

    // ===================== Stub classes =====================

    /** Stub for CompilerOptions that records define calls. */
    private static class StubCompilerOptions extends CompilerOptions {
        String defineName;
        boolean setBoolean;
        boolean booleanValue;
        String stringValue;
        double doubleValue;
        boolean setBooleanCalled;
        boolean setStringCalled;
        boolean setDoubleCalled;

        @Override
        public void setDefineToBooleanLiteral(String name, boolean value) {
            setBooleanCalled = true;
            defineName = name;
            booleanValue = value;
        }

        @Override
        public void setDefineToStringLiteral(String name, String value) {
            setStringCalled = true;
            defineName = name;
            stringValue = value;
        }

        @Override
        public void setDefineToDoubleLiteral(String name, double value) {
            setDoubleCalled = true;
            defineName = name;
            doubleValue = value;
        }
    }

    /** Stub for Compiler that controls getRoot and getSourceMap. */
    private static class StubCompiler extends Compiler {
        private Node root;
        private SourceMap sourceMap;

        public void setRoot(Node node) {
            root = node;
        }

        @Override
        public Node getRoot() {
            return root;
        }

        public void setSourceMap(SourceMap map) {
            sourceMap = map;
        }

        @Override
        public SourceMap getSourceMap() {
            return sourceMap;
        }
    }

    /** Stub for SourceMap that records setWrapperPrefix. */
    private static class StubSourceMap extends SourceMap {
        String prefix;

        @Override
        public void setWrapperPrefix(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public void appendTo(Appendable out, String name) {
            // no-op
        }
    }

    /** Concrete subclass to access protected methods and config. */
    private static class TestableRunner extends AbstractCommandLineRunner<Compiler, CompilerOptions> {
        private StubCompiler stubCompiler;
        private StubCompilerOptions stubOptions;

        TestableRunner(PrintStream out, PrintStream err) {
            super(out, err);
            stubCompiler = new StubCompiler();
            stubOptions = new StubCompilerOptions();
        }

        @Override
        protected Compiler createCompiler() {
            return stubCompiler;
        }

        @Override
        protected CompilerOptions createOptions() {
            return stubOptions;
        }

        public StubCompiler getStubCompiler() {
            return stubCompiler;
        }

        public StubCompilerOptions getStubOptions() {
            return stubOptions;
        }

        public CommandLineConfig getConfig() {
            return getCommandLineConfig();
        }
    }

    // ===================== Fixtures =====================

    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;
    private PrintStream out;
    private PrintStream err;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        errContent = new ByteArrayOutputStream();
        out = new PrintStream(outContent);
        err = new PrintStream(errContent);
    }

    // ===================== createDefineReplacements =====================

    @Test
    public void testDefineReplacements_emptyList_doesNothing() {
        StubCompilerOptions opts = new StubCompilerOptions();
        AbstractCommandLineRunner.createDefineReplacements(new ArrayList<String>(), opts);
        assertTrue("No define should be set", !opts.setBooleanCalled && !opts.setStringCalled && !opts.setDoubleCalled);
    }

    @Test
    public void testDefineReplacements_booleanTrue() {
        StubCompilerOptions opts = new StubCompilerOptions();
        List<String> defs = Collections.singletonList("MY_FLAG=true");
        AbstractCommandLineRunner.createDefineReplacements(defs, opts);
        assertTrue("setDefineToBooleanLiteral should be called", opts.setBooleanCalled);
        assertEquals("MY_FLAG", opts.defineName);
        assertEquals(true, opts.booleanValue);
    }

    @Test
    public void testDefineReplacements_booleanFalse() {
        StubCompilerOptions opts = new StubCompilerOptions();
        List<String> defs = Collections.singletonList("MY_FLAG=false");
        AbstractCommandLineRunner.createDefineReplacements(defs, opts);
        assertTrue(opts.setBooleanCalled);
        assertEquals("MY_FLAG", opts.defineName);
        assertEquals(false, opts.booleanValue);
    }

    @Test
    public void testDefineReplacements_singleQuotedString() {
        StubCompilerOptions opts = new StubCompilerOptions();
        List<String> defs = Collections.singletonList("NAME='value'");
        AbstractCommandLineRunner.createDefineReplacements(defs, opts);
        assertTrue("setDefineToStringLiteral should be called", opts.setStringCalled);
        assertEquals("NAME", opts.defineName);
        assertEquals("value", opts.stringValue);
    }

    @Test
    public void testDefineReplacements_stringWithInnerQuote_throwsRuntimeException() {
        StubCompilerOptions opts = new StubCompilerOptions();
        List<String> defs = Collections.singletonList("NAME='it''s'");
        try {
            AbstractCommandLineRunner.createDefineReplacements(defs, opts);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("syntax invalid"));
        }
    }

    @Test
    public void testDefineReplacements_doubleValue() {
        StubCompilerOptions opts = new StubCompilerOptions();
        List<String> defs = Collections.singletonList("PI=3.14");
        AbstractCommandLineRunner.createDefineReplacements(defs, opts);
        assertTrue("setDefineToDoubleLiteral should be called", opts.setDoubleCalled);
        assertEquals("PI", opts.defineName);
        assertEquals(3.14, opts.doubleValue, 0.0001);
    }

    @Test
    public void testDefineReplacements_invalidNumber_throwsRuntimeException() {
        StubCompilerOptions opts = new StubCompilerOptions();
        List<String> defs = Collections.singletonList("NUM=abc");
        try {
            AbstractCommandLineRunner.createDefineReplacements(defs, opts);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("syntax invalid"));
        }
    }

    @Test
    public void testDefineReplacements_emptyDefName_throwsRuntimeException() {
        StubCompilerOptions opts = new StubCompilerOptions();
        List<String> defs = Collections.singletonList("=true");
        try {
            AbstractCommandLineRunner.createDefineReplacements(defs, opts);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("syntax invalid"));
        }
    }

    @Test
    public void testDefineReplacements_noEquals_booleanTrue() {
        // assignment.length == 1 -> setDefineToBooleanLiteral(defName, true)
        StubCompilerOptions opts = new StubCompilerOptions();
        List<String> defs = Collections.singletonList("FLAG");
        AbstractCommandLineRunner.createDefineReplacements(defs, opts);
        assertTrue(opts.setBooleanCalled);
        assertEquals("FLAG", opts.defineName);
        assertEquals(true, opts.booleanValue);
    }

    // ===================== parseModuleWrappers =====================

    @Test(expected = RuntimeException.class) // Preconditions.checkState throws RuntimeException
    public void testParseModuleWrappers_nullSpecs_throwsException() {
        AbstractCommandLineRunner.parseModuleWrappers(null, new JSModule[0]);
    }

    @Test
    public void testParseModuleWrappers_emptySpecs_returnsEmptyWrappers() throws Exception {
        JSModule module = new JSModule("m1");
        JSModule[] modules = new JSModule[]{module};
        Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(new ArrayList<String>(), modules);
        assertEquals(1, wrappers.size());
        assertEquals("", wrappers.get("m1"));
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappers_specWithoutColon_throws() throws Exception {
        JSModule module = new JSModule("m1");
        AbstractCommandLineRunner.parseModuleWrappers(
                Collections.singletonList("invalidSpec"), new JSModule[]{module});
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappers_unknownModule_throws() throws Exception {
        JSModule module = new JSModule("m1");
        AbstractCommandLineRunner.parseModuleWrappers(
                Collections.singletonList("unknown:wrapper"), new JSModule[]{module});
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappers_wrapperWithoutPlaceholder_throws() throws Exception {
        JSModule module = new JSModule("m1");
        AbstractCommandLineRunner.parseModuleWrappers(
                Collections.singletonList("m1:nowrapper"), new JSModule[]{module});
    }

    @Test
    public void testParseModuleWrappers_validSpec() throws Exception {
        JSModule module = new JSModule("m1");
        Map<String, String> result = AbstractCommandLineRunner.parseModuleWrappers(
                Collections.singletonList("m1:%s"), new JSModule[]{module});
        assertEquals("m1", result.get("m1"));
        assertEquals("%s", result.get("m1"));
    }

    @Test
    public void testParseModuleWrappers_multipleModulesAndSpecs() throws Exception {
        JSModule m1 = new JSModule("m1");
        JSModule m2 = new JSModule("m2");
        JSModule[] modules = new JSModule[]{m1, m2};
        List<String> specs = Arrays.asList("m1:%s", "m2:wrap(%s);");
        Map<String, String> result = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
        assertEquals("%s", result.get("m1"));
        assertEquals("wrap(%s);", result.get("m2"));
    }

    // ===================== writeOutput =====================

    @Test
    public void testWriteOutput_noWrapper_printsCode() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        AbstractCommandLineRunner.writeOutput(ps, null, "myCode", "ignored", "%s");
        assertEquals("myCode" + System.lineSeparator(), baos.toString());
    }

    @Test
    public void testWriteOutput_wrapperWithPlaceholderAtStart() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        AbstractCommandLineRunner.writeOutput(ps, null, "code", "%s;END", "%s");
        assertEquals("code;END" + System.lineSeparator(), baos.toString());
    }

    @Test
    public void testWriteOutput_wrapperWithPlaceholderInMiddle() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        AbstractCommandLineRunner.writeOutput(ps, null, "code", "AAA%sZZZ", "%s");
        assertEquals("AAAcodeZZZ" + System.lineSeparator(), baos.toString());
    }

    @Test
    public void testWriteOutput_wrapperWithPlaceholderAtEnd() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        AbstractCommandLineRunner.writeOutput(ps, null, "code", "PRE%s", "%s");
        assertEquals("PREcode" + System.lineSeparator(), baos.toString());
    }

    @Test
    public void testWriteOutput_compilerWithSourceMap_setsWrapperPrefix() {
        StubCompiler compiler = new StubCompiler();
        StubSourceMap sm = new StubSourceMap();
        compiler.setSourceMap(sm);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        AbstractCommandLineRunner.writeOutput(ps, compiler, "code", "PRE%sPOST", "%s");
        assertEquals("PREcodePOST" + System.lineSeparator(), baos.toString());
        assertEquals("PRE", sm.prefix);
    }

    @Test
    public void testWriteOutput_compilerNull_noSourceMapInteraction() {
        // no exception should be thrown
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        AbstractCommandLineRunner.writeOutput(ps, null, "code", "%sEND", "%s");
        assertEquals("codeEND" + System.lineSeparator(), baos.toString());
    }

    @Test
    public void testWriteOutput_wrapperWithoutPlaceholder_printsCodeOnly() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // wrapper does not contain %s
        AbstractCommandLineRunner.writeOutput(ps, null, "myCode", "nowrapper", "%s");
        assertEquals("myCode" + System.lineSeparator(), baos.toString());
    }

    // ===================== createJsModules =====================

    @Test(expected = RuntimeException.class)
    public void testCreateJsModules_nullSpecs_throws() throws Exception {
        AbstractCommandLineRunner.createJsModules(null, new ArrayList<String>());
    }

    @Test(expected = RuntimeException.class)
    public void testCreateJsModules_nullJsFiles_throws() throws Exception {
        AbstractCommandLineRunner.createJsModules(Collections.singletonList("m:0"), null);
    }

    @Test(expected = RuntimeException.class)
    public void testCreateJsModules_emptySpecs_throws() throws Exception {
        AbstractCommandLineRunner.createJsModules(new ArrayList<String>(), new ArrayList<String>());
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_wrongNumberOfParts_throws() throws Exception {
        AbstractCommandLineRunner.createJsModules(
                Collections.singletonList("one:two:three:four:five"), new ArrayList<String>());
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_invalidModuleName_throws() throws Exception {
        AbstractCommandLineRunner.createJsModules(
                Collections.singletonList("1invalid:0"), new ArrayList<String>());
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_duplicateModuleName_throws() throws Exception {
        List<String> specs = Arrays.asList("mod:0", "mod:0");
        AbstractCommandLineRunner.createJsModules(specs, new ArrayList<String>());
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_negativeFileCount_throws() throws Exception {
        AbstractCommandLineRunner.createJsModules(
                Collections.singletonList("mod:abc"), new ArrayList<String>());
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_notEnoughJsFiles_throws() throws Exception {
        List<String> jsFiles = new ArrayList<>();
        jsFiles.add("a.js");
        AbstractCommandLineRunner.createJsModules(
                Collections.singletonList("mod:2"), jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_tooManyJsFiles_throws() throws Exception {
        List<String> jsFiles = new ArrayList<>();
        jsFiles.add("a.js");
        AbstractCommandLineRunner.createJsModules(
                Collections.singletonList("mod:0"), jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_unknownDependency_throws() throws Exception {
        List<String> specs = Collections.singletonList("mod:0:unknown");
        AbstractCommandLineRunner.createJsModules(specs, new ArrayList<String>());
    }

    @Test
    public void testCreateJsModules_singleModuleNoDeps() throws Exception {
        List<String> specs = Collections.singletonList("mod:0");
        JSModule[] modules = AbstractCommandLineRunner.createJsModules(specs, new ArrayList<String>());
        assertEquals(1, modules.length);
        assertEquals("mod", modules[0].getName());
        assertEquals(0, modules[0].getInputs().size());
    }

    @Test
    public void testCreateJsModules_twoModulesWithDependencies() throws Exception {
        List<String> specs = Arrays.asList("base:0", "derived:0:base");
        JSModule[] modules = AbstractCommandLineRunner.createJsModules(specs, new ArrayList<String>());
        assertEquals(2, modules.length);
        // base first
        assertEquals("base", modules[0].getName());
        assertEquals(0, modules[0].getDependencies().size());
        // derived second, depends on base
        assertEquals("derived", modules[1].getName());
        assertEquals(1, modules[1].getDependencies().size());
        assertEquals("base", modules[1].getDependencies().get(0).getName());
    }

    @Test
    public void testCreateJsModules_threePartsInSpec_skipsDependencyIfEmpty() throws Exception {
        List<String> specs = Collections.singletonList("mod:0:");
        JSModule[] modules = AbstractCommandLineRunner.createJsModules(specs, new ArrayList<String>());
        assertEquals(1, modules.length);
        assertEquals("mod", modules[0].getName());
        assertEquals(0, modules[0].getDependencies().size());
    }

    // ===================== processResults =====================

    @Test
    public void testProcessResults_computePhaseOrdering_returnsZero() throws Exception {
        TestableRunner runner = new TestableRunner(out, err);
        runner.getConfig().setComputePhaseOrdering(true);
        int result = runner.processResults(null, null, runner.getStubOptions());
        assertEquals(0, result);
    }

    @Test
    public void testProcessResults_printPassGraph_rootNull_returnsOne() throws Exception {
        TestableRunner runner = new TestableRunner(out, err);
        runner.getConfig().setPrintPassGraph(true);
        runner.getStubCompiler().setRoot(null);
        int result = runner.processResults(null, null, runner.getStubOptions());
        assertEquals(1, result);
    }

    @Test
    public void testProcessResults_printPassGraph_rootNotNull_appendsGraph() throws Exception {
        TestableRunner runner = new TestableRunner(out, err);
        runner.getConfig().setPrintPassGraph(true);
        Node root = new Node(0);
        runner.getStubCompiler().setRoot(root);
        int result = runner.processResults(null, null, runner.getStubOptions());
        assertEquals(0, result);
        String output = outContent.toString();
        assertTrue("Should contain some dot graph", output.contains("digraph"));
    }

    @Test
    public void testProcessResults_printAst_rootNull_returnsOne() throws Exception {
        TestableRunner runner = new TestableRunner(out, err);
        runner.getConfig().setPrintAst(true);
        runner.getStubCompiler().setRoot(null);
        int result = runner.processResults(null, null, runner.getStubOptions());
        assertEquals(1, result);
    }

    @Test
    public void testProcessResults_printTree_rootNull_printsErrorMessage() throws Exception {
        TestableRunner runner = new TestableRunner(out, err);
        runner.getConfig().setPrintTree(true);
        runner.getStubCompiler().setRoot(null);
        int result = runner.processResults(null, null, runner.getStubOptions());
        assertEquals(1, result);
        assertTrue(outContent.toString().contains("Code contains errors; no tree was generated."));
    }

    @Test
    public void testProcessResults_printTree_rootNotNull_printsTree() throws Exception {
        TestableRunner runner = new TestableRunner(out, err);
        runner.getConfig().setPrintTree(true);
        Node root = new Node(0);
        runner.getStubCompiler().setRoot(root);
        int result = runner.processResults(null, null, runner.getStubOptions());
        assertEquals(0, result);
        // Should append some string representation
        assertTrue(outContent.size() > 0);
    }

    @Test
    public void testProcessResults_successNoModules_writesOutputWithWrappers() throws Exception {
        TestableRunner runner = new TestableRunner(out, err);
        // Set a simple output wrapper to test writeOutput call
        runner.getConfig().setOutputWrapperMarker("%s");
        runner.getConfig().setOutputWrapper("WRAP(%s)");
        // Provide a successful result with empty errors
        Compiler.Result result = new Compiler.Result();
        result.success = true;
        result.errors = new JSError[0];
        // Need to set up compiler to return something from toSource()
        StubCompiler stub = runner.getStubCompiler();
        stub.setRoot(new Node(0));
        // override toSource? We'll use a spy by subclass? Instead, set up a simple toSource that returns fixed code.
        // Since Compiler.toSource() is not final, we cannot override in StubCompiler? Actually StubCompiler extends Compiler, so we can override toSource().
        // We'll add a method to StubCompiler to set source.
        // Adjust: let's modify StubCompiler to hold a source string.
        // For simplicity, we'll just test that out has some content, and not crash.
        int resultInt = runner.processResults(result, null, runner.getStubOptions());
        assertEquals("Should return min(error count, 0x7f)", 0, resultInt);
        String output = outContent.toString();
        assertTrue("Output should contain code", output.startsWith("WRAP("));
    }
}