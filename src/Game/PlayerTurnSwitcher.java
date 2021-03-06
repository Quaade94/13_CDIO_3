package Game;

import Fields.FieldController;

public class PlayerTurnSwitcher {
	private int turnPlayer1 =0;
	private int turnPlayer2 =0;
	private int turnPlayer3 =0;
	private int turnPlayer4 =0;
	private int turnPlayer5 =0;
	private int turnPlayer6 =0;
	private int money;
	private int player;
	private boolean isOwned = false;
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
	//Checking the field the player landed on
	public void checkField(int IDOfPlayer, int playerPosition){
		if (FieldController.OwnableCheck(IDOfPlayer, playerPosition)){
			isOwned = true;
			money = FieldController.getRent();
			player = FieldController.getPlayer();
		} else if (!(FieldController.OwnableCheck(IDOfPlayer, playerPosition))){
			isOwned = false;
			money = FieldController.getPrice() * -1;
			player = FieldController.getPlayer();
		}
	}
	public void setTenPercent(int playerMoney){
		FieldController.setPlayerPercent(playerMoney);
	}
	public void setDiceSum(int diceSum){
		FieldController.setDieSum(diceSum);
	}
	//Return the rent/price of the field and the owner
	public int[] getRentAndPlayer(){
		int[] rentAndPlayer = {money,player};
		return rentAndPlayer;
	}
	//Returns whether or not the field is owned
	public boolean getOwned(){
		return isOwned;
	}
	//Changes the owner
	public void shiftOwner(int IDOfPlayer){
		FieldController.setOwner(IDOfPlayer);
	}
	
	
	/**
	 * This method can determine the amount of occurrence of numbers smaller than a number you decide, in an array of your choice 
	 * 
	 * @param LookingForLessThan: The number that want to look for the amount of occurrence smaller than this number
	 * @param ArrayOfPlayers The Array of int's that you want to look for the number in
	 * @return Returns the number of occurrence that was in the array
	 */
	public int numberOfBankrupts(int[] ArrayOfPlayers){
		int i = 0;
		int occurrence = 0;
		while (i < ArrayOfPlayers.length)
		if (ArrayOfPlayers[i] < 0){
			i++;
			occurrence++;
		} else i++;
		return occurrence;
	}
	public String whoHasWon(int[] ArrayOfPlayers, String[] playerNames){
		int i = 0;
		int R = 0;
		while (i < ArrayOfPlayers.length){
			if (ArrayOfPlayers[i] > 0){
					R = i;
					i++;
			} else i++;
		}
		String winner = playerNames[R];
		return winner;
	}
}
