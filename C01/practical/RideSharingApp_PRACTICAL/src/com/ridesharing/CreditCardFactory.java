package com.ridesharing;

public class CreditCardFactory implements PaymentFactory{
	public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}
