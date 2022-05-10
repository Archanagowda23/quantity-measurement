package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {

    private QuantityMeasurement quantityMeasurement;

    @Before
    public void init() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenOneFeetAndOneFeetValue_WhenEqual_ShouldReturnTrue() {
        double feet = 1;
        double inch = 12;
        boolean result = quantityMeasurement.compareUnits(feet, inch);
        Assert.assertTrue(result);
    }
}

