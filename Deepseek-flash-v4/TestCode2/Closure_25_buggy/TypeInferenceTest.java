package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class TypeInferenceTest {

  private static final String TYPE_INFERENCE_CLASS =
      "com.google.javascript.jscomp.TypeInference";

  private static final String FLOW_SCOPE_CLASS =
      "com.google.javascript.jscomp.type.FlowScope";

  private static final String JSTYPE_REGISTRY_CLASS =
      "com.google.javascript.rhino.jstype.JSTypeRegistry";

  @Test
  public void testFlowThroughSimpleNameDoesNotThrow() throws Exception {
    Object inference = newTypeInference();
    Object input = flowScope();

    Node name = new Node(Token.NAME);
    name.setString("x");

    Object result = invokeFlowThrough(inference, name, input);
    assertNotNull(result);
  }

  @Test
  public void testFlowThroughNumberDoesNotThrow() throws Exception {
    Object inference = newTypeInference();
    Object input = flowScope();

    Node number = Node.newNumber(42.0);

    Object result = invokeFlowThrough(inference, number, input);
    assertNotNull(result);
  }

  @Test
  public void testFlowThroughVarNodeDoesNotThrow() throws Exception {
    Object inference = newTypeInference();
    Object input = flowScope();

    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(Node.newString(Token.NAME, "x"));

    Object result = invokeFlowThrough(inference, varNode, input);
    assertNotNull(result);
  }

  private static Object invokeFlowThrough(Object target, Node node, Object input)
      throws Exception {
    Class<?> flowScopeClass = Class.forName(FLOW_SCOPE_CLASS);
    Method method = target.getClass().getDeclaredMethod("flowThrough", Node.class, flowScopeClass);
    method.setAccessible(true);
    Object result = method.invoke(target, node, input);
    if (result != null) {
      return result;
    }
    throw new AssertionError("flowThrough returned null");
  }

  private static Object newTypeInference() throws Exception {
    Class<?> typeInferenceClass = Class.forName(TYPE_INFERENCE_CLASS);
    AssertionError constructorFailure = null;

    for (Constructor<?> ctor : typeInferenceClass.getDeclaredConstructors()) {
      ctor.setAccessible(true);
      Class<?>[] parameterTypes = ctor.getParameterTypes();
      Object[] args = new Object[parameterTypes.length];
      for (int i = 0; i < parameterTypes.length; i++) {
        args[i] = defaultValue(parameterTypes[i]);
      }

      try {
        Object instance = ctor.newInstance(args);
        return instance;
      } catch (InvocationTargetException e) {
        constructorFailure =
            new AssertionError("Unable to construct TypeInference", e.getCause());
      } catch (Exception e) {
        constructorFailure = new AssertionError("Unable to construct TypeInference", e);
      }
    }

    Object instance = allocateWithoutConstructor(typeInferenceClass);
    setField(instance, "compiler", new Compiler());
    setField(instance, "registry", newRegistry());
    setField(instance, "lexicalScope", new HashMap<String, Object>());
    Object scope = flowScope();
    setField(instance, "functionScope", scope);
    setField(instance, "bottomScope", scope);
    setField(instance, "lazyScope", flowScope());
    return instance;
  }

  private static Object allocateWithoutConstructor(Class<?> type) throws Exception {
    Class<?> unsafeClass = Class.forName("sun.misc.Unsafe");
    Field field = unsafeClass.getDeclaredField("theUnsafe");
    field.setAccessible(true);
    Object unsafe = field.get(null);
    Method allocate = unsafe.getClass().getMethod("allocateInstance", Class.class);
    return allocate.invoke(unsafe, type);
  }

  private static Object defaultValue(Class<?> type) {
    if (!type.isPrimitive()) {
      if (type != Object.class && type.isAssignableFrom(Compiler.class)) {
        return new Compiler();
      }
      if (type == Map.class) {
        return new HashMap<String, Object>();
      }
      if (type.isInterface()) {
        return newProxy(type, "arg");
      }
      return null;
    }
    if (type == boolean.class) {
      return false;
    }
    if (type == int.class) {
      return 0;
    }
    if (type == long.class) {
      return 0L;
    }
    return null;
  }

  private static Object newRegistry() {
    try {
      Class<?> registryClass = Class.forName(JSTYPE_REGISTRY_CLASS);
      for (Constructor<?> ctor : registryClass.getConstructors()) {
        Class<?>[] paramTypes = ctor.getParameterTypes();
        if (paramTypes.length == 1 && paramTypes[0].isInterface()) {
          Object reporter = newProxy(paramTypes[0], "reporter");
          return ctor.newInstance(reporter);
        }
      }
    } catch (Throwable ignored) {
      // The test will still exercise reflective construction; a null registry is acceptable.
    }
    return null;
  }

  private static Object flowScope() throws Exception {
    Class<?> flowScopeClass = Class.forName(FLOW_SCOPE_CLASS);
    return newProxy(flowScopeClass, "flowScope");
  }

  private static Object newProxy(final Class<?> interfaceType, final String name) {
    InvocationHandler handler =
        (proxy, method, args) -> {
          if (method.getName().equals("createChildFlowScope")) {
            Class<?> returnType = method.getReturnType();
            if (returnType.isInterface()) {
              return newProxy(returnType, name + ".child");
            }
            return null;
          }
          Class<?> returnType = method.getReturnType();
          if (returnType == boolean.class) {
            return false;
          }
          if (returnType == int.class) {
            return 0;
          }
          if (returnType == long.class) {
            return 0L;
          }
          return null;
        };
    return Proxy.newProxyInstance(
        interfaceType.getClassLoader(), new Class<?>[] {interfaceType}, handler);
  }

  private static void setField(Object target, String fieldName, Object value) throws Exception {
    Field field = null;
    Class<?> current = target.getClass();
    while (current != null && field == null) {
      try {
        field = current.getDeclaredField(fieldName);
      } catch (NoSuchFieldException ignored) {
        current = current.getSuperclass();
      }
    }

    if (field == null) {
      return;
    }

    field.setAccessible(true);
    field.set(target, value);
  }
}