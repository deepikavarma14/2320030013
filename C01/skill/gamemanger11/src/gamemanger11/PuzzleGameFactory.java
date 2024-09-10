package gamemanger11;

public class PuzzleGameFactory implements GameFactory{
	 public Level createLevel(String difficulty) {
	        return LevelFactory.getLevel(difficulty);
	    }
}
