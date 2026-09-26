package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import static com.google.javascript.rhino.Token.*;

import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ScopedAliasesTest {

    private MockCompiler compiler;
    private ScopedAliases processor;
    private AliasTransformationHandler handler;

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        handler = new AliasTransformationHandler() {
            @Override
            public AliasTransformation logAliasTransformation(
                    String sourceFile, SourcePosition<AliasTransformation> position) {
                return new AliasTransformation() {
                    @Override
                    public void addAlias(String alias, String definition) {}
                    @Override
                    public Map<String, String> getAliasMap() {
                        return new java.util.HashMap<>();
                    }
                };
            }
        };
        processor = new ScopedAliases(compiler, null, handler);
    }

    @Test
    public void testNormal() {
        Node dom = IR.getprop(IR.name("goog"), "dom");
        Node aliasVar = IR.var(IR.name("dom"), dom);
        Node body = IR.block(aliasVar);
        Node fn = IR.function(IR.paramList(), body);
        Node call = IR.call(IR.getprop(IR.name("goog"), "scope"), fn);
        Node expr = IR.exprResult(call);
        Node script = IR.script(expr);
        script.setSourceFileName("test.js");
        setLineNumbers(expr, call, fn, body, aliasVar, dom, IR.name("dom"), IR.name("goog"));

        processor.process(null, script);
        assertTrue("Code should have changed", compiler.codeChanged);
        assertTrue("No errors expected", compiler.errors.isEmpty());
    }

    @Test
    public void testReturnInScope() {
        Node returnNode = new Node(RETURN);
        Node body = IR.block(returnNode);
        Node fn = IR.function(IR.paramList(), body);
        Node call = IR.call(IR.getprop(IR.name("goog"), "scope"), fn);
        Node expr = IR.exprResult(call);
        Node script = IR.script(expr);
        script.setSourceFileName("test.js");
        setLineNumbers(expr, call, fn, body, returnNode, IR.name("goog"),
                IR.getprop(IR.name("goog"), "scope"));

        processor.process(null, script);
        assertTrue(compiler.hasError);
        assertEquals(1, compiler.errors.size());
        assertEquals(ScopedAliases.GOOG_SCOPE_USES_RETURN,
                compiler.errors.get(0).getType());
    }

    @Test
    public void testThisInScope() {
        Node thisNode = new Node(THIS);
        Node exprResult = IR.exprResult(thisNode);
        Node body = IR.block(exprResult);
        Node fn = IR.function(IR.paramList(), body);
        Node call = IR.call(IR.getprop(IR.name("goog"), "scope"), fn);
        Node expr = IR.exprResult(call);
        Node script = IR.script(expr);
        script.setSourceFileName("test.js");
        setLineNumbers(expr, call, fn, body, exprResult, thisNode,
                IR.name("goog"), IR.getprop(IR.name("goog"), "scope"));

        processor.process(null, script);
        assertTrue(compiler.hasError);
        assertEquals(1, compiler.errors.size());
        assertEquals(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS,
                compiler.errors.get(0).getType());
    }

    @Test
    public void testThrowInScope() {
        Node throwNode = new Node(THROW, IR.name("e"));
        Node body = IR.block(throwNode);
        Node fn = IR.function(IR.paramList(), body);
        Node call = IR.call(IR.getprop(IR.name("goog"), "scope"), fn);
        Node expr = IR.exprResult(call);
        Node script = IR.script(expr);
        script.setSourceFileName("test.js");
        setLineNumbers(expr, call, fn, body, throwNode, IR.name("e"),
                IR.name("goog"), IR.getprop(IR.name("goog"), "scope"));

        processor.process(null, script);
        assertTrue(compiler.hasError);
        assertEquals(1, compiler.errors.size());
        assertEquals(ScopedAliases.GOOG_SCOPE_USES_THROW,
                compiler.errors.get(0).getType());
    }

    @Test
    public void testBadParameters_noParam() {
        Node call = IR.call(IR.getprop(IR.name("goog"), "scope"));
        Node expr = IR.exprResult(call);
        Node script = IR.script(expr);
        script.setSourceFileName("test.js");
        setLineNumbers(expr, call, IR.name("goog"),
                IR.getprop(IR.name("goog"), "scope"));

        processor.process(null, script);
        assertTrue(compiler.hasError);
        assertEquals(1, compiler.errors.size());
        assertEquals(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS,
                compiler.errors.get(0).getType());
    }

    @Test
    public void testBadParameters_extraParam() {
        Node fn1 = IR.function(IR.paramList(), IR.block());
        Node fn2 = IR.function(IR.paramList(), IR.block());
        Node call = IR.call(IR.getprop(IR.name("goog"), "scope"), fn1, fn2);
        Node expr = IR.exprResult(call);
        Node script = IR.script(expr);
        script.setSourceFileName("test.js");
        setLineNumbers(expr, call, fn1, fn2, IR.name("goog"),
                IR.getprop(IR.name("goog"), "scope"));

        processor.process(null, script);
        assertTrue(compiler.hasError);
        assertEquals(1, compiler.errors.size());
        assertEquals(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS,
                compiler.errors.get(0).getType());
    }

    @Test
    public void testNonAliasLocal() {
        Node constNode = IR.number(5);
        Node varNode = IR.var(IR.name("x"), constNode);
        Node body = IR.block(varNode);
        Node fn = IR.function(IR.paramList(), body);
        Node call = IR.call(IR.getprop(IR.name("goog"), "scope"), fn);
        Node expr = IR.exprResult(call);
        Node script = IR.script(expr);
        script.setSourceFileName("test.js");
        setLineNumbers(expr, call, fn, body, varNode, constNode, IR.name("x"),
                IR.name("goog"), IR.getprop(IR.name("goog"), "scope"));

        processor.process(null, script);
        assertTrue(compiler.hasError);
        assertEquals(1, compiler.errors.size());
        assertEquals(ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL,
                compiler.errors.get(0).getType());
        assertTrue(compiler.errors.get(0).getMessage().contains("x"));
    }

    @Test
    public void testAliasRedefined() {
        Node dom1 = IR.getprop(IR.name("goog"), "dom");
        Node var1 = IR.var(IR.name("dom"), dom1);
        Node dom2 = IR.getprop(IR.name("goog"), "window");
        Node var2 = IR.var(IR.name("dom"), dom2);
        Node body = IR.block(var1, var2);
        Node fn = IR.function(IR.paramList(), body);
        Node call = IR.call(IR.getprop(IR.name("goog"), "scope"), fn);
        Node expr = IR.exprResult(call);
        Node script = IR.script(expr);
        script.setSourceFileName("test.js");
        setLineNumbers(expr, call, fn, body, var1, var2, dom1, dom2,
                IR.name("dom"), IR.name("goog"),
                IR.getprop(IR.name("goog"), "scope"));

        processor.process(null, script);
        assertTrue(compiler.hasError);
        assertEquals(1, compiler.errors.size());
        assertEquals(ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED,
                compiler.errors.get(0).getType());
    }

    @Test
    public void testCycle() {
        Node aRef = IR.name("b");
        Node varA = IR.var(IR.name("a"), aRef);
        Node bRef = IR.name("a");
        Node varB = IR.var(IR.name("b"), bRef);
        Node body = IR.block(varA, varB);
        Node fn = IR.function(IR.paramList(), body);
        Node call = IR.call(IR.getprop(IR.name("goog"), "scope"), fn);
        Node expr = IR.exprResult(call);
        Node script = IR.script(expr);
        script.setSourceFileName("test.js");
        setLineNumbers(expr, call, fn, body, varA, varB, aRef, bRef,
                IR.name("a"), IR.name("b"), IR.name("goog"),
                IR.getprop(IR.name("goog"), "scope"));

        processor.process(null, script);
        assertTrue(compiler.hasError);
        assertEquals(1, compiler.errors.size());
        assertEquals(ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE,
                compiler.errors.get(0).getType());
    }

    private void setLineNumbers(Node... nodes) {
        for (Node n : nodes) {
            if (n.getLineno() == -1) {
                n.setLineno(1);
            }
            if (n.getCharno() == -1) {
                n.setCharno(0);
            }
        }
    }

    static class MockCompiler extends AbstractCompiler {
        List<JSError> errors = new ArrayList<>();
        boolean codeChanged = false;
        boolean hasError = false;
        CodingConvention convention = new DefaultCodingConvention();

        @Override
        public void report(JSError error) {
            errors.add(error);
            hasError = true;
        }

        @Override
        public void reportCodeChange() {
            codeChanged = true;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return convention;
        }

        @Override
        public void ensureLibraryInjected(String library) {
        }

        @Override
        public ErrorManager getErrorManager() {
            return new ErrorManager() {
                @Override
                public void report(CheckLevel level, JSError error) {
                }

                @Override
                public void generateReport() {
                }

                @Override
                public int getErrorCount() {
                    return errors.size();
                }

                @Override
                public int getWarningCount() {
                    return 0;
                }

                @Override
                public JSError[] getErrors() {
                    return errors.toArray(new JSError[0]);
                }

                @Override
                public JSError[] getWarnings() {
                    return new JSError[0];
                }

                @Override
                public void setTypedPercent(double p) {
                }

                @Override
                public double getTypedPercent() {
                    return 0.0;
                }
            };
        }

        @Override
        public boolean hasErrors() {
            return !errors.isEmpty();
        }

        @Override
        public ParserRunner getParser() {
            return null;
        }

        @Override
        public TypeRegistry getTypeRegistry() {
            return null;
        }

        @Override
        public String getCharset() {
            return "UTF-8";
        }

        @Override
        public Module getModule() {
            return null;
        }

        @Override
        public CompilerOptions getOptions() {
            return null;
        }

        @Override
        public Node getRoot() {
            return null;
        }

        @Override
        public Node getJsRoot() {
            return null;
        }

        @Override
        public void setCodingConvention(CodingConvention convention) {
            this.convention = convention;
        }

        @Override
        public void setErrorManager(ErrorManager errorManager) {
        }

        @Override
        public void setTypeRegistry(TypeRegistry typeRegistry) {
        }

        @Override
        public void setLifecycleStage(LifecycleStage stage) {
        }

        @Override
        public LifecycleStage getLifecycleStage() {
            return null;
        }

        @Override
        public void addInputSource(SourceFile sourceFile) {
        }

        @Override
        public void setSourceFileContent(String content) {
        }

        @Override
        public String getSourceFileContent() {
            return "";
        }

        @Override
        public InputId getInputId() {
            return null;
        }

        @Override
        public void setInputId(InputId inputId) {
        }

        @Override
        public CompilerInput getLastInput() {
            return null;
        }

        @Override
        public CompilerInput getInput(InputId id) {
            return null;
        }

        @Override
        public List<CompilerInput> getInputs() {
            return new ArrayList<>();
        }

        @Override
        public List<SourceFile> getSourceFiles() {
            return new ArrayList<>();
        }

        @Override
        public Map<String, SourceFile> getSourceFileMap() {
            return new java.util.HashMap<>();
        }

        @Override
        public void setProgressListener(ProgressListener listener) {
        }

        @Override
        public ProgressListener getProgressListener() {
            return null;
        }
    }
}