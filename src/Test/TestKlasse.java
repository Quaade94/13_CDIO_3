package Test;

import Game.GameBoard;
import Game.PlayerPosition;

public abstract class TestKlasse {

	protected String Name;
	
	PlayerPosition PlayerPosition = new PlayerPosition();
	GameBoard GameBoard = new GameBoard(21);

	public abstract void landOnField(int IDOfPlayer);
	
}
