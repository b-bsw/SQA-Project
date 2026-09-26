package org.mockito.internal.creation.bytebuddy;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Set;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.creation.instance.ClassInstantiator;
import org.mockito.internal.creation.instance.InstantiationException;
import org.mockito.invocation.MockHandler;
import org.mockito.mock.MockCreationSettings;
import org.mockito.mock.SerializableMode;

public class ByteBuddyMockMakerTest {

    private ByteBuddyMockMaker mockMaker;
    private StubClassInstantiator stubInstantiator;
    private StubCachingMockBytecodeGenerator stubGenerator;

    @Before
    public void setUp() throws Exception {
        mockMaker = new ByteBuddyMockMaker();
        stubInstantiator = new StubClassInstantiator();
        stubGenerator = new StubCachingMockBytecodeGenerator();
        injectField("classInstantiator", stubInstantiator);
        injectField("cachingMockBytecodeGenerator", stubGenerator);
    }

    private void injectField(String fieldName, Object value) throws Exception {
        Field field = ByteBuddyMockMaker.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
        field.set(mockMaker, value);
    }

    // --- Stub classes ---

    static class StubClassInstantiator implements ClassInstantiator {
        Object objectToInstantiate;

        @Override
        public Object instantiate(Class<?> cls) throws InstantiationException {
            if (objectToInstantiate == null) {
                throw new InstantiationException("instantiation failed");
            }
            return objectToInstantiate;
        }
    }

    static class StubCachingMockBytecodeGenerator extends CachingMockBytecodeGenerator {
        Class<?> generatedClass;

        @Override
        public <T> Class<? extends T> get(Class<T> type, Set<Class<?>> interfaces) {
            return (Class<? extends T>) generatedClass;
        }
    }

    static class StubMockCreationSettings<T> implements MockCreationSettings<T> {
        private final Class<T> typeToMock;
        private final SerializableMode serializableMode;
        private final Set<Class<?>> extraInterfaces;

        StubMockCreationSettings(Class<T> typeToMock, SerializableMode mode, Set<Class<?>> extraIfaces) {
            this.typeToMock = typeToMock;
            this.serializableMode = mode;
            this.extraInterfaces = extraIfaces;
        }

        @Override
        public Class<T> getTypeToMock() { return typeToMock; }

        @Override
        public SerializableMode getSerializableMode() { return serializableMode; }

        @Override
        public Set<Class<?>> getExtraInterfaces() { return extraInterfaces; }

        // Unused methods – just return defaults
        @Override public boolean isSerializable() { return false; }
        @Override public boolean isUsingConstructor() { return false; }
        @Override public Object getSerializableModeRaw() { return null; }
        @Override public Object getSpiedInstance() { return null; }
        @Override public Object getDefaultAnswer() { return null; }
        @Override public boolean isStubOnly() { return false; }
        @Override public boolean isLenient() { return false; }
        @Override public boolean isStripAnnotations() { return false; }
        @Override public boolean isPreferInterfaceOverCglib() { return false; }
        @Override public String getName() { return null; }
    }

    static class StubInternalMockHandler implements InternalMockHandler {
        @Override
        public Object handle(org.mockito.invocation.Invocation invocation) throws Throwable {
            return null;
        }
    }

    static class StubMockHandler implements MockHandler {
        @Override
        public Object handle(org.mockito.invocation.Invocation invocation) throws Throwable {
            return null;
        }
    }

    static class SimpleMockAccess implements MockMethodInterceptor.MockAccess {
        private MockMethodInterceptor interceptor;

        @Override
        public void setMockitoInterceptor(MockMethodInterceptor interceptor) {
            this.interceptor = interceptor;
        }

        @Override
        public MockMethodInterceptor getMockitoInterceptor() {
            return interceptor;
        }
    }

    static class SimpleMockMethodInterceptor extends MockMethodInterceptor {
        private final MockHandler handler;

        SimpleMockMethodInterceptor(MockHandler handler, MockCreationSettings settings) {
            super(handler instanceof InternalMockHandler ? (InternalMockHandler) handler : null, settings);
            this.handler = handler;
        }

        @Override
        public MockHandler getMockHandler() {
            return handler;
        }
    }

    // --- Helper classes for type hierarchy ---

    static class SomeClass {
        // no methods
    }

    static class SomeSubClass extends SomeClass implements MockMethodInterceptor.MockAccess {
        private MockMethodInterceptor interceptor;

        @Override
        public void setMockitoInterceptor(MockMethodInterceptor interceptor) {
            this.interceptor = interceptor;
        }

        @Override
        public MockMethodInterceptor getMockitoInterceptor() {
            return interceptor;
        }
    }

    static class IncompatibleClass {
        // does not extend SomeClass
    }

    // --- Test cases ---

    @Test(expected = MockitoException.class)
    public void createMockShouldThrowExceptionWhenSerializableAcrossClassloaders() {
        StubMockCreationSettings<SomeClass> settings = new StubMockCreationSettings<>(
                SomeClass.class, SerializableMode.ACROSS_CLASSLOADERS, Collections.<Class<?>>emptySet());
        mockMaker.createMock(settings, new StubMockHandler());
    }

    @Test
    public void createMockShouldReturnValidMock() {
        // Set up stubs
        SomeSubClass mockInstance = new SomeSubClass();
        stubInstantiator.objectToInstantiate = mockInstance;
        stubGenerator.generatedClass = SomeSubClass.class;

        StubInternalMockHandler handler = new StubInternalMockHandler();
        StubMockCreationSettings<SomeClass> settings = new StubMockCreationSettings<>(
                SomeClass.class, SerializableMode.NONE, Collections.<Class<?>>emptySet());

        SomeClass mock = mockMaker.createMock(settings, handler);
        assertNotNull("Mock should not be null", mock);
        assertTrue("Mock should be instance of SomeClass", mock instanceof SomeClass);
        assertTrue("Mock should be instance of MockAccess", mock instanceof MockMethodInterceptor.MockAccess);

        MockMethodInterceptor.MockAccess access = (MockMethodInterceptor.MockAccess) mock;
        assertNotNull("Interceptor should be set", access.getMockitoInterceptor());
        assertSame("Handler should be the one supplied", handler, access.getMockitoInterceptor().getMockHandler());
    }

    @Test(expected = MockitoException.class)
    public void createMockShouldThrowExceptionWhenClassCastOccurs() {
        // Instantiate an incompatible object
        IncompatibleClass incompatible = new IncompatibleClass();
        stubInstantiator.objectToInstantiate = incompatible;
        stubGenerator.generatedClass = IncompatibleClass.class; // ensure cast in ensureMockAssignable will fail

        StubMockCreationSettings<SomeClass> settings = new StubMockCreationSettings<>(
                SomeClass.class, SerializableMode.NONE, Collections.<Class<?>>emptySet());
        mockMaker.createMock(settings, new StubMockHandler());
    }

    @Test(expected = MockitoException.class)
    public void createMockShouldThrowExceptionWhenInstantiationFails() throws Exception {
        stubInstantiator.objectToInstantiate = null; // will cause instantiate to throw
        stubGenerator.generatedClass = SomeSubClass.class;

        StubMockCreationSettings<SomeClass> settings = new StubMockCreationSettings<>(
                SomeClass.class, SerializableMode.NONE, Collections.<Class<?>>emptySet());
        mockMaker.createMock(settings, new StubMockHandler());
    }

    @Test
    public void getHandlerShouldReturnNullForNonMockAccess() {
        assertNull("null handler for non-MockAccess object", mockMaker.getHandler("not a mock"));
        assertNull("null handler for null", mockMaker.getHandler(null));
    }

    @Test
    public void getHandlerShouldReturnHandlerForMockAccess() {
        SomeSubClass mock = new SomeSubClass();
        StubInternalMockHandler handler = new StubInternalMockHandler();
        MockMethodInterceptor interceptor = new SimpleMockMethodInterceptor(handler,
                new StubMockCreationSettings<>(SomeClass.class, SerializableMode.NONE, Collections.<Class<?>>emptySet()));
        mock.setMockitoInterceptor(interceptor);

        MockHandler retrieved = mockMaker.getHandler(mock);
        assertNotNull("Should retrieve handler", retrieved);
        assertSame("Should be the same handler", handler, retrieved);
    }

    @Test
    public void resetMockShouldUpdateInterceptor() {
        SomeSubClass mock = new SomeSubClass();
        StubInternalMockHandler oldHandler = new StubInternalMockHandler();
        StubInternalMockHandler newHandler = new StubInternalMockHandler();
        MockMethodInterceptor oldInterceptor = new SimpleMockMethodInterceptor(oldHandler,
                new StubMockCreationSettings<>(SomeClass.class, SerializableMode.NONE, Collections.<Class<?>>emptySet()));
        mock.setMockitoInterceptor(oldInterceptor);

        StubMockCreationSettings<SomeClass> settings = new StubMockCreationSettings<>(
                SomeClass.class, SerializableMode.NONE, Collections.<Class<?>>emptySet());
        mockMaker.resetMock(mock, newHandler, settings);

        MockHandler retrieved = mockMaker.getHandler(mock);
        assertSame("After reset handler should be new", newHandler, retrieved);
    }
}