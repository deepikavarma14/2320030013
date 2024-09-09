package com.ridesharing;

public class RideSharingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserAuthentication auth = UserAuthentication.getInstance();
        auth.authenticateUser("user", "password");
        VehicleFactory vehicleFactory = new CarFactory();
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.requestRide();
        PaymentFactory paymentFactory = new CreditCardFactory();
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.processPayment(15.0);       
	}

}
