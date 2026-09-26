package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

public class StdValueInstantiatorTest {

    public static class Sample {
        public String text;
        public int intValue;
        public long longValue;
        public double doubleValue;
        public boolean boolValue;

        public Sample() { }

        public Sample(String text) {
            this.text = text;
        }

        public Sample(int intValue) {
            this.intValue = intValue;
        }

        public Sample(long longValue) {
            this.longValue = longValue;
        }

        public Sample(double doubleValue) {
            this.doubleValue = doubleValue;
        }

        public Sample(boolean boolValue) {
            this.boolValue = boolValue;
        }

        public Sample(String text, int intValue) {
            this.text = text;
            this.intValue = intValue;
        }
    }

    public static class ThrowingDefault {
        public ThrowingDefault() {
            throw new IllegalStateException("boom-default");
        }
    }

    public static class ThrowingString {
        public ThrowingString() { }

        public ThrowingString(String value) {
            throw new IllegalStateException("boom-string");
        }
    }

    private ObjectMapper mapper;
    private DeserializationContext ctxt;
    private JavaType sampleType;
    private StdValueInstantiator instantiator;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        ctxt = mapper.getDeserializationContext();
        sampleType = mapper.getTypeFactory().constructType(Sample.class);
        instantiator = new StdValueInstantiator(null, sampleType);
    }

    private AnnotatedWithParams constructor(Class<?> type, Class<?>... paramTypes) {
        AnnotatedClass annotatedClass = mapper.getDeserializationConfig().introspect(
                mapper.getTypeFactory().constructType(type));
        for (AnnotatedConstructor ctor : annotatedClass.getConstructors()) {
            if (ctor.getParameterCount() != paramTypes.length) {
                continue;
            }
            boolean matches = true;
            for (int i = 0; i < paramTypes.length; i++) {
                if (ctor.getRawParameterType(i) != paramTypes[i]) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                return ctor;
            }
        }
        throw new IllegalStateException("No matching constructor for " + type.getName()
                + " params " + Arrays.toString(paramTypes));
    }

    @Test
    public void testConstructorsAndInitialState() {
        @SuppressWarnings("deprecation")
        StdValueInstantiator fromClass = new StdValueInstantiator(null, Sample.class);
        assertEquals(Sample.class, fromClass.getValueClass());
        assertNotNull(fromClass.getValueTypeDesc());

        StdValueInstantiator nullType = new StdValueInstantiator(null, (JavaType) null);
        assertEquals("UNKNOWN TYPE", nullType.getValueTypeDesc());
        assertEquals(Object.class, nullType.getValueClass());

        assertFalse(instantiator.canCreateUsingDefault());
        assertFalse(instantiator.canCreateUsingDelegate());
        assertFalse(instantiator.canCreateUsingArrayDelegate());
        assertFalse(instantiator.canCreateFromObjectWith());
        assertFalse(instantiator.canCreateFromString());
        assertFalse(instantiator.canCreateFromInt());
        assertFalse(instantiator.canCreateFromLong());
        assertFalse(instantiator.canCreateFromDouble());
        assertFalse(instantiator.canCreateFromBoolean());
        assertFalse(instantiator.canInstantiate());

        assertNull(instantiator.getDefaultCreator());
        assertNull(instantiator.getWithArgsCreator());
        assertNull(instantiator.getDelegateCreator());
        assertNull(instantiator.getArrayDelegateCreator());
        assertNull(instantiator.getIncompleteParameter());
        assertNull(instantiator.getDelegateType(null));
        assertNull(instantiator.getArrayDelegateType(null));
        assertNull(instantiator.getFromObjectArguments(null));
    }

    @Test
    public void testDefaultCreator() throws Exception {
        AnnotatedWithParams defaultCtor = constructor(Sample.class);
        instantiator.configureFromObjectSettings(defaultCtor, null, null, null, null, null);

        assertTrue(instantiator.canCreateUsingDefault());
        assertTrue(instantiator.canInstantiate());
        assertSame(defaultCtor, instantiator.getDefaultCreator());
        assertNotNull(instantiator.createUsingDefault(ctxt));
    }

    @Test
    public void testObjectWithArgsCreator() throws Exception {
        AnnotatedWithParams withArgsCtor = constructor(Sample.class, String.class, int.class);
        SettableBeanProperty[] props = new SettableBeanProperty[0];
        instantiator.configureFromObjectSettings(null, null, null, null, withArgsCtor, props);

        assertTrue(instantiator.canCreateFromObjectWith());
        assertTrue(instantiator.canInstantiate());
        assertSame(props, instantiator.getFromObjectArguments(null));

        Sample result = (Sample) instantiator.createFromObjectWith(ctxt, new Object[] {"abc", 42});
        assertEquals("abc", result.text);
        assertEquals(42, result.intValue);
    }

    @Test
    public void testStringCreator() throws Exception {
        instantiator.configureFromStringCreator(constructor(Sample.class, String.class));

        assertTrue(instantiator.canCreateFromString());
        assertTrue(instantiator.canInstantiate());

        Sample result = (Sample) instantiator.createFromString(ctxt, "hello");
        assertEquals("hello", result.text);
    }

    @Test
    public void testIntCreator() throws Exception {
        instantiator.configureFromIntCreator(constructor(Sample.class, int.class));

        assertTrue(instantiator.canCreateFromInt());
        assertFalse(instantiator.canCreateFromLong());

        Sample result = (Sample) instantiator.createFromInt(ctxt, 5);
        assertEquals(5, result.intValue);
    }

    @Test
    public void testIntWidensToLongCreator() throws Exception {
        instantiator.configureFromLongCreator(constructor(Sample.class, long.class));

        assertTrue(instantiator.canCreateFromLong());
        assertFalse(instantiator.canCreateFromInt());

        Sample fromInt = (Sample) instantiator.createFromInt(ctxt, 12);
        assertEquals(12L, fromInt.longValue);

        Sample fromLong = (Sample) instantiator.createFromLong(ctxt, 34L);
        assertEquals(34L, fromLong.longValue);
    }

    @Test
    public void testDoubleCreator() throws Exception {
        instantiator.configureFromDoubleCreator(constructor(Sample.class, double.class));

        assertTrue(instantiator.canCreateFromDouble());

        Sample result = (Sample) instantiator.createFromDouble(ctxt, 3.25);
        assertEquals(3.25, result.doubleValue, 0.0);
    }

    @Test
    public void testBooleanCreator() throws Exception {
        instantiator.configureFromBooleanCreator(constructor(Sample.class, boolean.class));

        assertTrue(instantiator.canCreateFromBoolean());

        Sample result = (Sample) instantiator.createFromBoolean(ctxt, true);
        assertTrue(result.boolValue);
    }

    @Test
    public void testDelegateCreator() throws Exception {
        AnnotatedWithParams delegateCtor = constructor(Sample.class, String.class);
        instantiator.configureFromObjectSettings(null, delegateCtor, sampleType, null, null, null);

        assertTrue(instantiator.canCreateUsingDelegate());
        assertEquals(sampleType, instantiator.getDelegateType(null));

        Sample result = (Sample) instantiator.createUsingDelegate(ctxt, "delegate");
        assertEquals("delegate", result.text);
    }

    @Test
    public void testArrayDelegateCreator() throws Exception {
        AnnotatedWithParams arrayDelegateCtor = constructor(Sample.class, String.class);
        instantiator.configureFromArraySettings(arrayDelegateCtor, sampleType, null);

        assertTrue(instantiator.canCreateUsingArrayDelegate());
        assertEquals(sampleType, instantiator.getArrayDelegateType(null));

        Sample result = (Sample) instantiator.createUsingArrayDelegate(ctxt, "arrayDelegate");
        assertEquals("arrayDelegate", result.text);
    }

    @Test
    public void testCreateUsingDelegateFallsBackToArrayDelegate() throws Exception {
        instantiator.configureFromArraySettings(constructor(Sample.class, String.class), sampleType, null);

        Sample result = (Sample) instantiator.createUsingDelegate(ctxt, "fallbackToArray");
        assertEquals("fallbackToArray", result.text);
    }

    @Test
    public void testCreateUsingArrayDelegateFallsBackToDelegate() throws Exception {
        instantiator.configureFromObjectSettings(null, constructor(Sample.class, String.class), sampleType, null, null, null);

        Sample result = (Sample) instantiator.createUsingArrayDelegate(ctxt, "fallbackToDelegate");
        assertEquals("fallbackToDelegate", result.text);
    }

    @Test
    public void testDelegateWithNonNullEmptyArgumentsArray() throws Exception {
        AnnotatedWithParams noArgs = constructor(Sample.class);
        instantiator.configureFromArraySettings(noArgs, sampleType, new SettableBeanProperty[0]);

        assertNotNull(instantiator.createUsingDelegate(ctxt, "ignored"));
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateUsingDelegateWithoutAnyDelegateCreatorThrows() throws Exception {
        instantiator.createUsingDelegate(ctxt, "x");
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateUsingDefaultWithThrowingCreatorWrapsException() throws Exception {
        instantiator.configureFromObjectSettings(constructor(ThrowingDefault.class), null, null, null, null, null);
        instantiator.createUsingDefault(ctxt);
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromStringWithThrowingCreatorWrapsException() throws Exception {
        instantiator.configureFromStringCreator(constructor(ThrowingString.class, String.class));
        instantiator.createFromString(ctxt, "boom");
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromStringWithoutCreatorFallsBack() throws Exception {
        instantiator.createFromString(ctxt, "x");
    }

    @Test(expected = JsonMappingException.class)
    public void testCreateFromIntWithoutCreatorFallsBack() throws Exception {
        instantiator.createFromInt(ctxt, 1);
    }

    @Test
    public void testIncompleteParameter() throws Exception {
        AnnotatedWithParams ctor = constructor(Sample.class, String.class);
        AnnotatedParameter param = ctor.getParameter(0);
        assertNotNull(param);

        instantiator.configureIncompleteParameter(param);
        assertSame(param, instantiator.getIncompleteParameter());

        instantiator.configureIncompleteParameter(null);
        assertNull(instantiator.getIncompleteParameter());
    }
}