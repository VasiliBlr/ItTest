package org.example;

public class App
{
    public static void main( String[] args )
    {
        Factory factory = new Factory();
       double result = factory.getConvertor("Kelvin", 0);
        System.out.println(result);
    }
}
