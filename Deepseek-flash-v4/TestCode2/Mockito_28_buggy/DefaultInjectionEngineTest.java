package org.mockito.internal.configuration;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class DefaultInjectionEngineTest {

    public static class AlphaDependency {}
    public static class BetaDependency {}
    public static class GammaDependency {}

    public static class BaseTarget {
        private AlphaDependency alpha;

        public AlphaDependency getAlpha() {
            return alpha;
        }
    }

    public static class DerivedTarget extends BaseTarget {
        private BetaDependency beta;
        private GammaDependency gamma;

        public BetaDependency getBeta() {
            return beta;
        }

        public GammaDependency getGamma() {
            return gamma;
        }
    }

    public static class SingleHolder {
        public DerivedTarget derivedTarget;
    }

    public static class FirstTarget {
        private AlphaDependency alpha;

        public AlphaDependency getAlpha() {
            return alpha;
        }
    }

    public static class SecondTarget {
        private BetaDependency beta;

        public BetaDependency getBeta() {
            return beta;
        }
    }

    public static class MultiHolder {
        public FirstTarget firstTarget;
        public SecondTarget secondTarget;
    }

    public static class NoMatchHolder {
        public DerivedTarget derivedTarget;
    }

    public interface CannotInstantiate {}

    public static class ExceptionHolder {
        public CannotInstantiate cannotInstantiate;
    }

    @Test
    public void shouldDoNothingWhenInjectMocksFieldsIsEmpty() throws Exception {
        DefaultInjectionEngine engine = new DefaultInjectionEngine();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(new AlphaDependency());

        engine.injectMocksOnFields(Collections.<Field>emptySet(), mocks, new Object());
    }

    @Test
    public void shouldInjectMatchingMocksIntoDerivedAndSuperclassFields() throws Exception {
        DefaultInjectionEngine engine = new DefaultInjectionEngine();
        SingleHolder holder = new SingleHolder();

        AlphaDependency alpha = new AlphaDependency();
        BetaDependency beta = new BetaDependency();
        GammaDependency gamma = new GammaDependency();

        Set<Object> mocks = new HashSet<Object>();
        mocks.add(alpha);
        mocks.add(beta);
        mocks.add(gamma);

        Set<Field> fields = new HashSet<Field>();
        fields.add(SingleHolder.class.getDeclaredField("derivedTarget"));

        engine.injectMocksOnFields(fields, mocks, holder);

        assertNotNull(holder.derivedTarget);
        assertSame(alpha, holder.derivedTarget.getAlpha());
        assertSame(beta, holder.derivedTarget.getBeta());
        assertSame(gamma, holder.derivedTarget.getGamma());
    }

    @Test
    public void shouldInjectMocksIntoMultipleInjectMocksFields() throws Exception {
        DefaultInjectionEngine engine = new DefaultInjectionEngine();
        MultiHolder holder = new MultiHolder();

        AlphaDependency alpha = new AlphaDependency();
        BetaDependency beta = new BetaDependency();

        Set<Object> mocks = new HashSet<Object>();
        mocks.add(alpha);
        mocks.add(beta);

        Set<Field> fields = new HashSet<Field>();
        fields.add(MultiHolder.class.getDeclaredField("firstTarget"));
        fields.add(MultiHolder.class.getDeclaredField("secondTarget"));

        engine.injectMocksOnFields(fields, mocks, holder);

        assertNotNull(holder.firstTarget);
        assertNotNull(holder.secondTarget);
        assertSame(alpha, holder.firstTarget.getAlpha());
        assertSame(beta, holder.secondTarget.getBeta());
    }

    @Test
    public void shouldNotFailWhenMocksSetIsEmpty() throws Exception {
        DefaultInjectionEngine engine = new DefaultInjectionEngine();
        NoMatchHolder holder = new NoMatchHolder();

        Set<Field> fields = new HashSet<Field>();
        fields.add(NoMatchHolder.class.getDeclaredField("derivedTarget"));

        engine.injectMocksOnFields(fields, Collections.<Object>emptySet(), holder);

        assertNotNull(holder.derivedTarget);
        assertNull(holder.derivedTarget.getAlpha());
        assertNull(holder.derivedTarget.getBeta());
        assertNull(holder.derivedTarget.getGamma());
    }

    @Test(expected = MockitoException.class)
    public void shouldThrowMockitoExceptionWhenInjectMocksFieldCannotBeInitialized() throws Exception {
        DefaultInjectionEngine engine = new DefaultInjectionEngine();
        ExceptionHolder holder = new ExceptionHolder();

        Set<Field> fields = new HashSet<Field>();
        fields.add(ExceptionHolder.class.getDeclaredField("cannotInstantiate"));

        engine.injectMocksOnFields(fields, Collections.<Object>emptySet(), holder);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenMocksIsNull() throws Exception {
        DefaultInjectionEngine engine = new DefaultInjectionEngine();
        SingleHolder holder = new SingleHolder();

        Set<Field> fields = new HashSet<Field>();
        fields.add(SingleHolder.class.getDeclaredField("derivedTarget"));

        engine.injectMocksOnFields(fields, null, holder);
    }
}