package Test;

import Game.PlayerPosition;

public abstract class TestKlasse {

	protected String Name;
	
	PlayerPosition PlayerPosition = new PlayerPosition();

	public abstract void landOnField(int IDOfPlayer);
	
}
