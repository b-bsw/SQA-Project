package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.io.Files;
import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class CommandLineRunnerTest {

  @Rule
  public TemporaryFolder temporaryFolder = new TemporaryFolder();

  @Test
  public void testGetDefaultExternsReturnsNonEmptyExterns() throws Exception {
    List<SourceFile> externs = CommandLineRunner.getDefaultExterns();
    assertNotNull(externs);
    assertFalse(externs.isEmpty());
    for (SourceFile extern : externs) {
      assertNotNull(extern);
    }
  }

  @Test
  public void testNoArgumentsMeansCompilerShouldNotRun() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[0]);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testUnknownFlagMakesConfigInvalid() throws Exception {
    CommandLineRunner runner = new CommandLineRunner(new String[] {"--no_such_flag"});
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testValidJsInputMeansCompilerShouldRun() throws Exception {
    File input = temporaryFolder.newFile("input.js");
    Files.write("var x = 1;", input, Charset.forName("UTF-8"));

    CommandLineRunner runner =
        new CommandLineRunner(new String[] {"--js", input.getAbsolutePath()});
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testGetWarningGuardSpecNotNull() {
    assertNotNull(CommandLineRunner.getWarningGuardSpec());
  }
}