package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.FileHandler;

import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SubTypeValidatorTest {

    private final SubTypeValidator validator = SubTypeValidator.instance();

    @Test
    public void instanceReturnsSameSingleton() {
        assertNotNull(SubTypeValidator.instance());
        assertSame(SubTypeValidator.instance(), SubTypeValidator.instance());
    }

    @Test
    public void validateSubTypeAllowsSafeType() throws Exception {
        validator.validateSubType(null, type(String.class));
    }

    @Test
    public void validateSubTypeRejectsBlockedJdkClass() throws Exception {
        try {
            validator.validateSubType(null, type(FileHandler.class));
            fail("Expected JsonMappingException for blocked type");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("prevented for security reasons"));
        }
    }

    @SuppressWarnings("unchecked")
    @Test
    public void validateSubTypeUsesConfiguredIllegalNames() throws Exception {
        Field field = SubTypeValidator.class.getDeclaredField("_cfgIllegalClassNames");
        field.setAccessible(true);

        Set<String> original = (Set<String>) field.get(validator);
        Set<String> illegal = new HashSet<String>();
        illegal.add(String.class.getName());

        field.set(validator, illegal);
        try {
            validator.validateSubType(null, type(String.class));
            fail("Expected JsonMappingException for configured illegal type");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("prevented for security reasons"));
        } finally {
            field.set(validator, original);
        }
    }

    @Test(expected = NullPointerException.class)
    public void validateSubTypeRejectsNullJavaType() throws Exception {
        validator.validateSubType(null, null);
    }

    private JavaType type(Class<?> cls) {
        return TypeFactory.defaultInstance().constructType(cls);
    }
}