package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FahrenheitConvertorTest {

    FahrenheitConvertor convertor;

    @Before
    public void setUp() {
        convertor = new FahrenheitConvertor();
    }

    @Test
    public void convert() {
        double actual = convertor.convert(32);
        double expected = 0;
        Assert.assertEquals(expected, actual, 0.01);
    }
}