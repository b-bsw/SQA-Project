package com.fasterxml.jackson.databind.ser.std;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.*;
import com.fasterxml.jackson.databind.util.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.IOException;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.util.*;

public class BeanSerializerBaseTest {

    private ObjectMapper mapper;
    private TypeFactory typeFactory;
    private JavaType objectType;
    private BeanPropertyWriter prop1;
    private BeanPropertyWriter prop2;
    private TestBeanSerializer baseSerializer;

    // ---------- Inner stub classes ----------
    private static class SimpleBeanPropertyWriter extends BeanPropertyWriter {
        public SimpleBeanPropertyWriter(String name) {
            super(new SerializedString(name), null, null, null, null, null, false, null);
        }
        @Override
        public String getName() {
            return ((SerializedString)_name).getValue();
        }
    }

    private static class StubAnnotatedMember extends AnnotatedMember {
        private final Object value;
        public StubAnnotatedMember(Object v) { value = v; }
        @Override public Class<?> getDeclaringClass() { return Object.class; }
        @Override public String getName() { return "typeId"; }
        @Override public Type getGenericType() { return value.getClass(); }
        @Override public int getModifiers() { return 0; }
        @Override public Object getValue(Object pojo) { return value; }
        @Override public void setValue(Object pojo, Object v) {}
        @Override public Annotated withAnnotations(AnnotationMap a) { return this; }
        @Override public AnnotationMap getAllAnnotations() { return null; }
        @Override public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) { return null; }
        @Override public boolean hasAnnotation(Class<?> acls) { return false; }
        @Override public AnnotatedElement getAnnotated() { return null; }
        @Override public JavaType getType(TypeFactory tf) { return tf.constructType(value.getClass()); }
        @Override public String getFullName() { return "stub"; }
        @Override public int getAnnotationCount() { return 0; }
        @Override public boolean hasOneOf(Class<? extends java.lang.annotation.Annotation>[] a) { return false; }
    }

    private static class TestBeanSerializer extends BeanSerializerBase {
        public TestBeanSerializer(JavaType type, BeanSerializerBuilder builder,
                BeanPropertyWriter[] properties, BeanPropertyWriter[] filteredProperties) {
            super(type, builder, properties, filteredProperties);
        }
        public TestBeanSerializer(BeanSerializerBase src,
                BeanPropertyWriter[] properties, BeanPropertyWriter[] filteredProperties) {
            super(src, properties, filteredProperties);
        }
        public TestBeanSerializer(BeanSerializerBase src, ObjectIdWriter oiw) {
            super(src, oiw);
        }
        public TestBeanSerializer(BeanSerializerBase src, String[] toIgnore) {
            super(src, toIgnore);
        }
        public TestBeanSerializer(BeanSerializerBase src, NameTransformer unwrapper) {
            super(src, unwrapper);
        }
        public TestBeanSerializer(BeanSerializerBase src) {
            super(src);
        }
        @Override public BeanSerializerBase withObjectIdWriter(ObjectIdWriter oiw) {
            return new TestBeanSerializer(this, oiw);
        }
        @Override protected BeanSerializerBase withIgnorals(String[] toIgnore) {
            return new TestBeanSerializer(this, toIgnore);
        }
        @Override protected BeanSerializerBase asArraySerializer() { return this; }
        @Override protected BeanSerializerBase withFilterId(Object filterId) { return this; }
        @Override public void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {}
        public String callCustomTypeId(Object bean) { return _customTypeId(bean); }
    }

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        typeFactory = mapper.getTypeFactory();
        objectType = typeFactory.constructType(Object.class);
        prop1 = new SimpleBeanPropertyWriter("prop1");
        prop2 = new SimpleBeanPropertyWriter("prop2");
        BeanPropertyWriter[] props = new BeanPropertyWriter[]{prop1, prop2};
        BeanPropertyWriter[] filtered = new BeanPropertyWriter[]{prop1, prop2};
        // create base serializer using constructor with null builder -> all auxiliary fields null
        baseSerializer = new TestBeanSerializer(objectType, null, props, filtered);
    }

    // ---------- Tests ----------
    @Test
    public void testUsesObjectIdDefault() {
        assertFalse(baseSerializer.usesObjectId());
    }

    @Test
    public void testUsesObjectIdWithWriter() {
        ObjectIdWriter oiw = ObjectIdWriter.construct(
                typeFactory.constructType(String.class),
                (PropertyName) null,
                new ObjectIdGenerators.IntSequenceGenerator(),
                false);
        TestBeanSerializer ser = new TestBeanSerializer(baseSerializer, oiw);
        assertTrue(ser.usesObjectId());
    }

    @Test
    public void testCustomTypeIdNull() {
        // baseSerializer has _typeId == null because builder was null
        assertEquals("", baseSerializer.callCustomTypeId(new Object()));
    }

    @Test
    public void testCustomTypeIdString() throws Exception {
        // Create serializer with a builder that provides a String-returning typeId member
        AnnotatedMember typeIdMember = new StubAnnotatedMember("myType");
        AnnotatedClass ac = AnnotatedClass.construct(Object.class, mapper.getDeserializationConfig().getAnnotationIntrospector(), null);
        BasicBeanDescription beanDesc = new BasicBeanDescription(
                mapper.getSerializationConfig(), objectType, ac, null);
        BeanSerializerBuilder builder = new BeanSerializerBuilder(beanDesc) {
            @Override public AnnotatedMember getTypeId() { return typeIdMember; }
            @Override public AnyGetterWriter getAnyGetter() { return null; }
            @Override public Object getFilterId() { return null; }
            @Override public ObjectIdWriter getObjectIdWriter() { return null; }
        };
        BeanPropertyWriter[] props = new BeanPropertyWriter[]{prop1};
        TestBeanSerializer ser = new TestBeanSerializer(objectType, builder, props, props);
        assertEquals("myType", ser.callCustomTypeId(new Object()));
    }

    @Test
    public void testConstructorWithIgnored() {
        String[] toIgnore = new String[]{"prop1"};
        TestBeanSerializer ser = new TestBeanSerializer(baseSerializer, toIgnore);
        assertEquals(1, ser._props.length);
        assertEquals("prop2", ser._props[0].getName());
    }

    @Test
    public void testConstructorWithObjectIdWriter() {
        ObjectIdWriter oiw = ObjectIdWriter.construct(
                typeFactory.constructType(String.class),
                (PropertyName) null,
                new ObjectIdGenerators.IntSequenceGenerator(),
                true);
        TestBeanSerializer ser = new TestBeanSerializer(baseSerializer, oiw);
        assertNotNull(ser._objectIdWriter);
        assertTrue(ser._objectIdWriter.alwaysAsId);
    }

    @Test
    public void testRenameWithNullProps() throws Exception {
        // constructor with unwrapper, but props should be unchanged if null or empty
        NameTransformer dummy = new NameTransformer() {
            @Override public String transform(String name) { return name + "_x"; }
            @Override public NameTransformer reverse() { return this; }
        };
        BeanPropertyWriter[] empty = new BeanPropertyWriter[0];
        TestBeanSerializer src = new TestBeanSerializer(objectType, null, empty, null);
        TestBeanSerializer renamed = new TestBeanSerializer(src, dummy);
        assertEquals(0, renamed._props.length);
    }

    @Test
    public void testAsArraySerializer() {
        assertSame(baseSerializer, baseSerializer.asArraySerializer());
    }

    @Test
    public void testAcceptJsonFormatVisitorNull() throws Exception {
        // should not throw NPE
        baseSerializer.acceptJsonFormatVisitor(null, objectType);
    }
}