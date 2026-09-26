package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanSerializerBaseTest {

    private static final class TestSerializerBase extends BeanSerializerBase {
        private TestSerializerBase(JavaType type, BeanSerializerBuilder builder,
                BeanPropertyWriter[] props, BeanPropertyWriter[] filteredProps) {
            super(type, builder, props, filteredProps);
        }

        private TestSerializerBase(TestSerializerBase src) {
            super(src);
        }

        private TestSerializerBase(TestSerializerBase src, ObjectIdWriter idWriter) {
            super(src, idWriter);
        }

        private TestSerializerBase(TestSerializerBase src, ObjectIdWriter idWriter, Object filterId) {
            super(src, idWriter, filterId);
        }

        private TestSerializerBase(TestSerializerBase src, String[] toIgnore) {
            super(src, toIgnore);
        }

        private TestSerializerBase(TestSerializerBase src, NameTransformer unwrapper) {
            super(src, unwrapper);
        }

        @Override
        public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
            return new TestSerializerBase(this, objectIdWriter);
        }

        @Override
        protected BeanSerializerBase withIgnorals(String[] toIgnore) {
            return new TestSerializerBase(this, toIgnore);
        }

        @Override
        protected BeanSerializerBase asArraySerializer() {
            return this;
        }

        @Override
        public BeanSerializerBase withFilterId(Object filterId) {
            return this;
        }

        @Override
        public void serialize(Object bean, JsonGenerator gen, SerializerProvider provider) throws IOException {
            // no-op for base behaviour tests
        }
    }

    @JsonSerializableSchema(id = "test-schema-id")
    public static class SchemaAnnotatedBean {
        public String value;
    }

    public static class PlainSchemaBean {
        public int x;
    }

    private JavaType type(Class<?> cls) {
        return TypeFactory.defaultInstance().constructType(cls);
    }

    private TestSerializerBase newBase(Class<?> cls) {
        return new TestSerializerBase(type(cls), null,
                new BeanPropertyWriter[0], new BeanPropertyWriter[0]);
    }

    @Test
    public void testPropertiesIsEmptyByDefault() {
        TestSerializerBase ser = newBase(Object.class);
        Iterator<PropertyWriter> it = ser.properties();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testUsesObjectIdDefaultsToFalse() {
        assertFalse(newBase(Object.class).usesObjectId());
    }

    @Test
    public void testUsesObjectIdWithObjectIdWriter() {
        TestSerializerBase src = newBase(Object.class);
        ObjectIdWriter writer = ObjectIdWriter.construct(
                type(String.class), "id", null, null);
        TestSerializerBase withId = new TestSerializerBase(src, writer);
        assertTrue(withId.usesObjectId());
    }

    @Test
    public void testResolveWithNoPropertiesDoesNotRequireProvider() throws Exception {
        TestSerializerBase ser = newBase(Object.class);
        ser.resolve(null);
    }

    @Test
    public void testCopyWithNameTransformerNopKeepsProperties() {
        TestSerializerBase src = newBase(Object.class);
        TestSerializerBase copy = new TestSerializerBase(src, NameTransformer.NOP);
        assertNotNull(copy.properties());
        assertFalse(copy.properties().hasNext());
    }

    @Test
    public void testCopyWithEmptyIgnoredArrayCreatesCopy() {
        TestSerializerBase src = newBase(Object.class);
        TestSerializerBase copy = new TestSerializerBase(src, new String[0]);
        assertNotNull(copy.properties());
        assertFalse(copy.properties().hasNext());
    }

    @Test
    public void testGetSchemaWithoutAnnotation() {
        TestSerializerBase ser = newBase(PlainSchemaBean.class);
        JsonNode schema = ser.getSchema(null, PlainSchemaBean.class);
        assertNotNull(schema);
        assertTrue(schema.isObject());
    }

    @Test
    public void testGetSchemaReadsSerializableSchemaId() {
        TestSerializerBase ser = newBase(SchemaAnnotatedBean.class);
        JsonNode schema = ser.getSchema(null, SchemaAnnotatedBean.class);
        assertNotNull(schema);
        JsonNode idNode = schema.get("id");
        assertNotNull(idNode);
        assertEquals("test-schema-id", idNode.asText());
    }
}