package com.fasterxml.jackson.databind;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.StringWriter;
import java.text.DateFormat;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SerializationConfigTest {

    private SerializationConfig config;

    @Before
    public void setUp() {
        config = new ObjectMapper().getSerializationConfig();
    }

    @Test
    public void testDefaultConfigState() {
        assertNull(config.getFilterProvider());
        assertNotNull(config.getDefaultPrettyPrinter());
        assertNotNull(config.getDefaultPropertyInclusion());
        assertNotNull(config.getDefaultPropertyInclusion(String.class));
        assertNotNull(config.getDefaultPropertyFormat(String.class));
        assertNotNull(config.getDefaultVisibilityChecker());
        assertTrue(config.hasSerializationFeatures(0));
        assertTrue(config.toString().contains("SerializationConfig"));
        assertEquals(JsonInclude.Include.ALWAYS, config.getSerializationInclusion());
    }

    @Test
    public void testWithMapperFeature() {
        MapperFeature feature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        assertFalse(config.isEnabled(feature));

        SerializationConfig c = config.with(feature);
        assertNotSame(config, c);
        assertTrue(c.isEnabled(feature));
        assertSame(c, c.with(feature));

        SerializationConfig c2 = c.without(feature);
        assertNotSame(c, c2);
        assertFalse(c2.isEnabled(feature));
        assertSame(c2, c2.without(feature));
    }

    @Test
    public void testWithMapperFeatureState() {
        MapperFeature feature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        assertSame(config, config.with(feature, false));

        SerializationConfig c = config.with(feature, true);
        assertNotSame(config, c);
        assertTrue(c.isEnabled(feature));
        assertSame(c, c.with(feature, true));
    }

    @Test
    public void testWithMapperFeaturesVarargs() {
        SerializationConfig c = config.with(
                MapperFeature.SORT_PROPERTIES_ALPHABETICALLY,
                MapperFeature.USE_ANNOTATIONS);
        assertTrue(c.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        assertTrue(c.isEnabled(MapperFeature.USE_ANNOTATIONS));

        SerializationConfig c2 = c.without(
                MapperFeature.SORT_PROPERTIES_ALPHABETICALLY,
                MapperFeature.USE_ANNOTATIONS);
        assertFalse(c2.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        assertFalse(c2.isEnabled(MapperFeature.USE_ANNOTATIONS));
    }

    @Test
    public void testWithSerializationFeature() {
        SerializationFeature feature = SerializationFeature.INDENT_OUTPUT;
        assertFalse(config.isEnabled(feature));

        SerializationConfig c = config.with(feature);
        assertNotSame(config, c);
        assertTrue(c.isEnabled(feature));
        assertSame(c, c.with(feature));
        assertSame(c, c.with(feature, feature));

        SerializationConfig c2 = c.without(feature);
        assertNotSame(c, c2);
        assertFalse(c2.isEnabled(feature));
        assertSame(c2, c2.without(feature));
    }

    @Test
    public void testWithSerializationFeatureVarargs() {
        SerializationConfig all = config.with(
                SerializationFeature.INDENT_OUTPUT,
                SerializationFeature.WRAP_ROOT_VALUE);
        assertTrue(all.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertTrue(all.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));

        SerializationConfig none = all.withoutFeatures(
                SerializationFeature.INDENT_OUTPUT,
                SerializationFeature.WRAP_ROOT_VALUE);
        assertFalse(none.isEnabled(SerializationFeature.INDENT_OUTPUT));
        assertFalse(none.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));

        assertSame(config, config.withFeatures(new SerializationFeature[0]));
        assertSame(config, config.withoutFeatures(new SerializationFeature[0]));
    }

    @Test
    public void testWithJsonGeneratorFeature() {
        JsonGenerator.Feature feature = JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        JsonFactory factory = new JsonFactory();

        SerializationConfig c = config.with(feature);
        assertNotSame(config, c);
        assertTrue(c.isEnabled(feature, factory));
        assertSame(c, c.with(feature));

        SerializationConfig c2 = c.without(feature);
        assertNotSame(c, c2);
        assertFalse(c2.isEnabled(feature, factory));
        assertSame(c2, c2.without(feature));
    }

    @Test
    public void testWithJsonGeneratorFeaturesVarargs() {
        JsonGenerator.Feature f1 = JsonGenerator.Feature.QUOTE_FIELD_NAMES;
        JsonGenerator.Feature f2 = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS;
        JsonFactory factory = new JsonFactory();

        SerializationConfig c = config.withFeatures(f1, f2);
        assertTrue(c.isEnabled(f1, factory));
        assertTrue(c.isEnabled(f2, factory));

        SerializationConfig c2 = c.withoutFeatures(f1, f2);
        assertFalse(c2.isEnabled(f1, factory));
        assertFalse(c2.isEnabled(f2, factory));
    }

    @Test
    public void testWithFormatFeature() {
        FormatFeature feature = JsonGenerator.Feature.QUOTE_FIELD_NAMES;

        SerializationConfig c = config.with(feature);
        assertNotSame(config, c);
        assertSame(c, c.with(feature));

        SerializationConfig c2 = c.without(feature);
        assertNotSame(c, c2);
        assertSame(c2, c2.without(feature));
    }

    @Test
    public void testWithDateFormat() {
        SerializationConfig c = config.with((DateFormat) null);
        assertTrue(c.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));

        SerializationConfig c2 = config.with(DateFormat.getDateTimeInstance());
        assertNotSame(config, c2);
        assertFalse(c2.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS));
    }

    @Test
    public void testWithSubtypeResolver() {
        SerializationConfig c = config.with((SubtypeResolver) null);
        assertNotSame(config, c);
        assertSame(c, c.with((SubtypeResolver) null));
    }

    @Test
    public void testWithFiltersAndDefaultPrettyPrinter() {
        SimpleFilterProvider filters = new SimpleFilterProvider();
        SerializationConfig c = config.withFilters(filters);
        assertNotSame(config, c);
        assertSame(filters, c.getFilterProvider());
        assertSame(c, c.withFilters(filters));
        assertSame(config, config.withFilters(null));

        SerializationConfig noPP = config.withDefaultPrettyPrinter(null);
        assertNotSame(config, noPP);
        assertNull(noPP.getDefaultPrettyPrinter());
        assertNull(noPP.constructDefaultPrettyPrinter());

        assertNotNull(config.constructDefaultPrettyPrinter());
    }

    @Test
    public void testWithRootNameAndView() {
        assertSame(config, config.withRootName(null));

        PropertyName root = PropertyName.construct("root");
        SerializationConfig c = config.withRootName(root);
        assertNotSame(config, c);
        assertTrue(c.useRootWrapping());
        assertSame(c, c.withRootName(root));

        assertTrue(config.with(SerializationFeature.WRAP_ROOT_VALUE).useRootWrapping());
        assertFalse(config.withRootName(PropertyName.construct("")).useRootWrapping());

        assertSame(config, config.withView(null));
        SerializationConfig viewCfg = config.withView(String.class);
        assertNotSame(config, viewCfg);
        assertSame(viewCfg, viewCfg.withView(String.class));
    }

    @Test
    public void testInitialize() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator g = new JsonFactory().createGenerator(sw);
        config.initialize(g);
        assertNull(g.getPrettyPrinter());

        SerializationConfig indent = config.with(SerializationFeature.INDENT_OUTPUT);
        StringWriter sw2 = new StringWriter();
        JsonGenerator g2 = new JsonFactory().createGenerator(sw2);
        indent.initialize(g2);
        assertNotNull(g2.getPrettyPrinter());
    }

    @Test
    public void testGetAnnotationIntrospector() {
        assertNotNull(config.getAnnotationIntrospector());

        SerializationConfig noAnnotations = config.without(MapperFeature.USE_ANNOTATIONS);
        assertSame(AnnotationIntrospector.nopInstance(), noAnnotations.getAnnotationIntrospector());
    }

    @Test
    public void testGetDefaultVisibilityChecker() {
        assertNotNull(config.getDefaultVisibilityChecker());

        SerializationConfig noGetters = config.without(MapperFeature.AUTO_DETECT_GETTERS);
        assertEquals(Visibility.NONE,
                noGetters.getDefaultVisibilityChecker().getVisibility(PropertyAccessor.GETTER));
    }

    @Test
    public void testSerializationInclusion() {
        SerializationConfig c = config.withSerializationInclusion(JsonInclude.Include.NON_NULL);
        assertNotSame(config, c);
        assertEquals(JsonInclude.Include.NON_NULL, c.getSerializationInclusion());
        assertEquals(JsonInclude.Include.NON_NULL, c.getDefaultPropertyInclusion().getValueInclusion());
    }

    @Test
    public void testIntrospect() {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertNotNull(config.introspect(type));
        assertNotNull(config.introspectClassAnnotations(type));
        assertNotNull(config.introspectDirectClassAnnotations(type));
    }

    @Test(expected = NullPointerException.class)
    public void testWithNullSerializationFeatureThrowsNPE() {
        config.with((SerializationFeature) null);
    }

    @Test(expected = NullPointerException.class)
    public void testWithNullMapperFeatureArrayThrowsNPE() {
        config.with((MapperFeature[]) null);
    }
}