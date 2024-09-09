package com.ridesharing;

public class PayPalFactory implements PaymentFactory{
	public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}
