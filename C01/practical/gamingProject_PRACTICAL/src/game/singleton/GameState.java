package game.singleton;

public class GameState {
	private static GameState instance;
    private int level;
    private int score;
    private String difficulty;

    private GameState() {
        // Private constructor to prevent instantiation
        level = 1;
        score = 0;
        difficulty = "Easy";
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void displayState() {
        System.out.println("Level: " + level + ", Score: " + score + ", Difficulty: " + difficulty);
    }
}
