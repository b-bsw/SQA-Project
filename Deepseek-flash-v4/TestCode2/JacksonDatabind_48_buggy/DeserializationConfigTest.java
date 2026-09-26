package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;

public class DeserializationConfigTest {

    private enum TestFormatFeature implements FormatFeature {
        READ_FEATURE_A, READ_FEATURE_B;

        @Override
        public int getMask() {
            return 1 << ordinal();
        }

        public boolean enabledByDefault() {
            return false;
        }
    }

    private DeserializationConfig config;

    @Before
    public void setUp() {
        config = createConfig();
    }

    private DeserializationConfig createConfig() {
        return new DeserializationConfig(BaseSettings.std(),
                new StdSubtypeResolver(),
                new SimpleMixInResolver(),
                new RootNameLookup());
    }

    @Test
    public void testDefaultsAndIntrospection() throws Exception {
        assertNotNull(config);
        assertNull(config.getProblemHandlers());
        assertSame(JsonNodeFactory.instance, config.getNodeFactory());
        assertFalse(config.useRootWrapping());
        assertFalse(config.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
        assertFalse(config.hasDeserializationFeatures(DeserializationFeature.UNWRAP_ROOT_VALUE.getMask()));

        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        assertNotNull(config.introspectClassAnnotations(stringType));
        assertNotNull(config.introspectDirectClassAnnotations(stringType));
        assertNotNull(config.introspect(stringType));
        assertNotNull(config.introspectForCreation(stringType));
        assertNotNull(config.introspectForBuilder(stringType));
        assertNull(config.findTypeDeserializer(stringType));
    }

    @Test
    public void testDeserializationFeatureWithWithout() {
        DeserializationFeature f = DeserializationFeature.UNWRAP_ROOT_VALUE;

        assertFalse(config.isEnabled(f));
        assertSame(config, config.without(f));
        assertSame(config, config.withoutFeatures(new DeserializationFeature[0]));

        DeserializationConfig c = config.with(f);
        assertNotSame(config, c);
        assertTrue(c.isEnabled(f));
        assertTrue((c.getDeserializationFeatures() & f.getMask()) != 0);
        assertSame(c, c.with(f));
        assertSame(c, c.withFeatures(f));

        DeserializationConfig c2 = c.without(f);
        assertNotSame(c, c2);
        assertFalse(c2.isEnabled(f));
        assertSame(c2, c2.without(f));
    }

    @Test
    public void testDeserializationFeatureCombinations() {
        DeserializationFeature f1 = DeserializationFeature.UNWRAP_ROOT_VALUE;
        DeserializationFeature f2 = DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        int mask = f1.getMask() | f2.getMask();

        DeserializationConfig c = config.with(f1, f2);
        assertNotSame(config, c);
        assertTrue(c.hasDeserializationFeatures(mask));
        assertTrue(c.hasSomeOfFeatures(mask));

        DeserializationConfig c2 = c.without(f1, f2);
        assertFalse(c2.hasSomeOfFeatures(mask));

        DeserializationConfig c3 = config.withFeatures(f1, f2);
        assertNotSame(config, c3);
        assertTrue(c3.hasDeserializationFeatures(mask));
    }

    @Test
    public void testMapperFeatureWithWithout() {
        MapperFeature f = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;

        assertSame(config, config.with(f, false));
        assertSame(config, config.without(f));

        DeserializationConfig c = config.with(f);
        assertNotSame(config, c);
        assertSame(c, c.with(f));
        assertSame(c, c.with(f, true));

        DeserializationConfig c2 = c.without(f);
        assertNotSame(c, c2);
        assertSame(c2, c2.without(f));
        assertSame(c2, c2.with(f, false));
    }

    @Test
    public void testWithRootNameViewContextAttributes() {
        assertSame(config, config.withRootName(null));
        assertSame(config, config.withView(null));

        DeserializationConfig named = config.withRootName(PropertyName.construct("root"));
        assertNotSame(config, named);
        assertTrue(named.useRootWrapping());
        assertSame(named, named.withRootName(PropertyName.construct("root")));

        DeserializationConfig empty = config.withRootName(PropertyName.construct(""));
        assertFalse(empty.useRootWrapping());

        DeserializationConfig unwrap = config.with(DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(unwrap.useRootWrapping());

        DeserializationConfig view = config.withView(String.class);
        assertNotSame(config, view);
        assertSame(view, view.withView(String.class));

        ContextAttributes attrs = config.getAttributes();
        assertSame(config, config.with(attrs));

        DeserializationConfig attrsC = config.with(ContextAttributes.getEmpty().withPerCallAttribute("k", "v"));
        assertNotSame(config, attrsC);
        assertSame(attrsC, attrsC.with(attrsC.getAttributes()));
    }

    @Test
    public void testSubtypeResolverNodeFactoryAndProblemHandlers() {
        assertSame(config, config.with(config.getSubtypeResolver()));

        DeserializationConfig c = config.with(new StdSubtypeResolver());
        assertNotSame(config, c);
        assertSame(c, c.with(c.getSubtypeResolver()));

        assertSame(config, config.with(JsonNodeFactory.instance));

        JsonNodeFactory nf = new JsonNodeFactory();
        DeserializationConfig c2 = config.with(nf);
        assertNotSame(config, c2);
        assertSame(nf, c2.getNodeFactory());

        DeserializationProblemHandler h = new DeserializationProblemHandler() {};
        DeserializationConfig c3 = config.withHandler(h);
        assertNotSame(config, c3);
        assertSame(h, c3.getProblemHandlers().value());
        assertSame(c3, c3.withHandler(h));

        DeserializationConfig c4 = c3.withNoProblemHandlers();
        assertNull(c4.getProblemHandlers());
        assertSame(config, config.withNoProblemHandlers());
    }

    @Test
    public void testAnnotationIntrospectorAndVisibility() {
        assertNotNull(config.getAnnotationIntrospector());

        DeserializationConfig noAnn = config.with(MapperFeature.USE_ANNOTATIONS, false);
        assertSame(NopAnnotationIntrospector.instance, noAnn.getAnnotationIntrospector());

        DeserializationConfig vis = config.without(MapperFeature.AUTO_DETECT_SETTERS,
                MapperFeature.AUTO_DETECT_CREATORS, MapperFeature.AUTO_DETECT_FIELDS);
        assertNotSame(config.getDefaultVisibilityChecker(), vis.getDefaultVisibilityChecker());

        assertNotNull(config.with(VisibilityChecker.Std.defaultInstance()));
        assertNotSame(config, config.withVisibility(PropertyAccessor.FIELD, Visibility.NONE));
    }

    @Test
    public void testDefaultInclusionAndFormat() {
        assertSame(MapperConfigBase.EMPTY_INCLUDE, config.getDefaultPropertyInclusion());
        assertSame(MapperConfigBase.EMPTY_INCLUDE, config.getDefaultPropertyInclusion(String.class));
        assertSame(MapperConfigBase.EMPTY_FORMAT, config.getDefaultPropertyFormat(String.class));
    }

    @Test
    public void testParserFeatureWithWithoutIsEnabled() {
        JsonParser.Feature feat = JsonParser.Feature.ALLOW_COMMENTS;
        JsonFactory factory = new JsonFactory();

        assertFalse(config.isEnabled(feat, factory));
        assertTrue(config.isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE, factory));

        DeserializationConfig on = config.with(feat);
        assertNotSame(config, on);
        assertTrue(on.isEnabled(feat, factory));
        assertSame(on, on.with(feat));

        DeserializationConfig off = config.without(feat);
        assertNotSame(config, off);
        assertFalse(off.isEnabled(feat, factory));
        assertSame(off, off.without(feat));

        DeserializationConfig both = config.withFeatures(feat, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        assertTrue(both.isEnabled(feat, factory));
        assertTrue(both.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, factory));

        DeserializationConfig neither = both.withoutFeatures(feat, JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES);
        assertFalse(neither.isEnabled(feat, factory));
        assertFalse(neither.isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, factory));
    }

    @Test
    public void testFormatFeatureMethods() throws Exception {
        DeserializationConfig c = config.with(TestFormatFeature.READ_FEATURE_A);
        assertNotSame(config, c);

        DeserializationConfig c2 = c.without(TestFormatFeature.READ_FEATURE_A);
        assertNotSame(c, c2);

        DeserializationConfig c3 = config.withFeatures(TestFormatFeature.READ_FEATURE_A,
                TestFormatFeature.READ_FEATURE_B);
        assertNotSame(config, c3);

        DeserializationConfig c4 = c3.withoutFeatures(TestFormatFeature.READ_FEATURE_A,
                TestFormatFeature.READ_FEATURE_B);
        assertNotSame(c3, c4);

        JsonParser p = new JsonFactory().createParser("{}");
        try {
            c.initialize(p);
        } finally {
            p.close();
        }
    }

    @Test
    public void testInitialize() throws Exception {
        DeserializationConfig c = config.with(JsonParser.Feature.ALLOW_COMMENTS);
        JsonParser p = new JsonFactory().createParser("{}");
        try {
            c.initialize(p);
            assertTrue(p.isEnabled(JsonParser.Feature.ALLOW_COMMENTS));
        } finally {
            p.close();
        }
    }

    @Test
    public void testWithBaseSettingsComponents() {
        assertSame(config, config.with(config.getBaseSettings().getClassIntrospector()));

        DeserializationConfig c1 = config.with(new JacksonAnnotationIntrospector());
        assertNotSame(config, c1);
        assertSame(c1, c1.with(c1.getAnnotationIntrospector()));

        DeserializationConfig c2 = config.with(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        assertNotNull(c2);

        assertNotNull(config.with(VisibilityChecker.Std.defaultInstance()));
        assertNotNull(config.with(TypeFactory.defaultInstance()));
        assertNotSame(config, config.with(new StdTypeResolverBuilder()));
    }

    @Test
    public void testWithSimpleBaseSetters() {
        assertNotSame(config, config.with(new SimpleDateFormat("yyyy-MM-dd")));
        assertNotSame(config, config.with(new Locale("xx", "XX")));
        assertNotSame(config, config.with(TimeZone.getTimeZone("GMT+14:00")));
        assertNotSame(config, config.with(Base64Variants.PEM));
    }

    @Test
    public void testWithInsertedAppendedAnnotationIntrospector() {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        assertNotSame(config, config.withInsertedAnnotationIntrospector(ai));
        assertNotSame(config, config.withAppendedAnnotationIntrospector(ai));
    }
}