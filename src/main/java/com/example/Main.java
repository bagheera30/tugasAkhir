package com.example;

public class Main {
    public static void main(String[] args) {
        double price = 100.0;
        double discountPercentage = 10.0;

        double discount = calculateDiscount(price, discountPercentage);
        double totalPrice = calculateTotalPrice(price, discount);

        System.out.println("Discount: $" + discount);
        System.out.println("Total Price: $" + totalPrice);
    }
}