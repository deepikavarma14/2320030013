package gamemanger11;

public class RideFactoryProducer {
	public static VehicleFactoryAbstract getFactory(String regionType) {
        if (regionType.equalsIgnoreCase("urban")) {
            return new UrbanVehicleFactory();
        } else if (regionType.equalsIgnoreCase("rural")) {
            return new RuralVehicleFactory();
        }
        return null;
    }
}
