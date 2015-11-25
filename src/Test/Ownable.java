package Test;

import Game.Player;

public abstract class Ownable extends TestKlasse {

	private int price;
	private int IDOfPlayer;
	
	public abstract  int getRent();
	
	@Override
	public abstract void landOnField(int IDOfPlayer);
	
	
	
}
