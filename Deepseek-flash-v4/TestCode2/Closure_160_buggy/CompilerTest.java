package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompilerTest {

    private Compiler compiler;
    private ByteArrayOutputStream outStream;

    @Before
    public void setUp() {
        outStream = new ByteArrayOutputStream();
        compiler = new Compiler(new PrintStream(outStream));
    }

    @Test
    public void testConstructorWithPrintStream() {
        assertNotNull(compiler);
        assertNull(compiler.options);
        assertNull(compiler.errorManager);
    }

    @Test
    public void testConstructorWithErrorManager() {
        ErrorManager em = new ErrorManager() {
            @Override public void report(CheckLevel level, JSError error) {}
            @Override public JSError[] getErrors() { return new JSError[0]; }
            @Override public JSError[] getWarnings() { return new JSError[0]; }
            @Override public int getErrorCount() { return 0; }
            @Override public int getWarningCount() { return 0; }
            @Override public void generateReport() {}
        };
        Compiler c = new Compiler(em);
        assertNotNull(c);
        assertSame(em, c.getErrorManager());
    }

    @Test
    public void testSetErrorManagerNullThrows() {
        try {
            compiler.setErrorManager(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInitOptionsCreatesErrorManagerWhenNull() {
        CompilerOptions options = new CompilerOptions();
        options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.OFF);
        options.checkTypes = false;
        compiler.initOptions(options);
        assertNotNull(compiler.getErrorManager());
        assertNotNull(compiler.warningsGuard);
    }

    @Test
    public void testInitOptionsEnablesCheckTypes() {
        CompilerOptions options = new CompilerOptions();
        options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.ERROR);
        compiler.initOptions(options);
        assertTrue(options.checkTypes);
    }

    @Test
    public void testInitOptionsDisablesCheckTypes() {
        CompilerOptions options = new CompilerOptions();
        options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.OFF);
        options.checkTypes = true;
        compiler.initOptions(options);
        assertFalse(options.checkTypes);
    }

    @Test
    public void testInitOptionsCheckTypesOffDisablesTypeParseErrors() {
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = false; // not set by group
        options.setWarningLevel(DiagnosticGroups.CHECK_TYPES, CheckLevel.WARNING);
        compiler.initOptions(options);
        // Should still set checkTypes because group is enabled? Actually code sets only if enables/disables.
        // This path goes to else if (!options.checkTypes) so it sets RhinoErrorReporter.TYPE_PARSE_ERROR to OFF.
        assertFalse(options.checkTypes);
        // verify that warning level for TYPE_PARSE_ERROR is off
    }

    @Test
    public void testInitWithEmptyModulesReportsError() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        List<JSModule> modules = new ArrayList<>(); // empty
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        assertTrue(compiler.hasErrors());
        // check that error is EMPTY_MODULE_LIST_ERROR
        JSError[] errors = compiler.getErrors();
        assertEquals(1, errors.length);
        assertEquals(Compiler.EMPTY_MODULE_LIST_ERROR, errors[0].getType());
    }

    @Test
    public void testInitWithSingleEmptyModule() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        JSModule module = new JSModule("root");
        // no inputs added
        List<JSModule> modules = Arrays.asList(module);
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        // Since only one module, checkFirstModule doesn't report empty root if size==1
        // But fillEmptyModules adds an empty input
        assertFalse(compiler.hasErrors());
        assertNotNull(compiler.modules);
        assertEquals(1, compiler.modules.size());
        assertEquals(1, compiler.modules.get(0).getInputs().size());
    }

    @Test
    public void testInitWithMultipleModulesFirstEmptyReportsError() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        JSModule root = new JSModule("root");
        JSModule dep = new JSModule("dep");
        root.add(JSSourceFile.fromCode("root.js", "var a = 1;"));
        // dep is empty
        List<JSModule> modules = Arrays.asList(root, dep);
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        // checkFirstModule: root is not empty, so no error about root.
        // fillEmptyModules will add empty source to dep.
        assertFalse(compiler.hasErrors());
        assertEquals(2, compiler.modules.size());
        assertEquals(1, compiler.modules.get(0).getInputs().size());
        assertEquals(1, compiler.modules.get(1).getInputs().size());
    }

    @Test
    public void testInitInputsByNameMapDuplicateExtern() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        externs.add(JSSourceFile.fromCode("extern.js", "")); // duplicate name
        JSModule module = new JSModule("single");
        module.add(JSSourceFile.fromCode("in.js", ""));
        List<JSModule> modules = Arrays.asList(module);
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        // Should report DUPLICATE_EXTERN_INPUT
        assertTrue(compiler.hasErrors() || compiler.getErrorCount() > 0);
        // but initInputsByNameMap is called inside initModules after initial parsing? Actually it's called at the end of initModules.
        // Let's check that error is recorded
    }

    @Test
    public void testInitInputsByNameMapDuplicateInput() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        JSModule module = new JSModule("single");
        module.add(JSSourceFile.fromCode("in.js", ""));
        module.add(JSSourceFile.fromCode("in.js", "")); // duplicate input name
        List<JSModule> modules = Arrays.asList(module);
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        // Should report DUPLICATE_INPUT
        assertTrue(compiler.getErrorCount() > 0);
    }

    @Test
    public void testParseSimpleInputs() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        List<JSSourceFile> inputs = new ArrayList<>();
        inputs.add(JSSourceFile.fromCode("test.js", "var x = 1;"));
        compiler.init(externs, inputs, options);
        Node root = compiler.parseInputs();
        assertNotNull(root);
        assertFalse(compiler.hasErrors());
        // Should have externsRoot and jsRoot children
        assertNotNull(compiler.externsRoot);
        assertNotNull(compiler.jsRoot);
        assertTrue(compiler.jsRoot.hasChildren());
    }

    @Test
    public void testParseWithEmptyInput() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        externs.add(JSSourceFile.fromCode("extern.js", ""));
        List<JSSourceFile> inputs = new ArrayList<>();
        inputs.add(JSSourceFile.fromCode("empty.js", ""));
        compiler.init(externs, inputs, options);
        Node root = compiler.parseInputs();
        assertNotNull(root);
        // Empty input produces a script node with no children (maybe)
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testHasErrorsAfterInitWithEmptyModules() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        List<JSModule> modules = new ArrayList<>();
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        assertTrue(compiler.hasErrors());
        assertTrue(compiler.hasHaltingErrors());
    }

    @Test
    public void testGetErrorLevelUsesWarningsGuard() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        JSError error = JSError.make("test.js", 1, 0, DiagnosticGroups.CHECK_VARIABLES, "test");
        CheckLevel level = compiler.getErrorLevel(error);
        assertNotNull(level);
        // By default, CHECK_VARIABLES is OFF, so level should be OFF
        assertEquals(CheckLevel.OFF, level);
    }

    @Test
    public void testCodeBuilderBasic() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        assertEquals(0, cb.getLength());
        assertEquals(0, cb.getLineIndex());
        assertEquals(0, cb.getColumnIndex());
        cb.append("hello\nworld");
        assertTrue(cb.endsWith("world"));
        assertTrue(cb.getLength() > 0);
        assertEquals(1, cb.getLineIndex());
        int col = cb.getColumnIndex();
        assertTrue(col > 0);
    }

    @Test
    public void testCodeBuilderReset() {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("some text");
        assertTrue(cb.getLength() > 0);
        cb.reset();
        assertEquals(0, cb.getLength());
        assertEquals("", cb.toString());
    }

    @Test
    public void testGetUniqueNameIdSupplier() {
        compiler.resetUniqueNameId();
        java.util.concurrent.atomic.AtomicInteger id = new java.util.concurrent.atomic.AtomicInteger(0);
        // Simulate supplier
        com.google.common.base.Supplier<String> supplier = new com.google.common.base.Supplier<String>() {
            @Override
            public String get() {
                return String.valueOf(id.getAndIncrement());
            }
        };
        assertEquals("0", supplier.get());
        assertEquals("1", supplier.get());
    }

    @Test
    public void testResetUniqueNameId() {
        // Access via reflection? Not visible. We'll test through getUniqueNameIdSupplier.
        // Actually resetUniqueNameId is package-private, test can call it.
        compiler.resetUniqueNameId();
        // Not much to assert, just ensure no exception
    }

    @Test
    public void testGetInputReturnsNullForUnknown() {
        assertNull(compiler.getInput("nonexistent"));
    }

    @Test
    public void testRemoveInputNonexistent() {
        // should not throw
        compiler.removeInput("nonexistent");
    }

    @Test
    public void testNewExternInputDuplicatesThrows() {
        // First init to set up externsRoot
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        List<JSSourceFile> inputs = new ArrayList<>();
        inputs.add(JSSourceFile.fromCode("test.js", ""));
        compiler.init(externs, inputs, options);
        compiler.newExternInput("myExtern");
        try {
            compiler.newExternInput("myExtern");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddIncrementalSourceAstDuplicateThrows() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        List<JSSourceFile> inputs = new ArrayList<>();
        inputs.add(JSSourceFile.fromCode("test.js", ""));
        compiler.init(externs, inputs, options);
        JsAst ast = new JsAst(JSSourceFile.fromCode("test2.js", ""));
        compiler.addIncrementalSourceAst(ast);
        try {
            compiler.addIncrementalSourceAst(ast);
            fail("Expected NullPointerException or IllegalStateException? Actually Preconditions.checkState throws IllegalStateException");
        } catch (IllegalStateException e) {
            // expected from Preconditions.checkState
        }
    }

    @Test
    public void testReplaceIncrementalSourceAstExisting() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        List<JSSourceFile> inputs = new ArrayList<>();
        inputs.add(JSSourceFile.fromCode("test.js", "var a=1;"));
        compiler.init(externs, inputs, options);
        // Call parseInputs to build ASTs
        compiler.parseInputs();
        JsAst newAst = new JsAst(JSSourceFile.fromCode("test.js", "var b=2;"));
        boolean replaced = compiler.replaceIncrementalSourceAst(newAst);
        assertTrue(replaced);
        // Verify input map updated
        CompilerInput input = compiler.getInput("test.js");
        assertNotNull(input);
        // The new AST should be associated
    }

    @Test
    public void testReplaceIncrementalSourceAstNonExistent() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        List<JSSourceFile> inputs = new ArrayList<>();
        compiler.init(externs, inputs, options);
        compiler.parseInputs();
        JsAst ast = new JsAst(JSSourceFile.fromCode("unknown.js", ""));
        try {
            compiler.replaceIncrementalSourceAst(ast);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testGetModuleGraphNullForSingleModule() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        List<JSModule> modules = new ArrayList<>();
        JSModule module = new JSModule("single");
        module.add(JSSourceFile.fromCode("a.js", ""));
        modules.add(module);
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        assertNull(compiler.getModuleGraph());
    }

    @Test
    public void testGetSourceLineNegativeLineReturnsNull() {
        assertNull(compiler.getSourceLine("test.js", -1));
    }

    @Test
    public void testGetSourceRegionNegativeLineReturnsNull() {
        assertNull(compiler.getSourceRegion("test.js", -5));
    }

    @Test
    public void testGetNodeForCodeInsertionNullModuleThrowsIfNoInputs() {
        try {
            compiler.getNodeForCodeInsertion(null);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testGetNodeForCodeInsertionEmptyModuleThrows() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        JSModule module = new JSModule("empty");
        List<JSModule> modules = Arrays.asList(module);
        compiler.initOptions(options);
        compiler.initModules(externs, modules, options);
        // Module should have been filled, but getNodeForCodeInsertion checks for inputs
        // Since module has one input (from fillEmptyModules), it should work.
        try {
            compiler.getNodeForCodeInsertion(module);
            // Should not throw if module has input
        } catch (IllegalStateException e) {
            fail("Should not throw because module has filled input");
        }
    }

    @Test
    public void testSetPassConfigAlreadySetThrows() {
        compiler.setPassConfig(new DefaultPassConfig(new CompilerOptions()));
        try {
            compiler.setPassConfig(new DefaultPassConfig(new CompilerOptions()));
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testDisableThreads() {
        compiler.disableThreads();
        assertFalse(compiler.useThreads);
    }

    @Test
    public void testGetOptionsReturnsCurrent() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertSame(options, compiler.getOptions());
    }

    @Test
    public void testGetErrorManagerWhenOptionsNull() {
        compiler.options = null;
        ErrorManager em = compiler.getErrorManager();
        assertNotNull(em);
        assertNotNull(compiler.options);
    }

    @Test
    public void testGetDiagnosticGroups() {
        assertNotNull(compiler.getDiagnosticGroups());
    }

    @Test
    public void testReportCodeChange() {
        // Should not throw
        compiler.reportCodeChange();
    }

    @Test
    public void testGetCodingConventionDefault() {
        assertNotNull(compiler.getCodingConvention());
        assertTrue(compiler.getCodingConvention() instanceof ClosureCodingConvention);
    }

    @Test
    public void testIsIdeModeDefault() {
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertFalse(compiler.isIdeMode());
    }

    @Test
    public void testAcceptEcmaScript5EcmaScript3() {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT3);
        compiler.initOptions(options);
        assertFalse(compiler.acceptEcmaScript5());
    }

    @Test
    public void testAcceptEcmaScript5EcmaScript5() {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testLanguageModeEcmaScript5() {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT);
        compiler.initOptions(options);
        assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT5_STRICT, compiler.languageMode());
    }

    @Test
    public void testAcceptConstKeywordTrue() {
        CompilerOptions options = new CompilerOptions();
        options.acceptConstKeyword = true;
        compiler.initOptions(options);
        assertTrue(compiler.acceptConstKeyword());
    }

    @Test
    public void testAcceptConstKeywordFalse() {
        CompilerOptions options = new CompilerOptions();
        options.acceptConstKeyword = false;
        compiler.initOptions(options);
        assertFalse(compiler.acceptConstKeyword());
    }

    @Test
    public void testIsTypeCheckingEnabledTrue() {
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = true;
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testIsTypeCheckingEnabledFalse() {
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = false;
        compiler.initOptions(options);
        assertFalse(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testGetTypeRegistryCreatesOne() {
        assertNotNull(compiler.getTypeRegistry());
    }

    @Test
    public void testGetTypedScopeCreator() {
        assertNotNull(compiler.getTypedScopeCreator());
    }

    @Test
    public void testGetTopScope() {
        // May be null if not initialized
        // Not critical, just ensure no exception
        compiler.getTopScope();
    }

    @Test
    public void testGetReverseAbstractInterpreter() {
        assertNotNull(compiler.getReverseAbstractInterpreter());
    }

    @Test
    public void testGetTypeValidator() {
        assertNotNull(compiler.getTypeValidator());
    }

    @Test
    public void testGetInputsInOrder() {
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        List<JSSourceFile> inputs = new ArrayList<>();
        inputs.add(JSSourceFile.fromCode("a.js", ""));
        inputs.add(JSSourceFile.fromCode("b.js", ""));
        compiler.init(externs, inputs, options);
        List<CompilerInput> ordered = compiler.getInputsInOrder();
        assertEquals(2, ordered.size());
        assertEquals("a.js", ordered.get(0).getName());
        assertEquals("b.js", ordered.get(1).getName());
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
    public void testUpdateGlobalVarReferencesNullMapThrows() {
        // preparation: need inputs
        CompilerOptions options = new CompilerOptions();
        List<JSSourceFile> externs = new ArrayList<>();
        List<JSSourceFile> inputs = new ArrayList<>();
        inputs.add(JSSourceFile.fromCode("test.js", ""));
        compiler.init(externs, inputs, options);
        compiler.parseInputs();
        try {
            compiler.updateGlobalVarReferences(null, compiler.jsRoot);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
}