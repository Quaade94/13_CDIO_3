package GameTests;

import Game.Die;

public class DieTest extends Die{
	private int sum;

	@Override
	public void roll(){
		int dice1 = 2;
		int dice2 = 3;
		sum = 5;
	}
	
	public int getDiceSum() {
		return sum;
	}

}