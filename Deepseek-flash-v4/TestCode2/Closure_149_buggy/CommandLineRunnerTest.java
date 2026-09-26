package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class CommandLineRunnerTest {

  private ByteArrayOutputStream errBaos;
  private PrintStream errStream;

  @Before
  public void setUp() {
    errBaos = new ByteArrayOutputStream();
    errStream = new PrintStream(errBaos);
  }

  @Test
  public void testConstructorEmptyArgs() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {}, System.out, errStream);
    assertTrue("shouldRunCompiler should be true for valid empty args",
        runner.shouldRunCompiler());
  }

  @Test
  public void testConstructorInvalidArgs() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--jscomp_error"}, System.out, errStream);
    assertFalse("shouldRunCompiler should be false for invalid args",
        runner.shouldRunCompiler());
    assertTrue("Error message should contain something",
        errBaos.toString().length() > 0);
  }

  @Test
  public void testConstructorHelpFlag() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--help"}, System.out, errStream);
    assertFalse("shouldRunCompiler should be false for --help",
        runner.shouldRunCompiler());
    assertTrue("Usage should be printed",
        errBaos.toString().contains("Usage"));
  }

  @Test
  public void testBooleanFlagInvalidValue() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--print_tree", "invalid"},
            System.out, errStream);
    assertFalse("shouldRunCompiler should be false for invalid boolean value",
        runner.shouldRunCompiler());
    assertTrue("Error message should mention illegal boolean",
        errBaos.toString().contains("Illegal boolean value"));
  }

  @Test
  public void testShouldRunCompilerWhenConfigValid() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {}, System.out, errStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testCreateCompiler() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {}, System.out, errStream);
    assertNotNull("createCompiler should not return null",
        runner.createCompiler());
  }

  @Test
  public void testCreateOptionsDefault() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {}, System.out, errStream);
    CompilerOptions options = runner.createOptions();
    assertNotNull("Options should not be null", options);
    assertFalse("Default prettyPrint should be false", options.prettyPrint);
    assertFalse("Default printInputDelimiter should be false",
        options.printInputDelimiter);
    assertTrue("Default closurePass should be true", options.closurePass);
  }

  @Test
  public void testCreateOptionsWithDebugAndFormatting() {
    CommandLineRunner runner =
        new CommandLineRunner(
            new String[] {
              "--debug",
              "--formatting", "PRETTY_PRINT",
              "--formatting", "PRINT_INPUT_DELIMITER"
            },
            System.out, errStream);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
    assertTrue("prettyPrint should be true", options.prettyPrint);
    assertTrue("printInputDelimiter should be true",
        options.printInputDelimiter);
  }

  @Test
  public void testCreateExternsDefault() throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {}, System.out, errStream);
    List<JSSourceFile> externs = runner.createExterns();
    assertEquals("Default externs should contain 22 files",
        22, externs.size());
  }

  @Test
  public void testCreateExternsOnlyCustom() throws Exception {
    CommandLineRunner runner =
        new CommandLineRunner(
            new String[] {"--use_only_custom_externs", "true"},
            System.out, errStream);
    List<JSSourceFile> externs = runner.createExterns();
    assertTrue("Externs should be empty when only custom externs and none provided",
        externs.isEmpty());
  }

  @Test
  public void testBooleanOptionHandlerTrue() {
    for (String trueVal : new String[] {"true", "on", "yes", "1"}) {
      errBaos.reset();
      CommandLineRunner runner =
          new CommandLineRunner(
              new String[] {"--print_tree", trueVal}, System.out, errStream);
      assertTrue("shouldRunCompiler should be true for valid boolean",
          runner.shouldRunCompiler());
    }
  }

  @Test
  public void testBooleanOptionHandlerFalse() {
    for (String falseVal : new String[] {"false", "off", "no", "0"}) {
      errBaos.reset();
      CommandLineRunner runner =
          new CommandLineRunner(
              new String[] {"--print_tree", falseVal}, System.out, errStream);
      assertTrue("shouldRunCompiler should be true for valid boolean",
          runner.shouldRunCompiler());
    }
  }

  @Test
  public void testBooleanOptionHandlerNoValue() {
    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--print_tree"}, System.out, errStream);
    assertTrue("shouldRunCompiler should be true for boolean flag without value",
        runner.shouldRunCompiler());
  }

  @Test
  public void testMultipleJsFiles() {
    CommandLineRunner runner =
        new CommandLineRunner(
            new String[] {"--js", "a.js", "--js", "b.js"},
            System.out, errStream);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testCompilationAndWarningLevel() {
    CommandLineRunner runner =
        new CommandLineRunner(
            new String[] {
              "--compilation_level", "ADVANCED_OPTIMIZATIONS",
              "--warning_level", "VERBOSE"
            },
            System.out, errStream);
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testEqualsArgFormat() {
    CommandLineRunner runner =
        new CommandLineRunner(
            new String[] {"--compilation_level=ADVANCED_OPTIMIZATIONS"},
            System.out, errStream);
    assertTrue(runner.shouldRunCompiler());
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testQuotesRemoval() {
    CommandLineRunner runner =
        new CommandLineRunner(
            new String[] {"--output_wrapper", "'(function(){%output%})()'"},
            System.out, errStream);
    assertTrue(runner.shouldRunCompiler());
  }
}