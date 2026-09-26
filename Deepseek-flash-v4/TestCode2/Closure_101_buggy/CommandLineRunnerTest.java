package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;

public class CommandLineRunnerTest {

  private static class RecordingSetter implements Setter<Boolean> {
    private Boolean value;

    @Override
    public void addValue(Boolean v) {
      this.value = v;
    }

    @Override
    public Class<Boolean> getType() {
      return Boolean.class;
    }

    @Override
    public String getFieldName() {
      return "testBoolean";
    }

    @Override
    public Boolean getValue() {
      return value;
    }
  }

  private static class FakeParameters implements Parameters {
    private final String value;

    FakeParameters(String value) {
      this.value = value;
    }

    @Override
    public String getParameter(int idx) {
      return idx == 0 ? value : null;
    }

    @Override
    public int size() {
      return value == null ? 0 : 1;
    }

    public String getParameter(int idx, String defaultValue) {
      String v = getParameter(idx);
      return v == null ? defaultValue : v;
    }
  }

  private CmdLineParser parser;
  private RecordingSetter setter;
  private CommandLineRunner.BooleanOptionHandler handler;

  @Before
  public void setUp() {
    parser = new CmdLineParser(new Object());
    setter = new RecordingSetter();
    handler = new CommandLineRunner.BooleanOptionHandler(
        parser, new OptionDef("--flag", false), setter);
  }

  @Test
  public void testParse_bareOptionSetsTrueAndConsumesNothing() throws CmdLineException {
    int consumed = handler.parseArguments(new FakeParameters(null));

    assertEquals(0, consumed);
    assertEquals(Boolean.TRUE, setter.getValue());
  }

  @Test
  public void testParse_trueValueConsumesOneToken() throws CmdLineException {
    int consumed = handler.parseArguments(new FakeParameters("true"));

    assertEquals(1, consumed);
    assertEquals(Boolean.TRUE, setter.getValue());
  }

  @Test
  public void testParse_falseValueIsCaseInsensitive() throws CmdLineException {
    int consumed = handler.parseArguments(new FakeParameters("FALSE"));

    assertEquals(1, consumed);
    assertEquals(Boolean.FALSE, setter.getValue());
  }

  @Test(expected = CmdLineException.class)
  public void testParse_invalidBooleanValueThrows() throws CmdLineException {
    handler.parseArguments(new FakeParameters("maybe"));
  }

  @Test
  public void testParse_emptyValueIsInvalid() {
    try {
      handler.parseArguments(new FakeParameters(""));
      fail("Expected CmdLineException for an empty boolean value");
    } catch (CmdLineException e) {
      assertTrue(e.getMessage().contains("Illegal boolean value"));
    }
  }

  @Test
  public void testDefaultMetaVariableIsNull() {
    assertNull(handler.getDefaultMetaVariable());
  }
}