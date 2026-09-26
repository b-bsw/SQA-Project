package com.fasterxml.jackson.databind.ser;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.ser.impl.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;

import static org.junit.Assert.*;

public class BeanSerializerFactoryTest {

    private ObjectMapper mapper;
    private SerializerProvider prov;
    private SerializationConfig config;
    private BeanSerializerFactory factory;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        prov = mapper.getSerializerProvider();
        config = prov.getConfig();
        factory = new BeanSerializerFactory(null);
    }

    @Test
    public void testWithConfigSame() {
        SerializerFactoryConfig cfg = factory.getFactoryConfig();
        assertSame(factory, factory.withConfig(cfg));
    }

    @Test
    public void testWithConfigDifferent() {
        SerializerFactoryConfig cfg2 = new SerializerFactoryConfig();
        BeanSerializerFactory result = (BeanSerializerFactory) factory.withConfig(cfg2);
        assertNotNull(result);
        assertNotSame(factory, result);
        assertEquals(cfg2, result.getFactoryConfig());
    }

    @Test(expected = IllegalStateException.class)
    public void testWithConfigSubtype() {
        BeanSerializerFactory sub = new BeanSerializerFactory(null) {
        };
        sub.withConfig(new SerializerFactoryConfig());
    }

    @Test
    public void testIsPotentialBeanTypeTrue() {
        assertTrue(factory.isPotentialBeanType(SimpleBean.class));
    }

    @Test
    public void testIsPotentialBeanTypeFalse() {
        assertFalse(factory.isPotentialBeanType(Object.class));
    }

    @Test
    public void testConstructBeanSerializerBuilder() {
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        BeanSerializerBuilder builder = factory.constructBeanSerializerBuilder(beanDesc);
        assertNotNull(builder);
        assertEquals(beanDesc, builder.getBeanDescription());
    }

    @Test
    public void testConstructPropertyBuilder() {
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        PropertyBuilder pb = factory.constructPropertyBuilder(config, beanDesc);
        assertNotNull(pb);
    }

    @Test
    public void testFindBeanSerializerNonBeanType() throws JsonMappingException {
        JavaType type = mapper.constructType(Object.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonSerializer<Object> ser = factory.findBeanSerializer(prov, type, beanDesc);
        assertNull(ser);
    }

    @Test
    public void testFindBeanSerializerBeanType() throws JsonMappingException {
        JavaType type = mapper.constructType(SimpleBean.class);
        BeanDescription beanDesc = config.introspect(type);
        JsonSerializer<Object> ser = factory.findBeanSerializer(prov, type, beanDesc);
        assertNotNull(ser);
        assertTrue(ser instanceof BeanSerializer);
    }

    @Test
    public void testConstructObjectIdHandlerPropertyGenerator() throws JsonMappingException {
        JavaType type = mapper.constructType(BeanWithId.class);
        BeanDescription beanDesc = config.introspect(type);
        BeanSerializerBuilder builder = new BeanSerializerBuilder(beanDesc);
        List<BeanPropertyWriter> props = factory.findBeanProperties(prov, beanDesc, builder);
        ObjectIdWriter oiw = factory.constructObjectIdHandler(prov, beanDesc, props);
        assertNotNull(oiw);
        assertTrue(oiw.generator instanceof PropertyBasedObjectIdGenerator);
        assertEquals("id", props.get(0).getName());
    }

    @Test
    public void testConstructObjectIdHandlerOtherGenerator() throws JsonMappingException {
        JavaType type = mapper.constructType(BeanWithIdOther.class);
        BeanDescription beanDesc = config.introspect(type);
        BeanSerializerBuilder builder = new BeanSerializerBuilder(beanDesc);
        List<BeanPropertyWriter> props = factory.findBeanProperties(prov, beanDesc, builder);
        ObjectIdWriter oiw = factory.constructObjectIdHandler(prov, beanDesc, props);
        assertNotNull(oiw);
        assertFalse(oiw.generator instanceof PropertyBasedObjectIdGenerator);
        assertTrue(oiw.generator instanceof ObjectIdGenerators.IntSequenceGenerator);
    }

    @Test
    public void testFilterBeanPropertiesIgnored() throws JsonMappingException {
        BeanDescription beanDesc = config.introspect(mapper.constructType(BeanWithIgnored.class));
        BeanSerializerBuilder builder = new BeanSerializerBuilder(beanDesc);
        List<BeanPropertyWriter> props = factory.findBeanProperties(prov, beanDesc, builder);
        assertEquals(2, props.size());
        List<BeanPropertyWriter> filtered = factory.filterBeanProperties(config, beanDesc, props);
        assertEquals(1, filtered.size());
        assertEquals("id", filtered.get(0).getName());
    }

    @Test
    public void testProcessViewsWithViews() throws JsonMappingException {
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        BeanSerializerBuilder builder = new BeanSerializerBuilder(beanDesc);
        builder.setConfig(config);
        List<BeanPropertyWriter> props = factory.findBeanProperties(prov, beanDesc, builder);
        props.get(0).setViews(new Class<?>[]{ViewA.class});
        builder.setProperties(props);
        factory.processViews(config, builder);
        assertNotNull(getFilteredProperties(builder));
    }

    @Test
    public void testProcessViewsNoViewsWithInclusion() throws JsonMappingException {
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        BeanSerializerBuilder builder = new BeanSerializerBuilder(beanDesc);
        builder.setConfig(config);
        List<BeanPropertyWriter> props = factory.findBeanProperties(prov, beanDesc, builder);
        for (BeanPropertyWriter bpw : props) {
            bpw.setViews(null);
        }
        builder.setProperties(props);
        factory.processViews(config, builder);
        assertNull(getFilteredProperties(builder));
    }

    @Test
    public void testRemoveIgnorableTypesAccessorNull() {
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        List<BeanPropertyDefinition> defs = beanDesc.findProperties();
        BeanPropertyDefinition dummy = new BeanPropertyDefinition.Std(
                PropertyName.construct("dummy"), null, false, null, null, false, false);
        defs.add(dummy);
        int originalSize = defs.size();
        factory.removeIgnorableTypes(config, beanDesc, defs);
        assertTrue(defs.size() < originalSize);
    }

    @Test
    public void testFindPropertyTypeSerializerNullBuilder() throws JsonMappingException {
        JavaType baseType = mapper.constructType(String.class);
        BeanDescription beanDesc = config.introspect(mapper.constructType(SimpleBean.class));
        AnnotatedMember accessor = beanDesc.findProperties().get(0).getAccessor();
        TypeSerializer ts = factory.findPropertyTypeSerializer(baseType, config, accessor);
        assertNull(ts);
    }

    private Object getFilteredProperties(BeanSerializerBuilder builder) {
        try {
            java.lang.reflect.Field f = BeanSerializerBuilder.class.getDeclaredField("_filteredProperties");
            f.setAccessible(true);
            return f.get(builder);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static class SimpleBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    static class BeanWithId {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
    static class BeanWithIdOther {
        public int id;
    }

    @JsonIgnoreProperties({"name"})
    static class BeanWithIgnored {
        public int id;
        public String name;
    }

    interface ViewA {}
}