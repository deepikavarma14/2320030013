package com.ridesharing;

public class PayPal implements PaymentMethod{
	public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using PayPal.");
    }
}
