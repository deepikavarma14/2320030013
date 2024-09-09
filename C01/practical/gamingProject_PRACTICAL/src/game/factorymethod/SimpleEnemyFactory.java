package game.factorymethod;

public class SimpleEnemyFactory extends EnemyFactory{
	 public Enemy createEnemy(String type) {
	        switch (type) {
	            case "Goblin":
	                return new Goblin();
	            case "Orc":
	                return new Orc();
	            default:
	                return null;
	        }
	    }
}