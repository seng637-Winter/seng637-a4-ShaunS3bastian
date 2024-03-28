package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jmock.Expectations;
import org.jmock.Expectations;
import org.jmock.Mockery;

public class DataUtilitiesCalculateColumnTotal2 {

	@Test
    public void calculateColumnTotalForEmptyValues2() {
        Mockery mockingContext = new Mockery();
        final Values2D values = mockingContext.mock(Values2D.class);

        mockingContext.checking(new Expectations() {{
            oneOf(values).getRowCount();
            will(returnValue(0));
        }});

        int[] validRows = {};
        double result = DataUtilities.calculateColumnTotal(values, 0, validRows);
        assertEquals(0.0, result, .000000001d);
    }

    @Test
    public void calculateColumnTotalForNegativeRowCount2() {
        Mockery mockingContext = new Mockery();
        final Values2D values = mockingContext.mock(Values2D.class);

        mockingContext.checking(new Expectations() {{
            oneOf(values).getRowCount();
            will(returnValue(-1));
        }});

        int[] validRows = {};
        double result = DataUtilities.calculateColumnTotal(values, 0, validRows);
        assertEquals(0.0, result, .000000001d);
    }

    @Test
    public void calculateColumnTotaValid2() {
        Mockery mockingContext = new Mockery();
        final Values2D values = mockingContext.mock(Values2D.class);

        mockingContext.checking(new Expectations() {{
            oneOf(values).getRowCount();
            will(returnValue(3));
            oneOf(values).getValue(0, 0);
            will(returnValue(1.0));
            oneOf(values).getValue(1, 0);
            will(returnValue(2.0));
            oneOf(values).getValue(2, 0);
            will(returnValue(3.0));
        }});

        int[] validRows = {0, 2};
        double result = DataUtilities.calculateColumnTotal(values, 0, validRows);
        assertEquals(4.0, result, .000000001d);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void calculateColumnTotalInvalidData2() {
        int[] validRows = {0, 1};
        DataUtilities.calculateColumnTotal(null, 0, validRows);
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void calculateColumnTotalInvalid2() {
//        Mockery mockingContext = new Mockery();
//        final Values2D values = mockingContext.mock(Values2D.class);
//
//        mockingContext.checking(new Expectations() {{
//            oneOf(values).getRowCount();
//            will(returnValue(3));
//        }});
//
//        int[] invalidRows = {0, 3};
//        DataUtilities.calculateColumnTotal(values, 0, invalidRows);
//        mockingContext.assertIsSatisfied();
//    }


    @Test(expected = IllegalArgumentException.class)
    public void calculateColumnTotalInvalid2() {
        // Create a mockery context
        Mockery mockingContext = new Mockery();

        // Mock the Values2D object
        final Values2D values = mockingContext.mock(Values2D.class);

        // Define the expected behavior for the mocked object
        mockingContext.checking(new Expectations() {{
            // Expect one invocation of getRowCount() and return 3
            oneOf(values).getRowCount();
            will(returnValue(3));

            // Ignore any invocations of getValue()
            ignoring(values).getValue(with(any(int.class)), with(any(int.class)));
        }});

        // Define invalid rows
        int[] invalidRows = {0, 3};

        // Call the method under test
        DataUtilities.calculateColumnTotal(values, 0, invalidRows);

        // Verify that the expected exception is thrown
        mockingContext.assertIsSatisfied();
    }
    
    @Test
    public void calculateColumnTotalForSingleValidRow() {
        Mockery mockingContext = new Mockery();
        final Values2D values = mockingContext.mock(Values2D.class);

        mockingContext.checking(new Expectations() {{
            oneOf(values).getRowCount();
            will(returnValue(3));
            oneOf(values).getValue(1, 0);
            will(returnValue(2.0));
        }});

        int[] validRows = {1};
        double result = DataUtilities.calculateColumnTotal(values, 0, validRows);
        assertEquals(2.0, result, .000000001d);
    }

    @Test
    public void calculateColumnTotalForNonZeroColumn() {
        Mockery mockingContext = new Mockery();
        final Values2D values = mockingContext.mock(Values2D.class);

        mockingContext.checking(new Expectations() {{
            oneOf(values).getRowCount();
            will(returnValue(3));
            oneOf(values).getValue(0, 1);
            will(returnValue(5.0));
            oneOf(values).getValue(1, 1);
            will(returnValue(2.0));
            oneOf(values).getValue(2, 1);
            will(returnValue(3.0));
        }});

        int[] validRows = {0, 2};
        double result = DataUtilities.calculateColumnTotal(values, 1, validRows);
        assertEquals(8.0, result, .000000001d);
    }

    @Test
    public void calculateColumnTotalForZeroRowCount() {
        Mockery mockingContext = new Mockery();
        final Values2D values = mockingContext.mock(Values2D.class);

        mockingContext.checking(new Expectations() {{
            oneOf(values).getRowCount();
            will(returnValue(0));
        }});

        int[] validRows = {};
        double result = DataUtilities.calculateColumnTotal(values, 1, validRows);
        assertEquals(0.0, result, .000000001d);
    }

    @Test
    public void calculateColumnTotalForZeroValidRows() {
        Mockery mockingContext = new Mockery();
        final Values2D values = mockingContext.mock(Values2D.class);

        mockingContext.checking(new Expectations() {{
            oneOf(values).getRowCount();
            will(returnValue(3));
        }});

        int[] validRows = {};
        double result = DataUtilities.calculateColumnTotal(values, 0, validRows);
        assertEquals(0.0, result, .000000001d);
    }

    @Test
    public void calculateColumnTotalForNullValidRows() {
        Mockery mockingContext = new Mockery();
        final Values2D values = mockingContext.mock(Values2D.class);

        mockingContext.checking(new Expectations() {{
            oneOf(values).getRowCount();
            will(returnValue(3));
        }});
    }

}