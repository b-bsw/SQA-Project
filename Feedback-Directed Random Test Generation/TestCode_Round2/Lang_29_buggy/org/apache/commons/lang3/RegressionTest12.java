package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.LWCToolkit", "https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "\n", "sun.lwawt.macosx.CPrinterJob", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "/", "sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("th", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/", "mixed mode", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "\n", "Java Virtual Machine Specification", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "Mac OS X", "hi!", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "OpenJDK Runtime Environment", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", ":", "mixed mode", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.awt.CGraphicsEnvironment", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/Users/piyadaketmala", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "mixed mode", "hi!", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "hi!", "11", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "26.6.2", "piyadaketmala", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "https://github.com/Homebrew/homebrew-core/issues", "OpenJDK 64-Bit Server VM", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "https://github.com/Homebrew/homebrew-core/issues", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "sun.lwawt.macosx.LWCToolkit", "hi!", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Mac OS X", "", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "Java Virtual Machine Specification", "55.0", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Mac OS X", "OpenJDK Runtime Environment", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11.0.32.1+0", "hi!", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Java Virtual Machine Specification", "11.0.32.1", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "11.0.32.1", "", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Oracle Corporation", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "", "aarch64", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "", "mixed mode", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "UTF-8", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "sun.awt.CGraphicsEnvironment", "UTF-8", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Mac OS X", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11", "\n", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", ":", "OpenJDK 64-Bit Server VM", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "", "sun.lwawt.macosx.LWCToolkit", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.awt.CGraphicsEnvironment", "hi!", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "https://github.com/Homebrew/homebrew-core/issues", "sun.lwawt.macosx.LWCToolkit", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "th", "", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/Users/piyadaketmala", "55.0", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "11.0.32.1", "11.0.32.1+0", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "55.0", "sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "sun.lwawt.macosx.CPrinterJob", "Homebrew", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala", "11.0.32.1+0", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "11.0.32.1+0", "11.0.32.1+0", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Java Platform API Specification", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "26.6.2", "/Users/piyadaketmala", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "Mac OS X", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "11.0.32.1+0", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "https://github.com/Homebrew/homebrew-core/issues", "OpenJDK 64-Bit Server VM", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "Homebrew", ":", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "11.0.32.1", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "11.0.32.1+0", "55.0", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/Users/piyadaketmala", ":", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Java Platform API Specification", "UTF-8", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "11", "Java Platform API Specification", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "https://github.com/Homebrew/homebrew-core/issues", "11", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "Java Platform API Specification", "/Users/piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala", ":", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "/", "TH", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Java Platform API Specification", "\n", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "https://github.com/Homebrew/homebrew-core/issues", "", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "", "Java Platform API Specification", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "mixed mode", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "Java Virtual Machine Specification", "Homebrew", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "hi!", "sun.lwawt.macosx.CPrinterJob", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "", "sun.awt.CGraphicsEnvironment", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "th", "hi!", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11", "sun.lwawt.macosx.CPrinterJob", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "mixed mode", "aarch64", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "UTF-8", "\n", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala", ":", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "aarch64", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "piyadaketmala", "TH", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("Java Virtual Machine Specification", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "55.0", "aarch64", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Java Virtual Machine Specification", "/", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("th", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "11.0.32.1", "OpenJDK 64-Bit Server VM", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "th", "", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "", "", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "mixed mode", "TH", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "55.0", "sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "https://github.com/Homebrew/homebrew-core/issues", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "Java Virtual Machine Specification", "11.0.32.1+0", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "Java Platform API Specification", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "hi!", "11.0.32.1", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "sun.lwawt.macosx.LWCToolkit", "Java Platform API Specification", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "11.0.32.1+0", "sun.lwawt.macosx.CPrinterJob", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "OpenJDK 64-Bit Server VM", "sun.awt.CGraphicsEnvironment", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("mixed mode", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", ":", "mixed mode", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "Oracle Corporation", "/Users/piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "Java Platform API Specification", "11.0.32.1", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "55.0", "11.0.32.1", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "UTF-8", "TH", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "mixed mode", "", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "/", "Java Virtual Machine Specification", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Java Platform API Specification", "Java Platform API Specification", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK 64-Bit Server VM", "Homebrew", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.CPrinterJob", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "OpenJDK Runtime Environment", "aarch64", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", ":", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.lwawt.macosx.LWCToolkit", "", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "th", "UTF-8", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "55.0", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Mac OS X", "OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "TH", "aarch64", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "Oracle Corporation", "26.6.2", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "https://github.com/Homebrew/homebrew-core/issues", "", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "aarch64", "Mac OS X", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala", "11.0.32.1+0", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "mixed mode", "", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "55.0", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "/", "55.0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "piyadaketmala", "Java Virtual Machine Specification", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Homebrew", "/Users/piyadaketmala", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/", "sun.lwawt.macosx.LWCToolkit", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "OpenJDK 64-Bit Server VM", "https://github.com/Homebrew/homebrew-core/issues", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "sun.lwawt.macosx.CPrinterJob", "UTF-8", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "11", "OpenJDK Runtime Environment", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "TH", "/Users/piyadaketmala", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "", ":", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "Mac OS X", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "Java Platform API Specification", "55.0", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "", "", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "https://github.com/Homebrew/homebrew-core/issues", "11", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Homebrew", "55.0", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "11", "OpenJDK Runtime Environment", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "55.0", "Mac OS X", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "OpenJDK Runtime Environment", "piyadaketmala", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "OpenJDK 64-Bit Server VM", "piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "11", "https://github.com/Homebrew/homebrew-core/issues", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", ":", "hi!", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "11.0.32.1", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/", "sun.lwawt.macosx.CPrinterJob", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala", "11", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", ":", "11.0.32.1", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "55.0", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "https://github.com/Homebrew/homebrew-core/issues", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "Mac OS X", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "26.6.2", "\n", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "55.0", "TH", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "OpenJDK 64-Bit Server VM", "/Users/piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "OpenJDK 64-Bit Server VM", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "", "aarch64", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "UTF-8", "Oracle Corporation", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "mixed mode", "Homebrew", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "OpenJDK Runtime Environment", "11.0.32.1+0", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "sun.awt.CGraphicsEnvironment", "hi!", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "mixed mode", "OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Java Virtual Machine Specification", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "aarch64", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "/", "Java Platform API Specification", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "https://github.com/Homebrew/homebrew-core/issues", "UTF-8", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", ":", "55.0", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", ":", "11.0.32.1+0", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("11.0.32.1+0", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "UTF-8", "\n", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "11.0.32.1", "mixed mode", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "26.6.2", "", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", ":");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "piyadaketmala", "OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK 64-Bit Server VM", ":", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "mixed mode", "55.0", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "mixed mode", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/", "aarch64", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "https://github.com/Homebrew/homebrew-core/issues", "hi!", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "11.0.32.1", "OpenJDK Runtime Environment", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "26.6.2", "piyadaketmala", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "", "sun.lwawt.macosx.CPrinterJob", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "OpenJDK Runtime Environment", "OpenJDK Runtime Environment", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "55.0", ":", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "", "OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "26.6.2", "sun.awt.CGraphicsEnvironment", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "OpenJDK 64-Bit Server VM", "Oracle Corporation", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Mac OS X", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "11", "/Users/piyadaketmala", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "", "sun.lwawt.macosx.LWCToolkit", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11.0.32.1+0", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "UTF-8", "11.0.32.1", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK 64-Bit Server VM", "aarch64", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Java Platform API Specification", "26.6.2", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "OpenJDK 64-Bit Server VM", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", ":", ":", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("piyadaketmala", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Java Virtual Machine Specification", "26.6.2", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11.0.32.1+0", "sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/", "https://github.com/Homebrew/homebrew-core/issues", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "https://github.com/Homebrew/homebrew-core/issues", "aarch64", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "", "55.0", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "https://github.com/Homebrew/homebrew-core/issues", "sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "TH", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Oracle Corporation", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Oracle Corporation", "/", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "", "", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "hi!", "aarch64", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Mac OS X", "https://github.com/Homebrew/homebrew-core/issues", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Homebrew", "55.0", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "55.0", "", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Oracle Corporation", "OpenJDK Runtime Environment", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11", "th", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala", "/", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "Oracle Corporation", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "11", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "", "th", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "TH", "Oracle Corporation", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "", "UTF-8", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "11", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "aarch64", "sun.lwawt.macosx.LWCToolkit", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "hi!", "11.0.32.1+0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", ":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Oracle Corporation", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "th", "mixed mode", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "sun.lwawt.macosx.LWCToolkit", "", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", ":", "mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "Oracle Corporation", "Mac OS X", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "Java Virtual Machine Specification", "th", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "UTF-8", "11", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "OpenJDK Runtime Environment", "Homebrew", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "11.0.32.1", "https://github.com/Homebrew/homebrew-core/issues", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.CPrinterJob", "26.6.2", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "piyadaketmala", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "th", "Java Platform API Specification", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "hi!", "11", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "TH", "TH", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "sun.lwawt.macosx.LWCToolkit", "OpenJDK Runtime Environment", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "/", "\n", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "", "/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "sun.awt.CGraphicsEnvironment", "Oracle Corporation", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "11.0.32.1+0", "Java Virtual Machine Specification", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "piyadaketmala", "", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "", "11.0.32.1+0", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", ":", "", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Mac OS X", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "Oracle Corporation", "55.0", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "sun.lwawt.macosx.CPrinterJob", "", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "", "26.6.2", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "th", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "", "sun.lwawt.macosx.LWCToolkit", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "sun.lwawt.macosx.LWCToolkit", "th", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "hi!", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "OpenJDK Runtime Environment", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.lwawt.macosx.CPrinterJob", "Oracle Corporation", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "https://github.com/Homebrew/homebrew-core/issues", "/Users/piyadaketmala", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "55.0", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Oracle Corporation", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "55.0", "55.0", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "26.6.2", "", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "th", "Oracle Corporation", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "sun.lwawt.macosx.LWCToolkit", "th", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "\n", "th", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "26.6.2", "piyadaketmala", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "/Users/piyadaketmala", "26.6.2", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Homebrew", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Java Platform API Specification", "OpenJDK Runtime Environment", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "aarch64", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "/Users/piyadaketmala", "Homebrew", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "Oracle Corporation", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "", ":", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "26.6.2", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "", "piyadaketmala", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/", "piyadaketmala", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Oracle Corporation", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "11", "Mac OS X", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "26.6.2", "55.0", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "/", "\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Homebrew", "Homebrew", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "th", "th", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "", "Homebrew", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", ":", "26.6.2", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/Users/piyadaketmala", ":", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala", "\n", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "55.0", "Java Platform API Specification", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "11.0.32.1", "UTF-8", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "Mac OS X", "", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "UTF-8", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "https://github.com/Homebrew/homebrew-core/issues", "26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Oracle Corporation", "hi!", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Virtual Machine Specification", "11.0.32.1+0", ":", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "26.6.2", "Homebrew", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "Mac OS X", "/", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "aarch64", "/Users/piyadaketmala", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/", "Homebrew", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "mixed mode", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "Java Platform API Specification", "Oracle Corporation", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Java Virtual Machine Specification", "sun.lwawt.macosx.CPrinterJob", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "th", "mixed mode", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11.0.32.1+0", "/", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Java Virtual Machine Specification", "\n", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "", "Java Virtual Machine Specification", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "OpenJDK 64-Bit Server VM", ":", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.lwawt.macosx.CPrinterJob", "th", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Homebrew", "sun.awt.CGraphicsEnvironment", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", ":", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "TH", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "55.0", "UTF-8", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "mixed mode", "/Users/piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "26.6.2", "hi!", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "", "Java Virtual Machine Specification", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Homebrew", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "11.0.32.1", "th", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "mixed mode", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Mac OS X", "", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "TH", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11.0.32.1", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "https://github.com/Homebrew/homebrew-core/issues", "Homebrew", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Java Virtual Machine Specification", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "55.0", "\n", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "11", "26.6.2", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "11", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "UTF-8", "sun.lwawt.macosx.LWCToolkit", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "11.0.32.1+0", "Homebrew", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "11.0.32.1+0", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "sun.lwawt.macosx.CPrinterJob", "11.0.32.1+0", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", ":", "Java Platform API Specification", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Oracle Corporation", "11.0.32.1+0", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "th", "piyadaketmala", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "th", "sun.awt.CGraphicsEnvironment", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "26.6.2", "TH", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "11", "11.0.32.1+0", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "\n", "sun.awt.CGraphicsEnvironment", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("https://github.com/Homebrew/homebrew-core/issues", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "sun.lwawt.macosx.CPrinterJob", "th", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", ":", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "sun.awt.CGraphicsEnvironment", "11.0.32.1", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "aarch64", "11.0.32.1+0", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "OpenJDK Runtime Environment", "11.0.32.1+0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "th", "", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "OpenJDK 64-Bit Server VM", "", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11.0.32.1", "OpenJDK 64-Bit Server VM", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "Mac OS X", "https://github.com/Homebrew/homebrew-core/issues", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "mixed mode", "Mac OS X", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "11", "aarch64", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "", "hi!", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "11.0.32.1+0", "", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Mac OS X", "UTF-8", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "11.0.32.1+0", "TH", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "OpenJDK Runtime Environment", "Mac OS X", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "UTF-8", "sun.awt.CGraphicsEnvironment", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Java Virtual Machine Specification", "TH", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.awt.CGraphicsEnvironment", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "TH", "11.0.32.1+0", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "\n", "Java Platform API Specification", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", ":", "11", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "11.0.32.1+0", "/", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "Java Platform API Specification", "hi!", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "sun.awt.CGraphicsEnvironment", "sun.lwawt.macosx.CPrinterJob", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "mixed mode", "OpenJDK 64-Bit Server VM", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "sun.awt.CGraphicsEnvironment", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("55.0", "Java Platform API Specification", "/", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "\n", "11", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "55.0", "TH", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "Homebrew", "OpenJDK Runtime Environment", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1+0", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "", "", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "sun.lwawt.macosx.LWCToolkit", "11.0.32.1+0", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "hi!", "\n", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "11.0.32.1", "/", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "", "https://github.com/Homebrew/homebrew-core/issues", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/", "11.0.32.1", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "sun.awt.CGraphicsEnvironment", "11", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "OpenJDK 64-Bit Server VM", "Homebrew", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "26.6.2", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("sun.lwawt.macosx.LWCToolkit", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "11.0.32.1+0", "Mac OS X", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "", "hi!", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "11.0.32.1+0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "", "/Users/piyadaketmala", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala", "11.0.32.1+0", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "26.6.2", "11.0.32.1+0", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Java Virtual Machine Specification", "Oracle Corporation", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "th", "Java Platform API Specification", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "/Users/piyadaketmala", "11", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "OpenJDK 64-Bit Server VM", "11.0.32.1", "11.0.32.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "Java Virtual Machine Specification", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "Java Platform API Specification", "/", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "Java Virtual Machine Specification", "Java Platform API Specification", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "sun.awt.CGraphicsEnvironment", "UTF-8", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "sun.lwawt.macosx.LWCToolkit", "/Users/piyadaketmala", "Oracle Corporation");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "https://github.com/Homebrew/homebrew-core/issues", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "hi!", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "", "26.6.2", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK Runtime Environment", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "\n", ":", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "sun.lwawt.macosx.CPrinterJob", "26.6.2", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("Homebrew", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "piyadaketmala", "26.6.2", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "/", "", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "mixed mode", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "55.0", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Java Virtual Machine Specification", "", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "\n", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "11.0.32.1", "26.6.2", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK 64-Bit Server VM", "11.0.32.1", "/", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "OpenJDK Runtime Environment", "TH", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("mixed mode", "sun.lwawt.macosx.LWCToolkit", "piyadaketmala", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "hi!", ":", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "Homebrew", "sun.lwawt.macosx.LWCToolkit", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "TH", "Java Virtual Machine Specification", "sun.lwawt.macosx.LWCToolkit");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "11.0.32.1", "aarch64", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "hi!", "mixed mode", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Homebrew", "11", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "piyadaketmala", "https://github.com/Homebrew/homebrew-core/issues", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "11.0.32.1+0", "aarch64", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "", "", "/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "Java Virtual Machine Specification", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "sun.awt.CGraphicsEnvironment", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "sun.lwawt.macosx.LWCToolkit", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala", "sun.awt.CGraphicsEnvironment", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Java Virtual Machine Specification", "Homebrew", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "OpenJDK 64-Bit Server VM", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("th", "UTF-8", "11.0.32.1+0", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isOSNameMatch("11.0.32.1", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("hi!", "/", "OpenJDK 64-Bit Server VM", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "55.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "aarch64", "/", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "sun.lwawt.macosx.CPrinterJob", "Mac OS X", "\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "26.6.2", "aarch64", "mixed mode");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/", "OpenJDK Runtime Environment", "", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "Java Platform API Specification", "https://github.com/Homebrew/homebrew-core/issues", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "\n", "https://github.com/Homebrew/homebrew-core/issues", "11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "/Users/piyadaketmala", "Java Virtual Machine Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "aarch64", "sun.lwawt.macosx.CPrinterJob", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "th", "Homebrew", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("OpenJDK Runtime Environment", "OpenJDK 64-Bit Server VM", "26.6.2", "OpenJDK 64-Bit Server VM");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala", "TH", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "mixed mode", "/Users/piyadaketmala", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "aarch64", "mixed mode", "26.6.2");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "Java Platform API Specification", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        boolean boolean2 = org.apache.commons.lang3.SystemUtils.isJavaVersionMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("aarch64", "55.0", "sun.awt.CGraphicsEnvironment", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "\n", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "/Users/piyadaketmala", "OpenJDK 64-Bit Server VM", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "mixed mode", "Homebrew", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "Java Platform API Specification", "OpenJDK Runtime Environment", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "", "11", "OpenJDK Runtime Environment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("TH", "/", "11.0.32.1+0", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Homebrew", "piyadaketmala", "11.0.32.1", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "mixed mode", "/", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out", "Mac OS X", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("https://github.com/Homebrew/homebrew-core/issues", "Java Platform API Specification", "TH", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "sun.lwawt.macosx.CPrinterJob", "Mac OS X", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "hi!", "", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "piyadaketmala", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/out");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "OpenJDK Runtime Environment", "Mac OS X", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("piyadaketmala", "Java Virtual Machine Specification", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Java Platform API Specification", "", "th", "Mac OS X");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "Oracle Corporation", "/Users/piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "11.0.32.1+0", "TH", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11", "Mac OS X", "26.6.2", "Java Platform API Specification");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1", "aarch64", "TH", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("UTF-8", "/Users/piyadaketmala", "11.0.32.1+0", "/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "11.0.32.1", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Oracle Corporation", "/Users/piyadaketmala", "mixed mode", "sun.lwawt.macosx.CPrinterJob");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "/Users/piyadaketmala", "26.6.2", "piyadaketmala");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("Mac OS X", "OpenJDK 64-Bit Server VM", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("26.6.2", "Homebrew", "sun.lwawt.macosx.LWCToolkit", "aarch64");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.awt.CGraphicsEnvironment", "th", "https://github.com/Homebrew/homebrew-core/issues", ":");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("11.0.32.1+0", "", "/", "TH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "sun.lwawt.macosx.CPrinterJob", "UTF-8", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/", "Mac OS X", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "Homebrew", "TH", "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("\n", "Oracle Corporation", "11.0.32.1", "Homebrew");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch(":", "OpenJDK 64-Bit Server VM", "OpenJDK 64-Bit Server VM", "th");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("sun.lwawt.macosx.CPrinterJob", "", "/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("", "sun.awt.CGraphicsEnvironment", "26.6.2", "/var/folders/kf/rkm05cy96b9127snnvt_s1fw0000gn/T/");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.", "26.6.2", ":", "https://github.com/Homebrew/homebrew-core/issues");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        boolean boolean4 = org.apache.commons.lang3.SystemUtils.isOSMatch("/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/sqa_randoop/Lang_29-6trjybk7/jars/randoop-all-4.3.4.jar:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/Lang_29:/Users/piyadaketmala/Documents/Year3_Sem1/SQA/SQA-Project/BuildClasses/d4j_work/Lang_29_buggy/target/classes:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/asm.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/commons-io.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/easymock.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/cglib.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/org/easymock/easymock/2.5.2/easymock-2.5.2.jar:/Users/piyadaketmala/defects4j/framework/projects/Lang/lib/junit/junit/4.7/junit-4.7.jar", "sun.lwawt.macosx.LWCToolkit", "OpenJDK 64-Bit Server VM", "sun.awt.CGraphicsEnvironment");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

