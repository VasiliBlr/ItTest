package org.example;

public class Factory {

    public Factory() {
    }

    public double getConvertor(String typeDegrees, double degrees){
     return switch (typeDegrees){
          case "Kelvin" -> new KelvinConvertor().convert(degrees);
          case "Fahrenheit" -> new FahrenheitConvertor().convert(degrees);
          default -> degrees;
      };
    }

}
