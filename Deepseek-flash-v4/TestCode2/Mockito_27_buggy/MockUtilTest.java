package org.mockito.internal.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Factory;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.creation.MockSettingsImpl;

import java.io.Serializable;
import java.util.List;
import java.util.RandomAccess;

import static org.junit.Assert.*;

@SuppressWarnings("unchecked")
public class MockUtilTest {

    private MockUtil mockUtil;

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCreateMockBasic() {
        List<String> mock = mockUtil.createMock(List.class, new MockSettingsImpl());

        assertTrue(mockUtil.isMock(mock));
        assertNotNull(mockUtil.getMockHandler(mock));
        assertNotNull(mockUtil.getMockName(mock));
    }

    @Test
    public void testCreateMockWithSerializableAndExtraInterfaces() {
        MockSettingsImpl noInterfaces = new MockSettingsImpl();
        noInterfaces.serializable();
        List<?> noInterfacesMock = mockUtil.createMock(List.class, noInterfaces);
        assertTrue(noInterfacesMock instanceof Serializable);

        MockSettingsImpl withInterfaces = new MockSettingsImpl();
        withInterfaces.serializable();
        withInterfaces.extraInterfaces(RandomAccess.class);
        List<?> withInterfacesMock = mockUtil.createMock(List.class, withInterfaces);
        assertTrue(withInterfacesMock instanceof Serializable);
        assertTrue(withInterfacesMock instanceof RandomAccess);
    }

    @Test
    public void testCreateMockWithExtraInterfacesNotSerializable() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(RandomAccess.class);

        List<?> mock = mockUtil.createMock(List.class, settings);

        assertTrue(mock instanceof RandomAccess);
    }

    @Test
    public void testCreateMockCopiesSpiedInstanceFields() {
        Person real = new Person();
        real.name = "John";
        real.age = 30;

        MockSettingsImpl settings = new MockSettingsImpl();
        settings.spiedInstance(real);

        Person mock = mockUtil.createMock(Person.class, settings);

        assertEquals("John", mock.name);
        assertEquals(30, mock.age);
    }

    @Test
    public void testIsMock() {
        assertFalse(mockUtil.isMock(null));
        assertFalse(mockUtil.isMock("not a mock"));

        StubFactory factory = new StubFactory();
        factory.setCallback(0, new Callback() {});
        assertFalse(mockUtil.isMock(factory));

        List<?> mock = mockUtil.createMock(List.class, new MockSettingsImpl());
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testGetMockHandlerWithNonMockThrows() {
        try {
            mockUtil.getMockHandler("not a mock");
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testGetMockHandlerWithNullThrows() {
        try {
            mockUtil.getMockHandler(null);
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testResetMock() {
        List<?> mock = mockUtil.createMock(List.class, new MockSettingsImpl());

        mockUtil.resetMock(mock);

        assertTrue(mockUtil.isMock(mock));
        assertNotNull(mockUtil.getMockHandler(mock));
    }

    @Test
    public void testResetMockWithNonMockThrows() {
        try {
            mockUtil.resetMock("not a mock");
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testGetMockName() {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("myMock");

        List<?> mock = mockUtil.createMock(List.class, settings);

        assertEquals("myMock", mockUtil.getMockName(mock).toString());
    }

    public static class Person {
        public String name;
        public int age;
    }

    private static class StubFactory implements Factory {
        private Callback[] callbacks = new Callback[1];

        @Override
        public Callback getCallback(int index) {
            return callbacks[index];
        }

        @Override
        public void setCallback(int index, Callback callback) {
            callbacks[index] = callback;
        }

        @Override
        public Callback[] getCallbacks() {
            return callbacks;
        }

        @Override
        public void setCallbacks(Callback[] callbacks) {
            this.callbacks = callbacks;
        }

        @Override
        public Object newInstance(Callback callback) {
            return null;
        }

        @Override
        public Object newInstance(Class[] types, Object[] args) {
            return null;
        }

        @Override
        public Object newInstance(Class[] types, Callback[] callbacks) {
            return null;
        }

        @Override
        public Object newInstance(Class[] types, Object[] args, Callback[] callbacks) {
            return null;
        }
    }
}