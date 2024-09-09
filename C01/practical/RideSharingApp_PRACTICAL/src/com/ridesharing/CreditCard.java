package com.ridesharing;

public class CreditCard implements PaymentMethod{
	public void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using Credit Card.");
    }
}
