package gamemanger11;

public class RacingGameFactory implements GameFactory{
	public Level createLevel(String difficulty) {
        return LevelFactory.getLevel(difficulty);
    }
}
