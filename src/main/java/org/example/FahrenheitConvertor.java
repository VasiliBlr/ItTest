package org.example;

public class FahrenheitConvertor implements DegreesConvertor {

    public FahrenheitConvertor() {
    }

    @Override
    public double convert(double degrees) {
        return 5 * (degrees - 32) / 9;
    }
}
