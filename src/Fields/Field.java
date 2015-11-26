package Fields;

import Game.GameBoard;
import Game.Player;

public abstract class Field {

	protected String Name;
	
	Player Player = new Player();
	GameBoard GameBoard = new GameBoard(21);

	public abstract void landOnField(int IDOfPlayer);
	
}
