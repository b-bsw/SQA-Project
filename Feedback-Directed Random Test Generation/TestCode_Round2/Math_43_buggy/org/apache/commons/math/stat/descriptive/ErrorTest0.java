package org.apache.commons.math.stat.descriptive;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        long long5 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.rank.Max max7 = summaryStatistics0.max;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getGeoMeanImpl();
        java.lang.String str9 = summaryStatistics0.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max7 and storelessUnivariateStatistic8", max7.equals(storelessUnivariateStatistic8) ? max7.hashCode() == storelessUnivariateStatistic8.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMean();
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = summaryStatistics0.sum;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double7 = summaryStatistics6.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics8.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = summaryStatistics8.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics8.getSumLogImpl();
        summaryStatistics6.setSumLogImpl(storelessUnivariateStatistic12);
        org.apache.commons.math.stat.descriptive.moment.Mean mean14 = summaryStatistics6.mean;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean15 = summaryStatistics6.geoMean;
        summaryStatistics0.geoMean = geometricMean15;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on sum5 and geometricMean15", sum5.equals(geometricMean15) ? sum5.hashCode() == geometricMean15.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = summaryStatistics2.copy();
        double double8 = summaryStatistics2.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = summaryStatistics2.secondMoment;
        org.apache.commons.math.stat.descriptive.moment.Mean mean10 = summaryStatistics2.mean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics11.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = summaryStatistics11.variance;
        double double15 = summaryStatistics11.getMin();
        double double16 = summaryStatistics11.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean17 = summaryStatistics11.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics11.getMeanImpl();
        summaryStatistics2.setMaxImpl(storelessUnivariateStatistic18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean17 and storelessUnivariateStatistic18", geometricMean17.equals(storelessUnivariateStatistic18) ? geometricMean17.hashCode() == storelessUnivariateStatistic18.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getVarianceImpl();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic7", geometricMean6.equals(storelessUnivariateStatistic7) ? geometricMean6.hashCode() == storelessUnivariateStatistic7.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs8 = summaryStatistics0.sumLog;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic7", geometricMean6.equals(storelessUnivariateStatistic7) ? geometricMean6.hashCode() == storelessUnivariateStatistic7.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        double double5 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double8 = summaryStatistics7.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics9.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = summaryStatistics9.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics9.getSumLogImpl();
        summaryStatistics7.setSumLogImpl(storelessUnivariateStatistic13);
        org.apache.commons.math.stat.descriptive.moment.Mean mean15 = summaryStatistics7.mean;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean16 = summaryStatistics7.geoMean;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs17 = summaryStatistics7.sumLog;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics18.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = summaryStatistics18.variance;
        double double22 = summaryStatistics18.getMin();
        double double23 = summaryStatistics18.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares25 = summaryStatistics24.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics24);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary28 = summaryStatistics27.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max29 = summaryStatistics27.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary31 = summaryStatistics30.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max32 = summaryStatistics30.max;
        summaryStatistics27.max = max32;
        summaryStatistics24.max = max32;
        summaryStatistics18.max = max32;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics36 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares37 = summaryStatistics36.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum38 = null;
        summaryStatistics36.sum = sum38;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics40 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics40.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance43 = summaryStatistics40.variance;
        summaryStatistics36.variance = variance43;
        summaryStatistics18.variance = variance43;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic46 = summaryStatistics18.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics47 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double48 = summaryStatistics47.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment49 = summaryStatistics47.secondMoment;
        double double50 = summaryStatistics47.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics51 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares52 = summaryStatistics51.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum53 = null;
        summaryStatistics51.sum = sum53;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics55 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics55.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance58 = summaryStatistics55.variance;
        summaryStatistics51.variance = variance58;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics60 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary61 = summaryStatistics60.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic62 = summaryStatistics60.getSumsqImpl();
        summaryStatistics51.setSumLogImpl(storelessUnivariateStatistic62);
        double double64 = summaryStatistics51.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics65 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares66 = summaryStatistics65.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics67 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics65);
        org.apache.commons.math.stat.descriptive.summary.Sum sum68 = summaryStatistics65.sum;
        summaryStatistics51.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum68);
        summaryStatistics47.sum = sum68;
        summaryStatistics18.sum = sum68;
        summaryStatistics7.sum = sum68;
        summaryStatistics0.sum = sum68;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic6 and geometricMean16", storelessUnivariateStatistic6.equals(geometricMean16) ? storelessUnivariateStatistic6.hashCode() == geometricMean16.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        org.apache.commons.math.stat.descriptive.moment.Mean mean4 = summaryStatistics0.mean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary6 = summaryStatistics5.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max7 = summaryStatistics5.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics8.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max10 = summaryStatistics8.max;
        summaryStatistics5.max = max10;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = summaryStatistics12.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics12);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean16 = summaryStatistics12.geoMean;
        summaryStatistics5.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean16);
        summaryStatistics0.geoMean = geometricMean16;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary20 = summaryStatistics19.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double22 = summaryStatistics21.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary24 = summaryStatistics23.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max25 = summaryStatistics23.max;
        boolean boolean26 = summaryStatistics21.equals((java.lang.Object) summaryStatistics23);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares27 = summaryStatistics23.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares29 = summaryStatistics28.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics28);
        org.apache.commons.math.stat.descriptive.summary.Sum sum31 = summaryStatistics28.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs32 = summaryStatistics28.sumLog;
        summaryStatistics23.sumLog = sumOfLogs32;
        summaryStatistics19.sumLog = sumOfLogs32;
        summaryStatistics0.sumLog = sumOfLogs32;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics36 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = summaryStatistics36.getMeanImpl();
        double double38 = summaryStatistics36.getSum();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary39 = summaryStatistics36.getSummary();
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = summaryStatistics36.variance;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics41 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double42 = summaryStatistics41.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics43 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics43.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = summaryStatistics43.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic47 = summaryStatistics43.getSumLogImpl();
        summaryStatistics41.setSumLogImpl(storelessUnivariateStatistic47);
        org.apache.commons.math.stat.descriptive.moment.Mean mean49 = summaryStatistics41.mean;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean50 = summaryStatistics41.geoMean;
        summaryStatistics36.geoMean = geometricMean50;
        summaryStatistics0.geoMean = geometricMean50;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mean4 and geometricMean50", mean4.equals(geometricMean50) ? mean4.hashCode() == geometricMean50.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic1 = summaryStatistics0.getMeanImpl();
        double double2 = summaryStatistics0.getSum();
        double double3 = summaryStatistics0.getGeometricMean();
        long long4 = summaryStatistics0.n;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics5.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance8 = summaryStatistics5.variance;
        double double9 = summaryStatistics5.getMin();
        double double10 = summaryStatistics5.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares12 = summaryStatistics11.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics11);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary15 = summaryStatistics14.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max16 = summaryStatistics14.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary18 = summaryStatistics17.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max19 = summaryStatistics17.max;
        summaryStatistics14.max = max19;
        summaryStatistics11.max = max19;
        summaryStatistics5.max = max19;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares24 = summaryStatistics23.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum25 = null;
        summaryStatistics23.sum = sum25;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics27.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = summaryStatistics27.variance;
        summaryStatistics23.variance = variance30;
        summaryStatistics5.variance = variance30;
        org.apache.commons.math.stat.descriptive.rank.Max max33 = summaryStatistics5.max;
        summaryStatistics0.max = max33;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics35 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics35.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = summaryStatistics35.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic39 = summaryStatistics35.getSumLogImpl();
        summaryStatistics35.n = ' ';
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic42 = summaryStatistics35.getMeanImpl();
        double double43 = summaryStatistics35.getPopulationVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean44 = summaryStatistics35.geoMean;
        summaryStatistics0.geoMean = geometricMean44;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic42 and geometricMean44", storelessUnivariateStatistic42.equals(geometricMean44) ? storelessUnivariateStatistic42.hashCode() == geometricMean44.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.moment.Mean mean6 = summaryStatistics0.mean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics0);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics8.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = summaryStatistics8.variance;
        double double12 = summaryStatistics8.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares14 = summaryStatistics13.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics13);
        org.apache.commons.math.stat.descriptive.summary.Sum sum16 = summaryStatistics13.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs17 = summaryStatistics13.sumLog;
        summaryStatistics8.sumLog = sumOfLogs17;
        summaryStatistics7.sumLog = sumOfLogs17;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double21 = summaryStatistics20.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics22.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance25 = summaryStatistics22.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic26 = summaryStatistics22.getSumLogImpl();
        summaryStatistics20.setSumLogImpl(storelessUnivariateStatistic26);
        org.apache.commons.math.stat.descriptive.moment.Mean mean28 = summaryStatistics20.mean;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean29 = summaryStatistics20.geoMean;
        summaryStatistics7.geoMean = geometricMean29;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mean6 and geometricMean29", mean6.equals(geometricMean29) ? mean6.hashCode() == geometricMean29.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics2.getMinImpl();
        double double8 = summaryStatistics2.getMin();
        org.apache.commons.math.stat.descriptive.rank.Min min9 = summaryStatistics2.min;
        double double10 = summaryStatistics2.getSecondMoment();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics2.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics12.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance15 = summaryStatistics12.variance;
        double double16 = summaryStatistics12.getMin();
        double double17 = summaryStatistics12.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean18 = summaryStatistics12.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics12.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics2, summaryStatistics12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean18 and storelessUnivariateStatistic19", geometricMean18.equals(storelessUnivariateStatistic19) ? geometricMean18.hashCode() == storelessUnivariateStatistic19.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.moment.Mean mean6 = summaryStatistics0.mean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics0);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics8.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = summaryStatistics8.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics8.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics13.getMeanImpl();
        double double15 = summaryStatistics13.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double17 = summaryStatistics16.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = summaryStatistics16.secondMoment;
        summaryStatistics13.secondMoment = secondMoment18;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics20.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics20.getMaxImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares24 = summaryStatistics23.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics23);
        org.apache.commons.math.stat.descriptive.summary.Sum sum26 = summaryStatistics23.sum;
        summaryStatistics20.sum = sum26;
        summaryStatistics13.sum = sum26;
        summaryStatistics8.sum = sum26;
        summaryStatistics7.sum = sum26;
        double double31 = summaryStatistics7.getSumsq();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean32 = summaryStatistics7.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = summaryStatistics7.copy();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mean6 and geometricMean32", mean6.equals(geometricMean32) ? mean6.hashCode() == geometricMean32.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = summaryStatistics0.sumLog;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = summaryStatistics0.copy();
        java.lang.String str9 = summaryStatistics8.toString();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics8.getMeanImpl();
        org.apache.commons.math.stat.descriptive.summary.Sum sum11 = summaryStatistics8.sum;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic10", geometricMean6.equals(storelessUnivariateStatistic10) ? geometricMean6.hashCode() == storelessUnivariateStatistic10.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        long long5 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics8.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares12 = summaryStatistics11.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum13 = null;
        summaryStatistics11.sum = sum13;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary16 = summaryStatistics15.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max17 = summaryStatistics15.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary19 = summaryStatistics18.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max20 = summaryStatistics18.max;
        summaryStatistics15.max = max20;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics15.getMeanImpl();
        summaryStatistics11.setSumLogImpl(storelessUnivariateStatistic22);
        summaryStatistics8.setVarianceImpl(storelessUnivariateStatistic22);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic26 = summaryStatistics25.getMeanImpl();
        double double27 = summaryStatistics25.getSum();
        double double28 = summaryStatistics25.getGeometricMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic29 = summaryStatistics25.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics8, summaryStatistics25);
        org.apache.commons.math.stat.descriptive.rank.Min min31 = summaryStatistics8.min;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean32 = summaryStatistics8.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double34 = summaryStatistics33.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics35 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics35.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance38 = summaryStatistics35.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic39 = summaryStatistics35.getSumLogImpl();
        summaryStatistics33.setSumLogImpl(storelessUnivariateStatistic39);
        org.apache.commons.math.stat.descriptive.moment.Mean mean41 = summaryStatistics33.mean;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean42 = summaryStatistics33.geoMean;
        summaryStatistics8.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean42);
        summaryStatistics0.geoMean = geometricMean42;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic7 and geometricMean42", storelessUnivariateStatistic7.equals(geometricMean42) ? storelessUnivariateStatistic7.hashCode() == geometricMean42.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        double double7 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics8.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max10 = summaryStatistics8.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares12 = summaryStatistics11.sumsq;
        summaryStatistics8.sumsq = sumOfSquares12;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics14.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = summaryStatistics14.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics14.getSumLogImpl();
        double double19 = summaryStatistics14.getStandardDeviation();
        boolean boolean20 = summaryStatistics8.equals((java.lang.Object) summaryStatistics14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = summaryStatistics21.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double24 = summaryStatistics23.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary26 = summaryStatistics25.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max27 = summaryStatistics25.max;
        boolean boolean28 = summaryStatistics23.equals((java.lang.Object) summaryStatistics25);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares29 = summaryStatistics25.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares31 = summaryStatistics30.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = summaryStatistics30.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = summaryStatistics30.sumLog;
        summaryStatistics25.sumLog = sumOfLogs34;
        summaryStatistics21.sumLog = sumOfLogs34;
        summaryStatistics14.sumLog = sumOfLogs34;
        summaryStatistics0.sumLog = sumOfLogs34;
        double double39 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.Mean mean40 = summaryStatistics0.mean;
        org.apache.commons.math.stat.descriptive.rank.Min min41 = summaryStatistics0.min;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and mean40", geometricMean6.equals(mean40) ? geometricMean6.hashCode() == mean40.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getMeanImpl();
        double double8 = summaryStatistics0.getSumOfLogs();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic7", geometricMean6.equals(storelessUnivariateStatistic7) ? geometricMean6.hashCode() == storelessUnivariateStatistic7.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = summaryStatistics2.copy();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics2.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double10 = summaryStatistics9.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment11 = summaryStatistics9.secondMoment;
        summaryStatistics2.secondMoment = secondMoment11;
        java.lang.String str13 = summaryStatistics2.toString();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean14 = summaryStatistics2.geoMean;
        org.apache.commons.math.stat.descriptive.rank.Min min15 = null;
        summaryStatistics2.min = min15;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic17 = summaryStatistics2.getMinImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = summaryStatistics2.secondMoment;
        double double19 = summaryStatistics2.getSecondMoment();
        double double20 = summaryStatistics2.getMin();
        summaryStatistics2.addValue((double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max4 and geometricMean14", max4.equals(geometricMean14) ? max4.hashCode() == geometricMean14.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = summaryStatistics0.sumLog;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = summaryStatistics0.copy();
        java.lang.String str9 = summaryStatistics8.toString();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics8.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics11.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance14 = summaryStatistics11.variance;
        double double15 = summaryStatistics11.getSecondMoment();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double17 = summaryStatistics16.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary19 = summaryStatistics18.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max20 = summaryStatistics18.max;
        boolean boolean21 = summaryStatistics16.equals((java.lang.Object) summaryStatistics18);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares22 = summaryStatistics18.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = summaryStatistics18.copy();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = summaryStatistics18.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double26 = summaryStatistics25.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment27 = summaryStatistics25.secondMoment;
        summaryStatistics18.secondMoment = secondMoment27;
        java.lang.String str29 = summaryStatistics18.toString();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean30 = summaryStatistics18.geoMean;
        org.apache.commons.math.stat.descriptive.rank.Min min31 = null;
        summaryStatistics18.min = min31;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean33 = summaryStatistics18.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics11, summaryStatistics18);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics35 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double36 = summaryStatistics35.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics37 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary38 = summaryStatistics37.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max39 = summaryStatistics37.max;
        boolean boolean40 = summaryStatistics35.equals((java.lang.Object) summaryStatistics37);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares41 = summaryStatistics37.sumsq;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic42 = summaryStatistics37.getMinImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics43 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary44 = summaryStatistics43.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max45 = summaryStatistics43.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics46 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares47 = summaryStatistics46.sumsq;
        summaryStatistics43.sumsq = sumOfSquares47;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics49 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics49.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = summaryStatistics49.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic53 = summaryStatistics49.getSumLogImpl();
        double double54 = summaryStatistics49.getStandardDeviation();
        boolean boolean55 = summaryStatistics43.equals((java.lang.Object) summaryStatistics49);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics56 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary57 = summaryStatistics56.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics58 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double59 = summaryStatistics58.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics60 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary61 = summaryStatistics60.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max62 = summaryStatistics60.max;
        boolean boolean63 = summaryStatistics58.equals((java.lang.Object) summaryStatistics60);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares64 = summaryStatistics60.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics65 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares66 = summaryStatistics65.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics67 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics65);
        org.apache.commons.math.stat.descriptive.summary.Sum sum68 = summaryStatistics65.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs69 = summaryStatistics65.sumLog;
        summaryStatistics60.sumLog = sumOfLogs69;
        summaryStatistics56.sumLog = sumOfLogs69;
        summaryStatistics49.sumLog = sumOfLogs69;
        summaryStatistics37.sumLog = sumOfLogs69;
        summaryStatistics18.sumLog = sumOfLogs69;
        summaryStatistics8.sumLog = sumOfLogs69;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic10", geometricMean6.equals(storelessUnivariateStatistic10) ? geometricMean6.hashCode() == storelessUnivariateStatistic10.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares8 = summaryStatistics7.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics7);
        org.apache.commons.math.stat.descriptive.summary.Sum sum10 = summaryStatistics7.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs11 = summaryStatistics7.sumLog;
        summaryStatistics2.sumLog = sumOfLogs11;
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares13 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double15 = summaryStatistics14.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary17 = summaryStatistics16.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max18 = summaryStatistics16.max;
        boolean boolean19 = summaryStatistics14.equals((java.lang.Object) summaryStatistics16);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares20 = summaryStatistics16.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = summaryStatistics16.copy();
        double double22 = summaryStatistics16.getSum();
        double double23 = summaryStatistics16.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary25 = summaryStatistics24.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic26 = summaryStatistics24.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics24);
        summaryStatistics24.n = (-1);
        long long30 = summaryStatistics24.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean31 = summaryStatistics24.mean;
        summaryStatistics16.mean = mean31;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics33.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance36 = summaryStatistics33.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic37 = summaryStatistics33.getSumLogImpl();
        double double38 = summaryStatistics33.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic39 = summaryStatistics33.getMinImpl();
        summaryStatistics16.setSumsqImpl(storelessUnivariateStatistic39);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = summaryStatistics16.getSumLogImpl();
        summaryStatistics2.setMeanImpl(storelessUnivariateStatistic41);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics43 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics43.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance46 = summaryStatistics43.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic47 = summaryStatistics43.getSumLogImpl();
        summaryStatistics43.n = ' ';
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic50 = summaryStatistics43.getMeanImpl();
        double double51 = summaryStatistics43.getPopulationVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean52 = summaryStatistics43.geoMean;
        summaryStatistics2.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic39 and geometricMean52", storelessUnivariateStatistic39.equals(geometricMean52) ? storelessUnivariateStatistic39.hashCode() == geometricMean52.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        double double5 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = summaryStatistics0.sumLog;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics8.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics8.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics8);
        summaryStatistics8.n = (-1);
        long long14 = summaryStatistics8.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean15 = summaryStatistics8.mean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics16.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = summaryStatistics16.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic20 = summaryStatistics16.getSumLogImpl();
        summaryStatistics8.setSumsqImpl(storelessUnivariateStatistic20);
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics0, summaryStatistics8);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic23 = summaryStatistics0.getGeoMeanImpl();
        java.lang.Class<?> wildcardClass24 = storelessUnivariateStatistic23.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic6 and storelessUnivariateStatistic23", storelessUnivariateStatistic6.equals(storelessUnivariateStatistic23) ? storelessUnivariateStatistic6.hashCode() == storelessUnivariateStatistic23.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics0);
        double double4 = summaryStatistics0.getSumsq();
        long long5 = summaryStatistics0.n;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics6.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = summaryStatistics6.variance;
        double double10 = summaryStatistics6.getMin();
        double double11 = summaryStatistics6.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean12 = summaryStatistics6.geoMean;
        double double13 = summaryStatistics6.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary15 = summaryStatistics14.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max16 = summaryStatistics14.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares18 = summaryStatistics17.sumsq;
        summaryStatistics14.sumsq = sumOfSquares18;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics20.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = summaryStatistics20.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = summaryStatistics20.getSumLogImpl();
        double double25 = summaryStatistics20.getStandardDeviation();
        boolean boolean26 = summaryStatistics14.equals((java.lang.Object) summaryStatistics20);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary28 = summaryStatistics27.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double30 = summaryStatistics29.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics31 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary32 = summaryStatistics31.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max33 = summaryStatistics31.max;
        boolean boolean34 = summaryStatistics29.equals((java.lang.Object) summaryStatistics31);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares35 = summaryStatistics31.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics36 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares37 = summaryStatistics36.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics38 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics36);
        org.apache.commons.math.stat.descriptive.summary.Sum sum39 = summaryStatistics36.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs40 = summaryStatistics36.sumLog;
        summaryStatistics31.sumLog = sumOfLogs40;
        summaryStatistics27.sumLog = sumOfLogs40;
        summaryStatistics20.sumLog = sumOfLogs40;
        summaryStatistics6.sumLog = sumOfLogs40;
        double double45 = summaryStatistics6.getMin();
        org.apache.commons.math.stat.descriptive.moment.Mean mean46 = summaryStatistics6.mean;
        summaryStatistics0.mean = mean46;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean12 and mean46", geometricMean12.equals(mean46) ? geometricMean12.hashCode() == mean46.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares4 = summaryStatistics3.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum5 = null;
        summaryStatistics3.sum = sum5;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary8 = summaryStatistics7.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max9 = summaryStatistics7.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary11 = summaryStatistics10.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max12 = summaryStatistics10.max;
        summaryStatistics7.max = max12;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics7.getMeanImpl();
        summaryStatistics3.setSumLogImpl(storelessUnivariateStatistic14);
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics17.getMeanImpl();
        double double19 = summaryStatistics17.getSum();
        double double20 = summaryStatistics17.getGeometricMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics17.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics0, summaryStatistics17);
        org.apache.commons.math.stat.descriptive.rank.Min min23 = summaryStatistics0.min;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean24 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double26 = summaryStatistics25.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics27.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance30 = summaryStatistics27.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic31 = summaryStatistics27.getSumLogImpl();
        summaryStatistics25.setSumLogImpl(storelessUnivariateStatistic31);
        org.apache.commons.math.stat.descriptive.moment.Mean mean33 = summaryStatistics25.mean;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean34 = summaryStatistics25.geoMean;
        summaryStatistics0.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean34);
        summaryStatistics0.addValue((double) '#');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on min23 and geometricMean24", min23.equals(geometricMean24) ? min23.hashCode() == geometricMean24.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getSumsq();
        org.apache.commons.math.stat.descriptive.moment.Mean mean6 = summaryStatistics0.mean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics0);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics8.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = summaryStatistics8.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic12 = summaryStatistics8.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics13.getMeanImpl();
        double double15 = summaryStatistics13.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics16 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double17 = summaryStatistics16.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment18 = summaryStatistics16.secondMoment;
        summaryStatistics13.secondMoment = secondMoment18;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics20.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics20.getMaxImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares24 = summaryStatistics23.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics23);
        org.apache.commons.math.stat.descriptive.summary.Sum sum26 = summaryStatistics23.sum;
        summaryStatistics20.sum = sum26;
        summaryStatistics13.sum = sum26;
        summaryStatistics8.sum = sum26;
        summaryStatistics7.sum = sum26;
        double double31 = summaryStatistics7.getSumsq();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean32 = summaryStatistics7.geoMean;
        java.lang.Object obj33 = null;
        boolean boolean34 = summaryStatistics7.equals(obj33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mean6 and geometricMean32", mean6.equals(geometricMean32) ? mean6.hashCode() == geometricMean32.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        double double7 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics8.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max10 = summaryStatistics8.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares12 = summaryStatistics11.sumsq;
        summaryStatistics8.sumsq = sumOfSquares12;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics14.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = summaryStatistics14.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics14.getSumLogImpl();
        double double19 = summaryStatistics14.getStandardDeviation();
        boolean boolean20 = summaryStatistics8.equals((java.lang.Object) summaryStatistics14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = summaryStatistics21.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double24 = summaryStatistics23.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary26 = summaryStatistics25.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max27 = summaryStatistics25.max;
        boolean boolean28 = summaryStatistics23.equals((java.lang.Object) summaryStatistics25);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares29 = summaryStatistics25.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares31 = summaryStatistics30.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = summaryStatistics30.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = summaryStatistics30.sumLog;
        summaryStatistics25.sumLog = sumOfLogs34;
        summaryStatistics21.sumLog = sumOfLogs34;
        summaryStatistics14.sumLog = sumOfLogs34;
        summaryStatistics0.sumLog = sumOfLogs34;
        double double39 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.moment.Mean mean40 = summaryStatistics0.mean;
        double double41 = summaryStatistics0.getMax();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and mean40", geometricMean6.equals(mean40) ? geometricMean6.hashCode() == mean40.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = summaryStatistics2.copy();
        double double8 = summaryStatistics2.getSum();
        double double9 = summaryStatistics2.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = summaryStatistics12.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max14 = summaryStatistics12.max;
        boolean boolean15 = summaryStatistics10.equals((java.lang.Object) summaryStatistics12);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = summaryStatistics12.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = summaryStatistics12.copy();
        double double18 = summaryStatistics12.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment19 = summaryStatistics12.secondMoment;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics20.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance23 = summaryStatistics20.variance;
        double double24 = summaryStatistics20.getMin();
        long long25 = summaryStatistics20.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic26 = summaryStatistics20.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.rank.Max max27 = summaryStatistics20.max;
        summaryStatistics12.max = max27;
        summaryStatistics2.max = max27;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double31 = summaryStatistics30.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics32.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = summaryStatistics32.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic36 = summaryStatistics32.getSumLogImpl();
        summaryStatistics30.setSumLogImpl(storelessUnivariateStatistic36);
        org.apache.commons.math.stat.descriptive.moment.Mean mean38 = summaryStatistics30.mean;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean39 = summaryStatistics30.geoMean;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs40 = summaryStatistics30.sumLog;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics41 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics41.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance44 = summaryStatistics41.variance;
        double double45 = summaryStatistics41.getMin();
        double double46 = summaryStatistics41.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics47 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares48 = summaryStatistics47.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics49 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics47);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics50 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary51 = summaryStatistics50.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max52 = summaryStatistics50.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics53 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary54 = summaryStatistics53.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max55 = summaryStatistics53.max;
        summaryStatistics50.max = max55;
        summaryStatistics47.max = max55;
        summaryStatistics41.max = max55;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics59 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares60 = summaryStatistics59.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum61 = null;
        summaryStatistics59.sum = sum61;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics63 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics63.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance66 = summaryStatistics63.variance;
        summaryStatistics59.variance = variance66;
        summaryStatistics41.variance = variance66;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic69 = summaryStatistics41.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics70 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double71 = summaryStatistics70.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment72 = summaryStatistics70.secondMoment;
        double double73 = summaryStatistics70.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics74 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares75 = summaryStatistics74.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum76 = null;
        summaryStatistics74.sum = sum76;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics78 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics78.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance81 = summaryStatistics78.variance;
        summaryStatistics74.variance = variance81;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics83 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary84 = summaryStatistics83.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic85 = summaryStatistics83.getSumsqImpl();
        summaryStatistics74.setSumLogImpl(storelessUnivariateStatistic85);
        double double87 = summaryStatistics74.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics88 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares89 = summaryStatistics88.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics90 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics88);
        org.apache.commons.math.stat.descriptive.summary.Sum sum91 = summaryStatistics88.sum;
        summaryStatistics74.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum91);
        summaryStatistics70.sum = sum91;
        summaryStatistics41.sum = sum91;
        summaryStatistics30.sum = sum91;
        summaryStatistics2.sum = sum91;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max27 and geometricMean39", max27.equals(geometricMean39) ? max27.hashCode() == geometricMean39.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics2.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics2.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares10 = summaryStatistics9.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics9);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = summaryStatistics12.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max14 = summaryStatistics12.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary16 = summaryStatistics15.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max17 = summaryStatistics15.max;
        summaryStatistics12.max = max17;
        summaryStatistics9.max = max17;
        summaryStatistics2.max = max17;
        summaryStatistics2.addValue((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max4 and storelessUnivariateStatistic8", max4.equals(storelessUnivariateStatistic8) ? max4.hashCode() == storelessUnivariateStatistic8.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        long long5 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = summaryStatistics0.copy();
        double double8 = summaryStatistics7.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares9 = summaryStatistics7.sumsq;
        double double10 = summaryStatistics7.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.rank.Max max11 = summaryStatistics7.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary15 = summaryStatistics14.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max16 = summaryStatistics14.max;
        boolean boolean17 = summaryStatistics12.equals((java.lang.Object) summaryStatistics14);
        double double18 = summaryStatistics12.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary20 = summaryStatistics19.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics19.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics19);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = summaryStatistics23.getMeanImpl();
        double double25 = summaryStatistics23.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double27 = summaryStatistics26.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment28 = summaryStatistics26.secondMoment;
        summaryStatistics23.secondMoment = secondMoment28;
        summaryStatistics22.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment28);
        summaryStatistics12.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment28);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics32.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance35 = summaryStatistics32.variance;
        double double36 = summaryStatistics32.getMin();
        double double37 = summaryStatistics32.getVariance();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics38 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares39 = summaryStatistics38.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics40 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics38);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics41 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary42 = summaryStatistics41.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max43 = summaryStatistics41.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics44 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary45 = summaryStatistics44.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max46 = summaryStatistics44.max;
        summaryStatistics41.max = max46;
        summaryStatistics38.max = max46;
        summaryStatistics32.max = max46;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics50 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares51 = summaryStatistics50.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum52 = null;
        summaryStatistics50.sum = sum52;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics54 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics54.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance57 = summaryStatistics54.variance;
        summaryStatistics50.variance = variance57;
        summaryStatistics32.variance = variance57;
        summaryStatistics12.variance = variance57;
        summaryStatistics7.variance = variance57;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic62 = summaryStatistics7.getGeoMeanImpl();
        double double63 = summaryStatistics7.getSum();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max11 and storelessUnivariateStatistic62", max11.equals(storelessUnivariateStatistic62) ? max11.hashCode() == storelessUnivariateStatistic62.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max2 = summaryStatistics0.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares4 = summaryStatistics3.sumsq;
        summaryStatistics0.sumsq = sumOfSquares4;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics6.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = summaryStatistics6.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics6.getSumLogImpl();
        double double11 = summaryStatistics6.getStandardDeviation();
        boolean boolean12 = summaryStatistics0.equals((java.lang.Object) summaryStatistics6);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double14 = summaryStatistics13.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary16 = summaryStatistics15.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max17 = summaryStatistics15.max;
        boolean boolean18 = summaryStatistics13.equals((java.lang.Object) summaryStatistics15);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares19 = summaryStatistics15.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares21 = summaryStatistics20.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics20);
        org.apache.commons.math.stat.descriptive.summary.Sum sum23 = summaryStatistics20.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs24 = summaryStatistics20.sumLog;
        summaryStatistics15.sumLog = sumOfLogs24;
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares26 = summaryStatistics15.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double28 = summaryStatistics27.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary30 = summaryStatistics29.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max31 = summaryStatistics29.max;
        boolean boolean32 = summaryStatistics27.equals((java.lang.Object) summaryStatistics29);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares33 = summaryStatistics29.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics34 = summaryStatistics29.copy();
        double double35 = summaryStatistics29.getSum();
        double double36 = summaryStatistics29.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics37 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary38 = summaryStatistics37.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic39 = summaryStatistics37.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics40 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics37);
        summaryStatistics37.n = (-1);
        long long43 = summaryStatistics37.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean44 = summaryStatistics37.mean;
        summaryStatistics29.mean = mean44;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics46 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics46.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance49 = summaryStatistics46.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic50 = summaryStatistics46.getSumLogImpl();
        double double51 = summaryStatistics46.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic52 = summaryStatistics46.getMinImpl();
        summaryStatistics29.setSumsqImpl(storelessUnivariateStatistic52);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic54 = summaryStatistics29.getSumLogImpl();
        summaryStatistics15.setMeanImpl(storelessUnivariateStatistic54);
        boolean boolean56 = summaryStatistics6.equals((java.lang.Object) summaryStatistics15);
        org.apache.commons.math.stat.descriptive.rank.Min min57 = summaryStatistics15.min;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics58 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double59 = summaryStatistics58.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics60 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary61 = summaryStatistics60.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max62 = summaryStatistics60.max;
        boolean boolean63 = summaryStatistics58.equals((java.lang.Object) summaryStatistics60);
        long long64 = summaryStatistics60.n;
        double double65 = summaryStatistics60.getMin();
        double double66 = summaryStatistics60.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics67 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics67.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance70 = summaryStatistics67.variance;
        double double71 = summaryStatistics67.getMin();
        long long72 = summaryStatistics67.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic73 = summaryStatistics67.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics74 = summaryStatistics67.copy();
        double double75 = summaryStatistics74.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares76 = summaryStatistics74.sumsq;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean77 = summaryStatistics74.geoMean;
        summaryStatistics60.setMinImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean77);
        summaryStatistics15.geoMean = geometricMean77;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic52 and geometricMean77", storelessUnivariateStatistic52.equals(geometricMean77) ? storelessUnivariateStatistic52.hashCode() == geometricMean77.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        double double7 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics8.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max10 = summaryStatistics8.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares12 = summaryStatistics11.sumsq;
        summaryStatistics8.sumsq = sumOfSquares12;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics14.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = summaryStatistics14.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics14.getSumLogImpl();
        double double19 = summaryStatistics14.getStandardDeviation();
        boolean boolean20 = summaryStatistics8.equals((java.lang.Object) summaryStatistics14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = summaryStatistics21.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double24 = summaryStatistics23.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary26 = summaryStatistics25.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max27 = summaryStatistics25.max;
        boolean boolean28 = summaryStatistics23.equals((java.lang.Object) summaryStatistics25);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares29 = summaryStatistics25.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares31 = summaryStatistics30.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = summaryStatistics30.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = summaryStatistics30.sumLog;
        summaryStatistics25.sumLog = sumOfLogs34;
        summaryStatistics21.sumLog = sumOfLogs34;
        summaryStatistics14.sumLog = sumOfLogs34;
        summaryStatistics0.sumLog = sumOfLogs34;
        long long39 = summaryStatistics0.n;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares42 = null;
        summaryStatistics0.sumsq = sumOfSquares42;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic41", geometricMean6.equals(storelessUnivariateStatistic41) ? geometricMean6.hashCode() == storelessUnivariateStatistic41.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMax();
        double double2 = summaryStatistics0.getMin();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary4 = summaryStatistics3.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics3);
        summaryStatistics3.n = (-1);
        long long9 = summaryStatistics3.getN();
        double double10 = summaryStatistics3.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = summaryStatistics3.copy();
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = summaryStatistics11.variance;
        summaryStatistics0.variance = variance12;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares15 = summaryStatistics14.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum16 = null;
        summaryStatistics14.sum = sum16;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics18.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = summaryStatistics18.variance;
        summaryStatistics14.variance = variance21;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary24 = summaryStatistics23.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max25 = summaryStatistics23.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary27 = summaryStatistics26.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max28 = summaryStatistics26.max;
        summaryStatistics23.max = max28;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary31 = summaryStatistics30.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic32 = summaryStatistics30.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics33 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics30);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean34 = summaryStatistics30.geoMean;
        summaryStatistics23.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean34);
        boolean boolean36 = summaryStatistics14.equals((java.lang.Object) summaryStatistics23);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares37 = summaryStatistics23.sumsq;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic38 = summaryStatistics23.getMinImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic39 = summaryStatistics23.getMinImpl();
        org.apache.commons.math.stat.descriptive.rank.Max max40 = summaryStatistics23.max;
        boolean boolean41 = summaryStatistics0.equals((java.lang.Object) summaryStatistics23);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics42 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics42.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance45 = summaryStatistics42.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic46 = summaryStatistics42.getSumLogImpl();
        double double47 = summaryStatistics42.getSecondMoment();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics48 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics48.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance51 = summaryStatistics48.variance;
        double double52 = summaryStatistics48.getMin();
        long long53 = summaryStatistics48.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean54 = null;
        summaryStatistics48.mean = mean54;
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares56 = summaryStatistics48.sumsq;
        double double57 = summaryStatistics48.getGeometricMean();
        org.apache.commons.math.stat.descriptive.rank.Max max58 = summaryStatistics48.max;
        summaryStatistics42.max = max58;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic60 = summaryStatistics42.getGeoMeanImpl();
        summaryStatistics0.setGeoMeanImpl(storelessUnivariateStatistic60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max58 and storelessUnivariateStatistic60", max58.equals(storelessUnivariateStatistic60) ? max58.hashCode() == storelessUnivariateStatistic60.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics8.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance11 = summaryStatistics8.variance;
        double double12 = summaryStatistics8.getMin();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics13 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = summaryStatistics13.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double16 = summaryStatistics15.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary18 = summaryStatistics17.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max19 = summaryStatistics17.max;
        boolean boolean20 = summaryStatistics15.equals((java.lang.Object) summaryStatistics17);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares21 = summaryStatistics17.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares23 = summaryStatistics22.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics22);
        org.apache.commons.math.stat.descriptive.summary.Sum sum25 = summaryStatistics22.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs26 = summaryStatistics22.sumLog;
        summaryStatistics17.sumLog = sumOfLogs26;
        summaryStatistics13.sumLog = sumOfLogs26;
        summaryStatistics8.sumLog = sumOfLogs26;
        long long30 = summaryStatistics8.n;
        double double31 = summaryStatistics8.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic32 = summaryStatistics8.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment33 = summaryStatistics8.secondMoment;
        summaryStatistics0.secondMoment = secondMoment33;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic7", geometricMean6.equals(storelessUnivariateStatistic7) ? geometricMean6.hashCode() == storelessUnivariateStatistic7.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics5.getMeanImpl();
        double double7 = summaryStatistics5.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double9 = summaryStatistics8.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment10 = summaryStatistics8.secondMoment;
        summaryStatistics5.secondMoment = secondMoment10;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics12.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics12.getMaxImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = summaryStatistics15.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics15);
        org.apache.commons.math.stat.descriptive.summary.Sum sum18 = summaryStatistics15.sum;
        summaryStatistics12.sum = sum18;
        summaryStatistics5.sum = sum18;
        summaryStatistics0.sum = sum18;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics0.getMeanImpl();
        summaryStatistics0.clear();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean24 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary26 = summaryStatistics25.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics25.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics25);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary30 = summaryStatistics29.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max31 = summaryStatistics29.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares33 = summaryStatistics32.sumsq;
        summaryStatistics29.sumsq = sumOfSquares33;
        summaryStatistics28.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares33);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics36 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary37 = summaryStatistics36.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max38 = summaryStatistics36.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary40 = summaryStatistics39.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max41 = summaryStatistics39.max;
        summaryStatistics36.max = max41;
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics28, summaryStatistics36);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics44 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares45 = summaryStatistics44.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics46 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics44);
        org.apache.commons.math.stat.descriptive.summary.Sum sum47 = summaryStatistics44.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs48 = summaryStatistics44.sumLog;
        double double49 = summaryStatistics44.getMin();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic50 = summaryStatistics44.getVarianceImpl();
        summaryStatistics36.setSumsqImpl(storelessUnivariateStatistic50);
        summaryStatistics0.setMaxImpl(storelessUnivariateStatistic50);
        summaryStatistics0.addValue((double) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic22 and geometricMean24", storelessUnivariateStatistic22.equals(geometricMean24) ? storelessUnivariateStatistic22.hashCode() == geometricMean24.hashCode() : true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = summaryStatistics2.copy();
        double double8 = summaryStatistics2.getSum();
        double double9 = summaryStatistics2.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = summaryStatistics12.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max14 = summaryStatistics12.max;
        boolean boolean15 = summaryStatistics10.equals((java.lang.Object) summaryStatistics12);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = summaryStatistics12.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = summaryStatistics12.copy();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics12.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double20 = summaryStatistics19.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = summaryStatistics19.secondMoment;
        summaryStatistics12.secondMoment = secondMoment21;
        java.lang.String str23 = summaryStatistics12.toString();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean24 = summaryStatistics12.geoMean;
        org.apache.commons.math.stat.descriptive.rank.Min min25 = null;
        summaryStatistics12.min = min25;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs27 = summaryStatistics12.sumLog;
        summaryStatistics2.sumLog = sumOfLogs27;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean29 = summaryStatistics2.geoMean;
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment30 = summaryStatistics2.secondMoment;
        summaryStatistics2.addValue((double) 10.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max4 and geometricMean29", max4.equals(geometricMean29) ? max4.hashCode() == geometricMean29.hashCode() : true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = summaryStatistics2.copy();
        double double8 = summaryStatistics2.getSum();
        double double9 = summaryStatistics2.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = summaryStatistics12.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max14 = summaryStatistics12.max;
        boolean boolean15 = summaryStatistics10.equals((java.lang.Object) summaryStatistics12);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = summaryStatistics12.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = summaryStatistics12.copy();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics12.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double20 = summaryStatistics19.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment21 = summaryStatistics19.secondMoment;
        summaryStatistics12.secondMoment = secondMoment21;
        java.lang.String str23 = summaryStatistics12.toString();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean24 = summaryStatistics12.geoMean;
        org.apache.commons.math.stat.descriptive.rank.Min min25 = null;
        summaryStatistics12.min = min25;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs27 = summaryStatistics12.sumLog;
        summaryStatistics2.sumLog = sumOfLogs27;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean29 = summaryStatistics2.geoMean;
        summaryStatistics2.addValue((double) (short) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max4 and geometricMean29", max4.equals(geometricMean29) ? max4.hashCode() == geometricMean29.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        double double7 = summaryStatistics0.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double10 = summaryStatistics9.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary12 = summaryStatistics11.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max13 = summaryStatistics11.max;
        boolean boolean14 = summaryStatistics9.equals((java.lang.Object) summaryStatistics11);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = summaryStatistics15.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum17 = null;
        summaryStatistics15.sum = sum17;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics19.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance22 = summaryStatistics19.variance;
        summaryStatistics15.variance = variance22;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary25 = summaryStatistics24.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic26 = summaryStatistics24.getSumsqImpl();
        summaryStatistics15.setSumLogImpl(storelessUnivariateStatistic26);
        double double28 = summaryStatistics15.getSumsq();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic29 = summaryStatistics15.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.moment.Mean mean30 = summaryStatistics15.mean;
        summaryStatistics11.mean = mean30;
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares32 = summaryStatistics11.sumsq;
        summaryStatistics0.sumsq = sumOfSquares32;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic8", geometricMean6.equals(storelessUnivariateStatistic8) ? geometricMean6.hashCode() == storelessUnivariateStatistic8.hashCode() : true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = summaryStatistics6.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics6.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics6);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean10 = summaryStatistics6.geoMean;
        summaryStatistics2.geoMean = geometricMean10;
        summaryStatistics2.addValue((double) (byte) 10);
        double double14 = summaryStatistics2.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = summaryStatistics15.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics17.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance20 = summaryStatistics17.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic21 = summaryStatistics17.getSumLogImpl();
        summaryStatistics15.setSumLogImpl(storelessUnivariateStatistic21);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary23 = summaryStatistics15.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary25 = summaryStatistics24.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic26 = summaryStatistics24.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics24);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics28 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary29 = summaryStatistics28.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max30 = summaryStatistics28.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics31 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares32 = summaryStatistics31.sumsq;
        summaryStatistics28.sumsq = sumOfSquares32;
        summaryStatistics27.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares32);
        summaryStatistics15.sumsq = sumOfSquares32;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic36 = summaryStatistics15.getMeanImpl();
        double double37 = summaryStatistics15.getSecondMoment();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics38 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double39 = summaryStatistics38.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics40 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary41 = summaryStatistics40.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max42 = summaryStatistics40.max;
        boolean boolean43 = summaryStatistics38.equals((java.lang.Object) summaryStatistics40);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares44 = summaryStatistics40.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics45 = summaryStatistics40.copy();
        double double46 = summaryStatistics40.getSum();
        double double47 = summaryStatistics40.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics48 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double49 = summaryStatistics48.getMax();
        double double50 = summaryStatistics48.getMean();
        long long51 = summaryStatistics48.n;
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics40, summaryStatistics48);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics53 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares54 = summaryStatistics53.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics55 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics53);
        org.apache.commons.math.stat.descriptive.summary.Sum sum56 = summaryStatistics53.sum;
        summaryStatistics40.sum = sum56;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic58 = summaryStatistics40.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics59 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics59.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance62 = summaryStatistics59.variance;
        double double63 = summaryStatistics59.getMin();
        double double64 = summaryStatistics59.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean65 = summaryStatistics59.geoMean;
        summaryStatistics40.geoMean = geometricMean65;
        summaryStatistics15.geoMean = geometricMean65;
        summaryStatistics2.geoMean = geometricMean65;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max4 and geometricMean65", max4.equals(geometricMean65) ? max4.hashCode() == geometricMean65.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = summaryStatistics2.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max4 = summaryStatistics2.max;
        boolean boolean5 = summaryStatistics0.equals((java.lang.Object) summaryStatistics2);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares6 = summaryStatistics2.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares8 = summaryStatistics7.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics7);
        org.apache.commons.math.stat.descriptive.summary.Sum sum10 = summaryStatistics7.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs11 = summaryStatistics7.sumLog;
        summaryStatistics2.sumLog = sumOfLogs11;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean13 = summaryStatistics2.geoMean;
        summaryStatistics2.clear();
        long long15 = summaryStatistics2.getN();
        double double16 = summaryStatistics2.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary18 = summaryStatistics17.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic19 = summaryStatistics17.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics17);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics21.getMeanImpl();
        double double23 = summaryStatistics21.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double25 = summaryStatistics24.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment26 = summaryStatistics24.secondMoment;
        summaryStatistics21.secondMoment = secondMoment26;
        summaryStatistics20.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment26);
        double double29 = summaryStatistics20.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares31 = summaryStatistics30.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = summaryStatistics30.sum;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics34 = summaryStatistics30.copy();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics35 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic36 = summaryStatistics35.getMeanImpl();
        double double37 = summaryStatistics35.getSum();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary38 = summaryStatistics35.getSummary();
        double double39 = summaryStatistics35.getSum();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics35.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = summaryStatistics35.getVarianceImpl();
        summaryStatistics30.setSumImpl(storelessUnivariateStatistic41);
        summaryStatistics20.setSumsqImpl(storelessUnivariateStatistic41);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics44 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics20);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics45 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary46 = summaryStatistics45.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max47 = summaryStatistics45.max;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic48 = summaryStatistics45.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics49 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.rank.Max max50 = summaryStatistics49.max;
        summaryStatistics45.max = max50;
        summaryStatistics44.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max50);
        summaryStatistics2.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) max50);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics54 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics54.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance57 = summaryStatistics54.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic58 = summaryStatistics54.getSumLogImpl();
        double double59 = summaryStatistics54.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic60 = summaryStatistics54.getMinImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs61 = summaryStatistics54.sumLog;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics62 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary63 = summaryStatistics62.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic64 = summaryStatistics62.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics65 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics62);
        summaryStatistics62.n = (-1);
        long long68 = summaryStatistics62.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean69 = summaryStatistics62.mean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics70 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics70.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance73 = summaryStatistics70.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic74 = summaryStatistics70.getSumLogImpl();
        summaryStatistics62.setSumsqImpl(storelessUnivariateStatistic74);
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics54, summaryStatistics62);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic77 = summaryStatistics54.getGeoMeanImpl();
        summaryStatistics2.setGeoMeanImpl(storelessUnivariateStatistic77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic60 and storelessUnivariateStatistic77", storelessUnivariateStatistic60.equals(storelessUnivariateStatistic77) ? storelessUnivariateStatistic60.hashCode() == storelessUnivariateStatistic77.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getSecondMoment();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics5 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double6 = summaryStatistics5.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary8 = summaryStatistics7.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max9 = summaryStatistics7.max;
        boolean boolean10 = summaryStatistics5.equals((java.lang.Object) summaryStatistics7);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares11 = summaryStatistics7.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = summaryStatistics7.copy();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics7.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double15 = summaryStatistics14.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment16 = summaryStatistics14.secondMoment;
        summaryStatistics7.secondMoment = secondMoment16;
        java.lang.String str18 = summaryStatistics7.toString();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean19 = summaryStatistics7.geoMean;
        org.apache.commons.math.stat.descriptive.rank.Min min20 = null;
        summaryStatistics7.min = min20;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean22 = summaryStatistics7.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics0, summaryStatistics7);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic24 = summaryStatistics7.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic25 = summaryStatistics7.getMinImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics26.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance29 = summaryStatistics26.variance;
        org.apache.commons.math.stat.descriptive.moment.Mean mean30 = summaryStatistics26.mean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics31 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary32 = summaryStatistics31.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max33 = summaryStatistics31.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics34 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary35 = summaryStatistics34.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max36 = summaryStatistics34.max;
        summaryStatistics31.max = max36;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics38 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary39 = summaryStatistics38.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics38.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics41 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics38);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean42 = summaryStatistics38.geoMean;
        summaryStatistics31.setMaxImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) geometricMean42);
        summaryStatistics26.geoMean = geometricMean42;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics45 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double46 = summaryStatistics45.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics47 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary48 = summaryStatistics47.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max49 = summaryStatistics47.max;
        boolean boolean50 = summaryStatistics45.equals((java.lang.Object) summaryStatistics47);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares51 = summaryStatistics47.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics52 = summaryStatistics47.copy();
        double double53 = summaryStatistics47.getSum();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment54 = summaryStatistics47.secondMoment;
        summaryStatistics26.secondMoment = secondMoment54;
        summaryStatistics7.secondMoment = secondMoment54;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic57 = summaryStatistics7.getMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics58 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary59 = summaryStatistics58.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic60 = summaryStatistics58.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics61 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics58);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics62 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary63 = summaryStatistics62.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max64 = summaryStatistics62.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics65 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares66 = summaryStatistics65.sumsq;
        summaryStatistics62.sumsq = sumOfSquares66;
        summaryStatistics61.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfSquares66);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics69 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary70 = summaryStatistics69.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic71 = summaryStatistics69.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics72 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics69);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean73 = summaryStatistics69.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics74 = summaryStatistics69.copy();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics75 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double76 = summaryStatistics75.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics77 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics77.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance80 = summaryStatistics77.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic81 = summaryStatistics77.getSumLogImpl();
        summaryStatistics75.setSumLogImpl(storelessUnivariateStatistic81);
        org.apache.commons.math.stat.descriptive.moment.Mean mean83 = summaryStatistics75.mean;
        summaryStatistics74.mean = mean83;
        summaryStatistics61.mean = mean83;
        summaryStatistics61.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics87 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics87.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance90 = summaryStatistics87.variance;
        double double91 = summaryStatistics87.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic92 = summaryStatistics87.getSumLogImpl();
        summaryStatistics61.setSumLogImpl(storelessUnivariateStatistic92);
        double double94 = summaryStatistics61.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean95 = summaryStatistics61.geoMean;
        summaryStatistics7.geoMean = geometricMean95;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic24 and geometricMean95", storelessUnivariateStatistic24.equals(geometricMean95) ? storelessUnivariateStatistic24.hashCode() == geometricMean95.hashCode() : true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        double double7 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = summaryStatistics8.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max10 = summaryStatistics8.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics11 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares12 = summaryStatistics11.sumsq;
        summaryStatistics8.sumsq = sumOfSquares12;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics14 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics14.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance17 = summaryStatistics14.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics14.getSumLogImpl();
        double double19 = summaryStatistics14.getStandardDeviation();
        boolean boolean20 = summaryStatistics8.equals((java.lang.Object) summaryStatistics14);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = summaryStatistics21.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double24 = summaryStatistics23.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary26 = summaryStatistics25.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max27 = summaryStatistics25.max;
        boolean boolean28 = summaryStatistics23.equals((java.lang.Object) summaryStatistics25);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares29 = summaryStatistics25.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares31 = summaryStatistics30.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics30);
        org.apache.commons.math.stat.descriptive.summary.Sum sum33 = summaryStatistics30.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs34 = summaryStatistics30.sumLog;
        summaryStatistics25.sumLog = sumOfLogs34;
        summaryStatistics21.sumLog = sumOfLogs34;
        summaryStatistics14.sumLog = sumOfLogs34;
        summaryStatistics0.sumLog = sumOfLogs34;
        long long39 = summaryStatistics0.n;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic40 = summaryStatistics0.getVarianceImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = summaryStatistics0.getMinImpl();
        double double42 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic41", geometricMean6.equals(storelessUnivariateStatistic41) ? geometricMean6.hashCode() == storelessUnivariateStatistic41.hashCode() : true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean8 = summaryStatistics0.geoMean;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean8 and storelessUnivariateStatistic7", geometricMean8.equals(storelessUnivariateStatistic7) ? geometricMean8.hashCode() == storelessUnivariateStatistic7.hashCode() : true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        long long5 = summaryStatistics0.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.rank.Max max7 = summaryStatistics0.max;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics9.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = summaryStatistics9.variance;
        double double13 = summaryStatistics9.getMin();
        long long14 = summaryStatistics9.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean15 = null;
        summaryStatistics9.mean = mean15;
        summaryStatistics9.addValue((double) (short) 10);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics19 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic20 = summaryStatistics19.getMeanImpl();
        double double21 = summaryStatistics19.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double23 = summaryStatistics22.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment24 = summaryStatistics22.secondMoment;
        summaryStatistics19.secondMoment = secondMoment24;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics26 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics26.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic28 = summaryStatistics26.getMaxImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares30 = summaryStatistics29.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics31 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics29);
        org.apache.commons.math.stat.descriptive.summary.Sum sum32 = summaryStatistics29.sum;
        summaryStatistics26.sum = sum32;
        summaryStatistics19.sum = sum32;
        summaryStatistics9.sum = sum32;
        summaryStatistics0.sum = sum32;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max7 and storelessUnivariateStatistic8", max7.equals(storelessUnivariateStatistic8) ? max7.hashCode() == storelessUnivariateStatistic8.hashCode() : true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        summaryStatistics0.n = ' ';
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic7 = summaryStatistics0.getMeanImpl();
        double double8 = summaryStatistics0.getPopulationVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = summaryStatistics0.geoMean;
        double double10 = summaryStatistics0.getSumsq();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic7 and geometricMean9", storelessUnivariateStatistic7.equals(geometricMean9) ? storelessUnivariateStatistic7.hashCode() == geometricMean9.hashCode() : true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares1 = summaryStatistics0.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics2.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = summaryStatistics2.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics2.getSumLogImpl();
        summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic6);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary8 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic9 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = summaryStatistics12.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max14 = summaryStatistics12.max;
        boolean boolean15 = summaryStatistics10.equals((java.lang.Object) summaryStatistics12);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = summaryStatistics12.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = summaryStatistics12.copy();
        double double18 = summaryStatistics12.getSum();
        double double19 = summaryStatistics12.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary21 = summaryStatistics20.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic22 = summaryStatistics20.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics20);
        summaryStatistics20.n = (-1);
        long long26 = summaryStatistics20.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean27 = summaryStatistics20.mean;
        summaryStatistics12.mean = mean27;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics29.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance32 = summaryStatistics29.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic33 = summaryStatistics29.getSumLogImpl();
        double double34 = summaryStatistics29.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic35 = summaryStatistics29.getMinImpl();
        summaryStatistics12.setSumsqImpl(storelessUnivariateStatistic35);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics37 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics37.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance40 = summaryStatistics37.variance;
        double double41 = summaryStatistics37.getMin();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics42 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary43 = summaryStatistics42.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics44 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double45 = summaryStatistics44.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics46 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary47 = summaryStatistics46.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max48 = summaryStatistics46.max;
        boolean boolean49 = summaryStatistics44.equals((java.lang.Object) summaryStatistics46);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares50 = summaryStatistics46.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics51 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares52 = summaryStatistics51.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics53 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics51);
        org.apache.commons.math.stat.descriptive.summary.Sum sum54 = summaryStatistics51.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs55 = summaryStatistics51.sumLog;
        summaryStatistics46.sumLog = sumOfLogs55;
        summaryStatistics42.sumLog = sumOfLogs55;
        summaryStatistics37.sumLog = sumOfLogs55;
        summaryStatistics12.sumLog = sumOfLogs55;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic60 = summaryStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics61 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary62 = summaryStatistics61.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max63 = summaryStatistics61.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics64 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary65 = summaryStatistics64.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max66 = summaryStatistics64.max;
        summaryStatistics61.max = max66;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic68 = summaryStatistics61.getMeanImpl();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares69 = summaryStatistics61.sumsq;
        double double70 = summaryStatistics61.getSum();
        org.apache.commons.math.stat.descriptive.summary.Sum sum71 = summaryStatistics61.sum;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics72 = summaryStatistics61.copy();
        summaryStatistics72.clear();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics74 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics74.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance77 = summaryStatistics74.variance;
        double double78 = summaryStatistics74.getMean();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic79 = summaryStatistics74.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.moment.Mean mean80 = summaryStatistics74.mean;
        summaryStatistics72.mean = mean80;
        summaryStatistics12.mean = mean80;
        summaryStatistics0.mean = mean80;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic9 and storelessUnivariateStatistic35", storelessUnivariateStatistic9.equals(storelessUnivariateStatistic35) ? storelessUnivariateStatistic9.hashCode() == storelessUnivariateStatistic35.hashCode() : true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        double double5 = summaryStatistics0.getSecondMoment();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics6.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance9 = summaryStatistics6.variance;
        double double10 = summaryStatistics6.getMin();
        long long11 = summaryStatistics6.getN();
        org.apache.commons.math.stat.descriptive.moment.Mean mean12 = null;
        summaryStatistics6.mean = mean12;
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares14 = summaryStatistics6.sumsq;
        double double15 = summaryStatistics6.getGeometricMean();
        org.apache.commons.math.stat.descriptive.rank.Max max16 = summaryStatistics6.max;
        summaryStatistics0.max = max16;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic18 = summaryStatistics0.getGeoMeanImpl();
        summaryStatistics0.n = '4';
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on max16 and storelessUnivariateStatistic18", max16.equals(storelessUnivariateStatistic18) ? max16.hashCode() == storelessUnivariateStatistic18.hashCode() : true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic4 = summaryStatistics0.getSumLogImpl();
        double double5 = summaryStatistics0.getStandardDeviation();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics0.getMinImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares8 = summaryStatistics7.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics7);
        double double10 = summaryStatistics7.getMax();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics7.getSumImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = summaryStatistics12.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic14 = summaryStatistics12.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics12);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean16 = summaryStatistics12.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = summaryStatistics12.copy();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares18 = summaryStatistics17.sumsq;
        summaryStatistics7.sumsq = sumOfSquares18;
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment20 = summaryStatistics7.secondMoment;
        summaryStatistics0.secondMoment = secondMoment20;
        double double22 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean23 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics24.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics27 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares28 = summaryStatistics27.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics27);
        double double30 = summaryStatistics27.getVariance();
        org.apache.commons.math.stat.descriptive.moment.Variance variance31 = summaryStatistics27.variance;
        summaryStatistics24.variance = variance31;
        summaryStatistics0.variance = variance31;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic6 and geometricMean23", storelessUnivariateStatistic6.equals(geometricMean23) ? storelessUnivariateStatistic6.hashCode() == geometricMean23.hashCode() : true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics0);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics4.getMeanImpl();
        double double6 = summaryStatistics4.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double8 = summaryStatistics7.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = summaryStatistics7.secondMoment;
        summaryStatistics4.secondMoment = secondMoment9;
        summaryStatistics3.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment9);
        long long12 = summaryStatistics3.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics3.getMeanImpl();
        double double14 = summaryStatistics3.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics15.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance18 = summaryStatistics15.variance;
        double double19 = summaryStatistics15.getMin();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary21 = summaryStatistics20.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics22 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double23 = summaryStatistics22.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics24 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary25 = summaryStatistics24.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max26 = summaryStatistics24.max;
        boolean boolean27 = summaryStatistics22.equals((java.lang.Object) summaryStatistics24);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares28 = summaryStatistics24.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics29 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares30 = summaryStatistics29.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics31 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics29);
        org.apache.commons.math.stat.descriptive.summary.Sum sum32 = summaryStatistics29.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs33 = summaryStatistics29.sumLog;
        summaryStatistics24.sumLog = sumOfLogs33;
        summaryStatistics20.sumLog = sumOfLogs33;
        summaryStatistics15.sumLog = sumOfLogs33;
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment37 = summaryStatistics15.secondMoment;
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary38 = summaryStatistics15.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics15);
        org.apache.commons.math.stat.descriptive.moment.Mean mean40 = null;
        summaryStatistics15.mean = mean40;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic42 = summaryStatistics15.getMeanImpl();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean43 = summaryStatistics15.geoMean;
        summaryStatistics3.geoMean = geometricMean43;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic42 and geometricMean43", storelessUnivariateStatistic42.equals(geometricMean43) ? storelessUnivariateStatistic42.hashCode() == geometricMean43.hashCode() : true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double1 = summaryStatistics0.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics2 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics2.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance5 = summaryStatistics2.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic6 = summaryStatistics2.getSumLogImpl();
        summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic6);
        org.apache.commons.math.stat.descriptive.moment.Mean mean8 = summaryStatistics0.mean;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean9 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs10 = summaryStatistics0.sumLog;
        org.apache.commons.math.stat.descriptive.moment.Mean mean11 = summaryStatistics0.mean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics12 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double13 = summaryStatistics12.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment14 = summaryStatistics12.secondMoment;
        double double15 = summaryStatistics12.getSumOfLogs();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = summaryStatistics12.sumsq;
        double double17 = summaryStatistics12.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics18 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics18.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance21 = summaryStatistics18.variance;
        double double22 = summaryStatistics18.getSecondMoment();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double24 = summaryStatistics23.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics25 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary26 = summaryStatistics25.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max27 = summaryStatistics25.max;
        boolean boolean28 = summaryStatistics23.equals((java.lang.Object) summaryStatistics25);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares29 = summaryStatistics25.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = summaryStatistics25.copy();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic31 = summaryStatistics25.getSumLogImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double33 = summaryStatistics32.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment34 = summaryStatistics32.secondMoment;
        summaryStatistics25.secondMoment = secondMoment34;
        java.lang.String str36 = summaryStatistics25.toString();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean37 = summaryStatistics25.geoMean;
        org.apache.commons.math.stat.descriptive.rank.Min min38 = null;
        summaryStatistics25.min = min38;
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean40 = summaryStatistics25.geoMean;
        org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(summaryStatistics18, summaryStatistics25);
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic42 = summaryStatistics25.getMaxImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic43 = summaryStatistics25.getMeanImpl();
        summaryStatistics12.setVarianceImpl(storelessUnivariateStatistic43);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics45 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic46 = summaryStatistics45.getMeanImpl();
        double double47 = summaryStatistics45.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics48 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double49 = summaryStatistics48.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment50 = summaryStatistics48.secondMoment;
        summaryStatistics45.secondMoment = secondMoment50;
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = summaryStatistics45.variance;
        org.apache.commons.math.stat.descriptive.rank.Min min53 = summaryStatistics45.min;
        summaryStatistics12.setSumsqImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) min53);
        summaryStatistics0.min = min53;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean9 and storelessUnivariateStatistic42", geometricMean9.equals(storelessUnivariateStatistic42) ? geometricMean9.hashCode() == storelessUnivariateStatistic42.hashCode() : true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance3 = summaryStatistics0.variance;
        double double4 = summaryStatistics0.getMin();
        double double5 = summaryStatistics0.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean6 = summaryStatistics0.geoMean;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs7 = summaryStatistics0.sumLog;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics8 = summaryStatistics0.copy();
        java.lang.String str9 = summaryStatistics8.toString();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic10 = summaryStatistics8.getMeanImpl();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic11 = summaryStatistics8.getVarianceImpl();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean6 and storelessUnivariateStatistic10", geometricMean6.equals(storelessUnivariateStatistic10) ? geometricMean6.hashCode() == storelessUnivariateStatistic10.hashCode() : true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics0.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary4 = summaryStatistics3.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics3.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics6 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics3);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic8 = summaryStatistics7.getMeanImpl();
        double double9 = summaryStatistics7.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics10 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double11 = summaryStatistics10.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment12 = summaryStatistics10.secondMoment;
        summaryStatistics7.secondMoment = secondMoment12;
        summaryStatistics6.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment12);
        summaryStatistics0.secondMoment = secondMoment12;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic16 = summaryStatistics0.getGeoMeanImpl();
        org.apache.commons.math.stat.descriptive.rank.Min min17 = summaryStatistics0.min;
        double double18 = summaryStatistics0.getStandardDeviation();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic16 and min17", storelessUnivariateStatistic16.equals(min17) ? storelessUnivariateStatistic16.hashCode() == min17.hashCode() : true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary1 = summaryStatistics0.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic2 = summaryStatistics0.getSumsqImpl();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics3 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics0);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic5 = summaryStatistics4.getMeanImpl();
        double double6 = summaryStatistics4.getSum();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics7 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double8 = summaryStatistics7.getGeometricMean();
        org.apache.commons.math.stat.descriptive.moment.SecondMoment secondMoment9 = summaryStatistics7.secondMoment;
        summaryStatistics4.secondMoment = secondMoment9;
        summaryStatistics3.setMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) secondMoment9);
        long long12 = summaryStatistics3.getN();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic13 = summaryStatistics3.getMeanImpl();
        double double14 = summaryStatistics3.getMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics15 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares16 = summaryStatistics15.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics15);
        double double18 = summaryStatistics15.getVariance();
        org.apache.commons.math.stat.descriptive.moment.Variance variance19 = summaryStatistics15.variance;
        double double20 = summaryStatistics15.getSecondMoment();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics21 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics21.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance24 = summaryStatistics21.variance;
        double double25 = summaryStatistics21.getSecondMoment();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic26 = summaryStatistics21.getSumImpl();
        boolean boolean27 = summaryStatistics15.equals((java.lang.Object) storelessUnivariateStatistic26);
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean28 = summaryStatistics15.geoMean;
        summaryStatistics3.geoMean = geometricMean28;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares31 = summaryStatistics30.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum32 = null;
        summaryStatistics30.sum = sum32;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics34 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics34.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance37 = summaryStatistics34.variance;
        summaryStatistics30.variance = variance37;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary40 = summaryStatistics39.getSummary();
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic41 = summaryStatistics39.getSumsqImpl();
        summaryStatistics30.setSumLogImpl(storelessUnivariateStatistic41);
        double double43 = summaryStatistics30.getSumsq();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics44 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares45 = summaryStatistics44.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics46 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics44);
        org.apache.commons.math.stat.descriptive.summary.Sum sum47 = summaryStatistics44.sum;
        summaryStatistics30.setGeoMeanImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sum47);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics49 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics49.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance52 = summaryStatistics49.variance;
        double double53 = summaryStatistics49.getMin();
        double double54 = summaryStatistics49.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean55 = summaryStatistics49.geoMean;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs56 = summaryStatistics49.sumLog;
        summaryStatistics30.setVarianceImpl((org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic) sumOfLogs56);
        double double58 = summaryStatistics30.getSumsq();
        boolean boolean59 = summaryStatistics3.equals((java.lang.Object) double58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on storelessUnivariateStatistic26 and geometricMean55", storelessUnivariateStatistic26.equals(geometricMean55) ? storelessUnivariateStatistic26.hashCode() == geometricMean55.hashCode() : true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics0 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares1 = summaryStatistics0.sumsq;
        org.apache.commons.math.stat.descriptive.summary.Sum sum2 = null;
        summaryStatistics0.sum = sum2;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics4 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics4.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance7 = summaryStatistics4.variance;
        summaryStatistics0.variance = variance7;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics9 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics9.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance12 = summaryStatistics9.variance;
        double double13 = summaryStatistics9.getMin();
        double double14 = summaryStatistics9.getVariance();
        org.apache.commons.math.stat.descriptive.moment.GeometricMean geometricMean15 = summaryStatistics9.geoMean;
        double double16 = summaryStatistics9.getMax();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics17 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary18 = summaryStatistics17.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max19 = summaryStatistics17.max;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics20 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares21 = summaryStatistics20.sumsq;
        summaryStatistics17.sumsq = sumOfSquares21;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics23 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        summaryStatistics23.addValue((double) (byte) 10);
        org.apache.commons.math.stat.descriptive.moment.Variance variance26 = summaryStatistics23.variance;
        org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic storelessUnivariateStatistic27 = summaryStatistics23.getSumLogImpl();
        double double28 = summaryStatistics23.getStandardDeviation();
        boolean boolean29 = summaryStatistics17.equals((java.lang.Object) summaryStatistics23);
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics30 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary31 = summaryStatistics30.getSummary();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics32 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        double double33 = summaryStatistics32.getGeometricMean();
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics34 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary35 = summaryStatistics34.getSummary();
        org.apache.commons.math.stat.descriptive.rank.Max max36 = summaryStatistics34.max;
        boolean boolean37 = summaryStatistics32.equals((java.lang.Object) summaryStatistics34);
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares38 = summaryStatistics34.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics39 = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
        org.apache.commons.math.stat.descriptive.summary.SumOfSquares sumOfSquares40 = summaryStatistics39.sumsq;
        org.apache.commons.math.stat.descriptive.SummaryStatistics summaryStatistics41 = new org.apache.commons.math.stat.descriptive.SummaryStatistics(summaryStatistics39);
        org.apache.commons.math.stat.descriptive.summary.Sum sum42 = summaryStatistics39.sum;
        org.apache.commons.math.stat.descriptive.summary.SumOfLogs sumOfLogs43 = summaryStatistics39.sumLog;
        summaryStatistics34.sumLog = sumOfLogs43;
        summaryStatistics30.sumLog = sumOfLogs43;
        summaryStatistics23.sumLog = sumOfLogs43;
        summaryStatistics9.sumLog = sumOfLogs43;
        double double48 = summaryStatistics9.getMin();
        org.apache.commons.math.stat.descriptive.moment.Mean mean49 = summaryStatistics9.mean;
        summaryStatistics0.mean = mean49;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on geometricMean15 and mean49", geometricMean15.equals(mean49) ? geometricMean15.hashCode() == mean49.hashCode() : true);
    }
}

