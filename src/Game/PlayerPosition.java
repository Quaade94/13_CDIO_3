package Game;

import desktop_resources.GUI;

public class PlayerPosition {

	Die Die = new Die();

	private int player1Position = 0;
	private int player2Position = 0;
	private int player3Position = 0;
	private int player4Position = 0;
	private int player5Position = 0;
	private int player6Position = 0;
	
	private int fakePos = 0;
	
	public int bilSletter = 0;
	
	int[] playerPosition = {player1Position,player2Position,player3Position,player4Position,player5Position,player6Position,};

	public int getPlayerPosition(int IDOfPlayer){		
		return playerPosition[IDOfPlayer];
	}

	public void setPlayerPosition(int IDOfPlayer, int DiceSum){
		
		playerPosition[IDOfPlayer] = (playerPosition[IDOfPlayer] + DiceSum);
		
		/**
		 * For removing the car from the last known position
		 **/
		bilSletter = playerPosition[IDOfPlayer]-DiceSum;
		
		/**
		 * Makes the player go back to the start if he reaches the end of the GameBoard
		 **/
		if(playerPosition[IDOfPlayer]>21){
			fakePos = playerPosition[IDOfPlayer];
			fakePos = fakePos - 21;
			playerPosition[IDOfPlayer] = fakePos;
			}		
	}	
}


