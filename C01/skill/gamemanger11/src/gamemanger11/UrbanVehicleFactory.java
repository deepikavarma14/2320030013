package gamemanger11;

public class UrbanVehicleFactory implements VehicleFactoryAbstract{
	public Vehicle createVehicle(String vehicleType) {
        return VehicleFactory.getVehicle(vehicleType);
    }
}
