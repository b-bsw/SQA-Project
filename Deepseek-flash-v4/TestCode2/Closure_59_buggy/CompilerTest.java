package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.Compiler.CodeBuilder;
import com.google.javascript.rhino.Node;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CompilerTest {

  private Compiler compiler;
  private ByteArrayOutputStream outContent;
  private PrintStream testStream;

  @Before
  public void setUp() {
    outContent = new ByteArrayOutputStream();
    testStream = new PrintStream(outContent);
    compiler = new Compiler(testStream);
  }

  @After
  public void tearDown() {
    testStream.close();
  }

  // ----------------------------------------------------------------
  // Constructor tests
  // ----------------------------------------------------------------

  @Test
  public void testDefaultConstructor() {
    Compiler c = new Compiler();
    assertNotNull(c);
  }

  @Test
  public void testConstructorWithPrintStream() {
    Compiler c = new Compiler(System.out);
    assertNotNull(c);
  }

  @Test
  public void testConstructorWithErrorManager() {
    ErrorManager em = new LoggerErrorManager(null, null);
    Compiler c = new Compiler(em);
    assertNotNull(c);
  }

  // ----------------------------------------------------------------
  // setErrorManager - null argument should throw NPE
  // ----------------------------------------------------------------

  @Test(expected = NullPointerException.class)
  public void testSetErrorManagerNullThrows() {
    compiler.setErrorManager(null);
  }

  // ----------------------------------------------------------------
  // initOptions - ensures options stored and errorManager set when null
  // ----------------------------------------------------------------

  @Test
  public void testInitOptionsSetsErrorManagerWhenNull() {
    CompilerOptions options = new CompilerOptions();
    assertNull(compiler.options);
    assertNull(compiler.errorManager);
    compiler.initOptions(options);
    assertNotNull(compiler.options);
    assertNotNull(compiler.errorManager);
    assertEquals(options, compiler.options);
  }

  @Test
  public void testInitOptionsPreservesGivenErrorManager() {
    ErrorManager em = new LoggerErrorManager(null, null);
    Compiler c = new Compiler(em);
    CompilerOptions options = new CompilerOptions();
    c.initOptions(options);
    assertSame(em, c.errorManager);
  }

  // ----------------------------------------------------------------
  // init (with lists) - basic flow, empty modules, single module
  // ----------------------------------------------------------------

  @Test
  public void testInitWithEmptyInputs() {
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = new ArrayList<>();
    List<JSSourceFile> inputs = new ArrayList<>();
    compiler.init(externs, inputs, options);
    assertNotNull(compiler.inputs);
    assertTrue(compiler.inputs.isEmpty());
    assertNotNull(compiler.externs);
    assertTrue(compiler.externs.isEmpty());
  }

  @Test
  public void testInitWithSingleInput() {
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = new ArrayList<>();
    List<JSSourceFile> inputs = Arrays.asList(JSSourceFile.fromCode("test.js", "var a = 1;"));
    compiler.init(externs, inputs, options);
    assertEquals(1, compiler.inputs.size());
    assertEquals("test.js", compiler.inputs.get(0).getName());
  }

  // ----------------------------------------------------------------
  // initModules - test empty module list (should report error)
  // ----------------------------------------------------------------

  @Test
  public void testInitModulesEmptyModuleList() {
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = new ArrayList<>();
    List<JSModule> modules = new ArrayList<>();
    compiler.initModules(externs, modules, options);
    // Should have reported EMPTY_MODULE_LIST_ERROR
    assertTrue(compiler.hasErrors());
  }

  @Test
  public void testInitModulesRootModuleEmptyWithMultipleModules() {
    CompilerOptions options = new CompilerOptions();
    List<JSSourceFile> externs = new ArrayList<>();
    JSModule root = new JSModule("root");
    JSModule child = new JSModule("child");
    child.add(JSSourceFile.fromCode("child.js", "var b = 2;"));
    List<JSModule> modules = Arrays.asList(root, child);
    compiler.initModules(externs, modules, options);
    // Root empty but multiple modules -> EMPTY_ROOT_MODULE_ERROR
    assertTrue(compiler.hasErrors());
  }

  // ----------------------------------------------------------------
  // getInput / inputsByName - after init
  // ----------------------------------------------------------------

  @Test
  public void testGetInputReturnsCorrect() {
    CompilerOptions options = new CompilerOptions();
    JSSourceFile inputFile = JSSourceFile.fromCode("foo.js", "var x = 1;");
    compiler.init(new ArrayList<JSSourceFile>(), Arrays.asList(inputFile), options);
    CompilerInput retrieved = compiler.getInput("foo.js");
    assertNotNull(retrieved);
    assertEquals("foo.js", retrieved.getName());
  }

  @Test
  public void testGetInputReturnsNullForMissing() {
    assertNull(compiler.getInput("nonexistent.js"));
  }

  // ----------------------------------------------------------------
  // resetUniqueNameId and getUniqueNameIdSupplier
  // ----------------------------------------------------------------

  @Test
  public void testResetUniqueNameId() {
    compiler.resetUniqueNameId();
    assertEquals(0, compiler.uniqueNameId);
    // simulate usage
    compiler.getUniqueNameIdSupplier().get();
    assertEquals(1, compiler.uniqueNameId);
    compiler.resetUniqueNameId();
    assertEquals(0, compiler.uniqueNameId);
  }

  @Test
  public void testGetUniqueNameIdSupplier() {
    compiler.resetUniqueNameId();
    com.google.common.base.Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
    assertEquals("0", supplier.get());
    assertEquals("1", supplier.get());
    assertEquals("2", supplier.get());
  }

  // ----------------------------------------------------------------
  // hasErrors / getErrors / getWarnings
  // ----------------------------------------------------------------

  @Test
  public void testHasErrorsAfterInitError() {
    CompilerOptions options = new CompilerOptions();
    compiler.init(new ArrayList<JSSourceFile>(), new ArrayList<JSSourceFile>(), options);
    // no error yet
    assertFalse(compiler.hasErrors());
    // Force error by calling compile on empty
    // But compile calls init again which may set errors. Instead we can manually report.
    // We'll test via initModules empty module list which reports error.
    List<JSModule> emptyModules = new ArrayList<>();
    compiler.initModules(new ArrayList<JSSourceFile>(), emptyModules, options);
    assertTrue(compiler.hasErrors());
    assertTrue(compiler.getErrors().length > 0);
  }

  @Test
  public void testGetWarningsEmpty() {
    // No warnings initially
    assertEquals(0, compiler.getErrors().length);
    assertEquals(0, compiler.getWarnings().length);
  }

  // ----------------------------------------------------------------
  // parse method - basic parse of simple code
  // ----------------------------------------------------------------

  @Test
  public void testParseSimpleCode() {
    JSSourceFile file = JSSourceFile.fromCode("simple.js", "var a = 1;");
    Node root = compiler.parse(file);
    assertNotNull(root);
    assertTrue(root.isScript());
  }

  // ----------------------------------------------------------------
  // CodeBuilder inner class - basic operations
  // ----------------------------------------------------------------

  @Test
  public void testCodeBuilderAppendAndReset() {
    CodeBuilder cb = new CodeBuilder();
    assertEquals(0, cb.getLength());
    cb.append("hello");
    assertEquals("hello", cb.toString());
    assertEquals(5, cb.getLength());
    cb.append("\nworld");
    assertTrue(cb.endsWith("world"));
    cb.reset();
    assertEquals(0, cb.getLength());
    assertEquals("", cb.toString());
  }

  @Test
  public void testCodeBuilderNewlineTracking() {
    CodeBuilder cb = new CodeBuilder();
    cb.append("line1\nline2\nline3");
    assertEquals(3, cb.getLineIndex() + 1); // line index is zero-based
    assertEquals(5, cb.getColumnIndex());   // "line3" length
  }

  // ----------------------------------------------------------------
  // getState / setState - round trip test
  // ----------------------------------------------------------------

  @Test
  public void testStateRoundTrip() {
    // Initialize minimal state
    CompilerOptions options = new CompilerOptions();
    compiler.init(new ArrayList<JSSourceFile>(), new ArrayList<JSSourceFile>(), options);
    // Set something non-null in options for coverage
    options.setIdeMode(true);
    Compiler.IntermediateState state = compiler.getState();
    assertNotNull(state);
    // Create a new compiler and set state
    Compiler restored = new Compiler();
    restored.setState(state);
    assertEquals(restored.getOptions().ideMode, true);
  }

  // ----------------------------------------------------------------
  // removeExternInput - edge cases
  // ----------------------------------------------------------------

  @Test
  public void testRemoveExternInputNonExistent() {
    // Should not throw
    compiler.removeExternInput("nonexistent");
    // No exception = pass
  }

  @Test
  public void testRemoveExternInputRemovesFromMap() {
    CompilerOptions options = new CompilerOptions();
    JSSourceFile externFile = JSSourceFile.fromCode("ext.js", "var ext = 1;");
    compiler.init(Arrays.asList(externFile), new ArrayList<JSSourceFile>(), options);
    assertNotNull(compiler.getInput("ext.js"));
    compiler.removeExternInput("ext.js");
    assertNull(compiler.getInput("ext.js"));
  }

  // ----------------------------------------------------------------
  // newExternInput - duplicate name should throw
  // ----------------------------------------------------------------

  @Test(expected = IllegalArgumentException.class)
  public void testNewExternInputDuplicateNameThrows() {
    CompilerOptions options = new CompilerOptions();
    compiler.init(new ArrayList<JSSourceFile>(), new ArrayList<JSSourceFile>(), options);
    compiler.newExternInput("dup");
    compiler.newExternInput("dup"); // should throw
  }

  // ----------------------------------------------------------------
  // disableThreads
  // ----------------------------------------------------------------

  @Test
  public void testDisableThreads() {
    assertTrue(compiler.useThreads);
    compiler.disableThreads();
    assertFalse(compiler.useThreads);
  }

  // ----------------------------------------------------------------
  // Helper assertion for JUnit 4 style
  // ----------------------------------------------------------------
  private void assertFalse(boolean condition) {
    org.junit.Assert.assertFalse(condition);
  }
}