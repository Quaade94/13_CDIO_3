

public class PlayerPosition {

	Die Die = new Die();

	private int player1Position = 0;
	private int player2Position = 0;
	private int player3Position = 0;
	private int player4Position = 0;
	private int player5Position = 0;
	private int player6Position = 0;
	
	int[] playerPosition = {player1Position,player2Position,player3Position,player4Position,player5Position,player6Position,};


	public int getPlayerPosition(int IDOfPlayer){
		
		return playerPosition[IDOfPlayer];

	}

	public void setPlayerPosition(int IDOfPlayer, int DiceSum){

		
		playerPosition[IDOfPlayer] = (playerPosition[IDOfPlayer] + DiceSum);
//		System.out.println("set " + DiceSum);
//		System.out.println(playerPosition[IDOfPlayer]);
	}
	
}



