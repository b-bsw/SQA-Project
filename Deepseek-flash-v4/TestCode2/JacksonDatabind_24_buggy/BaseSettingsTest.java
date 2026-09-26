package com.fasterxml.jackson.databind.cfg;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TypeHandler;

public class BaseSettingsTest {

    private ClassIntrospector classIntrospector;
    private AnnotationIntrospector annotationIntrospector;
    private VisibilityChecker<?> visibilityChecker;
    private PropertyNamingStrategy propertyNamingStrategy;
    private TypeFactory typeFactory;
    private TypeResolverBuilder<?> typeResolverBuilder;
    private DateFormat dateFormat;
    private HandlerInstantiator handlerInstantiator;
    private Locale locale;
    private TimeZone timeZone;
    private Base64Variant base64Variant;
    private BaseSettings baseSettings;

    @Before
    public void setUp() {
        classIntrospector = new BasicClassIntrospector();
        annotationIntrospector = new JacksonAnnotationIntrospector();
        visibilityChecker = VisibilityChecker.Std.defaultInstance();
        propertyNamingStrategy = new PropertyNamingStrategy() {
            @Override
            public String nameForField(MapperConfig<?> config, AnnotatedField field, String defaultName) {
                throw new UnsupportedOperationException();
            }
            @Override
            public String nameForGetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
                throw new UnsupportedOperationException();
            }
            @Override
            public String nameForSetterMethod(MapperConfig<?> config, AnnotatedMethod method, String defaultName) {
                throw new UnsupportedOperationException();
            }
            @Override
            public String nameForConstructorParameter(MapperConfig<?> config, AnnotatedParameter ctorParam, String defaultName) {
                throw new UnsupportedOperationException();
            }
        };
        typeFactory = TypeFactory.defaultInstance();
        typeResolverBuilder = new TypeResolverBuilder<Object>() {
            @Override
            public TypeSerializer buildTypeSerializer(SerializationConfig config, JavaType baseType,
                    Collection<NamedType> subtypes) {
                throw new UnsupportedOperationException();
            }
            @Override
            public TypeDeserializer buildTypeDeserializer(DeserializationConfig config, JavaType baseType,
                    Collection<NamedType> subtypes) {
                throw new UnsupportedOperationException();
            }
            @Override
            public TypeIdResolver init(JavaType bt, TypeIdResolver idRes) {
                throw new UnsupportedOperationException();
            }
            @Override
            public Class<?> getDefaultImpl() {
                throw new UnsupportedOperationException();
            }
        };
        dateFormat = new StdDateFormat();
        handlerInstantiator = new HandlerInstantiator() {
            @Override
            public JsonSerializer<?> serializerInstance(SerializationConfig config,
                    Class<? extends JsonSerializer<?>> handlerClass) {
                throw new UnsupportedOperationException();
            }
            @Override
            public JsonDeserializer<?> deserializerInstance(DeserializationConfig config,
                    Class<? extends JsonDeserializer<?>> handlerClass) {
                throw new UnsupportedOperationException();
            }
            @Override
            public TypeIdResolver typeIdResolverInstance(SerializationConfig config,
                    Class<? extends TypeIdResolver> resolverClass) {
                throw new UnsupportedOperationException();
            }
            @Override
            public TypeHandler<?> typeHandlerInstance(SerializationConfig config,
                    Class<? extends TypeHandler<?>> handlerClass) {
                throw new UnsupportedOperationException();
            }
        };
        locale = Locale.US;
        timeZone = TimeZone.getTimeZone("America/New_York");
        base64Variant = Base64Variants.MIME;
        baseSettings = new BaseSettings(classIntrospector, annotationIntrospector, visibilityChecker,
                propertyNamingStrategy, typeFactory, typeResolverBuilder, dateFormat,
                handlerInstantiator, locale, timeZone, base64Variant);
    }

    @Test
    public void testConstructorAndGetters() {
        assertSame(classIntrospector, baseSettings.getClassIntrospector());
        assertSame(annotationIntrospector, baseSettings.getAnnotationIntrospector());
        assertSame(visibilityChecker, baseSettings.getVisibilityChecker());
        assertSame(propertyNamingStrategy, baseSettings.getPropertyNamingStrategy());
        assertSame(typeFactory, baseSettings.getTypeFactory());
        assertSame(typeResolverBuilder, baseSettings.getTypeResolverBuilder());
        assertSame(dateFormat, baseSettings.getDateFormat());
        assertSame(handlerInstantiator, baseSettings.getHandlerInstantiator());
        assertSame(locale, baseSettings.getLocale());
        assertSame(timeZone, baseSettings.getTimeZone());
        assertSame(base64Variant, baseSettings.getBase64Variant());
    }

    @Test
    public void testWithClassIntrospectorSameReturnsThis() {
        assertSame(baseSettings, baseSettings.withClassIntrospector(classIntrospector));
    }

    @Test
    public void testWithClassIntrospectorDifferentReturnsNew() {
        BaseSettings newSettings = baseSettings.withClassIntrospector(null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getClassIntrospector());
    }

    @Test
    public void testWithAnnotationIntrospectorSameReturnsThis() {
        assertSame(baseSettings, baseSettings.withAnnotationIntrospector(annotationIntrospector));
    }

    @Test
    public void testWithAnnotationIntrospectorDifferentReturnsNew() {
        BaseSettings newSettings = baseSettings.withAnnotationIntrospector(null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getAnnotationIntrospector());
    }

    @Test
    public void testWithInsertedAnnotationIntrospector() {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        BaseSettings newSettings = baseSettings.withInsertedAnnotationIntrospector(ai);
        assertNotSame(baseSettings, newSettings);
        assertNotNull(newSettings.getAnnotationIntrospector());
        assertTrue(newSettings.getAnnotationIntrospector() instanceof AnnotationIntrospectorPair);
    }

    @Test
    public void testWithAppendedAnnotationIntrospector() {
        AnnotationIntrospector ai = new JacksonAnnotationIntrospector();
        BaseSettings newSettings = baseSettings.withAppendedAnnotationIntrospector(ai);
        assertNotSame(baseSettings, newSettings);
        assertNotNull(newSettings.getAnnotationIntrospector());
        assertTrue(newSettings.getAnnotationIntrospector() instanceof AnnotationIntrospectorPair);
    }

    @Test
    public void testWithVisibilityCheckerSameReturnsThis() {
        assertSame(baseSettings, baseSettings.withVisibilityChecker(visibilityChecker));
    }

    @Test
    public void testWithVisibilityCheckerDifferentReturnsNew() {
        BaseSettings newSettings = baseSettings.withVisibilityChecker(null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getVisibilityChecker());
    }

    @Test
    public void testWithVisibility() {
        PropertyAccessor accessor = PropertyAccessor.FIELD;
        JsonAutoDetect.Visibility vis = JsonAutoDetect.Visibility.PUBLIC_ONLY;
        BaseSettings newSettings = baseSettings.withVisibility(accessor, vis);
        assertNotSame(baseSettings, newSettings);
        assertNotNull(newSettings.getVisibilityChecker());
        assertNotSame(visibilityChecker, newSettings.getVisibilityChecker());
    }

    @Test
    public void testWithPropertyNamingStrategySameReturnsThis() {
        assertSame(baseSettings, baseSettings.withPropertyNamingStrategy(propertyNamingStrategy));
    }

    @Test
    public void testWithPropertyNamingStrategyDifferentReturnsNew() {
        BaseSettings newSettings = baseSettings.withPropertyNamingStrategy(null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getPropertyNamingStrategy());
    }

    @Test
    public void testWithTypeFactorySameReturnsThis() {
        assertSame(baseSettings, baseSettings.withTypeFactory(typeFactory));
    }

    @Test
    public void testWithTypeFactoryDifferentReturnsNew() {
        BaseSettings newSettings = baseSettings.withTypeFactory(null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getTypeFactory());
    }

    @Test
    public void testWithTypeResolverBuilderSameReturnsThis() {
        assertSame(baseSettings, baseSettings.withTypeResolverBuilder(typeResolverBuilder));
    }

    @Test
    public void testWithTypeResolverBuilderDifferentReturnsNew() {
        BaseSettings newSettings = baseSettings.withTypeResolverBuilder(null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getTypeResolverBuilder());
    }

    @Test
    public void testWithDateFormatSameReturnsThis() {
        assertSame(baseSettings, baseSettings.withDateFormat(dateFormat));
    }

    @Test
    public void testWithDateFormatDifferentReturnsNew() {
        DateFormat other = new SimpleDateFormat("yyyy-MM-dd");
        BaseSettings newSettings = baseSettings.withDateFormat(other);
        assertNotSame(baseSettings, newSettings);
        assertSame(other, newSettings.getDateFormat());
        assertEquals(other.getTimeZone(), newSettings.getTimeZone());
    }

    @Test
    public void testWithDateFormatNullReturnsNewWithSameTimeZone() {
        BaseSettings newSettings = baseSettings.withDateFormat(null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getDateFormat());
        assertEquals(timeZone, newSettings.getTimeZone());
    }

    @Test
    public void testWithHandlerInstantiatorSameReturnsThis() {
        assertSame(baseSettings, baseSettings.withHandlerInstantiator(handlerInstantiator));
    }

    @Test
    public void testWithHandlerInstantiatorDifferentReturnsNew() {
        BaseSettings newSettings = baseSettings.withHandlerInstantiator(null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getHandlerInstantiator());
    }

    @Test
    public void testWithLocaleSameReturnsThis() {
        assertSame(baseSettings, baseSettings.with(locale));
    }

    @Test
    public void testWithLocaleDifferentReturnsNew() {
        BaseSettings newSettings = baseSettings.with((Locale) null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getLocale());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithTimeZoneNullThrowsException() {
        baseSettings.with((TimeZone) null);
    }

    @Test
    public void testWithTimeZoneWithStdDateFormat() {
        TimeZone newTz = TimeZone.getTimeZone("Europe/Paris");
        BaseSettings newSettings = baseSettings.with(newTz);
        assertNotSame(baseSettings, newSettings);
        assertEquals(newTz, newSettings.getTimeZone());
        DateFormat df = newSettings.getDateFormat();
        assertTrue(df instanceof StdDateFormat);
        assertEquals(newTz, df.getTimeZone());
    }

    @Test
    public void testWithTimeZoneWithOtherDateFormat() {
        DateFormat otherDf = new SimpleDateFormat("yyyy-MM-dd");
        TimeZone otherTz = TimeZone.getTimeZone("Asia/Tokyo");
        otherDf.setTimeZone(otherTz);
        BaseSettings settingsWithOtherDf = new BaseSettings(classIntrospector, annotationIntrospector,
                visibilityChecker, propertyNamingStrategy, typeFactory, typeResolverBuilder,
                otherDf, handlerInstantiator, locale, timeZone, base64Variant);
        TimeZone newTz = TimeZone.getTimeZone("America/Los_Angeles");
        BaseSettings newSettings = settingsWithOtherDf.with(newTz);
        assertNotSame(settingsWithOtherDf, newSettings);
        assertEquals(newTz, newSettings.getTimeZone());
        DateFormat resultDf = newSettings.getDateFormat();
        assertNotNull(resultDf);
        assertNotSame(otherDf, resultDf);
        assertTrue(resultDf instanceof SimpleDateFormat);
        assertEquals(newTz, resultDf.getTimeZone());
    }

    @Test
    public void testWithBase64VariantSameReturnsThis() {
        assertSame(baseSettings, baseSettings.with(base64Variant));
    }

    @Test
    public void testWithBase64VariantDifferentReturnsNew() {
        BaseSettings newSettings = baseSettings.with((Base64Variant) null);
        assertNotSame(baseSettings, newSettings);
        assertNull(newSettings.getBase64Variant());
    }
}