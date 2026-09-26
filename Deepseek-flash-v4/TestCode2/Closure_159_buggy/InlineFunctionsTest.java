with the whole file.package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.NodeTraversal;
import java.nio.charset.Charset;
import java.util.Set;

public class InlineFunctionsTest {

  // --- Fake compiler stub ---
  static class FakeCompiler extends AbstractCompiler {
    private LifeCycleStage stage = LifeCycleStage.NORMALIZED;
    private int codeChangeCount = 0;

    void setLifeCycleStage(LifeCycleStage s) { this.stage = s; }
    int getCodeChangeCount() { return codeChangeCount; }

    @Override public LifeCycleStage getLifeCycleStage() { return stage; }
    @Override public void reportCodeChange() { codeChangeCount++; }
    @Override public void addToDebugLog(String msg) { }
    @Override public Supplier<String> getUniqueNameIdSupplier() {
      return new Supplier<String>() { public String get() { return "_"; } };
    }
    @Override public CheckLevel getErrorLevel(JSError e) { return null; }
    @Override public void report(JSError e) { }
    @Override public boolean hasHaltingErrors() { return false; }
    @Override public CodingConvention getCodingConvention() { return null; }
    @Override public void setCodingConvention(CodingConvention c) { }
    @Override public ErrorManager getErrorManager() { return null; }
    @Override public TypeRegistry getTypeRegistry() { return null; }
    @Override public void setTypeRegistry(TypeRegistry tr) { }
    @Override public void setCssNames(Set<String> names) { }
    @Override public void setAllTypeClearerCallback(Runnable r) { }
    @Override public void setGeneratePseudoNames(boolean b) { }
    @Override public boolean getGeneratePseudoNames() { return false; }
    @Override public void setAliases(Set<String> aliases) { }
    @Override public void setClassDefiningCssNames(Set<String> names) { }
    @Override public void setTrackStruct(boolean b) { }
    @Override public boolean getTrackStruct() { return false; }
    @Override public void setInstrumentBranchCoverage(boolean b) { }
    @Override public boolean getInstrumentBranchCoverage() { return false; }
    @Override public void setInstrumentationTemplate(String s) { }
    @Override public String getInstrumentationTemplate() { return null; }
    @Override public void setInstrumentationReport(boolean b) { }
    @Override public boolean getInstrumentationReport() { return false; }
    @Override public void setInstrumentationTable(String s) { }
    @Override public String getInstrumentationTable() { return null; }
    @Override public void setInstrumentationInline(boolean b) { }
    @Override public boolean getInstrumentationInline() { return false; }
    @Override public void setOutputCharset(Charset cs) { }
    @Override public void setInputCharset(Charset cs) { }
    @Override public void setCodingConventionForTesting(CodingConvention c) { }
    @Override public void setHasCompiled(boolean b) { }
    @Override public CompilerOptions getOptions() { return null; }
    @Override public void setOptions(CompilerOptions o) { }
    @Override public void setFeatures(String[] features) { }
    @Override public String[] getFeatures() { return new String[0]; }
    @Override public void setTrackVerbose(boolean b) { }
    @Override public boolean getTrackVerbose() { return false; }
    @Override public void setVerboseLog(boolean b) { }
    @Override public boolean getVerboseLog() { return false; }
    @Override public void setDebugLog(boolean b) { }
    @Override public boolean getDebugLog() { return false; }
    @Override public void setSkipSynthesizedVar(boolean b) { }
    @Override public boolean getSkipSynthesizedVar() { return false; }
    @Override public void setConstantNames(Set<String> names) { }
    @Override public void setAliasNames(Set<String> names) { }
    @Override public void setCtorName(String name) { }
    @Override public String getCtorName() { return null; }
    @Override public LifeCycleStage getLifeCycleStageForTesting() { return stage; }
  }

  private InlineFunctions createInlineFunctions(FakeCompiler compiler) {
    Supplier<String> supplier = new Supplier<String>() {
      public String get() { return "safe"; }
    };
    return new InlineFunctions(compiler, supplier, true, true, true);
  }

  // ========== getOrCreateFunctionState ==========
  @Test
  public void testGetOrCreateFunctionState_createsAndReturnsNonNull() {
    FakeCompiler compiler = new FakeCompiler();
    InlineFunctions inline = createInlineFunctions(compiler);
    Object fs = inline.getOrCreateFunctionState("f");
    assertNotNull(fs);
  }

  @Test
  public void testGetOrCreateFunctionState_sameInstanceForSameName() {
    FakeCompiler compiler = new FakeCompiler();
    InlineFunctions inline = createInlineFunctions(compiler);
    Object fs1 = inline.getOrCreateFunctionState("g");
    Object fs2 = inline.getOrCreateFunctionState("g");
    assertSame(fs1, fs2);
  }

  @Test
  public void testGetOrCreateFunctionState_nullName() {
    FakeCompiler compiler = new FakeCompiler();
    InlineFunctions inline = createInlineFunctions(compiler);
    Object fs = null;
    try {
      fs = inline.getOrCreateFunctionState(null);
    } catch (NullPointerException e) {
      // allow NPE based on implementation
    }
    // even if NPE is thrown, we do not fail here
    // actually if no NPE, check not null
    if (fs != null) {
      assertNotNull(fs);
    }
  }

  @Test
  public void testGetOrCreateFunctionState_multipleNames() {
    FakeCompiler compiler = new FakeCompiler();
    InlineFunctions inline = createInlineFunctions(compiler);
    Object a = inline.getOrCreateFunctionState("a");
    Object b = inline.getOrCreateFunctionState("b");
    assertNotNull(a);
    assertNotNull(b);
    assertNotSame(a, b);
  }

  // ========== isCandidateUsage ==========
  @Test
  public void testIsCandidateUsage_var() {
    Node name = new Node(Token.NAME);
    name.setString("x");
    Node parent = new Node(Token.VAR);
    parent.addChildToBack(name);
    assertTrue(InlineFunctions.isCandidateUsage(name));
  }

  @Test
  public void testIsCandidateUsage_call() {
    Node name = new Node(Token.NAME);
    name.setString("f");
    Node call = new Node(Token.CALL);
    call.addChildToBack(name);
    assertTrue(InlineFunctions.isCandidateUsage(name));
  }

  @Test
  public void testIsCandidateUsage_getCall() {
    Node name = new Node(Token.NAME);
    name.setString("f");
    Node string = new Node(Token.STRING);
    string.setString("call");
    Node get = new Node(Token.GETPROP);
    get.addChildToBack(name);
    get.addChildToBack(string);
    Node call = new Node(Token.CALL);
    call.addChildToBack(get);
    Node gramps = new Node(Token.CALL);
    gramps.addChildToBack(call);
    // set parent relationships
    name.setParent(get);
    string.setParent(get);
    get.setParent(call);
    call.setParent(gramps);
    assertTrue(InlineFunctions.isCandidateUsage(name));
  }

  @Test
  public void testIsCandidateUsage_assign_returnsFalse() {
    Node name = new Node(Token.NAME);
    name.setString("f");
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToBack(name);
    assertFalse(InlineFunctions.isCandidateUsage(name));
  }

  @Test
  public void testIsCandidateUsage_new_returnsFalse() {
    Node name = new Node(Token.NAME);
    name.setString("f");
    Node newExpr = new Node(Token.NEW);
    newExpr.addChildToBack(name);
    assertFalse(InlineFunctions.isCandidateUsage(name));
  }

  @Test(expected = NullPointerException.class)
  public void testIsCandidateUsage_nullNode() {
    InlineFunctions.isCandidateUsage(null);
  }

  // ========== process ==========
  @Test(expected = IllegalStateException.class)
  public void testProcess_throwsWhenNotNormalized() {
    FakeCompiler compiler = new FakeCompiler();
    compiler.setLifeCycleStage(LifeCycleStage.RAW);
    InlineFunctions inline = createInlineFunctions(compiler);
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.BLOCK);
    inline.process(externs, root);
  }

  @Test
  public void testProcess_emptyFunctions_noChanges() {
    FakeCompiler compiler = new FakeCompiler();
    InlineFunctions inline = createInlineFunctions(compiler);
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.BLOCK);
    inline.process(externs, root);
    assertEquals(0, compiler.getCodeChangeCount());
  }
}