package gamemanger11;

public class GameManager {
	private static GameManager instance;
    private GameManager() {
    }
    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }
    public void startGame() {
        System.out.println("Game Started");
    }

    public void endGame() {
        System.out.println("Game Ended");
    }
}
