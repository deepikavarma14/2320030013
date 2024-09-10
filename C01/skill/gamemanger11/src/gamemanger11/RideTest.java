package gamemanger11;

public class RideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RideManager rideManager = RideManager.getInstance();
        
        VehicleFactoryAbstract urbanFactory = RideFactoryProducer.getFactory("urban");
        Vehicle car = urbanFactory.createVehicle("car");
        car.drive();
                VehicleFactoryAbstract ruralFactory = RideFactoryProducer.getFactory("rural");
        Vehicle scooter = ruralFactory.createVehicle("scooter");
        scooter.drive();
	}

}
