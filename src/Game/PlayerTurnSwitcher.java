package Game;

public class PlayerTurnSwitcher {

	private int playerTurn =1;
	private int playerArraySize;	
//ss
			
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
