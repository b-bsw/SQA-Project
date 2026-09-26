package org.mockito.internal.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.RETURNS_DEFAULTS;
import static org.mockito.Mockito.withSettings;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.cglib.proxy.Factory;
import org.mockito.cglib.proxy.MethodInterceptor;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.creation.MockSettingsImpl;

public class MockUtilTest {

    private MockUtil mockUtil;

    @Before
    public void setUp() {
        mockUtil = new MockUtil();
    }

    private MockSettingsImpl settings() {
        return (MockSettingsImpl) withSettings().defaultAnswer(RETURNS_DEFAULTS);
    }

    private MockSettingsImpl settingsWithExtraInterfaces() {
        return (MockSettingsImpl) withSettings().defaultAnswer(RETURNS_DEFAULTS)
                .extraInterfaces(List.class);
    }

    @Test
    public void createMock_withDefaultSettings_createsUsableMock() {
        Runnable mock = mockUtil.createMock(Runnable.class, settings());

        assertNotNull(mock);
        assertTrue(mockUtil.isMock(mock));
        assertNotNull(mockUtil.getMockHandler(mock));
    }

    @Test
    public void createMock_withExtraInterfaces_implementsExtraInterface() {
        Runnable mock = mockUtil.createMock(Runnable.class, settingsWithExtraInterfaces());

        assertTrue(mock instanceof Runnable);
        assertTrue(mock instanceof List);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void createMock_withSpiedInstance_copiesState() throws Exception {
        SampleClass original = new SampleClass();
        original.value = "spied";

        SampleClass mock = mockUtil.createMock(SampleClass.class,
                (MockSettingsImpl) withSettings().spiedInstance(original));

        assertNotNull(mock);
        assertEquals("spied", mock.getClass().getField("value").get(mock));
    }

    @Test
    public void resetMock_afterCreate_keepsMockValid() {
        Runnable mock = mockUtil.createMock(Runnable.class, settings());

        mockUtil.resetMock(mock);

        assertTrue(mockUtil.isMock(mock));
        assertNotNull(mockUtil.getMockHandler(mock));
    }

    @Test(expected = NotAMockException.class)
    public void getMockHandler_null_throwsNotAMockException() {
        mockUtil.getMockHandler((Object) null);
    }

    @Test(expected = NotAMockException.class)
    public void getMockHandler_notAMock_throwsNotAMockException() {
        mockUtil.getMockHandler("not a mock");
    }

    @Test
    public void isMock_null_returnsFalse() {
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void isMock_plainObject_returnsFalse() {
        assertFalse(mockUtil.isMock(new Object()));
    }

    @Test
    public void isMock_enhancedWithNonFilterCallback_returnsFalse() {
        Runnable mock = mockUtil.createMock(Runnable.class, settings());

        ((Factory) mock).setCallback(0, new MethodInterceptor() {
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                return null;
            }
        });

        assertFalse(mockUtil.isMock(mock));
    }

    @Test
    public void getMockName_returnsMockName() {
        Runnable mock = mockUtil.createMock(Runnable.class, settings());

        assertNotNull(mockUtil.getMockName(mock));
    }

    @Test(expected = NotAMockException.class)
    public void getMockName_notAMock_throwsNotAMockException() {
        mockUtil.getMockName("not a mock");
    }

    public static class SampleClass {
        public String value = "original";
    }
}