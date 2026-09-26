package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import static com.google.javascript.rhino.IR.*;

import com.google.javascript.jscomp.GlobalNamespace.Ref;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class CollapsePropertiesTest {

  private TestCompiler compiler;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
  }

  @Test
  public void testEmptyScript() {
    Node externs = script();
    Node root = script();
    CollapseProperties cp = new CollapseProperties(compiler, false, false);
    cp.process(externs, root);
    assertEquals(0, compiler.getCodeChangeCount());
    assertTrue(compiler.getReportedErrors().isEmpty());
  }

  @Test
  public void testOneGlobalName() {
    Node externs = script();
    Node root = script(var(name("a", number(1))));
    CollapseProperties cp = new CollapseProperties(compiler, false, false);
    cp.process(externs, root);
    assertEquals(0, compiler.getCodeChangeCount());
    assertTrue(compiler.getReportedErrors().isEmpty());
  }

  @Test
  public void testMultipleGlobalNames() {
    Node externs = script();
    Node root = script(
        var(name("a", number(1))),
        var(name("b", string("hello"))));
    CollapseProperties cp = new CollapseProperties(compiler, false, false);
    cp.process(externs, root);
    assertEquals(0, compiler.getCodeChangeCount());
    assertTrue(compiler.getReportedErrors().isEmpty());
  }

  @Test
  public void testCollapseObjectLiteralProperty() {
    Node externs = script();
    Node root = script(
        var(name("a", objectlit(
            stringKey("x", number(1))
        ))));
    CollapseProperties cp = new CollapseProperties(compiler, false, false);
    cp.process(externs, root);
    assertTrue(compiler.getCodeChangeCount() > 0);
    assertTrue(compiler.getReportedErrors().isEmpty());
  }

  @Test
  public void testInlineAliases() {
    Node externs = script();
    Node root = script(
        var(name("a", objectlit())),
        var(name("b", name("a"))),
        exprResult(assign(getprop(name("b"), string("x")), number(1)))
    );
    CollapseProperties cp = new CollapseProperties(compiler, false, true);
    cp.process(externs, root);
    assertTrue(compiler.getCodeChangeCount() > 0);
    assertTrue(compiler.getReportedErrors().isEmpty());
  }

  @Test
  public void testUnsafeThisWarning() {
    Node externs = script();
    Node body = block(
        exprResult(assign(
            getprop(name("a"), string("b")),
            function(null, block(
                exprResult(assign(thisNode(), number(1)))
            ))
        ))
    );
    Node root = script(body);
    CollapseProperties cp = new CollapseProperties(compiler, false, false);
    cp.process(externs, root);
    boolean foundUnsafeThis = false;
    for (JSError err : compiler.getReportedErrors()) {
      if (err.getType() == CollapseProperties.UNSAFE_THIS) {
        foundUnsafeThis = true;
        break;
      }
    }
    assertTrue("Expected UNSAFE_THIS warning", foundUnsafeThis);
  }

  @Test
  public void testNamespaceRedefinitionWarning() {
    Node externs = script();
    Node root = script(
        exprResult(assign(
            getprop(name("a"), string("b")),
            objectlit()
        )),
        exprResult(assign(
            getprop(name("a"), string("b")),
            number(5)
        ))
    );
    CollapseProperties cp = new CollapseProperties(compiler, false, false);
    cp.process(externs, root);
    boolean foundRedef = false;
    for (JSError err : compiler.getReportedErrors()) {
      if (err.getType() == CollapseProperties.NAMESPACE_REDEFINED_WARNING) {
        foundRedef = true;
        break;
      }
    }
    assertTrue("Expected NAMESPACE_REDEFINED warning", foundRedef);
  }

  private static class TestCompiler extends Compiler {
    private int codeChangeCount = 0;
    private List<JSError> reportedErrors = new ArrayList<>();

    @Override
    public void reportCodeChange() {
      codeChangeCount++;
    }

    @Override
    public void report(JSError error) {
      reportedErrors.add(error);
    }

    public int getCodeChangeCount() {
      return codeChangeCount;
    }

    public List<JSError> getReportedErrors() {
      return reportedErrors;
    }
  }
}