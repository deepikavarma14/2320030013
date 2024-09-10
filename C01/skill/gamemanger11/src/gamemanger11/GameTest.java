package gamemanger11;

public class GameTest {
	 public static void main(String[] args) {
	        GameManager gameManager = GameManager.getInstance();
	        gameManager.startGame();
	        GameFactory puzzleFactory = GameFactoryProducer.getFactory("puzzle");
	        Level easyPuzzle = puzzleFactory.createLevel("easy");
	        easyPuzzle.loadLevel();
	        GameFactory racingFactory = GameFactoryProducer.getFactory("racing");
	        Level hardRacing = racingFactory.createLevel("hard");
	        hardRacing.loadLevel();
	        gameManager.endGame();
	    }
}
