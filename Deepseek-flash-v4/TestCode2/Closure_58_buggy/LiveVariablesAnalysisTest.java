package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class LiveVariablesAnalysisTest {

  // -------------------------------------------------------------------------
  // Helpers
  // -------------------------------------------------------------------------

  private static Object unsafeAllocate(Class<?> clazz) throws Exception {
    Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
    Field field = unsafeClass.getDeclaredField("theUnsafe");
    field.setAccessible(true);
    Object unsafe = field.get(null);
    Method allocate = unsafeClass.getMethod("allocateInstance", Class.class);
    return allocate.invoke(unsafe, clazz);
  }

  private static LiveVariablesAnalysis newAnalysis() throws Exception {
    return (LiveVariablesAnalysis) unsafeAllocate(LiveVariablesAnalysis.class);
  }

  private static void setField(Object target, String name, Object value) throws Exception {
    Field f = target.getClass().getDeclaredField(name);
    f.setAccessible(true);
    f.set(target, value);
  }

  private static BitSet liveSet(Object lattice) throws Exception {
    Field f = lattice.getClass().getDeclaredField("liveSet");
    f.setAccessible(true);
    return (BitSet) f.get(lattice);
  }

  private static boolean isLive(Object lattice, int index) throws Exception {
    Method m = lattice.getClass().getDeclaredMethod("isLive", int.class);
    m.setAccessible(true);
    return (Boolean) m.invoke(lattice, index);
  }

  private static Object newLattice(int numVars) throws Exception {
    Class<?> clazz =
        Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableLattice");
    Constructor<?> ctor = clazz.getDeclaredConstructor(int.class);
    ctor.setAccessible(true);
    return ctor.newInstance(numVars);
  }

  private static Object copyLattice(Object lattice) throws Exception {
    Class<?> clazz = lattice.getClass();
    Constructor<?> ctor = clazz.getDeclaredConstructor(clazz);
    ctor.setAccessible(true);
    return ctor.newInstance(lattice);
  }

  private static boolean invokeIsArgumentsName(LiveVariablesAnalysis analysis, Node n)
      throws Exception {
    Method m = LiveVariablesAnalysis.class.getDeclaredMethod("isArgumentsName", Node.class);
    m.setAccessible(true);
    return (Boolean) m.invoke(analysis, n);
  }

  // -------------------------------------------------------------------------
  // LiveVariableLattice tests
  // -------------------------------------------------------------------------

  @Test
  public void testLiveVariableLatticeInitialState() throws Exception {
    Object lattice = newLattice(4);

    for (int i = 0; i < 4; i++) {
      assertFalse(isLive(lattice, i));
    }

    assertEquals("{}", lattice.toString());
  }

  @Test
  public void testLiveVariableLatticeTracksLiveBitAndClones() throws Exception {
    Object a = newLattice(4);
    Object b = newLattice(4);

    assertFalse(isLive(a, 0));
    liveSet(a).set(2);
    assertTrue(isLive(a, 2));
    assertFalse(isLive(a, 1));

    liveSet(b).set(2);
    assertEquals(a, b);
    assertEquals(a.hashCode(), b.hashCode());

    Object copy = copyLattice(a);
    assertEquals(a, copy);

    liveSet(a).clear(2);
    assertFalse(copy.equals(a));
  }

  @Test
  public void testLiveVariableJoinOrsLiveSets() throws Exception {
    Class<?> joinClass =
        Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableJoinOp");
    Constructor<?> ctor = joinClass.getDeclaredConstructor();
    ctor.setAccessible(true);
    Object joinOp = ctor.newInstance();

    Object left = newLattice(4);
    Object right = newLattice(4);
    liveSet(left).set(0);
    liveSet(right).set(2);

    Method apply = joinClass.getDeclaredMethod("apply", List.class);
    apply.setAccessible(true);

    Object result = apply.invoke(joinOp, Arrays.asList(left, right));

    assertTrue(liveSet(result).get(0));
    assertTrue(liveSet(result).get(2));
    assertFalse(liveSet(result).get(1));
  }

  // -------------------------------------------------------------------------
  // LiveVariablesAnalysis outer-class tests
  // -------------------------------------------------------------------------

  @Test
  public void testCreateEntryLatticeOnEmptyScope() throws Exception {
    LiveVariablesAnalysis analysis = newAnalysis();
    setField(analysis, "escaped", new HashSet<Scope.Var>());
    setField(analysis, "jsScope", new Scope(new Node(Token.SCRIPT), null));

    Object entry = analysis.createEntryLattice();
    assertNotNull(entry);
    assertEquals("{}", entry.toString());
  }

  @Test
  public void testIsForwardReturnsFalse() throws Exception {
    LiveVariablesAnalysis analysis = newAnalysis();
    assertFalse(analysis.isForward());
  }

  @Test
  public void testGetEscapedLocalsReturnsEscapedSet() throws Exception {
    LiveVariablesAnalysis analysis = newAnalysis();
    Set<Scope.Var> escaped = new HashSet<>();
    setField(analysis, "escaped", escaped);

    assertSame(escaped, analysis.getEscapedLocals());
  }

  @Test
  public void testIsArgumentsName() throws Exception {
    LiveVariablesAnalysis analysis = newAnalysis();
    setField(analysis, "escaped", new HashSet<Scope.Var>());

    Node notName = new Node(Token.SCRIPT);
    assertFalse(invokeIsArgumentsName(analysis, notName));

    Node notArguments = new Node(Token.NAME, "x");
    assertFalse(invokeIsArgumentsName(analysis, notArguments));

    setField(analysis, "jsScope", new Scope(new Node(Token.SCRIPT), null));
    Node arguments = new Node(Token.NAME, "arguments");
    assertTrue(invokeIsArgumentsName(analysis, arguments));
  }
}