package org.example;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KelvinConvertorTest {

    KelvinConvertor kelvinConvertor;

    @Before
    public void setUp() {
        kelvinConvertor = new KelvinConvertor();
    }

    @Test
    public void convert() {
        double actual = kelvinConvertor.convert(310);
        double expected = 36.85;
        Assert.assertEquals(expected, actual, 0.01);
    }
}