package gamemanger11;

public class RideManager {
	private static RideManager instance;
    private RideManager() {
    }
    public static RideManager getInstance() {
        if (instance == null) {
            instance = new RideManager();
        }
        return instance;
    }
    public void requestRide(String vehicleType) {
        Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
        if (vehicle != null) {
            vehicle.drive();
        } else {
            System.out.println("Vehicle type not available.");
        }
    }
}
