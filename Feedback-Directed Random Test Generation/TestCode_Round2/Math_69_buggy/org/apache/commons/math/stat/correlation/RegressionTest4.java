package org.apache.commons.math.stat.correlation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix37);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation40 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix37, (int) (byte) 100);
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray70 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray71 = new double[][] { doubleArray46, doubleArray52, doubleArray58, doubleArray64, doubleArray70 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation72.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix73, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix73, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix73, 1);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation40.covarianceToCorrelation(realMatrix73);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation81 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix73);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = pearsonsCorrelation81.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = pearsonsCorrelation81.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix84 = pearsonsCorrelation81.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(realMatrix84);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) '#');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, 1);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) (byte) 10);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation39 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = pearsonsCorrelation39.getCorrelationPValues();
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray70 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray71 = new double[][] { doubleArray46, doubleArray52, doubleArray58, doubleArray64, doubleArray70 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation72.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation72.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation72.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation72.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation39.computeCorrelationMatrix(realMatrix76);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation78 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation80 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, (int) (short) 10);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation81 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationMatrix();
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = pearsonsCorrelation65.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix67 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix66);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation31.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation31.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation31.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation45 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = pearsonsCorrelation45.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = pearsonsCorrelation45.getCorrelationPValues();
        double[] doubleArray53 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray59 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray65 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray71 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray77 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray78 = new double[][] { doubleArray53, doubleArray59, doubleArray65, doubleArray71, doubleArray77 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation79.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix81 = pearsonsCorrelation79.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation83 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix81, (int) ' ');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation85 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix81, (int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix86 = pearsonsCorrelation85.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation88 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix86, (int) '4');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation89 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix86);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation91 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix86, (int) (short) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix92 = pearsonsCorrelation91.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix93 = pearsonsCorrelation45.computeCorrelationMatrix(realMatrix92);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation95 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix93, 100);
        org.apache.commons.math.linear.RealMatrix realMatrix96 = pearsonsCorrelation95.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix92);
        org.junit.Assert.assertNotNull(realMatrix93);
        org.junit.Assert.assertNotNull(realMatrix96);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32);
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation35.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix36, (int) (byte) 10);
        double[] doubleArray44 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray68 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray69 = new double[][] { doubleArray44, doubleArray50, doubleArray56, doubleArray62, doubleArray68 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation70.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation70.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation74 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix72, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation74.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation74.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation74.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation74.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = pearsonsCorrelation38.covarianceToCorrelation(realMatrix78);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation80 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation0 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation();
        org.apache.commons.math.linear.RealMatrix realMatrix1 = pearsonsCorrelation0.getCorrelationMatrix();
        org.junit.Assert.assertNull(realMatrix1);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) '#');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, 1);
        double[] doubleArray42 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray48 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray54 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray60 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray66 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray67 = new double[][] { doubleArray42, doubleArray48, doubleArray54, doubleArray60, doubleArray66 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        double[] doubleArray72 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray76 = new double[] { '4', (byte) 100, (short) 10 };
        double double77 = pearsonsCorrelation68.correlation(doubleArray72, doubleArray76);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation68.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = pearsonsCorrelation36.covarianceToCorrelation(realMatrix78);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation80 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix79);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation81 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix79);
        org.apache.commons.math.linear.RealMatrix realMatrix82 = pearsonsCorrelation81.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = pearsonsCorrelation81.getCorrelationPValues();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.038461538461538464d + "'", double77 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(realMatrix83);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation32 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation33 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray40 = new double[] { (short) 1, 'a', ' ', (-1), (byte) 0, '#' };
        double[] doubleArray47 = new double[] { (short) 1, 'a', ' ', (-1), (byte) 0, '#' };
        double[] doubleArray54 = new double[] { (short) 1, 'a', ' ', (-1), (byte) 0, '#' };
        double[][] doubleArray55 = new double[][] { doubleArray40, doubleArray47, doubleArray54 };
        org.apache.commons.math.linear.RealMatrix realMatrix56 = pearsonsCorrelation33.computeCorrelationMatrix(doubleArray55);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation57 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray55);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation58 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray55);
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray70 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray76 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray82 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray88 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray89 = new double[][] { doubleArray64, doubleArray70, doubleArray76, doubleArray82, doubleArray88 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation90 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray89);
        org.apache.commons.math.linear.RealMatrix realMatrix91 = pearsonsCorrelation58.computeCorrelationMatrix(doubleArray89);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation92 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray89);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation93 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray89);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation94 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray89);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation95 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray89);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation96 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray89);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation97 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray89);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation98 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray89);
        java.lang.Class<?> wildcardClass99 = doubleArray89.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 97.0d, 32.0d, (-1.0d), 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d, 97.0d, 32.0d, (-1.0d), 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 1.0d, 97.0d, 32.0d, (-1.0d), 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation45 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = pearsonsCorrelation45.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation47 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix46);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation49 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix46, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation50 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix46);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = pearsonsCorrelation50.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation53 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix51, 0);
        java.lang.Class<?> wildcardClass54 = pearsonsCorrelation53.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix51);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix43 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation44 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix43);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation46 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix43, (int) (byte) -1);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation47 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix43);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation49 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix43, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix50 = pearsonsCorrelation49.getCorrelationPValues();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(realMatrix43);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation45 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation46 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41);
        org.apache.commons.math.linear.RealMatrix realMatrix47 = pearsonsCorrelation46.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = pearsonsCorrelation46.getCorrelationMatrix();
        java.lang.Class<?> wildcardClass49 = realMatrix48.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation35.getCorrelationMatrix();
        double[] doubleArray44 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray68 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray69 = new double[][] { doubleArray44, doubleArray50, doubleArray56, doubleArray62, doubleArray68 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation70.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix71, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix71, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation75.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation78 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, (int) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix79 = pearsonsCorrelation78.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation35.covarianceToCorrelation(realMatrix79);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80, 0);
        java.lang.Class<?> wildcardClass83 = realMatrix80.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33);
        double[] doubleArray40 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray65 = new double[][] { doubleArray40, doubleArray46, doubleArray52, doubleArray58, doubleArray64 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation66 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation67 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation69 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation71 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation34.computeCorrelationMatrix(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation74 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation75.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation75.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation32 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray38 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray44 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray63 = new double[][] { doubleArray38, doubleArray44, doubleArray50, doubleArray56, doubleArray62 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation64 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = pearsonsCorrelation64.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = pearsonsCorrelation32.covarianceToCorrelation(realMatrix65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = pearsonsCorrelation32.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = pearsonsCorrelation32.getCorrelationPValues();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix37);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation38.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation41 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix39, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix39);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation33 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation33.getCorrelationMatrix();
        double[] doubleArray40 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray65 = new double[][] { doubleArray40, doubleArray46, doubleArray52, doubleArray58, doubleArray64 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation66 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = pearsonsCorrelation33.computeCorrelationMatrix(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation68.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation68.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation68.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix71);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray70 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray71 = new double[][] { doubleArray46, doubleArray52, doubleArray58, doubleArray64, doubleArray70 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation72.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix73);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix74);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix74, (int) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation77.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation80 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix78, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix78);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation42 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41);
        double[] doubleArray49 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray55 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray61 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray67 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray73 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray74 = new double[][] { doubleArray49, doubleArray55, doubleArray61, doubleArray67, doubleArray73 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation75.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation78 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation80 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, 1);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation84 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix85 = pearsonsCorrelation43.computeCorrelationMatrix(realMatrix76);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation87 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix85, (int) (byte) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix88 = pearsonsCorrelation87.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation90 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix88, (int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix91 = pearsonsCorrelation90.getCorrelationStandardErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix92 = pearsonsCorrelation90.getCorrelationPValues();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertNotNull(realMatrix91);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, 1);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation38.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation40 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation40.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation45 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = pearsonsCorrelation45.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix46);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        double[] doubleArray39 = new double[] { 10, 1L, (short) 1, 0L };
        double[] doubleArray44 = new double[] { 10, 1L, (short) 1, 0L };
        double[] doubleArray49 = new double[] { 10, 1L, (short) 1, 0L };
        double[] doubleArray54 = new double[] { 10, 1L, (short) 1, 0L };
        double[] doubleArray59 = new double[] { 10, 1L, (short) 1, 0L };
        double[] doubleArray64 = new double[] { 10, 1L, (short) 1, 0L };
        double[][] doubleArray65 = new double[][] { doubleArray39, doubleArray44, doubleArray49, doubleArray54, doubleArray59, doubleArray64 };
        org.apache.commons.math.linear.RealMatrix realMatrix66 = pearsonsCorrelation34.computeCorrelationMatrix(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation67 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation68.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation68.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation71 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix70);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix70);
        java.lang.Class<?> wildcardClass73 = pearsonsCorrelation72.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 10.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 10.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 10.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 10.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = pearsonsCorrelation31.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        double[] doubleArray69 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray73 = new double[] { '4', (byte) 100, (short) 10 };
        double double74 = pearsonsCorrelation65.correlation(doubleArray69, doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation65.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix75);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80, (int) 'a');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation83 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = pearsonsCorrelation83.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = pearsonsCorrelation83.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation87 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix85, (int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix88 = pearsonsCorrelation87.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation90 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix88, (int) (short) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation91 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix88);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation93 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix88, (int) (byte) 1);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation95 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix88, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.038461538461538464d + "'", double74 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix88);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) '#');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, 1);
        double[] doubleArray42 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray48 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray54 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray60 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray66 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray67 = new double[][] { doubleArray42, doubleArray48, doubleArray54, doubleArray60, doubleArray66 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation36.computeCorrelationMatrix(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation71 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation74 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation76 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation78 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation80 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation81 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation83 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(realMatrix69);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, 1);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation38.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation40 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation40.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = pearsonsCorrelation40.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation44 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix42, 0);
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray68 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray74 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray75 = new double[][] { doubleArray50, doubleArray56, doubleArray62, doubleArray68, doubleArray74 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation76 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray75);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray75);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation77.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = pearsonsCorrelation44.covarianceToCorrelation(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation36.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation36.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation39 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix38);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation40 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix38);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation40.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix41);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationStandardErrors();
        double[] doubleArray47 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray53 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray59 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray65 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray71 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray72 = new double[][] { doubleArray47, doubleArray53, doubleArray59, doubleArray65, doubleArray71 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray72);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation73.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation75.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix76);
        java.lang.Class<?> wildcardClass78 = realMatrix76.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation66 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation67 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = pearsonsCorrelation31.computeCorrelationMatrix(doubleArray64);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation69 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation69.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation71 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation71.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation71.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix73, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation75.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix76);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        double[] doubleArray38 = new double[] { 100L, ' ', (short) -1 };
        double[] doubleArray44 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray68 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray69 = new double[][] { doubleArray44, doubleArray50, doubleArray56, doubleArray62, doubleArray68 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray69);
        double[] doubleArray74 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray78 = new double[] { '4', (byte) 100, (short) 10 };
        double double79 = pearsonsCorrelation70.correlation(doubleArray74, doubleArray78);
        double double80 = pearsonsCorrelation34.correlation(doubleArray38, doubleArray78);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = pearsonsCorrelation34.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix82 = pearsonsCorrelation34.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation84 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix82, (int) (short) -1);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation85 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix82);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation87 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix82, (int) '#');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation88 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix82);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = pearsonsCorrelation88.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.038461538461538464d + "'", double79 == 0.038461538461538464d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.2837121053918259d + "'", double80 == 0.2837121053918259d);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(realMatrix89);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation44 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41);
        org.apache.commons.math.linear.RealMatrix realMatrix45 = pearsonsCorrelation44.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix46 = pearsonsCorrelation44.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = pearsonsCorrelation44.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = pearsonsCorrelation44.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix45);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix38 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation35.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = pearsonsCorrelation35.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) (short) 10);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation40 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation40.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix41);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation33 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation33.getCorrelationMatrix();
        double[] doubleArray40 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray65 = new double[][] { doubleArray40, doubleArray46, doubleArray52, doubleArray58, doubleArray64 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation66 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = pearsonsCorrelation33.computeCorrelationMatrix(doubleArray65);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation68.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix69);
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation70.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix71);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation36.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation39 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix37, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation41 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix37, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        double[] doubleArray38 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray44 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray63 = new double[][] { doubleArray38, doubleArray44, doubleArray50, doubleArray56, doubleArray62 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation64 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = pearsonsCorrelation64.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = pearsonsCorrelation64.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix66, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation68.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation68.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation71 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix70);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix70);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix70);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation73.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix74);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation33 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = pearsonsCorrelation34.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation34.getCorrelationPValues();
        double[] doubleArray42 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray48 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray54 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray60 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray66 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray67 = new double[][] { doubleArray42, doubleArray48, doubleArray54, doubleArray60, doubleArray66 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        double[] doubleArray72 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray76 = new double[] { '4', (byte) 100, (short) 10 };
        double double77 = pearsonsCorrelation68.correlation(doubleArray72, doubleArray76);
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation68.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation80 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix78, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix78, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = pearsonsCorrelation34.covarianceToCorrelation(realMatrix78);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation85 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix78, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.038461538461538464d + "'", double77 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix83);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        double[] doubleArray69 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray73 = new double[] { '4', (byte) 100, (short) 10 };
        double double74 = pearsonsCorrelation65.correlation(doubleArray69, doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation65.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix75);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation84 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (short) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = pearsonsCorrelation84.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix86 = pearsonsCorrelation84.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation87 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix86);
        org.apache.commons.math.linear.RealMatrix realMatrix88 = pearsonsCorrelation87.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix89 = pearsonsCorrelation87.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.038461538461538464d + "'", double74 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix86);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertNotNull(realMatrix89);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix44 = pearsonsCorrelation43.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation46 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix44, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix44);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        double[] doubleArray38 = new double[] { 100L, ' ', (short) -1 };
        double[] doubleArray44 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray68 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray69 = new double[][] { doubleArray44, doubleArray50, doubleArray56, doubleArray62, doubleArray68 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray69);
        double[] doubleArray74 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray78 = new double[] { '4', (byte) 100, (short) 10 };
        double double79 = pearsonsCorrelation70.correlation(doubleArray74, doubleArray78);
        double double80 = pearsonsCorrelation34.correlation(doubleArray38, doubleArray78);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = pearsonsCorrelation34.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix82 = pearsonsCorrelation34.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = pearsonsCorrelation34.getCorrelationStandardErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix84 = pearsonsCorrelation34.getCorrelationPValues();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.038461538461538464d + "'", double79 == 0.038461538461538464d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.2837121053918259d + "'", double80 == 0.2837121053918259d);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(realMatrix83);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, 1);
        org.apache.commons.math.linear.RealMatrix realMatrix39 = pearsonsCorrelation38.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = pearsonsCorrelation38.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation38.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix39);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix41);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation33 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32);
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation33.getCorrelationMatrix();
        double[] doubleArray40 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray65 = new double[][] { doubleArray40, doubleArray46, doubleArray52, doubleArray58, doubleArray64 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation66 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = pearsonsCorrelation66.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = pearsonsCorrelation66.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix68, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation33.covarianceToCorrelation(realMatrix68);
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation33.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation33.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix73, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation75.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation75.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation75.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix78);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation32 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray38 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray44 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray63 = new double[][] { doubleArray38, doubleArray44, doubleArray50, doubleArray56, doubleArray62 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation64 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = pearsonsCorrelation64.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = pearsonsCorrelation32.covarianceToCorrelation(realMatrix65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = pearsonsCorrelation32.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation69 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix67, (int) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation69.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation69.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix72 = pearsonsCorrelation69.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation69.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix72);
        org.junit.Assert.assertNotNull(realMatrix73);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix35);
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation36.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation39 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix37, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix37);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        double[] doubleArray69 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray73 = new double[] { '4', (byte) 100, (short) 10 };
        double double74 = pearsonsCorrelation65.correlation(doubleArray69, doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation65.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix75);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation83 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix81, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation84 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix81);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.038461538461538464d + "'", double74 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation66 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation67 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = pearsonsCorrelation31.computeCorrelationMatrix(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix69);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        double[] doubleArray69 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray73 = new double[] { '4', (byte) 100, (short) 10 };
        double double74 = pearsonsCorrelation65.correlation(doubleArray69, doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation65.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix75);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80, (int) 'a');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation83 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = pearsonsCorrelation83.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = pearsonsCorrelation83.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation87 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix85, (int) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix88 = pearsonsCorrelation87.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix89 = pearsonsCorrelation87.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix90 = pearsonsCorrelation87.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix91 = pearsonsCorrelation87.getCorrelationPValues();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.038461538461538464d + "'", double74 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(realMatrix90);
        org.junit.Assert.assertNotNull(realMatrix91);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray37 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray43 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray49 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray55 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray61 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray62 = new double[][] { doubleArray37, doubleArray43, doubleArray49, doubleArray55, doubleArray61 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation63 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = pearsonsCorrelation63.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix64);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation66 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix64);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = pearsonsCorrelation66.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = pearsonsCorrelation66.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation66.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation66.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation66.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix35 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation31.getCorrelationStandardErrors();
        double[] doubleArray42 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray48 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray54 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray60 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray66 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray67 = new double[][] { doubleArray42, doubleArray48, doubleArray54, doubleArray60, doubleArray66 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray67);
        org.apache.commons.math.linear.RealMatrix realMatrix69 = pearsonsCorrelation68.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix70 = pearsonsCorrelation68.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix71 = pearsonsCorrelation68.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix71, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix71);
        java.lang.Class<?> wildcardClass75 = pearsonsCorrelation31.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix34);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertNotNull(realMatrix69);
        org.junit.Assert.assertNotNull(realMatrix70);
        org.junit.Assert.assertNotNull(realMatrix71);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation44 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41);
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray68 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray74 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray75 = new double[][] { doubleArray50, doubleArray56, doubleArray62, doubleArray68, doubleArray74 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation76 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation76.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix77, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation81 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix77, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation83 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix77, 1);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = pearsonsCorrelation44.covarianceToCorrelation(realMatrix77);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation86 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix84, 10);
        org.apache.commons.math.linear.RealMatrix realMatrix87 = pearsonsCorrelation86.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix88 = pearsonsCorrelation86.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix89 = pearsonsCorrelation86.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix87);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertNotNull(realMatrix89);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation32 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation33 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix35 = pearsonsCorrelation34.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation34.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation37 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix36);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation39 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix36, 0);
        org.apache.commons.math.linear.RealMatrix realMatrix40 = pearsonsCorrelation39.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation39.getCorrelationMatrix();
        double[] doubleArray47 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray53 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray59 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray65 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray71 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray72 = new double[][] { doubleArray47, doubleArray53, doubleArray59, doubleArray65, doubleArray71 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray72);
        double[] doubleArray77 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray81 = new double[] { '4', (byte) 100, (short) 10 };
        double double82 = pearsonsCorrelation73.correlation(doubleArray77, doubleArray81);
        org.apache.commons.math.linear.RealMatrix realMatrix83 = pearsonsCorrelation73.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation84 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix83);
        org.apache.commons.math.linear.RealMatrix realMatrix85 = pearsonsCorrelation84.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation87 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix85, (int) (byte) -1);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation88 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix85);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = pearsonsCorrelation39.covarianceToCorrelation(realMatrix85);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix35);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.038461538461538464d + "'", double82 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix83);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix89);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation45 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = pearsonsCorrelation45.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation48 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix46, (int) '#');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation49 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix46);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation50 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix46);
        org.apache.commons.math.linear.RealMatrix realMatrix51 = pearsonsCorrelation50.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix51);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray70 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray71 = new double[][] { doubleArray46, doubleArray52, doubleArray58, doubleArray64, doubleArray70 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation72.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix73);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation76 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix74, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation76.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation78 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix77);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix77);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix77);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray37 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray43 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray49 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray55 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray61 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray62 = new double[][] { doubleArray37, doubleArray43, doubleArray49, doubleArray55, doubleArray61 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation63 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray62);
        org.apache.commons.math.linear.RealMatrix realMatrix64 = pearsonsCorrelation63.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix65 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix64);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation66 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix64);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = pearsonsCorrelation66.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix68 = pearsonsCorrelation66.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix68, (int) (short) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix68, (int) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation72.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation72.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation72.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertNotNull(realMatrix64);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(realMatrix68);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        double[] doubleArray38 = new double[] { 100L, ' ', (short) -1 };
        double[] doubleArray44 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray68 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray69 = new double[][] { doubleArray44, doubleArray50, doubleArray56, doubleArray62, doubleArray68 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray69);
        double[] doubleArray74 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray78 = new double[] { '4', (byte) 100, (short) 10 };
        double double79 = pearsonsCorrelation70.correlation(doubleArray74, doubleArray78);
        double double80 = pearsonsCorrelation34.correlation(doubleArray38, doubleArray78);
        org.apache.commons.math.linear.RealMatrix realMatrix81 = pearsonsCorrelation34.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix82 = pearsonsCorrelation34.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix83 = pearsonsCorrelation34.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation84 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix83);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.038461538461538464d + "'", double79 == 0.038461538461538464d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.2837121053918259d + "'", double80 == 0.2837121053918259d);
        org.junit.Assert.assertNotNull(realMatrix81);
        org.junit.Assert.assertNotNull(realMatrix82);
        org.junit.Assert.assertNotNull(realMatrix83);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray70 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray71 = new double[][] { doubleArray46, doubleArray52, doubleArray58, doubleArray64, doubleArray70 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation72.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix73);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation76 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix74, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation76.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation76.getCorrelationMatrix();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix78);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation79.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix81 = pearsonsCorrelation79.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix81);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation32 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation33 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray40 = new double[] { (short) 1, 'a', ' ', (-1), (byte) 0, '#' };
        double[] doubleArray47 = new double[] { (short) 1, 'a', ' ', (-1), (byte) 0, '#' };
        double[] doubleArray54 = new double[] { (short) 1, 'a', ' ', (-1), (byte) 0, '#' };
        double[][] doubleArray55 = new double[][] { doubleArray40, doubleArray47, doubleArray54 };
        org.apache.commons.math.linear.RealMatrix realMatrix56 = pearsonsCorrelation33.computeCorrelationMatrix(doubleArray55);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation57 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray55);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation58 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray55);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation59 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray55);
        org.apache.commons.math.linear.RealMatrix realMatrix60 = pearsonsCorrelation59.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix61 = pearsonsCorrelation59.getCorrelationStandardErrors();
        java.lang.Class<?> wildcardClass62 = pearsonsCorrelation59.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 1.0d, 97.0d, 32.0d, (-1.0d), 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d, 97.0d, 32.0d, (-1.0d), 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 1.0d, 97.0d, 32.0d, (-1.0d), 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertNotNull(realMatrix56);
        org.junit.Assert.assertNotNull(realMatrix60);
        org.junit.Assert.assertNotNull(realMatrix61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        double[] doubleArray69 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray73 = new double[] { '4', (byte) 100, (short) 10 };
        double double74 = pearsonsCorrelation65.correlation(doubleArray69, doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation65.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix75);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80, (int) 'a');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation84 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation86 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80, (int) '4');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation88 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80, (int) (byte) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = pearsonsCorrelation88.getCorrelationStandardErrors();
        java.lang.Class<?> wildcardClass90 = realMatrix89.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.038461538461538464d + "'", double74 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation34 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation36 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation38 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, 1);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation40 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32, (int) '#');
        double[] doubleArray46 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray52 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray58 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray64 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray70 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray71 = new double[][] { doubleArray46, doubleArray52, doubleArray58, doubleArray64, doubleArray70 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray71);
        org.apache.commons.math.linear.RealMatrix realMatrix73 = pearsonsCorrelation72.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation72.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation40.computeCorrelationMatrix(realMatrix74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation40.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation40.covarianceToCorrelation(realMatrix77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(realMatrix73);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation45 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = pearsonsCorrelation45.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix47 = pearsonsCorrelation45.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix48 = pearsonsCorrelation45.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix47);
        org.junit.Assert.assertNotNull(realMatrix48);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation32 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray38 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray44 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray50 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray56 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray62 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray63 = new double[][] { doubleArray38, doubleArray44, doubleArray50, doubleArray56, doubleArray62 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation64 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray63);
        org.apache.commons.math.linear.RealMatrix realMatrix65 = pearsonsCorrelation64.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = pearsonsCorrelation32.covarianceToCorrelation(realMatrix65);
        org.apache.commons.math.linear.RealMatrix realMatrix67 = pearsonsCorrelation32.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation69 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix67, (int) 'a');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix67);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation71 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix67);
        java.lang.Class<?> wildcardClass72 = pearsonsCorrelation71.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertNotNull(realMatrix65);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix67);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation35 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix33, (int) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix36 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix37 = pearsonsCorrelation35.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation39 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix37, (int) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix40 = pearsonsCorrelation39.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation39.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = pearsonsCorrelation39.getCorrelationMatrix();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(realMatrix37);
        org.junit.Assert.assertNotNull(realMatrix40);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix42);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation42 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41);
        double[] doubleArray49 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray55 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray61 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray67 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray73 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray74 = new double[][] { doubleArray49, doubleArray55, doubleArray61, doubleArray67, doubleArray73 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation75 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray74);
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation75.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation78 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, (-1));
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation80 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, (int) (byte) 100);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, 1);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation84 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix76, (int) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix85 = pearsonsCorrelation43.computeCorrelationMatrix(realMatrix76);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation86 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix85);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation88 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix85, (int) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix89 = pearsonsCorrelation88.getCorrelationPValues();
        java.lang.Class<?> wildcardClass90 = pearsonsCorrelation88.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation33 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix32);
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        org.apache.commons.math.linear.RealMatrix realMatrix66 = pearsonsCorrelation65.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation68 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix66, (int) '#');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation70 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix66, 1);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation72 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix66, (int) (byte) 10);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation73 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix66);
        org.apache.commons.math.linear.RealMatrix realMatrix74 = pearsonsCorrelation73.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation73.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix76 = pearsonsCorrelation33.covarianceToCorrelation(realMatrix75);
        org.apache.commons.math.linear.RealMatrix realMatrix77 = pearsonsCorrelation33.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix78 = pearsonsCorrelation33.getCorrelationMatrix();
        org.apache.commons.math.linear.RealMatrix realMatrix79 = pearsonsCorrelation33.getCorrelationMatrix();
        java.lang.Class<?> wildcardClass80 = pearsonsCorrelation33.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(realMatrix66);
        org.junit.Assert.assertNotNull(realMatrix74);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix76);
        org.junit.Assert.assertNotNull(realMatrix77);
        org.junit.Assert.assertNotNull(realMatrix78);
        org.junit.Assert.assertNotNull(realMatrix79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        org.apache.commons.math.linear.RealMatrix realMatrix32 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = pearsonsCorrelation31.getCorrelationPValues();
        double[] doubleArray39 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray45 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray51 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray57 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray63 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray64 = new double[][] { doubleArray39, doubleArray45, doubleArray51, doubleArray57, doubleArray63 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation65 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray64);
        double[] doubleArray69 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray73 = new double[] { '4', (byte) 100, (short) 10 };
        double double74 = pearsonsCorrelation65.correlation(doubleArray69, doubleArray73);
        org.apache.commons.math.linear.RealMatrix realMatrix75 = pearsonsCorrelation65.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation77 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation79 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix75, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix80 = pearsonsCorrelation31.computeCorrelationMatrix(realMatrix75);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation82 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80, (int) 'a');
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation83 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix80);
        org.apache.commons.math.linear.RealMatrix realMatrix84 = pearsonsCorrelation83.getCorrelationStandardErrors();
        org.apache.commons.math.linear.RealMatrix realMatrix85 = pearsonsCorrelation83.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation87 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix85, (int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix88 = pearsonsCorrelation87.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation90 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix88, (int) (short) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix91 = pearsonsCorrelation90.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation92 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix91);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = pearsonsCorrelation92.getCorrelationStandardErrors();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.038461538461538464d + "'", double74 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix75);
        org.junit.Assert.assertNotNull(realMatrix80);
        org.junit.Assert.assertNotNull(realMatrix84);
        org.junit.Assert.assertNotNull(realMatrix85);
        org.junit.Assert.assertNotNull(realMatrix88);
        org.junit.Assert.assertNotNull(realMatrix91);
        org.junit.Assert.assertNotNull(realMatrix93);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double[] doubleArray5 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray17 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray23 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[] doubleArray29 = new double[] { (byte) 1, 1, 0, 'a', (-1.0d) };
        double[][] doubleArray30 = new double[][] { doubleArray5, doubleArray11, doubleArray17, doubleArray23, doubleArray29 };
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation31 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(doubleArray30);
        double[] doubleArray35 = new double[] { (short) -1, 10.0d, 10.0f };
        double[] doubleArray39 = new double[] { '4', (byte) 100, (short) 10 };
        double double40 = pearsonsCorrelation31.correlation(doubleArray35, doubleArray39);
        org.apache.commons.math.linear.RealMatrix realMatrix41 = pearsonsCorrelation31.getCorrelationPValues();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation43 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 0);
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation45 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix41, (int) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix46 = pearsonsCorrelation45.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation47 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix46);
        org.apache.commons.math.linear.RealMatrix realMatrix48 = pearsonsCorrelation47.getCorrelationStandardErrors();
        org.apache.commons.math.stat.correlation.PearsonsCorrelation pearsonsCorrelation50 = new org.apache.commons.math.stat.correlation.PearsonsCorrelation(realMatrix48, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d, 1.0d, 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 52.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.038461538461538464d + "'", double40 == 0.038461538461538464d);
        org.junit.Assert.assertNotNull(realMatrix41);
        org.junit.Assert.assertNotNull(realMatrix46);
        org.junit.Assert.assertNotNull(realMatrix48);
    }
}

