package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;

public class ValueInstantiatorTest {

    private static class DefaultVI extends ValueInstantiator {
    }

    private static class NullValueClassVI extends ValueInstantiator {
        @Override
        public Class<?> getValueClass() {
            return null;
        }
    }

    private static class BooleanFallbackVI extends ValueInstantiator {
        boolean called;
        boolean lastBoolean;

        @Override
        public boolean canCreateFromBoolean() {
            return true;
        }

        @Override
        public Object createFromBoolean(DeserializationContext ctxt, boolean value) {
            called = true;
            lastBoolean = value;
            return value ? "TRUE" : "FALSE";
        }
    }

    private static class DelegateVI extends ValueInstantiator {
        @Override
        public boolean canCreateUsingDelegate() {
            return true;
        }
    }

    private static class ArrayDelegateVI extends ValueInstantiator {
        @Override
        public boolean canCreateUsingArrayDelegate() {
            return true;
        }
    }

    private static class StringVI extends ValueInstantiator {
        @Override
        public boolean canCreateFromString() {
            return true;
        }
    }

    private static class ObjectWithArgsVI extends ValueInstantiator {
        Object[] receivedArgs;

        @Override
        public boolean canCreateFromObjectWith() {
            return true;
        }

        @Override
        public Object createFromObjectWith(DeserializationContext ctxt, Object[] args) {
            receivedArgs = args;
            return "result";
        }
    }

    private DeserializationContext defaultContext() {
        return new DefaultDeserializationContext.Impl(new ObjectMapper().getDeserializationConfig());
    }

    private DeserializationContext emptyStringAcceptedContext() {
        return new DefaultDeserializationContext.Impl(new ObjectMapper()
                .enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
                .getDeserializationConfig());
    }

    @Test
    public void testDefaultMetadataAndCapabilities() {
        ValueInstantiator vi = new DefaultVI();

        assertEquals(Object.class, vi.getValueClass());
        assertEquals("java.lang.Object", vi.getValueTypeDesc());

        assertNull(vi.getFromObjectArguments(null));
        assertNull(vi.getDelegateType(null));
        assertNull(vi.getArrayDelegateType(null));
        assertNull(vi.getDefaultCreator());
        assertNull(vi.getDelegateCreator());
        assertNull(vi.getArrayDelegateCreator());
        assertNull(vi.getWithArgsCreator());
        assertNull(vi.getIncompleteParameter());

        assertFalse(vi.canCreateFromString());
        assertFalse(vi.canCreateFromInt());
        assertFalse(vi.canCreateFromLong());
        assertFalse(vi.canCreateFromDouble());
        assertFalse(vi.canCreateFromBoolean());
        assertFalse(vi.canCreateUsingDefault());
        assertFalse(vi.canCreateUsingDelegate());
        assertFalse(vi.canCreateUsingArrayDelegate());
        assertFalse(vi.canCreateFromObjectWith());
        assertFalse(vi.canInstantiate());
    }

    @Test
    public void testGetValueTypeDescWithNullValueClass() {
        assertEquals("UNKNOWN", new NullValueClassVI().getValueTypeDesc());
    }

    @Test
    public void testBaseClassMetadata() {
        ValueInstantiator byClass = new ValueInstantiator.Base(String.class);
        assertEquals(String.class, byClass.getValueClass());
        assertEquals("java.lang.String", byClass.getValueTypeDesc());

        JavaType intType = new ObjectMapper().getTypeFactory().constructType(Integer.class);
        ValueInstantiator byType = new ValueInstantiator.Base(intType);
        assertEquals(Integer.class, byType.getValueClass());
        assertEquals("java.lang.Integer", byType.getValueTypeDesc());
    }

    @Test
    public void testCanInstantiateTrueForAnyCreator() {
        assertTrue(new DelegateVI().canInstantiate());
        assertTrue(new ArrayDelegateVI().canInstantiate());
        assertTrue(new StringVI().canInstantiate());
        assertTrue(new ObjectWithArgsVI().canInstantiate());
        assertTrue(new BooleanFallbackVI().canInstantiate());
    }

    @Test(expected = IOException.class)
    public void testCreateUsingDefaultMissingInstantiator() throws Exception {
        new DefaultVI().createUsingDefault(defaultContext());
    }

    @Test(expected = IOException.class)
    public void testCreateFromObjectWithArgsMissingInstantiator() throws Exception {
        new DefaultVI().createFromObjectWith(defaultContext(), new Object[] { "a" });
    }

    @Test
    public void testCreateFromObjectWithBufferDelegatesToArrayMethod() throws Exception {
        ObjectWithArgsVI vi = new ObjectWithArgsVI();
        PropertyValueBuffer buffer = new PropertyValueBuffer(null, 0);
        Object result = vi.createFromObjectWith(null, new SettableBeanProperty[0], buffer);

        assertSame("result", result);
        assertArrayEquals(new Object[0], vi.receivedArgs);
    }

    @Test(expected = IOException.class)
    public void testCreateUsingDelegateMissingInstantiator() throws Exception {
        new DefaultVI().createUsingDelegate(defaultContext(), "delegate");
    }

    @Test(expected = IOException.class)
    public void testCreateUsingArrayDelegateMissingInstantiator() throws Exception {
        new DefaultVI().createUsingArrayDelegate(defaultContext(), new Object[] { 1 });
    }

    @Test(expected = IOException.class)
    public void testCreateFromIntMissingInstantiator() throws Exception {
        new DefaultVI().createFromInt(defaultContext(), 42);
    }

    @Test(expected = IOException.class)
    public void testCreateFromLongMissingInstantiator() throws Exception {
        new DefaultVI().createFromLong(defaultContext(), 42L);
    }

    @Test(expected = IOException.class)
    public void testCreateFromDoubleMissingInstantiator() throws Exception {
        new DefaultVI().createFromDouble(defaultContext(), 4.2d);
    }

    @Test(expected = IOException.class)
    public void testCreateFromBooleanMissingInstantiator() throws Exception {
        new DefaultVI().createFromBoolean(defaultContext(), true);
    }

    @Test
    public void testCreateFromStringBooleanFallback() throws Exception {
        BooleanFallbackVI vi = new BooleanFallbackVI();

        assertSame("TRUE", vi.createFromString(null, "true"));
        assertTrue(vi.called);
        assertTrue(vi.lastBoolean);

        vi.called = false;
        assertSame("FALSE", vi.createFromString(null, "false"));
        assertTrue(vi.called);
        assertFalse(vi.lastBoolean);

        vi.called = false;
        assertSame("TRUE", vi.createFromString(null, "  true  "));
        assertTrue(vi.called);
        assertTrue(vi.lastBoolean);
    }

    @Test
    public void testCreateFromStringEmptyStringAcceptedAsNull() throws Exception {
        assertNull(new DefaultVI().createFromString(emptyStringAcceptedContext(), ""));
    }

    @Test(expected = IOException.class)
    public void testCreateFromStringEmptyStringNotAccepted() throws Exception {
        new DefaultVI().createFromString(defaultContext(), "");
    }

    @Test(expected = IOException.class)
    public void testCreateFromStringNonEmptyStringMissingCreator() throws Exception {
        new DefaultVI().createFromString(defaultContext(), "abc");
    }

    @Test(expected = IOException.class)
    public void testCreateFromStringBooleanFallbackUnknownValue() throws Exception {
        new BooleanFallbackVI().createFromString(defaultContext(), "abc");
    }
}