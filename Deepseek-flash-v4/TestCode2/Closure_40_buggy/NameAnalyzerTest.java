package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import java.lang.reflect.Field;
import java.util.Map;
import org.junit.Test;

public class NameAnalyzerTest {

  @Test
  public void testProcessEmptySource() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node externs = compiler.parseExterns("");
    Node root = compiler.parseSyntheticCode("");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testRemoveUnreferencedVar() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node externs = compiler.parseExterns("");
    Node root = compiler.parseSyntheticCode("var unreferenced = 1;");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);

    assertFalse(root.toStringTree().contains("unreferenced"));
  }

  @Test
  public void testKeepWhenRemovalDisabled() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node externs = compiler.parseExterns("");
    Node root = compiler.parseSyntheticCode("var stillThere = 1;");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    analyzer.process(externs, root);

    assertTrue(root.toStringTree().contains("stillThere"));
  }

  @Test
  public void testExternallyDefinedWindowNotRemoved() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node externs = compiler.parseExterns("var window;");
    Node root = compiler.parseSyntheticCode("window.foo = 1;");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);

    assertTrue(root.toStringTree().contains("window"));
  }

  @Test
  public void testProcessComplexSyntax() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node externs = compiler.parseExterns("");
    Node root = compiler.parseSyntheticCode(
        "function Foo() {}"
        + "Foo.prototype.bar = function() { return this; };"
        + "for (var i = 0; i < 3; i++) {"
        + "  var obj = { key: i };"
        + "  switch (i) { case 0: obj = null; break; }"
        + "}"
        + "var f = new Foo(); f.bar();");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, root);

    assertNotNull(root);
  }

  @Test
  public void testClassDefiningCallsHaveSideEffectsDefaultFalse() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());

    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    assertFalse(analyzer.classDefiningCallsHaveSideEffects());
  }

  @Test(expected = NullPointerException.class)
  public void testProcessNullRootThrows() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node externs = compiler.parseExterns("");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(externs, null);
  }

  @Test
  public void testUnreferencedNameTracked() throws Exception {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node externs = compiler.parseExterns("");
    Node root = compiler.parseSyntheticCode("var a = 1;");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    analyzer.process(externs, root);

    Map<String, Object> names = getAllNames(analyzer);
    assertTrue("expected name 'a' in " + names.keySet(), names.containsKey("a"));
    assertFalse(isReferenced(names.get("a")));
  }

  @Test
  public void testReferencedNameTracked() throws Exception {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node externs = compiler.parseExterns("");
    Node root = compiler.parseSyntheticCode("var a = 1; var b = a;");

    NameAnalyzer analyzer = new NameAnalyzer(compiler, false);
    analyzer.process(externs, root);

    Map<String, Object> names = getAllNames(analyzer);
    assertTrue("expected name 'a' in " + names.keySet(), names.containsKey("a"));
    assertTrue(isReferenced(names.get("a")));
  }

  @SuppressWarnings("unchecked")
  private static Map<String, Object> getAllNames(NameAnalyzer analyzer)
      throws Exception {
    Field field = NameAnalyzer.class.getDeclaredField("allNames");
    field.setAccessible(true);
    return (Map<String, Object>) field.get(analyzer);
  }

  private static boolean isReferenced(Object jsName) throws Exception {
    return getBooleanField(jsName, "referenced");
  }

  private static boolean getBooleanField(Object jsName, String fieldName)
      throws Exception {
    Field field = jsName.getClass().getDeclaredField(fieldName);
    field.setAccessible(true);
    return field.getBoolean(jsName);
  }
}