package org.example.second;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BankProviderTest {

    private BankProvider bankProvider;

    @Before
    public void setUp() {
        bankProvider = new BankProvider();
    }

    @Test
    public void getAllOrder() {
        double bank = 55;
        double expected = 62;
        assertEquals(expected, bankProvider.getAllOrder(bank), 0.01);
    }

    @Test
    public void testGetAllOrder() {
        double bank = 101;
        double expected = 115;
        assertEquals(expected, bankProvider.getAllOrder(bank), 0.01);
    }
}