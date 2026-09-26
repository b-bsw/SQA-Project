package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class CompilerTest {

    private Compiler compiler;
    private CompilerOptions options;
    private List<JSSourceFile> externs;
    private List<JSSourceFile> inputs;

    @Before
    public void setUp() {
        compiler = new Compiler();
        options = new CompilerOptions();
        externs = new ArrayList<>();
        inputs = new ArrayList<>();
    }

    @Test
    public void testConstructorWithNullStream() {
        Compiler c = new Compiler((PrintStream) null);
        assertNotNull(c);
    }

    @Test
    public void testConstructorWithErrorManager() {
        ErrorManager em = new LoggerErrorManager(null, null);
        Compiler c = new Compiler(em);
        assertNotNull(c);
    }

    @Test
    public void testSetErrorManagerWithNullThrowsException() {
        try {
            compiler.setErrorManager(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInitOptionsSetsErrorManagerWhenNull() {
        options = new CompilerOptions();
        compiler.initOptions(options);
        assertNotNull(compiler.getErrorManager());
    }

    @Test
    public void testInitOptionsSetsCheckTypesFromDiagnosticGroups() {
        options.enables(DiagnosticGroups.CHECK_TYPES);
        compiler.initOptions(options);
        assertTrue(options.checkTypes);
    }

    @Test
    public void testInitOptionsDisablesCheckTypes() {
        options.disables(DiagnosticGroups.CHECK_TYPES);
        compiler.initOptions(options);
        assertFalse(options.checkTypes);
    }

    @Test
    public void testInitOptionsWithNoCheckTypesTurnsOffParseError() {
        options.checkTypes = false;
        compiler.initOptions(options);
        CheckLevel level = options.getWarningLevel(DiagnosticGroup.forType(RhinoErrorReporter.TYPE_PARSE_ERROR));
        assertEquals(CheckLevel.OFF, level);
    }

    @Test
    public void testInitOptionsSetsGlobalThisWarning() {
        options.checkGlobalThisLevel = CheckLevel.WARNING;
        compiler.initOptions(options);
        CheckLevel level = options.getWarningLevel(DiagnosticGroups.GLOBAL_THIS);
        assertEquals(CheckLevel.WARNING, level);
    }

    @Test
    public void testInitOptionsCheckSymbolsOffAndVariablesNotEnabled() {
        options.checkSymbols = false;
        compiler.initOptions(options);
        CheckLevel level = options.getWarningLevel(DiagnosticGroups.CHECK_VARIABLES);
        assertEquals(CheckLevel.OFF, level);
    }

    @Test
    public void testInitWithSingleModule() {
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        externs.add(extern);
        inputs.add(input);
        compiler.init(externs, inputs, options);
        assertNotNull(compiler.getInput("input.js"));
    }

    @Test
    public void testInitWithEmptyModuleListReportsError() {
        List<JSModule> modules = new ArrayList<>();
        options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testInitWithEmptyRootModuleAndMultipleModulesReportsError() {
        List<JSModule> modules = new ArrayList<>();
        JSModule root = new JSModule("root");
        JSModule child = new JSModule("child");
        child.add(JSSourceFile.fromCode("child.js", "var a = 1;"));
        modules.add(root);
        modules.add(child);
        options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testInitFillsEmptyModules() {
        List<JSModule> modules = new ArrayList<>();
        JSModule root = new JSModule("root");
        modules.add(root);
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        assertEquals(1, root.getInputs().size());
    }

    @Test
    public void testInitWithMultipleModulesCreatesModuleGraph() {
        List<JSModule> modules = new ArrayList<>();
        JSModule m1 = new JSModule("m1");
        m1.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
        JSModule m2 = new JSModule("m2");
        m2.add(JSSourceFile.fromCode("b.js", "var b = 2;"));
        m2.addDependency(m1);
        modules.add(m1);
        modules.add(m2);
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        assertNotNull(compiler.getModuleGraph());
    }

    @Test
    public void testInitInputsByNameMapWithDuplicateExtern() {
        externs.add(JSSourceFile.fromCode("dup.js", ""));
        externs.add(JSSourceFile.fromCode("dup.js", ""));
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        inputs.add(input);
        options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.init(externs, inputs, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testInitInputsByNameMapWithDuplicateInput() {
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        inputs.add(JSSourceFile.fromCode("dup.js", "var a = 1;"));
        inputs.add(JSSourceFile.fromCode("dup.js", "var b = 2;"));
        options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.init(externs, inputs, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testCompileWithHasErrorsReturnsResult() {
        options = new CompilerOptions();
        compiler.initOptions(options);
        Result result = compiler.compile(externs, inputs, options);
        assertNotNull(result);
    }

    @Test
    public void testCompileModulesWithHasErrorsReturnsResult() {
        List<JSModule> modules = new ArrayList<>();
        options = new CompilerOptions();
        compiler.initOptions(options);
        Result result = compiler.compileModules(externs, modules, options);
        assertNotNull(result);
    }

    @Test
    public void testDisableThreadsSetsUseThreadsToFalse() {
        compiler.disableThreads();
        assertFalse(compiler.useThreads);
    }

    @Test
    public void testRunCallableWithLargeStack() {
        final Object result = new Object();
        Callable<Object> callable = new Callable<Object>() {
            public Object call() {
                return result;
            }
        };
        Object returned = Compiler.runCallableWithLargeStack(callable);
        assertSame(result, returned);
    }

    @Test(expected = RuntimeException.class)
    public void testRunCallableWithExceptionThrowsRuntimeException() {
        Callable<Object> callable = new Callable<Object>() {
            public Object call() throws Exception {
                throw new Exception("test");
            }
        };
        Compiler.runCallable(callable, false, false);
    }

    @Test
    public void testRunCallableWithoutThread() {
        final Object result = new Object();
        Callable<Object> callable = new Callable<Object>() {
            public Object call() {
                return result;
            }
        };
        Object returned = Compiler.runCallable(callable, false, false);
        assertSame(result, returned);
    }

    @Test
    public void testGetUniqueNameIdSupplier() {
        Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
        assertEquals("0", supplier.get());
        assertEquals("1", supplier.get());
        assertEquals("2", supplier.get());
    }

    @Test
    public void testResetUniqueNameId() {
        compiler.nextUniqueNameId();
        compiler.resetUniqueNameId();
        assertEquals(0, compiler.uniqueNameId);
    }

    @Test
    public void testAreNodesEqualForInliningWithoutAmbiguate() {
        options.ambiguateProperties = false;
        options.disambiguateProperties = false;
        Node n1 = Node.newString("a");
        Node n2 = Node.newString("a");
        assertTrue(compiler.areNodesEqualForInlining(n1, n2));
    }

    @Test
    public void testAreNodesEqualForInliningWithAmbiguate() {
        options.ambiguateProperties = true;
        Node n1 = Node.newString("a");
        Node n2 = Node.newString("a");
        assertTrue(compiler.areNodesEqualForInlining(n1, n2));
    }

    @Test
    public void testRemoveInputNotFoundDoesNothing() {
        compiler.removeInput("nonexistent");
        // no exception expected
    }

    @Test
    public void testNewExternInputThrowsOnDuplicate() {
        JSSourceFile sf = JSSourceFile.fromCode("test.js", "");
        inputs.add(sf);
        List<JSModule> modules = new ArrayList<>();
        JSModule m = new JSModule("m");
        m.add(sf);
        modules.add(m);
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        try {
            compiler.newExternInput("test.js");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetInputReturnsNullForUnknown() {
        assertNull(compiler.getInput("unknown"));
    }

    @Test
    public void testGetSourceLineWithInvalidLineNumber() {
        assertNull(compiler.getSourceLine("test", 0));
    }

    @Test
    public void testGetSourceLineWithUnknownSource() {
        assertNull(compiler.getSourceLine("unknown", 1));
    }

    @Test
    public void testGetSourceRegionWithInvalidLineNumber() {
        assertNull(compiler.getSourceRegion("test", 0));
    }

    @Test
    public void testGetSourceRegionWithUnknownSource() {
        assertNull(compiler.getSourceRegion("unknown", 1));
    }

    @Test
    public void testGetNodeForCodeInsertionNullModuleThrowsWhenNoInputs() {
        try {
            compiler.getNodeForCodeInsertion(null);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testGetNodeForCodeInsertionWithModuleWithoutInputs() {
        JSModule module = new JSModule("empty");
        try {
            compiler.getNodeForCodeInsertion(module);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testHasRegExpGlobalReferencesDefault() {
        assertTrue(compiler.hasRegExpGlobalReferences());
    }

    @Test
    public void testSetHasRegExpGlobalReferences() {
        compiler.setHasRegExpGlobalReferences(false);
        assertFalse(compiler.hasRegExpGlobalReferences());
    }

    @Test
    public void testInitBasedOnOptionsWithSourceMap() {
        options.sourceMapOutputPath = "map";
        options.sourceMapFormat = SourceMap.Format.DEFAULT;
        compiler.initOptions(options);
        compiler.initBasedOnOptions();
        assertNotNull(compiler.getSourceMap());
    }

    @Test
    public void testInitBasedOnOptionsWithoutSourceMap() {
        options.sourceMapOutputPath = null;
        compiler.initOptions(options);
        compiler.initBasedOnOptions();
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testGetCodingConventionReturnsDefaultWhenOptionsNull() {
        compiler.options = null;
        CodingConvention convention = compiler.getCodingConvention();
        assertNotNull(convention);
    }

    @Test
    public void testGetCodingConventionReturnsFromOptions() {
        options.codingConvention = new GoogleCodingConvention();
        compiler.options = options;
        assertSame(options.codingConvention, compiler.getCodingConvention());
    }

    @Test
    public void testIsIdeMode() {
        options.ideMode = true;
        compiler.options = options;
        assertTrue(compiler.isIdeMode());
    }

    @Test
    public void testAcceptEcmaScript5WithES5() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.options = options;
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testAcceptEcmaScript5WithES3() {
        options.setLanguageIn(LanguageMode.ECMASCRIPT3);
        compiler.options = options;
        assertFalse(compiler.acceptEcmaScript5());
    }

    @Test
    public void testAcceptConstKeyword() {
        options.acceptConstKeyword = true;
        compiler.options = options;
        assertTrue(compiler.acceptConstKeyword());
    }

    @Test
    public void testIsTypeCheckingEnabled() {
        options.checkTypes = true;
        compiler.options = options;
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testGetErrorCountWithNoErrors() {
        ErrorManager em = new LoggerErrorManager(null, null);
        compiler.setErrorManager(em);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testHasHaltingErrorsFalseInIdeMode() {
        options.ideMode = true;
        compiler.options = options;
        assertFalse(compiler.hasHaltingErrors());
    }

    @Test
    public void testHasHaltingErrorsTrueWithErrors() {
        ErrorManager em = new LoggerErrorManager(null, null);
        compiler.setErrorManager(em);
        em.report(CheckLevel.ERROR, JSError.make("test", 1, "test error"));
        assertTrue(compiler.hasHaltingErrors());
    }

    @Test
    public void testGetAstDotGraphWithNullJsRoot() throws IOException {
        compiler.jsRoot = null;
        assertEquals("", compiler.getAstDotGraph());
    }

    @Test
    public void testGetStateAndSetStateRoundTrip() {
        List<JSModule> modules = new ArrayList<>();
        JSModule m = new JSModule("m");
        m.add(JSSourceFile.fromCode("a.js", "var a = 1;"));
        modules.add(m);
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        Compiler.IntermediateState state = compiler.getState();
        Compiler newCompiler = new Compiler();
        newCompiler.setState(state);
        assertNotNull(newCompiler.getInput("a.js"));
    }

    @Test
    public void testParseSyntheticCodeAddsInput() {
        Node n = compiler.parseSyntheticCode("var x = 1;");
        assertNotNull(n);
        assertNotNull(compiler.getInput(" [synthetic] "));
    }

    @Test
    public void testParseSyntheticCodeWithFileName() {
        compiler.initCompilerOptionsIfTesting();
        Node n = compiler.parseSyntheticCode("test.js", "var y = 2;");
        assertNotNull(n);
    }

    @Test
    public void testParseTestCodeCreatesInputsByName() {
        compiler.initCompilerOptionsIfTesting();
        Node n = compiler.parseTestCode("var z = 3;");
        assertNotNull(n);
        assertNotNull(compiler.getInput(" [testcode] "));
    }

    @Test
    public void testGetDefaultErrorReporter() {
        assertNotNull(compiler.getDefaultErrorReporter());
    }

    @Test
    public void testCodeBuilderAppendIncrementsLineCount() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("line1\nline2\nline3");
        assertEquals(2, cb.getLineIndex());
    }

    @Test
    public void testCodeBuilderAppendNoNewlineUpdatesColumn() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("hello");
        assertEquals(5, cb.getColumnIndex());
    }

    @Test
    public void testCodeBuilderReset() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("test");
        assertTrue(cb.getLength() > 0);
        cb.reset();
        assertEquals(0, cb.getLength());
    }

    @Test
    public void testCodeBuilderEndsWith() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("hello world");
        assertTrue(cb.endsWith("world"));
        assertFalse(cb.endsWith("hello"));
    }

    @Test
    public void testSetPassConfigThrowsWhenAlreadySet() {
        compiler.setPassConfig(new DefaultPassConfig(options));
        try {
            compiler.setPassConfig(new DefaultPassConfig(options));
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testSetPassConfigReplacesPasses() {
        PassConfig pc = new DefaultPassConfig(options);
        compiler.setPassConfig(pc);
        assertSame(pc, compiler.getPassConfig());
    }

    @Test
    public void testThrowInternalErrorCreatesRuntimeException() {
        try {
            compiler.throwInternalError("test message", new Exception("cause"));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("INTERNAL COMPILER ERROR"));
        }
    }

    @Test
    public void testUpdateGlobalVarReferencesWithNullMap() {
        Map<Scope.Var, ReferenceCollectingCallback.ReferenceCollection> refMapPatch = new HashMap<>();
        Node collectionRoot = new Node(Token.SCRIPT);
        compiler.updateGlobalVarReferences(refMapPatch, collectionRoot);
        assertNotNull(compiler.getGlobalVarReferences());
    }

    @Test
    public void testReportWithWarningsGuardChangesLevel() {
        options = new CompilerOptions();
        compiler.initOptions(options);
        JSError error = JSError.make("test", 1, "test", CheckLevel.WARNING);
        compiler.report(error);
        assertTrue(compiler.getWarningCount() > 0 || compiler.getErrorCount() > 0);
    }

    @Test
    public void testProcessDefines() {
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        inputs.add(JSSourceFile.fromCode("input.js", "var a = 1;"));
        options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.init(externs, inputs, options);
        compiler.processDefines();
        // no exception expected
    }

    @Test
    public void testIsInliningForbiddenHeuristic() {
        options.propertyRenaming = PropertyRenamingPolicy.HEURISTIC;
        assertTrue(compiler.isInliningForbidden());
    }

    @Test
    public void testIsInliningForbiddenOff() {
        options.propertyRenaming = PropertyRenamingPolicy.OFF;
        assertFalse(compiler.isInliningForbidden());
    }

    @Test
    public void testGetFunctionalInformationMapDefaultNull() {
        assertNull(compiler.getFunctionalInformationMap());
    }

    @Test
    public void testGetVariableMap() {
        assertNotNull(compiler.getVariableMap());
    }

    @Test
    public void testGetPropertyMap() {
        assertNotNull(compiler.getPropertyMap());
    }

    @Test
    public void testGetOptions() {
        compiler.options = options;
        assertSame(options, compiler.getOptions());
    }

    @Test
    public void testSetLoggingLevel() {
        Compiler.setLoggingLevel(Level.OFF);
        // no exception expected
    }

    @Test
    public void testGetErrorManagerWhenOptionsNull() {
        assertNotNull(compiler.getErrorManager());
    }
}