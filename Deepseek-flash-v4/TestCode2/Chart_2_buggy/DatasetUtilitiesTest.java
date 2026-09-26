package org.jfree.data.general;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.Range;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.KeyedValues;
import org.jfree.data.function.Function2D;
import org.jfree.data.statistics.BoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.BoxAndWhiskerXYDataset;
import org.jfree.data.statistics.MultiValueCategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.DomainInfo;
import org.jfree.data.RangeInfo;
import org.jfree.data.category.CategoryRangeInfo;
import org.jfree.data.xy.XYDomainInfo;
import org.jfree.data.xy.XYRangeInfo;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class DatasetUtilitiesTest {
    private DefaultPieDataset pieDataset;
    
    @Before
    public void setUp() {
        pieDataset = new DefaultPieDataset();
    }
    
    @After
    public void tearDown() {
        pieDataset = null;
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalculatePieDatasetTotalNull() {
        DatasetUtilities.calculatePieDatasetTotal(null);
    }
    
    @Test
    public void testCalculatePieDatasetTotalEmpty() {
        assertEquals(0.0, DatasetUtilities.calculatePieDatasetTotal(pieDataset), 0.0001);
    }
    
    @Test
    public void testCalculatePieDatasetTotalPositive() {
        pieDataset.setValue("A", 10.0);
        pieDataset.setValue("B", 20.0);
        assertEquals(30.0, DatasetUtilities.calculatePieDatasetTotal(pieDataset), 0.0001);
    }
    
    @Test
    public void testCalculatePieDatasetTotalNegativeIgnored() {
        pieDataset.setValue("A", -5.0);
        assertEquals(0.0, DatasetUtilities.calculatePieDatasetTotal(pieDataset), 0.0001);
    }
    
    @Test
    public void testCreatePieDatasetForRowByKey() {
        DefaultCategoryDataset catData = new DefaultCategoryDataset();
        catData.addValue(1.0, "R1", "C1");
        catData.addValue(2.0, "R1", "C2");
        PieDataset result = DatasetUtilities.createPieDatasetForRow(catData, "R1");
        assertEquals(2, result.getItemCount());
        assertEquals(1.0, result.getValue(0));
        assertEquals(2.0, result.getValue(1));
    }
    
    @Test
    public void testCreatePieDatasetForRowByIndex() {
        DefaultCategoryDataset catData = new DefaultCategoryDataset();
        catData.addValue(5.0, "R1", "C1");
        PieDataset result = DatasetUtilities.createPieDatasetForRow(catData, 0);
        assertEquals(1, result.getItemCount());
        assertEquals(5.0, result.getValue(0));
    }
    
    @Test
    public void testCreatePieDatasetForColumnByKey() {
        DefaultCategoryDataset catData = new DefaultCategoryDataset();
        catData.addValue(3.0, "R1", "C1");
        catData.addValue(4.0, "R2", "C1");
        PieDataset result = DatasetUtilities.createPieDatasetForColumn(catData, "C1");
        assertEquals(2, result.getItemCount());
        assertEquals(3.0, result.getValue(0));
        assertEquals(4.0, result.getValue(1));
    }
    
    @Test
    public void testCreatePieDatasetForColumnByIndex() {
        DefaultCategoryDataset catData = new DefaultCategoryDataset();
        catData.addValue(7.0, "R1", "C1");
        PieDataset result = DatasetUtilities.createPieDatasetForColumn(catData, 0);
        assertEquals(1, result.getItemCount());
        assertEquals(7.0, result.getValue(0));
    }
    
    @Test
    public void testCreateConsolidatedPieDatasetAllLarge() {
        DefaultPieDataset source = new DefaultPieDataset();
        source.setValue("A", 50.0);
        source.setValue("B", 50.0);
        PieDataset result = DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.3, 2);
        assertEquals(2, result.getItemCount());
        assertNotNull(result.getValue("A"));
        assertNotNull(result.getValue("B"));
    }
    
    @Test
    public void testCreateConsolidatedPieDatasetSmallItems() {
        DefaultPieDataset source = new DefaultPieDataset();
        source.setValue("A", 80.0);
        source.setValue("B", 10.0);
        source.setValue("C", 10.0);
        PieDataset result = DatasetUtilities.createConsolidatedPieDataset(source, "Other", 0.15, 2);
        assertNotNull(result.getValue("A"));
        assertNotNull(result.getValue("Other"));
        assertNull(result.getValue("B"));
        assertNull(result.getValue("C"));
    }
    
    @Test
    public void testCreateCategoryDatasetDoubleArray() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        CategoryDataset result = DatasetUtilities.createCategoryDataset("Row", "Col", data);
        assertEquals(2, result.getRowCount());
        assertEquals(2, result.getColumnCount());
        assertEquals(1.0, result.getValue("Row1", "Col1"));
        assertEquals(4.0, result.getValue("Row2", "Col2"));
    }
    
    @Test
    public void testCreateCategoryDatasetNumberArray() {
        Number[][] data = {{5.0, 6.0}, {7.0, 8.0}};
        CategoryDataset result = DatasetUtilities.createCategoryDataset("R", "C", data);
        assertEquals(2, result.getRowCount());
        assertEquals(6.0, result.getValue("R1", "C2"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDatasetComparableNullRowKeys() {
        DatasetUtilities.createCategoryDataset(null, new Comparable[]{"C1"}, new double[][]{{1.0}});
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDatasetComparableNullColumnKeys() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1"}, null, new double[][]{{1.0}});
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDatasetComparableDuplicateRowKeys() {
        DatasetUtilities.createCategoryDataset(new Comparable[]{"R1", "R1"}, new Comparable[]{"C1"}, new double[][]{{1.0}, {2.0}});
    }
    
    @Test
    public void testCreateCategoryDatasetComparableValid() {
        Comparable[] rowKeys = {"R1", "R2"};
        Comparable[] colKeys = {"C1"};
        double[][] data = {{10.0}, {20.0}};
        CategoryDataset result = DatasetUtilities.createCategoryDataset(rowKeys, colKeys, data);
        assertEquals(10.0, result.getValue("R1", "C1"));
        assertEquals(20.0, result.getValue("R2", "C1"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateCategoryDatasetRowKeyNull() {
        DatasetUtilities.createCategoryDataset(null, new KeyedValues() {
            public int getItemCount() { return 0; }
            public Number getValue(int i) { return null; }
            public Comparable getKey(int i) { return null; }
            public Number getValue(Comparable key) { return null; }
            public Comparable getKey(Comparable value) { return null; }
            public List getKeys() { return new ArrayList(); }
        });
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DNullFunction() {
        DatasetUtilities.sampleFunction2DToSeries(null, 0.0, 1.0, 10, "S");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DNullSeriesKey() {
        Function2D f = new Function2D() {
            public double getValue(double x) { return x; }
        };
        DatasetUtilities.sampleFunction2DToSeries(f, 0.0, 1.0, 10, null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DStartGE() {
        Function2D f = new Function2D() {
            public double getValue(double x) { return x; }
        };
        DatasetUtilities.sampleFunction2DToSeries(f, 5.0, 3.0, 10, "S");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSampleFunction2DSamplesLess2() {
        Function2D f = new Function2D() {
            public double getValue(double x) { return x; }
        };
        DatasetUtilities.sampleFunction2DToSeries(f, 0.0, 1.0, 1, "S");
    }
    
    @Test
    public void testSampleFunction2DToSeriesValid() {
        Function2D f = new Function2D() {
            public double getValue(double x) { return x * 2; }
        };
        XYSeries series = DatasetUtilities.sampleFunction2DToSeries(f, 0.0, 4.0, 5, "Test");
        assertEquals(5, series.getItemCount());
        assertEquals(0.0, series.getX(0).doubleValue(), 0.0001);
        assertEquals(0.0, series.getY(0).doubleValue(), 0.0001);
        assertEquals(4.0, series.getX(4).doubleValue(), 0.0001);
        assertEquals(8.0, series.getY(4).doubleValue(), 0.0001);
    }
    
    @Test
    public void testIsEmptyOrNullPieNull() {
        assertTrue(DatasetUtilities.isEmptyOrNull((PieDataset) null));
    }
    
    @Test
    public void testIsEmptyOrNullPieEmpty() {
        assertTrue(DatasetUtilities.isEmptyOrNull(pieDataset));
    }
    
    @Test
    public void testIsEmptyOrNullPieNonEmpty() {
        pieDataset.setValue("A", 10.0);
        assertFalse(DatasetUtilities.isEmptyOrNull(pieDataset));
    }
    
    @Test
    public void testIsEmptyOrNullPieZeroValues() {
        pieDataset.setValue("A", 0.0);
        assertTrue(DatasetUtilities.isEmptyOrNull(pieDataset));
    }
    
    @Test
    public void testIsEmptyOrNullCategoryNull() {
        assertTrue(DatasetUtilities.isEmptyOrNull((CategoryDataset) null));
    }
    
    @Test
    public void testIsEmptyOrNullCategoryEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertTrue(DatasetUtilities.isEmptyOrNull(cat));
    }
    
    @Test
    public void testIsEmptyOrNullCategoryWithData() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(1.0, "R1", "C1");
        assertFalse(DatasetUtilities.isEmptyOrNull(cat));
    }
    
    @Test
    public void testIsEmptyOrNullXYNull() {
        assertTrue(DatasetUtilities.isEmptyOrNull((XYDataset) null));
    }
    
    @Test
    public void testIsEmptyOrNullXYEmpty() {
        XYSeriesCollection coll = new XYSeriesCollection();
        assertTrue(DatasetUtilities.isEmptyOrNull(coll));
    }
    
    @Test
    public void testIsEmptyOrNullXYNonEmpty() {
        XYSeries series = new XYSeries("S");
        series.add(1.0, 2.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        assertFalse(DatasetUtilities.isEmptyOrNull(coll));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindDomainBoundsNull() {
        DatasetUtilities.findDomainBounds((XYDataset) null);
    }
    
    @Test
    public void testFindDomainBoundsEmpty() {
        XYSeriesCollection coll = new XYSeriesCollection();
        assertNull(DatasetUtilities.findDomainBounds(coll));
    }
    
    @Test
    public void testFindDomainBoundsWithData() {
        XYSeries series = new XYSeries("S");
        series.add(1.0, 5.0);
        series.add(3.0, 10.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        Range range = DatasetUtilities.findDomainBounds(coll);
        assertEquals(1.0, range.getLowerBound(), 0.0001);
        assertEquals(3.0, range.getUpperBound(), 0.0001);
    }
    
    @Test
    public void testIterateDomainBoundsInterval() {
        XYSeries series = new XYSeries("S");
        series.add(1.0, 5.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        Range range = DatasetUtilities.iterateDomainBounds(coll, true);
        assertEquals(1.0, range.getLowerBound(), 0.0001);
        assertEquals(1.0, range.getUpperBound(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBoundsCategoryNull() {
        DatasetUtilities.findRangeBounds((CategoryDataset) null);
    }
    
    @Test
    public void testFindRangeBoundsCategoryEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findRangeBounds(cat));
    }
    
    @Test
    public void testFindRangeBoundsCategoryWithData() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(2.0, "R1", "C1");
        cat.addValue(5.0, "R1", "C2");
        Range range = DatasetUtilities.findRangeBounds(cat);
        assertEquals(2.0, range.getLowerBound(), 0.0001);
        assertEquals(5.0, range.getUpperBound(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindRangeBoundsXYNull() {
        DatasetUtilities.findRangeBounds((XYDataset) null);
    }
    
    @Test
    public void testFindRangeBoundsXYEmpty() {
        XYSeriesCollection coll = new XYSeriesCollection();
        assertNull(DatasetUtilities.findRangeBounds(coll));
    }
    
    @Test
    public void testFindRangeBoundsXYWithData() {
        XYSeries series = new XYSeries("S");
        series.add(1.0, 3.0);
        series.add(2.0, 7.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        Range range = DatasetUtilities.findRangeBounds(coll);
        assertEquals(3.0, range.getLowerBound(), 0.0001);
        assertEquals(7.0, range.getUpperBound(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateRangeBoundsCategoryNull() {
        DatasetUtilities.iterateRangeBounds((CategoryDataset) null);
    }
    
    @Test
    public void testIterateRangeBoundsCategoryEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.iterateRangeBounds(cat));
    }
    
    @Test
    public void testIterateRangeBoundsCategoryNormal() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(1.0, "R1", "C1");
        cat.addValue(4.0, "R1", "C2");
        Range range = DatasetUtilities.iterateRangeBounds(cat);
        assertEquals(1.0, range.getLowerBound(), 0.0001);
        assertEquals(4.0, range.getUpperBound(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsCategoryNullDataset() {
        DatasetUtilities.iterateToFindRangeBounds(null, new ArrayList(), true);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsCategoryNullKeys() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        DatasetUtilities.iterateToFindRangeBounds(cat, null, true);
    }
    
    @Test
    public void testIterateToFindRangeBoundsCategoryNoData() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        List keys = new ArrayList();
        assertNull(DatasetUtilities.iterateToFindRangeBounds(cat, keys, true));
    }
    
    @Test
    public void testIterateToFindRangeBoundsCategoryNormal() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(10.0, "R1", "C1");
        cat.addValue(20.0, "R1", "C2");
        List keys = new ArrayList();
        keys.add("R1");
        Range range = DatasetUtilities.iterateToFindRangeBounds(cat, keys, true);
        assertEquals(10.0, range.getLowerBound(), 0.0001);
        assertEquals(20.0, range.getUpperBound(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindDomainBoundsNullDataset() {
        DatasetUtilities.iterateToFindDomainBounds(null, new ArrayList(), true);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindDomainBoundsNullKeys() {
        XYSeriesCollection coll = new XYSeriesCollection();
        DatasetUtilities.iterateToFindDomainBounds(coll, null, true);
    }
    
    @Test
    public void testIterateToFindDomainBoundsEmpty() {
        XYSeriesCollection coll = new XYSeriesCollection();
        List keys = new ArrayList();
        assertNull(DatasetUtilities.iterateToFindDomainBounds(coll, keys, true));
    }
    
    @Test
    public void testIterateToFindDomainBoundsNormal() {
        XYSeries series = new XYSeries("S");
        series.add(2.0, 3.0);
        series.add(5.0, 7.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        List keys = new ArrayList();
        keys.add("S");
        Range range = DatasetUtilities.iterateToFindDomainBounds(coll, keys, true);
        assertEquals(2.0, range.getLowerBound(), 0.0001);
        assertEquals(5.0, range.getUpperBound(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsXYNullDataset() {
        DatasetUtilities.iterateToFindRangeBounds((XYDataset) null, new ArrayList(), new Range(0,1), true);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsXYNullKeys() {
        XYSeriesCollection coll = new XYSeriesCollection();
        DatasetUtilities.iterateToFindRangeBounds(coll, null, new Range(0,1), true);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIterateToFindRangeBoundsXYNullXRange() {
        XYSeriesCollection coll = new XYSeriesCollection();
        DatasetUtilities.iterateToFindRangeBounds(coll, new ArrayList(), null, true);
    }
    
    @Test
    public void testIterateToFindRangeBoundsXYNormal() {
        XYSeries series = new XYSeries("S");
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        List keys = new ArrayList();
        keys.add("S");
        Range xRange = new Range(0.0, 3.0);
        Range range = DatasetUtilities.iterateToFindRangeBounds(coll, keys, xRange, true);
        assertEquals(10.0, range.getLowerBound(), 0.0001);
        assertEquals(20.0, range.getUpperBound(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumDomainValueNull() {
        DatasetUtilities.findMinimumDomainValue(null);
    }
    
    @Test
    public void testFindMinimumDomainValueEmpty() {
        XYSeriesCollection coll = new XYSeriesCollection();
        assertNull(DatasetUtilities.findMinimumDomainValue(coll));
    }
    
    @Test
    public void testFindMinimumDomainValueWithData() {
        XYSeries series = new XYSeries("S");
        series.add(3.0, 5.0);
        series.add(1.0, 10.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        Number result = DatasetUtilities.findMinimumDomainValue(coll);
        assertEquals(1.0, result.doubleValue(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumDomainValueNull() {
        DatasetUtilities.findMaximumDomainValue(null);
    }
    
    @Test
    public void testFindMaximumDomainValueEmpty() {
        XYSeriesCollection coll = new XYSeriesCollection();
        assertNull(DatasetUtilities.findMaximumDomainValue(coll));
    }
    
    @Test
    public void testFindMaximumDomainValueWithData() {
        XYSeries series = new XYSeries("S");
        series.add(3.0, 5.0);
        series.add(7.0, 10.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        Number result = DatasetUtilities.findMaximumDomainValue(coll);
        assertEquals(7.0, result.doubleValue(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumRangeValueCategoryNull() {
        DatasetUtilities.findMinimumRangeValue((CategoryDataset) null);
    }
    
    @Test
    public void testFindMinimumRangeValueCategoryEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findMinimumRangeValue(cat));
    }
    
    @Test
    public void testFindMinimumRangeValueCategoryWithData() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(5.0, "R1", "C1");
        cat.addValue(2.0, "R1", "C2");
        Number result = DatasetUtilities.findMinimumRangeValue(cat);
        assertEquals(2.0, result.doubleValue(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumRangeValueXYNull() {
        DatasetUtilities.findMinimumRangeValue((XYDataset) null);
    }
    
    @Test
    public void testFindMinimumRangeValueXYEmpty() {
        XYSeriesCollection coll = new XYSeriesCollection();
        assertNull(DatasetUtilities.findMinimumRangeValue(coll));
    }
    
    @Test
    public void testFindMinimumRangeValueXYWithData() {
        XYSeries series = new XYSeries("S");
        series.add(1.0, 8.0);
        series.add(2.0, 3.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        Number result = DatasetUtilities.findMinimumRangeValue(coll);
        assertEquals(3.0, result.doubleValue(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumRangeValueCategoryNull() {
        DatasetUtilities.findMaximumRangeValue((CategoryDataset) null);
    }
    
    @Test
    public void testFindMaximumRangeValueCategoryEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findMaximumRangeValue(cat));
    }
    
    @Test
    public void testFindMaximumRangeValueCategoryWithData() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(2.0, "R1", "C1");
        cat.addValue(9.0, "R1", "C2");
        Number result = DatasetUtilities.findMaximumRangeValue(cat);
        assertEquals(9.0, result.doubleValue(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumRangeValueXYNull() {
        DatasetUtilities.findMaximumRangeValue((XYDataset) null);
    }
    
    @Test
    public void testFindMaximumRangeValueXYEmpty() {
        XYSeriesCollection coll = new XYSeriesCollection();
        assertNull(DatasetUtilities.findMaximumRangeValue(coll));
    }
    
    @Test
    public void testFindMaximumRangeValueXYWithData() {
        XYSeries series = new XYSeries("S");
        series.add(1.0, 4.0);
        series.add(2.0, 11.0);
        XYSeriesCollection coll = new XYSeriesCollection(series);
        Number result = DatasetUtilities.findMaximumRangeValue(coll);
        assertEquals(11.0, result.doubleValue(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBoundsCategoryNull() {
        DatasetUtilities.findStackedRangeBounds((CategoryDataset) null);
    }
    
    @Test
    public void testFindStackedRangeBoundsCategoryEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findStackedRangeBounds(cat));
    }
    
    @Test
    public void testFindStackedRangeBoundsCategoryNormal() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(2.0, "R1", "C1");
        cat.addValue(3.0, "R2", "C1");
        cat.addValue(-1.0, "R1", "C2");
        Range range = DatasetUtilities.findStackedRangeBounds(cat);
        assertEquals(-1.0, range.getLowerBound(), 0.0001);
        assertEquals(5.0, range.getUpperBound(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBoundsWithMapNull() {
        DatasetUtilities.findStackedRangeBounds((CategoryDataset) null, new KeyToGroupMap());
    }
    
    @Test
    public void testFindStackedRangeBoundsWithMapEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findStackedRangeBounds(cat, new KeyToGroupMap()));
    }
    
    @Test
    public void testFindStackedRangeBoundsWithMapNormal() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(5.0, "R1", "C1");
        cat.addValue(3.0, "R2", "C1");
        KeyToGroupMap map = new KeyToGroupMap();
        map.mapKeyToGroup("R1", "G1");
        map.mapKeyToGroup("R2", "G2");
        Range range = DatasetUtilities.findStackedRangeBounds(cat, map);
        assertNotNull(range);
        assertEquals(0.0, range.getLowerBound(), 0.0001);
        assertEquals(5.0, range.getUpperBound(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindMinimumStackedRangeValueNull() {
        DatasetUtilities.findMinimumStackedRangeValue(null);
    }
    
    @Test
    public void testFindMinimumStackedRangeValueEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findMinimumStackedRangeValue(cat));
    }
    
    @Test
    public void testFindMinimumStackedRangeValueNormal() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(-5.0, "R1", "C1");
        cat.addValue(3.0, "R2", "C1");
        Number result = DatasetUtilities.findMinimumStackedRangeValue(cat);
        assertEquals(-5.0, result.doubleValue(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindMaximumStackedRangeValueNull() {
        DatasetUtilities.findMaximumStackedRangeValue(null);
    }
    
    @Test
    public void testFindMaximumStackedRangeValueEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findMaximumStackedRangeValue(cat));
    }
    
    @Test
    public void testFindMaximumStackedRangeValueNormal() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(2.0, "R1", "C1");
        cat.addValue(7.0, "R2", "C1");
        Number result = DatasetUtilities.findMaximumStackedRangeValue(cat);
        assertEquals(9.0, result.doubleValue(), 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBoundsTableNull() {
        DatasetUtilities.findStackedRangeBounds((TableXYDataset) null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindStackedRangeBoundsTableNullWithBase() {
        DatasetUtilities.findStackedRangeBounds((TableXYDataset) null, 0.0);
    }
    
    @Test
    public void testFindStackedRangeBoundsTableNormal() {
        XYSeries series1 = new XYSeries("S1");
        series1.add(1.0, 2.0);
        XYSeries series2 = new XYSeries("S2");
        series2.add(1.0, 3.0);
        XYSeriesCollection coll = new XYSeriesCollection();
        coll.addSeries(series1);
        coll.addSeries(series2);
        Range range = DatasetUtilities.findStackedRangeBounds(coll, 0.0);
        assertEquals(0.0, range.getLowerBound(), 0.0001);
        assertEquals(5.0, range.getUpperBound(), 0.0001);
    }
    
    @Test
    public void testCalculateStackTotal() {
        XYSeries series1 = new XYSeries("S1");
        series1.add(1.0, 1.0);
        XYSeries series2 = new XYSeries("S2");
        series2.add(1.0, 4.0);
        XYSeriesCollection coll = new XYSeriesCollection();
        coll.addSeries(series1);
        coll.addSeries(series2);
        double total = DatasetUtilities.calculateStackTotal(coll, 0);
        assertEquals(5.0, total, 0.0001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindCumulativeRangeBoundsNull() {
        DatasetUtilities.findCumulativeRangeBounds(null);
    }
    
    @Test
    public void testFindCumulativeRangeBoundsEmpty() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        assertNull(DatasetUtilities.findCumulativeRangeBounds(cat));
    }
    
    @Test
    public void testFindCumulativeRangeBoundsNormal() {
        DefaultCategoryDataset cat = new DefaultCategoryDataset();
        cat.addValue(3.0, "R1", "C1");
        cat.addValue(2.0, "R1", "C2");
        cat.addValue(-1.0, "R1", "C3");
        Range range = DatasetUtilities.findCumulativeRangeBounds(cat);
        assertEquals(-1.0, range.getLowerBound(), 0.0001);
        assertEquals(5.0, range.getUpperBound(), 0.0001);
    }
}