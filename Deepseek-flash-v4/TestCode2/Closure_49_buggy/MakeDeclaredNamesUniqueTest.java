package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import java.lang.reflect.Field;
import org.junit.Test;

/**
 * Unit tests for {@link MakeDeclaredNamesUnique} and its nested supporting
 * classes.
 */
public class MakeDeclaredNamesUniqueTest {

  /** Reads the unique-id separator even if the field is private. */
  private static String getUniqueIdSeparator() {
    try {
      Field field = ContextualRenamer.class.getDeclaredField("UNIQUE_ID_SEPARATOR");
      field.setAccessible(true);
      return (String) field.get(null);
    } catch (ReflectiveOperationException e) {
      throw new AssertionError(e);
    }
  }

  private static Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  @Test
  public void testArgumentsConstant() {
    assertEquals("arguments", MakeDeclaredNamesUnique.ARGUMENTS);
  }

  @Test
  public void testDefaultConstructorCanBeInstantiated() {
    assertNotNull(new MakeDeclaredNamesUnique());
  }

  @Test
  public void testCustomRenamerConstructorCanBeInstantiated() {
    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique(new ContextualRenamer());
    assertNotNull(pass);
  }

  @Test
  public void testGetContextualRenameInverterReturnsNonNullPass() {
    Compiler compiler = createCompiler();
    assertNotNull(MakeDeclaredNamesUnique.getContextualRenameInverter(compiler));
  }

  @Test
  public void testGetOriginalNameWithoutSeparator() {
    assertEquals("a", ContextualRenameInverter.getOrginalName("a"));
  }

  @Test
  public void testGetOriginalNameStripsTrailingUniqueSuffix() {
    String sep = getUniqueIdSeparator();
    assertTrue(sep.length() > 0);

    assertEquals("a", ContextualRenameInverter.getOrginalName("a" + sep + "0"));
  }

  @Test
  public void testGetOriginalNamePreservesSeparatorInsideOriginalName() {
    String sep = getUniqueIdSeparator();
    assertTrue(sep.length() > 0);

    // The unique suffix is appended to the original name.  If the original
    // name itself contains the separator, only the final suffix should be
    // stripped.
    String original = "a" + sep + "b";
    String generated = original + sep + "1";

    assertEquals(original, ContextualRenameInverter.getOrginalName(generated));
  }

  @Test
  public void testGetOriginalNameBecomesEmptyForOnlySuffix() {
    String sep = getUniqueIdSeparator();
    assertTrue(sep.length() > 0);

    assertEquals("", ContextualRenameInverter.getOrginalName(sep + "1"));
  }

  @Test
  public void testTraversesSimpleScriptWithoutException() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseSyntheticCode("var a = 1;");

    assertNotNull(root);

    try {
      NodeTraversal.traverse(compiler, root, new MakeDeclaredNamesUnique());
    } catch (RuntimeException e) {
      fail("MakeDeclaredNamesUnique traversal threw: " + e.getMessage());
    }
  }

  @Test
  public void testTraversesFunctionScopesWithoutException() {
    Compiler compiler = createCompiler();
    Node root = compiler.parseSyntheticCode(
        "function f(a) { var b = a + 1; return b; }");

    assertNotNull(root);

    try {
      NodeTraversal.traverse(compiler, root, new MakeDeclaredNamesUnique());
    } catch (RuntimeException e) {
      fail("MakeDeclaredNamesUnique traversal of function threw: " + e.getMessage());
    }
  }
}