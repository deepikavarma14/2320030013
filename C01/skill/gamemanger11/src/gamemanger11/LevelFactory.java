package gamemanger11;

public class LevelFactory {
	public static Level getLevel(String difficulty) {
        if (difficulty.equalsIgnoreCase("easy")) {
            return new EasyLevel();
        } else if (difficulty.equalsIgnoreCase("medium")) {
            return new MediumLevel();
        } else if (difficulty.equalsIgnoreCase("hard")) {
            return new HardLevel();
        }
        return null;
    }
}
