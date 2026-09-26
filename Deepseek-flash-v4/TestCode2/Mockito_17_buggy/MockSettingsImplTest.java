package org.mockito.internal.creation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.stubbing.Answer;

public class MockSettingsImplTest {

    private MockSettingsImpl settings;

    @Before
    public void setUp() {
        settings = new MockSettingsImpl();
    }

    @After
    public void tearDown() {
        settings = null;
    }

    @Test
    public void testInitialState() {
        assertNull(settings.getExtraInterfaces());
        assertNull(settings.getSpiedInstance());
        assertNull(settings.getDefaultAnswer());
        assertNull(settings.getMockName());
        assertFalse(settings.isSerializable());
    }

    @Test
    public void testSerializable() {
        assertSame(settings, settings.serializable());
        assertTrue(settings.isSerializable());
        assertNotNull(settings.getExtraInterfaces());
        assertEquals(1, settings.getExtraInterfaces().length);
        assertTrue(java.util.Arrays.asList(settings.getExtraInterfaces()).contains(java.io.Serializable.class));
    }

    @Test
    public void testExtraInterfacesSetsInterfaces() {
        Class<?>[] interfaces = new Class<?>[] { Runnable.class, java.io.Serializable.class };
        assertSame(settings, settings.extraInterfaces(interfaces));
        assertSame(interfaces, settings.getExtraInterfaces());
        assertEquals(2, settings.getExtraInterfaces().length);
        assertTrue(settings.isSerializable());
    }

    @Test
    public void testExtraInterfacesWithoutSerializableDisablesSerializable() {
        settings.extraInterfaces(Runnable.class);
        assertEquals(1, settings.getExtraInterfaces().length);
        assertFalse(settings.isSerializable());
    }

    @Test(expected = RuntimeException.class)
    public void testExtraInterfacesNullArrayThrows() {
        settings.extraInterfaces((Class<?>[]) null);
    }

    @Test(expected = RuntimeException.class)
    public void testExtraInterfacesEmptyArrayThrows() {
        settings.extraInterfaces(new Class<?>[0]);
    }

    @Test(expected = RuntimeException.class)
    public void testExtraInterfacesNullElementThrows() {
        settings.extraInterfaces(new Class<?>[] { null });
    }

    @Test(expected = RuntimeException.class)
    public void testExtraInterfacesRejectsNonInterface() {
        settings.extraInterfaces(String.class);
    }

    @Test
    public void testNameIsUsedByInitiateMockName() {
        assertSame(settings, settings.name("myMock"));
        settings.initiateMockName(String.class);
        assertNotNull(settings.getMockName());
        assertEquals("myMock", settings.getMockName().toString());
    }

    @Test
    public void testInitiateMockNameCreatesDefaultNameWhenNull() {
        settings.initiateMockName(String.class);
        assertNotNull(settings.getMockName());
        assertNotNull(settings.getMockName().toString());
        assertFalse(settings.getMockName().toString().trim().isEmpty());
    }

    @Test
    public void testSpiedInstanceStoresObject() {
        Object spied = new Object();
        assertSame(settings, settings.spiedInstance(spied));
        assertSame(spied, settings.getSpiedInstance());
    }

    @Test
    public void testDefaultAnswerStoresAnswer() {
        Answer<Object> answer = new Answer<Object>() {
            public Object answer(org.mockito.invocation.InvocationOnMock invocation) throws Throwable {
                return "answer";
            }
        };
        assertSame(settings, settings.defaultAnswer(answer));
        assertSame(answer, settings.getDefaultAnswer());
    }
}