package com.google.gson.internal.bind;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.google.gson.TypeAdapter<java.lang.String> strTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.STRING;
        java.lang.Class<?> wildcardClass1 = strTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(strTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.google.gson.TypeAdapter<java.util.UUID> uUIDTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.UUID;
        java.lang.Class<?> wildcardClass1 = uUIDTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(uUIDTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.google.gson.TypeAdapter<java.util.Locale> localeTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LOCALE;
        java.lang.Class<?> wildcardClass1 = localeTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(localeTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicIntegerArray> atomicIntegerArrayTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY;
        java.lang.Class<?> wildcardClass1 = atomicIntegerArrayTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(atomicIntegerArrayTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.URL_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.gson.TypeAdapter<java.lang.Character> charTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.CHARACTER;
        java.lang.Class<?> wildcardClass1 = charTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(charTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicBoolean> atomicBooleanTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN;
        java.lang.Class<?> wildcardClass1 = atomicBooleanTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(atomicBooleanTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.google.gson.TypeAdapter<java.util.Calendar> calendarTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.CALENDAR;
        java.lang.Class<?> wildcardClass1 = calendarTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(calendarTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.google.gson.TypeAdapter<java.net.URL> uRLTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.URL;
        java.lang.Class<?> wildcardClass1 = uRLTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(uRLTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.LONG;
        java.lang.Class<?> wildcardClass1 = numberTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.google.gson.TypeAdapter<java.math.BigDecimal> bigDecimalTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL;
        java.lang.Class<?> wildcardClass1 = bigDecimalTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(bigDecimalTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.google.gson.TypeAdapter<java.net.URI> uRITypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.URI;
        java.lang.Class<?> wildcardClass1 = uRITypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(uRITypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.google.gson.TypeAdapter<java.lang.Boolean> booleanTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN_AS_STRING;
        java.lang.Class<?> wildcardClass1 = booleanTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(booleanTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.CLASS_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.FLOAT;
        java.lang.Class<?> wildcardClass1 = numberTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.SHORT;
        java.lang.Class<?> wildcardClass1 = numberTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.CURRENCY_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.CALENDAR_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.TIMESTAMP_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.ENUM_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.google.gson.TypeAdapter<com.google.gson.JsonElement> jsonElementTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT;
        java.lang.Class<?> wildcardClass1 = jsonElementTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(jsonElementTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.BYTE_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.INTEGER_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.google.gson.TypeAdapter<java.lang.Boolean> booleanTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN;
        java.lang.Class<?> wildcardClass1 = booleanTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(booleanTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.google.gson.TypeAdapter<java.math.BigInteger> bigIntegerTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER;
        java.lang.Class<?> wildcardClass1 = bigIntegerTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(bigIntegerTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.BIT_SET_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.google.gson.TypeAdapter<java.lang.StringBuilder> stringBuilderTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER;
        java.lang.Class<?> wildcardClass1 = stringBuilderTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(stringBuilderTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.URI_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicInteger> atomicIntegerTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER;
        java.lang.Class<?> wildcardClass1 = atomicIntegerTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(atomicIntegerTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.google.gson.TypeAdapter<java.util.BitSet> bitSetTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BIT_SET;
        java.lang.Class<?> wildcardClass1 = bitSetTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(bitSetTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.google.gson.TypeAdapter<java.lang.Class> classTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.CLASS;
        java.lang.Class<?> wildcardClass1 = classTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(classTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.google.gson.TypeAdapter<java.lang.StringBuffer> stringBufferTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER;
        java.lang.Class<?> wildcardClass1 = stringBufferTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(stringBufferTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.DOUBLE;
        java.lang.Class<?> wildcardClass1 = numberTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.UUID_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.LOCALE_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.NUMBER;
        java.lang.Class<?> wildcardClass1 = numberTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.INTEGER;
        java.lang.Class<?> wildcardClass1 = numberTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.google.gson.TypeAdapter<java.lang.Number> numberTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.BYTE;
        java.lang.Class<?> wildcardClass1 = numberTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(numberTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.STRING_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.google.gson.TypeAdapterFactory typeAdapterFactory0 = com.google.gson.internal.bind.TypeAdapters.NUMBER_FACTORY;
        java.lang.Class<?> wildcardClass1 = typeAdapterFactory0.getClass();
        org.junit.Assert.assertNotNull(typeAdapterFactory0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        com.google.gson.TypeAdapter<java.util.Currency> currencyTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.CURRENCY;
        java.lang.Class<?> wildcardClass1 = currencyTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(currencyTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.google.gson.TypeAdapter<java.net.InetAddress> inetAddressTypeAdapter0 = com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS;
        java.lang.Class<?> wildcardClass1 = inetAddressTypeAdapter0.getClass();
        org.junit.Assert.assertNotNull(inetAddressTypeAdapter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

