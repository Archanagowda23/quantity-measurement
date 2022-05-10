package com.bridgelabz.quantitymeasurement;

public class QuantityMeasurement {
    public boolean compareUnits(double feet, double inch) {
        if (inch == 12 * feet) return true;
        return false;
    }
}

