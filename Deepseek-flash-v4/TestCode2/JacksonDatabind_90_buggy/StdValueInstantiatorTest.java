package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

public class StdValueInstantiatorTest {

    private StdValueInstantiator inst;

    @Before
    public void setUp() {
        inst = new StdValueInstantiator(null, (Class<?>) String.class);
    }

    private AnnotatedWithParams creator(Class<?> cls, Class<?>... params) throws Exception {
        Constructor<?> ctor = cls.getConstructor(params);
        return new AnnotatedConstructor(ctor, null, null);
    }

    private AnnotatedWithParams stringCreator() throws Exception {
        return creator(String.class, String.class);
    }

    private AnnotatedWithParams noArgString() throws Exception {
        return creator(String.class);
    }

    private AnnotatedWithParams intCreator() throws Exception {
        return creator(Integer.class, int.class);
    }

    private AnnotatedWithParams longCreator() throws Exception {
        return creator(Long.class, long.class);
    }

    private AnnotatedWithParams doubleCreator() throws Exception {
        return creator(Double.class, double.class);
    }

    private AnnotatedWithParams booleanCreator() throws Exception {
        return creator(Boolean.class, boolean.class);
    }

    private JavaType stringType() {
        return TypeFactory.defaultInstance().constructType(String.class);
    }

    @Test
    public void initialCapabilitiesAreAllFalse() {
        assertFalse(inst.canCreateFromString());
        assertFalse(inst.canCreateFromInt());
        assertFalse(inst.canCreateFromLong());
        assertFalse(inst.canCreateFromDouble());
        assertFalse(inst.canCreateFromBoolean());
        assertFalse(inst.canCreateUsingDefault());
        assertFalse(inst.canCreateUsingDelegate());
        assertFalse(inst.canCreateUsingArrayDelegate());
    }

    @Test
    public void nullValueTypeUsesObjectAndUnknownTypeLabel() {
        StdValueInstantiator nullClass = new StdValueInstantiator(null, (Class<?>) null);
        assertEquals(Object.class, nullClass.getValueClass());
        assertEquals("UNKNOWN TYPE", nullClass.getValueTypeDesc());

        StdValueInstantiator nullJava = new StdValueInstantiator(null, (JavaType) null);
        assertEquals(Object.class, nullJava.getValueClass());
        assertEquals("UNKNOWN TYPE", nullJava.getValueTypeDesc());
    }

    @Test
    public void stringCreatorIsExposedThroughCapabilityAndCreate() throws Exception {
        AnnotatedWithParams stringCreator = stringCreator();

        inst.configureFromStringCreator(stringCreator);
        assertTrue(inst.canCreateFromString());
        assertEquals("abc", inst.createFromString(null, "abc"));
    }

    @Test
    public void intCreatorIsExposedThroughCapabilityAndCreate() throws Exception {
        inst.configureFromIntCreator(intCreator());

        assertTrue(inst.canCreateFromInt());
        assertEquals(Integer.valueOf(42), inst.createFromInt(null, 42));
    }

    @Test
    public void longCreatorIsExposedThroughCapabilityAndCreate() throws Exception {
        inst.configureFromLongCreator(longCreator());

        assertTrue(inst.canCreateFromLong());
        assertEquals(Long.valueOf(42L), inst.createFromLong(null, 42L));
    }

    @Test
    public void doubleCreatorIsExposedThroughCapabilityAndCreate() throws Exception {
        inst.configureFromDoubleCreator(doubleCreator());

        assertTrue(inst.canCreateFromDouble());
        assertEquals(Double.valueOf(4.25d), inst.createFromDouble(null, 4.25d));
    }

    @Test
    public void booleanCreatorIsExposedThroughCapabilityAndCreate() throws Exception {
        inst.configureFromBooleanCreator(booleanCreator());

        assertTrue(inst.canCreateFromBoolean());
        assertEquals(Boolean.TRUE, inst.createFromBoolean(null, true));
    }

    @Test
    public void defaultCreatorIsExposedThroughCapabilityAndCreate() throws Exception {
        inst.configureUsingDefault(noArgString());

        assertTrue(inst.canCreateUsingDefault());
        assertEquals("", inst.createUsingDefault(null));
    }

    @Test
    public void delegateCreatorIsExposedThroughCapabilityAndCreate() throws Exception {
        AnnotatedWithParams delegateCreator = stringCreator();
        JavaType delegateType = stringType();

        inst.configureUsingDelegate(delegateCreator, delegateType, null);

        assertTrue(inst.canCreateUsingDelegate());
        assertEquals(delegateType, inst.getDelegateType(null));
        assertEquals("value", inst.createUsingDelegate(null, "value"));
    }

    @Test
    public void arrayDelegateCreatorIsExposedThroughCapabilityAndCreate() throws Exception {
        AnnotatedWithParams arrayDelegateCreator = stringCreator();
        JavaType arrayDelegateType = stringType();

        inst.configureUsingArrayDelegate(arrayDelegateCreator, arrayDelegateType, null);

        assertTrue(inst.canCreateUsingArrayDelegate());
        assertEquals(arrayDelegateType, inst.getArrayDelegateType(null));
        assertEquals("value", inst.createUsingArrayDelegate(null, "value"));
    }

    @Test
    public void createUsingDelegateFallsBackToArrayDelegate() throws Exception {
        inst.configureUsingArrayDelegate(stringCreator(), stringType(), null);

        assertFalse(inst.canCreateUsingDelegate());
        assertTrue(inst.canCreateUsingArrayDelegate());
        assertEquals("value", inst.createUsingDelegate(null, "value"));
    }

    @Test
    public void createUsingArrayDelegateFallsBackToDelegate() throws Exception {
        inst.configureUsingDelegate(stringCreator(), stringType(), null);

        assertTrue(inst.canCreateUsingDelegate());
        assertFalse(inst.canCreateUsingArrayDelegate());
        assertEquals("value", inst.createUsingArrayDelegate(null, "value"));
    }

    @Test
    public void gettersExposeConfiguredCreators() throws Exception {
        AnnotatedWithParams defaultCreator = noArgString();
        AnnotatedWithParams delegateCreator = stringCreator();
        AnnotatedWithParams arrayDelegateCreator = stringCreator();

        inst.configureUsingDefault(defaultCreator);
        inst.configureUsingDelegate(delegateCreator, stringType(), null);
        inst.configureUsingArrayDelegate(arrayDelegateCreator, stringType(), null);

        assertSame(defaultCreator, inst.getDefaultCreator());
        assertSame(delegateCreator, inst.getDelegateCreator());
        assertSame(arrayDelegateCreator, inst.getArrayDelegateCreator());
    }

    @Test
    public void fromObjectArgumentsCanBeConfigured() throws Exception {
        SettableBeanProperty[] properties = new SettableBeanProperty[0];
        inst.configureFromObjectWith(noArgString(), properties);

        assertArrayEquals(properties, inst.getFromObjectArguments(null));
    }
}