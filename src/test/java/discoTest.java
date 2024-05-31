 package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
 public class disconTest{
@Test
    public void testCalculateDiscount() {
        double price = 100.0;
        double discountPercentage = 10.0;
        double expectedDiscount = 10.0;

        double actualDiscount = PaymentCalculator.calculateDiscount(price, discountPercentage);
        assertEquals(expectedDiscount, actualDiscount, 0.01);
    }

    @Test
    public void testCalculateTotalPrice() {
        double price = 100.0;
        double discount = 10.0;
        double expectedTotalPrice = 90.0;

        double actualTotalPrice = PaymentCalculator.calculateTotalPrice(price, discount);
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01);
    }
 }
 
 