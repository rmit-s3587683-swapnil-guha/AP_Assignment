import java.util.ArrayList;

public class GameLoad {
	public void gameLoding(ArrayList<Sport> game, int gameNumber, String predictID) {

		game.get(gameNumber - 1).startGame();
		if (game.get(gameNumber - 1).getWinner().getID().equals(predictID)) {
			System.out.println("Congratzz Your Prdiction Correct!");
		} else {
			System.out.println("Bad Luck!");
		}

	}

}
