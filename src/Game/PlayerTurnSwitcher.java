package Game;

import Fields.FieldController;
import desktop_resources.GUI;

public class PlayerTurnSwitcher {
	int turnPlayer1 =0;
	int turnPlayer2 =0;
	int turnPlayer3 =0;
	int turnPlayer4 =0;
	int turnPlayer5 =0;
	int turnPlayer6 =0;
	int money;
	int player;
	boolean isOwned = false;
	FieldController FieldController = new FieldController();
	
	int[] independentTurn = {turnPlayer1,turnPlayer2,turnPlayer3,turnPlayer4,turnPlayer5,turnPlayer6};
	
	private int playerTurn =1;
	private int playerArraySize;	

	public int getIndependentTurn(){
		int iDOfPlayers = playerTurn-1;
		return independentTurn[iDOfPlayers];
	}

	public void scaleIndependentTurn(){
		int iDOfPlayers = playerTurn-1;
		independentTurn[iDOfPlayers]++;			
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
	public void checkField(int IDOfPlayer, int playerPosition){
		if (FieldController.OwnableCheck(IDOfPlayer, playerPosition)){
			
		} else if (!(FieldController.OwnableCheck(IDOfPlayer, playerPosition))){
			isOwned = false;
			money = FieldController.getTerPrice() * -1;
			player = FieldController.getTerPlayer();
		}
		
		
	}
	public int[] getRentAndPlayer(){
		int[] rentAndPlayer = {money,player};
		return rentAndPlayer;
	}
	public boolean getOwned(){
		return isOwned;
	}
	public void shiftOwner(int IDOfPlayer){
		FieldController.setTerOwner(IDOfPlayer);
	}
}
