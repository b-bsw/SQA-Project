package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertNotNull;

import com.google.javascript.jscomp.mozilla.rhino.ast.AstNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Set;

/**
 * Minimal unit tests for {@link IRFactory}.
 *
 * <p>The tests create a real {@link Config} reflectively so that the tests stay
 * robust against small constructor signature changes.
 */
public class IRFactoryTest {

  @Test
  public void transformTree_emptyScript_returnsNode() throws Exception {
    AstRoot root = new AstRoot();
    root.setStatements(Collections.<AstNode>emptyList());

    Node result = IRFactory.transformTree(
        root, createConfig(LanguageMode.ECMASCRIPT5, true), null, null);

    assertNotNull(result);
  }

  @Test
  public void transformTree_allLanguageModes_doesNotThrow() throws Exception {
    for (LanguageMode mode : LanguageMode.values()) {
      AstRoot root = new AstRoot();
      root.setStatements(Collections.<AstNode>emptyList());

      Node result = IRFactory.transformTree(
          root, createConfig(mode, false), null, null);

      assertNotNull("Failed for mode: " + mode, result);
    }
  }

  @Test
  public void transformTree_acceptConstKeywordModes_doesNotThrow() throws Exception {
    for (boolean acceptConstKeyword : new boolean[] {true, false}) {
      AstRoot root = new AstRoot();
      root.setStatements(Collections.<AstNode>emptyList());

      Node result = IRFactory.transformTree(
          root,
          createConfig(LanguageMode.ECMASCRIPT5, acceptConstKeyword),
          null,
          null);

      assertNotNull(result);
    }
  }

  @Test(expected = NullPointerException.class)
  public void transformTree_nullRoot_throwsNullPointerException() throws Exception {
    IRFactory.transformTree(null, createConfig(LanguageMode.ECMASCRIPT5, false), null, null);
  }

  @Test(expected = NullPointerException.class)
  public void transformTree_nullConfig_throwsNullPointerException() throws Exception {
    AstRoot root = new AstRoot();
    root.setStatements(Collections.<AstNode>emptyList());

    IRFactory.transformTree(root, null, null, null);
  }

  private static Config createConfig(LanguageMode mode, boolean acceptConstKeyword)
      throws Exception {
    // First try creating Config through one of its constructors reflectively.
    for (Constructor<?> ctor : Config.class.getDeclaredConstructors()) {
      ctor.setAccessible(true);
      try {
        Class<?>[] types = ctor.getParameterTypes();
        Object[] args = new Object[types.length];

        for (int i = 0; i < types.length; i++) {
          args[i] = defaultValueFor(types[i], mode, acceptConstKeyword);
        }

        Config config = (Config) ctor.newInstance(args);
        setField(config, "languageMode", mode);
        setField(config, "acceptConstKeyword", acceptConstKeyword);
        return config;
      } catch (Exception ignored) {
        // Try another constructor.
      }
    }

    // Fall back to allocating the object without a constructor and setting fields directly.
    try {
      Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
      Field theUnsafe = unsafeClass.getDeclaredField("theUnsafe");
      theUnsafe.setAccessible(true);
      Object unsafe = theUnsafe.get(null);

      Method allocate = unsafeClass.getMethod("allocateInstance", Class.class);
      Config config = (Config) allocate.invoke(unsafe, Config.class);

      setField(config, "languageMode", mode);
      setField(config, "acceptConstKeyword", acceptConstKeyword);
      return config;
    } catch (Exception e) {
      throw new AssertionError("Unable to create Config for tests", e);
    }
  }

  private static Object defaultValueFor(
      Class<?> parameterType, LanguageMode mode, boolean boolValue) {
    if (parameterType == LanguageMode.class) {
      return mode;
    }
    if (parameterType == boolean.class || parameterType == Boolean.class) {
      return boolValue;
    }
    if (parameterType == int.class) {
      return 0;
    }
    if (parameterType == long.class) {
      return 0L;
    }
    if (parameterType == double.class) {
      return 0.0d;
    }
    if (parameterType == Set.class) {
      return Collections.emptySet();
    }
    if (parameterType == String.class) {
      return "";
    }
    if (parameterType == String[].class) {
      return new String[0];
    }
    return null;
  }

  private static void setField(Object target, String fieldName, Object value)
      throws Exception {
    Class<?> type = target.getClass();
    Field field = null;

    while (type != null && field == null) {
      try {
        field = type.getDeclaredField(fieldName);
      } catch (NoSuchFieldException e) {
        type = type.getSuperclass();
      }
    }

    if (field == null) {
      throw new NoSuchFieldException(fieldName);
    }

    field.setAccessible(true);
    field.set(target, value);
  }
}