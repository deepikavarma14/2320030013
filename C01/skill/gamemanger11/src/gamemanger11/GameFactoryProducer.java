package gamemanger11;

public class GameFactoryProducer {
	public static GameFactory getFactory(String gameType) {
        if (gameType.equalsIgnoreCase("puzzle")) {
            return new PuzzleGameFactory();
        } else if (gameType.equalsIgnoreCase("racing")) {
            return new RacingGameFactory();
        }
        return null;
    }
}
