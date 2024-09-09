package com.ridesharing;

public class ScooterFactory extends VehicleFactory{
	public Vehicle createVehicle() {
        return new Scooter();
    }
}
