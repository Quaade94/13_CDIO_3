package Fields;

import Game.GameBoard;

public abstract class Field{

	protected String Name;
	GameBoard GameBoard = new GameBoard();

	public abstract void landOnField(int IDOfPlayer);
	
}
