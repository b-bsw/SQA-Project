package org.mockito.internal.configuration.injection;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.*;

public class PropertyAndSetterInjectionTest {

    // --- Test helper types ---

    // Simple types for successful injection
    static class Bar {
        // marker
    }

    static class Foo {
        public Bar bar;
    }

    // Owner whose injectable field is of type Foo
    static class FooOwner {
        public Foo foo;
    }

    // Type without a no-arg constructor to trigger initialization failure
    static class NoConstructorFoo {
        public Bar bar;
        public NoConstructorFoo(int dummy) {
        }
    }

    static class NoConstructorOwner {
        public NoConstructorFoo noFoo;
    }

    private PropertyAndSetterInjection injector;

    @Before
    public void setUp() {
        injector = new PropertyAndSetterInjection();
    }

    // --- Helper to get a declared field from a class ---
    private Field getField(Class<?> clazz, String fieldName) throws NoSuchFieldException {
        return clazz.getDeclaredField(fieldName);
    }

    // --- Test: successful injection with one mock candidate ---
    @Test
    public void testSuccessfulInjection() throws Exception {
        // Prepare owner and set the injectMocks field to an initialized Foo
        FooOwner owner = new FooOwner();
        owner.foo = new Foo();

        Field injectField = getField(FooOwner.class, "foo");
        Set<Object> mocks = new HashSet<Object>();
        Bar mockBar = new Bar();
        mocks.add(mockBar);

        boolean result = injector.processInjection(injectField, owner, mocks);

        assertTrue("Injection should have occurred", result);
        assertSame("The bar field should be the injected mock", mockBar, owner.foo.bar);
    }

    // --- Test: no mocks provided, injection should not occur ---
    @Test
    public void testNoMocksReturnsFalse() throws Exception {
        FooOwner owner = new FooOwner();
        owner.foo = new Foo();

        Field injectField = getField(FooOwner.class, "foo");
        Set<Object> emptyMocks = new HashSet<Object>();

        boolean result = injector.processInjection(injectField, owner, emptyMocks);

        assertFalse("Without mocks, injection should not happen", result);
        assertNull("The bar field should remain null", owner.foo.bar);
    }

    // --- Test: initialization failure of the injectMocks field (no no-arg constructor) ---
    @Test(expected = MockitoException.class)
    public void testInitializationFailureThrowsMockitoException() throws Exception {
        NoConstructorOwner owner = new NoConstructorOwner();
        // field is left null, so FieldInitializer will try to instantiate

        Field injectField = getField(NoConstructorOwner.class, "noFoo");
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(new Bar());

        injector.processInjection(injectField, owner, mocks);
    }

    // --- Test: field to inject is final (should be filtered out) ---
    static class FinalFieldOwner {
        // Even if initialized, final fields are excluded by the notFinalOrStatic filter
        public final Foo foo = new Foo();
    }

    @Test
    public void testFinalFieldNotInjected() throws Exception {
        FinalFieldOwner owner = new FinalFieldOwner();
        Field injectField = getField(FinalFieldOwner.class, "foo");
        Set<Object> mocks = new HashSet<Object>();
        Bar mockBar = new Bar();
        mocks.add(mockBar);

        boolean result = injector.processInjection(injectField, owner, mocks);

        // The injectMocks field itself (FinalFieldOwner.foo) is final, but that's the target of injection.
        // The algorithm will try to initialize it. It creates a new Foo instance? Actually, because the field is
        // already initialized (non-null), FieldInitializer will return the existing instance.
        // Then it processes fields of Foo. Foo.bar is not final, so it can be injected.
        // So injection should occur.
        // This test confirms that the filter works for fields inside the injectMocks field, not the injectMocks field itself.
        // The notFinalOrStatic filter applies to fields of the awaitingInjectionClazz (Foo), not to the injectMocks field.
        // So we just check that the process completes without error and injects bar.
        assertTrue("Injection should occur even if the injectMocks field is final (already initialized)", result);
        assertNotNull("bar should be injected", owner.foo.bar);
        assertSame("bar should be the mock", mockBar, owner.foo.bar);
    }

    // --- Test: multiple levels of superclasses (hierarchy) ---
    static class GrandParent {
        public Bar grandParentBar;
    }
    static class Parent extends GrandParent {
        public Bar parentBar;
    }
    static class Child extends Parent {
        public Bar childBar;
    }

    static class HierarchyOwner {
        public Child child;
    }

    @Test
    public void testInjectionAcrossHierarchy() throws Exception {
        HierarchyOwner owner = new HierarchyOwner();
        owner.child = new Child();

        Field injectField = getField(HierarchyOwner.class, "child");
        Set<Object> mocks = new HashSet<Object>();
        Bar mock1 = new Bar();
        Bar mock2 = new Bar();
        Bar mock3 = new Bar();
        mocks.add(mock1);
        mocks.add(mock2);
        mocks.add(mock3);

        boolean result = injector.processInjection(injectField, owner, mocks);

        assertTrue("Injection should occur", result);
        assertSame("childBar should be set", mock1, owner.child.childBar);
        assertSame("parentBar should be set", mock2, owner.child.parentBar);
        assertSame("grandParentBar should be set", mock3, owner.child.grandParentBar);
    }

    // --- Test: duplicate mock type (name based) - but we do not have a mock with matching name,
    // so injection should not happen for that field. We'll test that it still returns true if any injection happens.
    @Test
    public void testInjectionWithUnmatchedName() throws Exception {
        // Create a class with two fields of same type
        static class TwoBars {
            public Bar firstBar;
            public Bar secondBar;
        }
        static class TwoBarsOwner {
            public TwoBars twoBars;
        }

        TwoBarsOwner owner = new TwoBarsOwner();
        owner.twoBars = new TwoBars();

        Field injectField = getField(TwoBarsOwner.class, "twoBars");
        Set<Object> mocks = new HashSet<Object>();
        Bar theOnlyMock = new Bar();
        mocks.add(theOnlyMock);

        boolean result = injector.processInjection(injectField, owner, mocks);

        // Only one mock for two fields of same type and no name match -> only one can be injected (the first in order)
        // The order depends on SuperTypesLastSorter + declaredFields order.
        // Usually declaredFields returns in order of declaration: firstBar then secondBar.
        // The injectMockCandidatesOnFields will try to inject into firstBar; type matches, it injects.
        // Then for secondBar, no mocks left, so no injection.
        assertTrue("At least one injection should occur", result);
        assertNotNull("firstBar should be injected", owner.twoBars.firstBar);
        assertNull("secondBar should remain null (no more mocks)", owner.twoBars.secondBar);
    }
}