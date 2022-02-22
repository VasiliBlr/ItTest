package org.example;

public class KelvinConvertor implements DegreesConvertor {

    public KelvinConvertor() {
    }

    @Override
    public double convert(double degrees) {
        return degrees - 273.15;
    }
}
