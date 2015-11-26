package Game;

public class PlayerTurnSwitcher {
	int turnPlayer1 =0;
	int turnPlayer2 =0;
	int turnPlayer3 =0;
	int turnPlayer4 =0;
	int turnPlayer5 =0;
	int turnPlayer6 =0;
	
	int[] independentTurn = {turnPlayer1,turnPlayer2,turnPlayer3,turnPlayer4,turnPlayer5,turnPlayer6};
	
	private int playerTurn =1;
	private int playerArraySize;	

	public int getIndependentTurn(int IDOfPlayers){
		
		return independentTurn[IDOfPlayers];
	}

	public void scaleIndependentTurn(int IDOfPlayers){
		
		independentTurn[IDOfPlayers]++;			
	}
			
	public void setPlayerSize(int size){
		playerArraySize = size;
	}
	
	public void endTurn(){
			
		if(playerTurn<=playerArraySize){			
			playerTurn++;			
		}
			
		if(playerTurn>playerArraySize) {	
			playerTurn = 1;
			}
	}

	public int getPlayerTurn(){	
	return playerTurn-1;
	}
}
