package org.jfree.data.category;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.jfree.data.UnknownKeyException;

/**
 * JUnit 4 test suite for DefaultIntervalCategoryDataset.
 * Covers constructor branches, key management, value access,
 * boundary conditions, and exception paths.
 */
public class DefaultIntervalCategoryDatasetTest {

    private DefaultIntervalCategoryDataset dataset;
    private DefaultIntervalCategoryDataset emptyDataset;
    private DefaultIntervalCategoryDataset singleSeriesDataset;
    
    // Standard test data: 2 series, 3 categories, custom keys
    private static final Number[][] STANDARD_STARTS = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
    private static final Number[][] STANDARD_ENDS   = {{10.0, 20.0, 30.0}, {40.0, 50.0, 60.0}};
    private static final Comparable[] STANDARD_SERIES_KEYS = {"S1", "S2"};
    private static final Comparable[] STANDARD_CATEGORY_KEYS = {"C1", "C2", "C3"};
    
    @Before
    public void setUp() throws Exception {
        dataset = new DefaultIntervalCategoryDataset(
                STANDARD_SERIES_KEYS, STANDARD_CATEGORY_KEYS,
                STANDARD_STARTS, STANDARD_ENDS);
        
        // Empty dataset (0 series)
        Number[][] empty = {};
        emptyDataset = new DefaultIntervalCategoryDataset(
                (Comparable[]) null, (Comparable[]) null, empty, empty);
        
        // Single series dataset (for boundary tests)
        Number[][] singleStarts = {{7.0, 8.0}};
        Number[][] singleEnds   = {{70.0, 80.0}};
        Comparable[] singleSeries = {"Only"};
        Comparable[] singleCategories = {"Cat1", "Cat2"};
        singleSeriesDataset = new DefaultIntervalCategoryDataset(
                singleSeries, singleCategories, singleStarts, singleEnds);
    }

    // ---- Constructor tests ----
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMismatchedSeriesCount() {
        Number[][] starts = {{1.0}};
        Number[][] ends   = {{2.0}, {3.0}}; // 2 series, mismatch
        new DefaultIntervalCategoryDataset((Comparable[]) null, (Comparable[]) null, starts, ends);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorMismatchedCategoryCount() {
        Number[][] starts = {{1.0, 2.0}};
        Number[][] ends   = {{3.0}}; // 1 category, mismatch
        new DefaultIntervalCategoryDataset((Comparable[]) null, (Comparable[]) null, starts, ends);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorSeriesKeysLengthMismatch() {
        Comparable[] seriesKeys = {"K1"}; // length 1, but data has 2 series
        new DefaultIntervalCategoryDataset(seriesKeys, null, STANDARD_STARTS, STANDARD_ENDS);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorCategoryKeysLengthMismatch() {
        Comparable[] categoryKeys = {"K1", "K2"}; // length 2, but data has 3 categories
        new DefaultIntervalCategoryDataset(null, categoryKeys, STANDARD_STARTS, STANDARD_ENDS);
    }
    
    @Test
    public void testConstructorNullData() {
        DefaultIntervalCategoryDataset ds = new DefaultIntervalCategoryDataset(
                (Number[][]) null, (Number[][]) null);
        Assert.assertEquals("Series count should be 0", 0, ds.getSeriesCount());
        Assert.assertEquals("Category count should be 0", 0, ds.getCategoryCount());
    }
    
    @Test
    public void testConstructorEmptyData() {
        Assert.assertEquals("Empty dataset series count", 0, emptyDataset.getSeriesCount());
        Assert.assertEquals("Empty dataset category count", 0, emptyDataset.getCategoryCount());
    }
    
    @Test
    public void testConstructorAutoGenerateKeys() {
        Number[][] starts = {{1.0, 2.0}};
        Number[][] ends   = {{3.0, 4.0}};
        DefaultIntervalCategoryDataset ds = new DefaultIntervalCategoryDataset(
                (Comparable[]) null, (Comparable[]) null, starts, ends);
        Assert.assertEquals("Auto series key count", 1, ds.getSeriesCount());
        Assert.assertEquals("Auto category key count", 2, ds.getCategoryCount());
        // Check generated keys (depends on resource bundle; assume default prefix "Series " and "Category ")
        Assert.assertNotNull("Series key should not be null", ds.getSeriesKey(0));
        Assert.assertNotNull("Category key should not be null", ds.getColumnKey(0));
    }
    
    // ---- getSeriesCount / getCategoryCount ----
    
    @Test
    public void testGetSeriesCount() {
        Assert.assertEquals("Series count", 2, dataset.getSeriesCount());
        Assert.assertEquals("Single series count", 1, singleSeriesDataset.getSeriesCount());
        Assert.assertEquals("Empty series count", 0, emptyDataset.getSeriesCount());
    }
    
    @Test
    public void testGetCategoryCount() {
        Assert.assertEquals("Category count", 3, dataset.getCategoryCount());
        Assert.assertEquals("Single series category count", 2, singleSeriesDataset.getCategoryCount());
        Assert.assertEquals("Empty category count", 0, emptyDataset.getCategoryCount());
    }
    
    // ---- getSeriesIndex / getCategoryIndex ----
    
    @Test
    public void testGetSeriesIndexFound() {
        Assert.assertEquals("Index of S1", 0, dataset.getSeriesIndex("S1"));
        Assert.assertEquals("Index of S2", 1, dataset.getSeriesIndex("S2"));
    }
    
    @Test
    public void testGetSeriesIndexNotFound() {
        Assert.assertEquals("Non-existent series", -1, dataset.getSeriesIndex("S3"));
    }
    
    @Test
    public void testGetCategoryIndexFound() {
        Assert.assertEquals("Index of C1", 0, dataset.getCategoryIndex("C1"));
        Assert.assertEquals("Index of C3", 2, dataset.getCategoryIndex("C3"));
    }
    
    @Test
    public void testGetCategoryIndexNotFound() {
        Assert.assertEquals("Non-existent category", -1, dataset.getCategoryIndex("C4"));
    }
    
    // ---- getSeriesKey (boundary) ----
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKeyNegativeIndex() {
        dataset.getSeriesKey(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetSeriesKeyOutOfBoundsIndex() {
        dataset.getSeriesKey(2);
    }
    
    @Test
    public void testGetSeriesKeyValid() {
        Assert.assertEquals("Series key at index 0", "S1", dataset.getSeriesKey(0));
        Assert.assertEquals("Series key at index 1", "S2", dataset.getSeriesKey(1));
    }
    
    // ---- setSeriesKeys ----
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeysNull() {
        dataset.setSeriesKeys(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetSeriesKeysLengthMismatch() {
        dataset.setSeriesKeys(new Comparable[] {"New"});
    }
    
    @Test
    public void testSetSeriesKeysValid() {
        Comparable[] newKeys = {"X", "Y"};
        dataset.setSeriesKeys(newKeys);
        Assert.assertArrayEquals("Series keys updated", newKeys, new Comparable[] {dataset.getSeriesKey(0), dataset.getSeriesKey(1)});
    }
    
    // ---- setCategoryKeys ----
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeysNull() {
        dataset.setCategoryKeys(null);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeysLengthMismatch() {
        dataset.setCategoryKeys(new Comparable[] {"A", "B"});
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetCategoryKeysNullElement() {
        dataset.setCategoryKeys(new Comparable[] {"A", null, "B"});
    }
    
    @Test
    public void testSetCategoryKeysValid() {
        Comparable[] newKeys = {"CatA", "CatB", "CatC"};
        dataset.setCategoryKeys(newKeys);
        Assert.assertArrayEquals("Category keys updated", newKeys,
                new Comparable[] {dataset.getColumnKey(0), dataset.getColumnKey(1), dataset.getColumnKey(2)});
    }
    
    // ---- getValue with keys ----
    
    @Test(expected = UnknownKeyException.class)
    public void testGetValueWithUnknownSeriesKey() {
        dataset.getValue("Unknown", "C1");
    }
    
    @Test(expected = UnknownKeyException.class)
    public void testGetValueWithUnknownCategoryKey() {
        dataset.getValue("S1", "Unknown");
    }
    
    @Test
    public void testGetValueWithKeysValid() {
        Assert.assertEquals("Value for (S1,C1)", STANDARD_ENDS[0][0], dataset.getValue("S1", "C1"));
        Assert.assertEquals("Value for (S2,C3)", STANDARD_ENDS[1][2], dataset.getValue("S2", "C3"));
    }
    
    // ---- getValue with int indices ----
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetValueWithIntSeriesOutOfBounds() {
        dataset.getValue(5, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetValueWithIntCategoryOutOfBounds() {
        dataset.getValue(0, 10);
    }
    
    @Test
    public void testGetValueWithIntValid() {
        Assert.assertEquals("End value at (0,0)", STANDARD_ENDS[0][0], dataset.getValue(0, 0));
        Assert.assertEquals("End value at (1,2)", STANDARD_ENDS[1][2], dataset.getValue(1, 2));
    }
    
    // ---- getStartValue / getEndValue with keys ----
    
    @Test
    public void testGetStartValueWithKeysValid() {
        Assert.assertEquals("Start value for (S1,C2)", STANDARD_STARTS[0][1], dataset.getStartValue("S1", "C2"));
    }
    
    @Test(expected = UnknownKeyException.class)
    public void testGetStartValueUnknownSeries() {
        dataset.getStartValue("Unknown", "C1");
    }
    
    @Test(expected = UnknownKeyException.class)
    public void testGetStartValueUnknownCategory() {
        dataset.getStartValue("S1", "Unknown");
    }
    
    @Test
    public void testGetEndValueWithKeysValid() {
        Assert.assertEquals("End value for (S2,C2)", STANDARD_ENDS[1][1], dataset.getEndValue("S2", "C2"));
    }
    
    // ---- getStartValue/getEndValue with int indices ----
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueWithIntSeriesNegative() {
        dataset.getStartValue(-1, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetStartValueWithIntCategoryOutOfBounds() {
        dataset.getStartValue(0, 3);
    }
    
    @Test
    public void testGetStartValueWithIntValid() {
        Assert.assertEquals("Start value at (0,1)", STANDARD_STARTS[0][1], dataset.getStartValue(0, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetEndValueWithIntSeriesOutOfBounds() {
        dataset.getEndValue(2, 0);
    }
    
    @Test
    public void testGetEndValueWithIntValid() {
        Assert.assertEquals("End value at (1,0)", STANDARD_ENDS[1][0], dataset.getEndValue(1, 0));
    }
    
    // ---- setStartValue / setEndValue ----
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValueInvalidSeries() {
        dataset.setStartValue(10, "C1", 99.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetStartValueInvalidCategory() {
        dataset.setStartValue(0, "Unknown", 99.0);
    }
    
    @Test
    public void testSetStartValueValid() {
        Number newVal = 99.0;
        dataset.setStartValue(0, "C2", newVal);
        Assert.assertEquals("Start value updated", newVal, dataset.getStartValue(0, 1));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValueInvalidSeries() {
        dataset.setEndValue(-1, "C1", 99.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetEndValueInvalidCategory() {
        dataset.setEndValue(0, "Unknown", 99.0);
    }
    
    @Test
    public void testSetEndValueValid() {
        Number newVal = 88.0;
        dataset.setEndValue(1, "C2", newVal);
        Assert.assertEquals("End value updated", newVal, dataset.getEndValue(1, 1));
    }
    
    // ---- getColumnIndex ----
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetColumnIndexNullKey() {
        dataset.getColumnIndex(null);
    }
    
    @Test
    public void testGetColumnIndexValid() {
        Assert.assertEquals("Index of C1", 0, dataset.getColumnIndex("C1"));
    }
    
    // ---- getRowIndex ----
    
    @Test
    public void testGetRowIndex() {
        Assert.assertEquals("Row index of S2", 1, dataset.getRowIndex("S2"));
        Assert.assertEquals("Row index of unknown", -1, dataset.getRowIndex("Unknown"));
    }
    
    // ---- getRowKeys / getColumnKeys ----
    
    @Test
    public void testGetRowKeys() {
        java.util.List keys = dataset.getRowKeys();
        Assert.assertFalse("Should not be empty", keys.isEmpty());
        Assert.assertEquals("First row key", "S1", keys.get(0));
    }
    
    @Test
    public void testGetColumnKeys() {
        java.util.List keys = dataset.getColumnKeys();
        Assert.assertEquals("Column keys size", 3, keys.size());
        Assert.assertEquals("First column key", "C1", keys.get(0));
    }
    
    @Test
    public void testGetRowKeysWhenSeriesKeysNull() {
        // empty dataset has null seriesKeys
        java.util.List keys = emptyDataset.getRowKeys();
        Assert.assertTrue("Should be empty", keys.isEmpty());
    }
    
    @Test
    public void testGetColumnKeysWhenCategoryKeysNull() {
        java.util.List keys = emptyDataset.getColumnKeys();
        Assert.assertTrue("Should be empty", keys.isEmpty());
    }
    
    // ---- getRowKey (boundary) ----
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKeyNegative() {
        dataset.getRowKey(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetRowKeyOutOfBounds() {
        dataset.getRowKey(2);
    }
    
    @Test
    public void testGetRowKeyValid() {
        Assert.assertEquals("Row key for index 0", "S1", dataset.getRowKey(0));
    }
    
    // ---- getColumnKey (boundary) ----
    
    @Test
    public void testGetColumnKeyValid() {
        Assert.assertEquals("Column key for index 2", "C3", dataset.getColumnKey(2));
    }
    
    // getColumnKey does not validate index, but we can test that it returns correct value
    // Note: getColumnKey directly indexes categoryKeys; if index out of bounds, throws ArrayIndexOutOfBoundsException
    // This is considered a bug, but we include a test expecting the exception.
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetColumnKeyOutOfBounds() {
        dataset.getColumnKey(5);
    }
    
    // ---- equals ----
    
    @Test
    public void testEqualsSameInstance() {
        Assert.assertTrue("Same instance", dataset.equals(dataset));
    }
    
    @Test
    public void testEqualsDifferentSeriesKeys() {
        DefaultIntervalCategoryDataset other = new DefaultIntervalCategoryDataset(
                new Comparable[] {"S1", "S2"}, STANDARD_CATEGORY_KEYS,
                STANDARD_STARTS, STANDARD_ENDS);
        // series keys are the same, so equals should be true
        Assert.assertTrue("Same keys", dataset.equals(other));
        
        // Change one key
        other.setSeriesKeys(new Comparable[] {"A", "B"});
        Assert.assertFalse("Different series keys", dataset.equals(other));
    }
    
    @Test
    public void testEqualsDifferentCategoryKeys() {
        DefaultIntervalCategoryDataset other = new DefaultIntervalCategoryDataset(
                STANDARD_SERIES_KEYS, new Comparable[] {"A", "B", "C"},
                STANDARD_STARTS, STANDARD_ENDS);
        Assert.assertFalse("Different category keys", dataset.equals(other));
    }
    
    @Test
    public void testEqualsDifferentStartData() {
        Number[][] newStarts = {{9.0, 8.0, 7.0}, {6.0, 5.0, 4.0}};
        DefaultIntervalCategoryDataset other = new DefaultIntervalCategoryDataset(
                STANDARD_SERIES_KEYS, STANDARD_CATEGORY_KEYS,
                newStarts, STANDARD_ENDS);
        Assert.assertFalse("Different start data", dataset.equals(other));
    }
    
    @Test
    public void testEqualsDifferentEndData() {
        Number[][] newEnds = {{90.0, 80.0, 70.0}, {60.0, 50.0, 40.0}};
        DefaultIntervalCategoryDataset other = new DefaultIntervalCategoryDataset(
                STANDARD_SERIES_KEYS, STANDARD_CATEGORY_KEYS,
                STANDARD_STARTS, newEnds);
        Assert.assertFalse("Different end data", dataset.equals(other));
    }
    
    @Test
    public void testEqualsDifferentType() {
        Assert.assertFalse("Different type", dataset.equals("string"));
    }
    
    @Test
    public void testEqualsNull() {
        Assert.assertFalse("Null", dataset.equals(null));
    }
    
    // ---- clone ----
    
    @Test
    public void testClone() throws Exception {
        DefaultIntervalCategoryDataset cloned = (DefaultIntervalCategoryDataset) dataset.clone();
        Assert.assertNotSame("Not same instance", dataset, cloned);
        Assert.assertEquals("Clone equals original", dataset, cloned);
        // Modify original, clone should remain unchanged
        dataset.setSeriesKeys(new Comparable[] {"New1", "New2"});
        Assert.assertFalse("Clone not affected", dataset.equals(cloned));
    }
    
    // ---- getRowCount / getColumnCount ----
    
    @Test
    public void testGetRowCount() {
        Assert.assertEquals("Row count", 2, dataset.getRowCount());
    }
    
    @Test
    public void testGetColumnCount() {
        Assert.assertEquals("Column count", 3, dataset.getColumnCount());
    }
}