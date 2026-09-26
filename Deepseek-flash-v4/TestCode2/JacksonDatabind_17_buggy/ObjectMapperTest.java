package com.fasterxml.jackson.databind;

import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.node.TreeNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.core.util.Version;
import java.util.List;

import static org.junit.Assert.*;

public class ObjectMapperTest {
    private ObjectMapper mapper;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    @Test
    public void testUseForTypeDefault() {
        ObjectMapper.DefaultTypeResolverBuilder builder = new ObjectMapper.DefaultTypeResolverBuilder(DefaultTyping.JAVA_LANG_OBJECT);
        TypeFactory tf = TypeFactory.defaultInstance();
        assertTrue(builder.useForType(tf.constructType(Object.class)));
        assertFalse(builder.useForType(tf.constructType(String.class)));
    }

    @Test
    public void testUseForTypeObjectAndNonConcrete() {
        ObjectMapper.DefaultTypeResolverBuilder builder = new ObjectMapper.DefaultTypeResolverBuilder(DefaultTyping.OBJECT_AND_NON_CONCRETE);
        TypeFactory tf = TypeFactory.defaultInstance();
        assertTrue(builder.useForType(tf.constructType(Object.class)));
        assertFalse(builder.useForType(tf.constructType(String.class)));
        assertTrue(builder.useForType(tf.constructType(List.class)));
        assertTrue(builder.useForType(tf.constructType(TreeNode.class)));
    }

    @Test
    public void testUseForTypeNonConcreteAndArrays() {
        ObjectMapper.DefaultTypeResolverBuilder builder = new ObjectMapper.DefaultTypeResolverBuilder(DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        TypeFactory tf = TypeFactory.defaultInstance();
        assertTrue(builder.useForType(tf.constructType(Object.class)));
        assertFalse(builder.useForType(tf.constructType(String.class)));
        assertTrue(builder.useForType(tf.constructType(List.class)));
        assertTrue(builder.useForType(tf.constructType(TreeNode.class)));

        assertTrue(builder.useForType(tf.constructArrayType(tf.constructType(Object.class))));
        assertFalse(builder.useForType(tf.constructArrayType(tf.constructType(String.class))));
        assertTrue(builder.useForType(tf.constructArrayType(tf.constructType(List.class))));
        assertTrue(builder.useForType(tf.constructArrayType(tf.constructType(TreeNode.class))));
    }

    @Test
    public void testUseForTypeNonFinal() {
        ObjectMapper.DefaultTypeResolverBuilder builder = new ObjectMapper.DefaultTypeResolverBuilder(DefaultTyping.NON_FINAL);
        TypeFactory tf = TypeFactory.defaultInstance();
        assertFalse(builder.useForType(tf.constructType(String.class)));
        assertTrue(builder.useForType(tf.constructType(Object.class)));
        assertTrue(builder.useForType(tf.constructType(List.class)));
        assertFalse(builder.useForType(tf.constructType(TreeNode.class)));

        assertFalse(builder.useForType(tf.constructArrayType(tf.constructType(String.class))));
        assertTrue(builder.useForType(tf.constructArrayType(tf.constructType(List.class))));
        assertTrue(builder.useForType(tf.constructArrayType(tf.constructType(Object.class))));
        assertFalse(builder.useForType(tf.constructArrayType(tf.constructType(TreeNode.class))));
    }

    @Test
    public void testCopy() {
        ObjectMapper copy = mapper.copy();
        assertNotNull(copy);
        assertNotSame(mapper, copy);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModuleNullName() {
        mapper.registerModule(new Module() {
            @Override
            public String getModuleName() { return null; }
            @Override
            public Version version() { return new Version(1,0,0,"","",""); }
            @Override
            public void setupModule(Module.SetupContext context) { }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModuleNullVersion() {
        mapper.registerModule(new Module() {
            @Override
            public String getModuleName() { return "test"; }
            @Override
            public Version version() { return null; }
            @Override
            public void setupModule(Module.SetupContext context) { }
        });
    }

    @Test
    public void testRegisterModuleValid() {
        Module module = new Module() {
            @Override
            public String getModuleName() { return "test"; }
            @Override
            public Version version() { return new Version(1,0,0,"","",""); }
            @Override
            public void setupModule(Module.SetupContext context) { }
        };
        assertSame(mapper, mapper.registerModule(module));
    }

    @Test
    public void testAddMixInAndFind() {
        mapper.addMixInAnnotations(String.class, Integer.class);
        assertEquals(Integer.class, mapper.findMixInClassFor(String.class));
        assertTrue(mapper.mixInCount() > 0);
    }

    @Test
    public void testConfigureMapperFeature() {
        mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
        assertTrue(mapper.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, false);
        assertFalse(mapper.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
    }
}