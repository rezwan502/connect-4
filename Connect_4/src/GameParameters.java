public class GameParameters {
	
	private int gameMode;
	private int maxDepth;
	private String player1Color;
	private String player2Color;
	
	public static final int HumanVSAi = 1;
	
	
	public GameParameters() {
		// Default values
		this.maxDepth = 6;
		this.player1Color = "GREEN";
		this.player2Color = "ORANGE";
		this.gameMode = HumanVSAi;
	}

	public int getMaxDepth() {
		return this.maxDepth;
	}

	public String getPlayer1Color() {
		return player1Color;
	}
	
	public String getPlayer2Color() {
		return player2Color;
	}

	public int getGameMode() {
		return gameMode;
	}

}
