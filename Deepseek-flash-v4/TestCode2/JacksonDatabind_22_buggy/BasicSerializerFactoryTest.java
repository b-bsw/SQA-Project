package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.*;
import com.fasterxml.jackson.databind.ser.std.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;

public class BasicSerializerFactoryTest {
    private static class TestBasicSerializerFactory extends BasicSerializerFactory {
        public TestBasicSerializerFactory() { super(new SerializerFactoryConfig()); }
        @Override
        public SerializerFactory withConfig(SerializerFactoryConfig config) { return new TestBasicSerializerFactory(config); }
        @Override
        public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType type) throws JsonMappingException { return null; }
        @Override
        protected Iterable<Serializers> customSerializers() { return Collections.emptyList(); }
    }

    private TestBasicSerializerFactory factory;
    private ObjectMapper mapper;
    private TypeFactory typeFactory;
    private SerializationConfig config;
    private SerializerProvider prov;

    @Before
    public void setUp() {
        factory = new TestBasicSerializerFactory();
        mapper = new ObjectMapper();
        typeFactory = mapper.getTypeFactory();
        config = mapper.getSerializationConfig();
        prov = mapper.getSerializerProvider();
    }

    @Test
    public void testFindSerializerByLookup() {
        assertNotNull("String serializer", factory.findSerializerByLookup(typeFactory.constructType(String.class), config, null, false));
        assertNotNull("boolean serializer", factory.findSerializerByLookup(typeFactory.constructType(Boolean.TYPE), config, null, false));
        assertNull("Object class returns null", factory.findSerializerByLookup(typeFactory.constructType(Object.class), config, null, false));
    }

    @Test
    public void testFindSerializerByPrimaryType() throws Exception {
        assertTrue(factory.findSerializerByPrimaryType(prov, typeFactory.constructType(Calendar.class), config.introspectClassAnnotations(Calendar.class), false) instanceof CalendarSerializer);
        assertTrue(factory.findSerializerByPrimaryType(prov, typeFactory.constructType(java.util.Date.class), config.introspectClassAnnotations(java.util.Date.class), false) instanceof DateSerializer);
        assertTrue(factory.findSerializerByPrimaryType(prov, typeFactory.constructType(ByteBuffer.class), config.introspectClassAnnotations(ByteBuffer.class), false) instanceof ByteBufferSerializer);
        assertTrue(factory.findSerializerByPrimaryType(prov, typeFactory.constructType(InetAddress.class), config.introspectClassAnnotations(InetAddress.class), false) instanceof InetAddressSerializer);
        assertTrue(factory.findSerializerByPrimaryType(prov, typeFactory.constructType(InetSocketAddress.class), config.introspectClassAnnotations(InetSocketAddress.class), false) instanceof InetSocketAddressSerializer);
        assertSame(ToStringSerializer.instance, factory.findSerializerByPrimaryType(prov, typeFactory.constructType(java.nio.charset.Charset.class), config.introspectClassAnnotations(java.nio.charset.Charset.class), false));
        assertTrue(factory.findSerializerByPrimaryType(prov, typeFactory.constructType(Integer.class), config.introspectClassAnnotations(Integer.class), false) instanceof NumberSerializer);
        assertNotNull("Enum serializer", factory.findSerializerByPrimaryType(prov, typeFactory.constructType(Thread.State.class), config.introspectClassAnnotations(Thread.State.class), false));
    }

    @Test
    public void testFindSerializerByAddonType() throws Exception {
        assertTrue(factory.findSerializerByAddonType(config, typeFactory.constructType(new ArrayList<String>().iterator().getClass()), config.introspectClassAnnotations(Iterator.class), false) instanceof IteratorSerializer);
        assertTrue(factory.findSerializerByAddonType(config, typeFactory.constructType(new ArrayList<String>().getClass()), config.introspectClassAnnotations(Iterable.class), false) instanceof IterableSerializer);
        assertSame(ToStringSerializer.instance, factory.findSerializerByAddonType(config, typeFactory.constructType(StringBuilder.class), config.introspectClassAnnotations(CharSequence.class), false));
    }

    @Test
    public void testBuildEnumSerializer() throws Exception {
        JavaType enumType = typeFactory.constructType(Thread.State.class);
        BeanDescription beanDesc = config.introspect(enumType);
        assertTrue(factory.buildEnumSerializer(config, enumType, beanDesc) instanceof EnumSerializer);
    }

    @Test
    public void testBuildCollectionSerializer() throws Exception {
        JavaType enumSetType = typeFactory.constructType(EnumSet.noneOf(Thread.State.class).getClass());
        BeanDescription enumSetDesc = config.introspectClassAnnotations(enumSetType.getRawClass());
        assertTrue("EnumSet", factory.buildCollectionSerializer(config, (CollectionType) enumSetType, enumSetDesc, false, null, null) instanceof EnumSetSerializer);
        JavaType arrayListType = typeFactory.constructType(new ArrayList<String>().getClass());
        BeanDescription alDesc = config.introspectClassAnnotations(arrayListType.getRawClass());
        assertTrue("ArrayList", factory.buildCollectionSerializer(config, (CollectionType) arrayListType, alDesc, false, null, null) instanceof IndexedListSerializer);
        JavaType llType = typeFactory.constructType(new LinkedList<String>().getClass());
        BeanDescription llDesc = config.introspectClassAnnotations(llType.getRawClass());
        assertTrue("LinkedList", factory.buildCollectionSerializer(config, (CollectionType) llType, llDesc, false, null, null) instanceof StringCollectionSerializer);
    }

    @Test
    public void testBuildMapSerializer() throws Exception {
        JavaType mapType = typeFactory.constructType(new HashMap<String,String>().getClass());
        BeanDescription mapDesc = config.introspect(mapType);
        assertTrue(factory.buildMapSerializer(config, (MapType) mapType, mapDesc, false, null, null, null) instanceof MapSerializer);
    }

    @Test
    public void testBuildArraySerializer() throws Exception {
        JavaType arrayType = typeFactory.constructType(String[].class);
        BeanDescription beanDesc = config.introspectClassAnnotations(arrayType.getRawClass());
        assertSame(StringArraySerializer.instance, factory.buildArraySerializer(config, (ArrayType) arrayType, beanDesc, false, null, null));
    }

    @Test
    public void testCreateKeySerializer() throws Exception {
        assertNotNull(factory.createKeySerializer(config, typeFactory.constructType(String.class), null));
    }

    @Test
    public void testCreateTypeSerializer() throws Exception {
        assertNull(factory.createTypeSerializer(config, typeFactory.constructType(String.class)));
    }

    @Test
    public void testVerifyAsClass() {
        assertNull(factory._verifyAsClass(null, "test", Object.class));
        assertNull(factory._verifyAsClass(Object.class, "test", Object.class));
        assertNotNull(factory._verifyAsClass(String.class, "test", Object.class));
    }

    @Test
    public void testUsesStaticTyping() throws Exception {
        JavaType type = typeFactory.constructType(String.class);
        BeanDescription beanDesc = config.introspectClassAnnotations(type.getRawClass());
        assertFalse(factory.usesStaticTyping(config, beanDesc, null));
    }
}