package com.ridesharing;

public class CarFactory extends VehicleFactory{
	public Vehicle createVehicle() {
        return new Car();
    }
}
