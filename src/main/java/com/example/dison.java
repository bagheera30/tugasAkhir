package com.example;
public class dison {
    public calculateDiscount(double price, double discountPercentage) {
        return (price * discountPercentage) / 100;
    }

    public double calculateTotalPrice(double price, double discount) {
        return price - discount;
    }
}