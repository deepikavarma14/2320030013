package gamemanger11;

public class RuralVehicleFactory implements VehicleFactoryAbstract{
	public Vehicle createVehicle(String vehicleType) {
        return VehicleFactory.getVehicle(vehicleType);
    }
}
