package game.abstractfactory;

public class ItemFactory extends AbstractFactory{
	 public Weapon createWeapon(String type) {
	        switch (type) {
	            case "Sword":
	                return new Sword();
	            case "Bow":
	                return new Bow();
	            default:
	                return null;
	        }
	    }
	    public PowerUp createPowerUp(String type) {
	        switch (type) {
	            case "Shield":
	                return new Shield();
	            case "HealthPotion":
	                return new HealthPotion();
	            default:
	                return null;
	        }
	    }
}
