package gamemanger11;

public class VehicleFactory {
	public static Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            return new Bike();
        } else if (vehicleType.equalsIgnoreCase("scooter")) {
            return new Scooter();
        }
        return null;
    }
}
