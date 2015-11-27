package Fields;

import Game.Account;
import Game.GameBoard;
import Game.Player;

public abstract class Field{

	protected String Name;
	GameBoard GameBoard = new GameBoard();
	Account Account = new Account();

	public abstract void landOnField(int IDOfPlayer);
	
}
