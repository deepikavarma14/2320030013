package game;
import game.singleton.GameState;
import game.factorymethod.Enemy;
import game.factorymethod.SimpleEnemyFactory;
import game.abstractfactory.AbstractFactory;
import game.abstractfactory.ItemFactory;
import game.abstractfactory.Weapon;
import game.abstractfactory.PowerUp;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameState gameState = GameState.getInstance();
        gameState.displayState();

        gameState.setLevel(2);
        gameState.setScore(150);
        gameState.setDifficulty("Medium");
        gameState.displayState();

        SimpleEnemyFactory enemyFactory = new SimpleEnemyFactory();
        Enemy goblin = enemyFactory.createEnemy("Goblin");
        goblin.attack();

        Enemy orc = enemyFactory.createEnemy("Orc");
        orc.attack();

        
        AbstractFactory itemFactory = new ItemFactory();
        Weapon sword = itemFactory.createWeapon("Sword");
        sword.use();

        PowerUp shield = itemFactory.createPowerUp("Shield");
        shield.activate();
	}

}
