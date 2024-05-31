package com.example;

public class Main {
    
    public static double calculateDiscount(double price, double discountPercentage) {
        return (price * discountPercentage) / 100;
    }

    public static double calculateTotalPrice(double price, double discount) {
        return price - discount;
    }
    public static void main(String[] args) {
        
        double price = 100.0;
        double discountPercentage = 10.0;

        double discount = calculateDiscount(price, discountPercentage);
        double totalPrice = calculateTotalPrice(price, discount);

        System.out.println("Discount: $" + discount);
        System.out.println("Total Price: $" + totalPrice);
    }
}