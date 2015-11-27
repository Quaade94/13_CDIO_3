package Game;

import java.util.Arrays;

import desktop_resources.GUI;

public class Main {

	public static void main(String[] args) {
		
		long gameTime1 = System.currentTimeMillis();		
		// GameBoard must be created first
		long responseTimeLaunch1 = System.currentTimeMillis();
		GameBoard GameBoard = new GameBoard();
		//GameBoard.toStrings();		toString method to print the array containing the fieldsname
		GameBoard.setGameBoard();
		long responseTimeLaunch2 = System.currentTimeMillis();
		System.out.println("Launch Time: "+(double)(responseTimeLaunch2-responseTimeLaunch1)/1000 + " seconds");
		
		Die Die = new Die();
		Player Player = new Player((GUI.getUserInteger(Language.getLang("PLAYERNO"), 2, 6)));
		Account Account = new Account();
		PlayerTurnSwitcher Turns1 = new PlayerTurnSwitcher();
	
		Turns1.setPlayerSize(Player.getNumberOfPlayers());
		//Creating players and accounts
		Player.addPlayers();
		Account.addAccounts(Player.getNumberOfPlayers());
		
		//Start game button
		GUI.getUserButtonPressed(Language.getLang("RDY"), Language.getLang("SRT"));
				
		
		
		int antalSpillere = Player.getNumberOfPlayers();
		System.out.println("Spillere " + antalSpillere); 
		
		while(antalSpillere>1){
			if (Account.getPlayerStash(Turns1.getPlayerTurn()) >= 0){
				
				//Throw Dice button
				GUI.getUserButtonPressed(Player.getPlayerName(Turns1.getPlayerTurn()) + Language.getLang("TURN"), Language.getLang("TD"));
				
				//player throws the dice and moves his car
				Die.roll();
				
				GUI.setDice(Die.getDice1(),Die.getDice2());
				
				Player.setPlayerPosition(Turns1.getPlayerTurn(), Die.getDiceSum());

				GUI.setCar(Player.getPlayerPosition(Turns1.getPlayerTurn()), Player.getPlayerName(Turns1.getPlayerTurn()));
				
				// removes the car from its earlier position (unless it is the player's first turn)
				if (Turns1.getIndependentTurn() > 0){
					GUI.removeCar(Player.carDestroyer, Player.getPlayerName(Turns1.getPlayerTurn()));
				}
				
				//Sending dice sum to Labor Camp class
				Turns1.setDiceSum(Die.getDiceSum());
				//Sending account stash to tax for calculation of 10%
				Turns1.setTenPercent(Account.getPlayerStash(Turns1.getPlayerTurn()));
				//Checking the field the player landed on
				Turns1.checkField(Turns1.getPlayerTurn(), Player.getPlayerPosition(Turns1.getPlayerTurn()));
				//Getting price/rent and owning player in an array
				int[] rentAndPlayer = Turns1.getRentAndPlayer();
				//If the field is not owned
				if (!(Turns1.getOwned())){
					if (Account.getPlayerStash(Turns1.getPlayerTurn()) >= rentAndPlayer[0] * -1) {
						boolean wantToBuy = GUI.getUserLeftButtonPressed(Language.getLang("CHOOSE"), Language.getLang("YES"), Language.getLang("NO"));
						if (wantToBuy){
								Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0]);
								GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
								Turns1.shiftOwner(Turns1.getPlayerTurn());
						}
					}
				//If the field is already owned / not ownable
				} else if (Turns1.getOwned()){
					Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0] * -1);
					GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
					if(rentAndPlayer[1] != 6){
						Account.setPlayerStash(rentAndPlayer[1], rentAndPlayer[0]);
						if(Account.getPlayerStash(rentAndPlayer[1]) > 0){
							GUI.setBalance(Player.getPlayerName(rentAndPlayer[1]), Account.getPlayerStash(rentAndPlayer[1]));
						}
					}
				}
				//Setting how many players are still left
				antalSpillere = Player.getPlayerArray().length - Turns1.numberOfBankrupts(Account.getAccountArray());
				//Cleaning up a player who lost from the board
				if(Account.getPlayerStash(Turns1.getPlayerTurn()) < 0){
					Account.setPlayerStash(Turns1.getPlayerTurn(), -50000);
					GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), 0);
				}

				if (Turns1.getIndependentTurn() > 0){
					GUI.removeCar(Player.carDestroyer, Player.getPlayerName(Turns1.getPlayerTurn()));
				}
				Turns1.scaleIndependentTurn();
				Turns1.endTurn();
			}else {
				//If the player has lost
				Account.setPlayerStash(Turns1.getPlayerTurn(), -50000);
				GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), 0);
				Turns1.endTurn();
			}
							
			}

		if (antalSpillere == 1) {
			GUI.getUserButtonPressed(Turns1.whoHasWon(Account.getAccountArray(), Player.getPlayerArray()) + " " + Language.getLang("WIN"), Language.getLang("CL"));
		}
		
		GUI.close();
		long gameTime2 = System.currentTimeMillis();
		double gameTime = ((gameTime2-gameTime1)/1000)/60;
		System.out.println("Game lasted: " + (int)gameTime + " minutes");		
	}
}