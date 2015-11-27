package Game;

import desktop_resources.GUI;

public class Main {

	public static void main(String[] args) {
		
		long gameTime1 = System.currentTimeMillis();
		
		//Spilleplade (SKAL være først)
		long responseTimeLaunch1 = System.currentTimeMillis();
		GameBoard GameBoard = new GameBoard();
		GameBoard.setGameBoard();
		long responseTimeLaunch2 = System.currentTimeMillis();
		System.out.println("Launch Time: "+(double)(responseTimeLaunch2-responseTimeLaunch1)/1000 + " seconds");
		
		//Importere
		Die Die = new Die();
		Player Player = new Player((GUI.getUserInteger(Language.getLang("PLAYERNO"), 2, 6)));
		Account Account = new Account();
		PlayerTurnSwitcher Turns1 = new PlayerTurnSwitcher();
		
		Turns1.setPlayerSize(Player.getNumberOfPlayers());
		Player.addPlayers();
		Account.addAccounts(Player.getNumberOfPlayers());
		
		//Start knappen
		GUI.getUserButtonPressed(Language.getLang("RDY"), Language.getLang("SRT"));
					
		//Dette skal IKKE slettes
		int[] FieldEffect = GameBoard.getFieldPrice();
				
		//player kaster med terningen og flytter brikke		
		while(Player.getNumberOfPlayers()>1){
			
			GUI.getUserButtonPressed(Player.getPlayerName(Turns1.getPlayerTurn()) + Language.getLang("TURN"), Language.getLang("TD"));
			Die.roll();
			
			GUI.setDice(Die.getDice1(),Die.getDice2());
			
			Player.setPlayerPosition(Turns1.getPlayerTurn(), Die.getDiceSum());

			GUI.setCar(Player.getPlayerPosition(Turns1.getPlayerTurn()), Player.getPlayerName(Turns1.getPlayerTurn()));
			
			//fjerner bilen fra sin tidligere plads (med mindre det er første tur)
			if (Turns1.getIndependentTurn() > 0){
				GUI.removeCar(Player.carDestroyer, Player.getPlayerName(Turns1.getPlayerTurn()));
			}
			
			Turns1.setTenPercent(Account.getPlayerStash(Turns1.getPlayerTurn()));
			Turns1.checkField(Turns1.getPlayerTurn(), Player.getPlayerPosition(Turns1.getPlayerTurn()));
			System.out.println(Player.getPlayerPosition(Turns1.getPlayerTurn()));
			int[] rentAndPlayer = Turns1.getRentAndPlayer();
			if (!(Turns1.getOwned())){
				if (Account.getPlayerStash(Turns1.getPlayerTurn()) >= rentAndPlayer[0] * -1) {
					boolean wantToBuy = GUI.getUserLeftButtonPressed("BUY", "JA", "NOPE");
					if (wantToBuy){
							Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0]);
							GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
							Turns1.shiftOwner(Turns1.getPlayerTurn());
					}
				}
			} else if (Turns1.getOwned()){
				System.out.println("F�r " + Account.getPlayerStash(rentAndPlayer[1]) + " " + Account.getPlayerStash(Turns1.getPlayerTurn()));
				Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0] * -1);
				Account.setPlayerStash(rentAndPlayer[1], rentAndPlayer[0]);
				GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
				GUI.setBalance(Player.getPlayerName(rentAndPlayer[1]), Account.getPlayerStash(rentAndPlayer[1]));
				System.out.println("Efter " + Account.getPlayerStash(rentAndPlayer[1])+ " " + Account.getPlayerStash(Turns1.getPlayerTurn()));
			}
		
		//placerer bilen på sin nye plads
		
//		System.out.println(Player.getNameOfPlayer(0));
	
		//fjerner bilen fra sin tidligere plads (med mindre det er første tur)
			if (Turns1.getIndependentTurn() > 0){
				GUI.removeCar(Player.carDestroyer, Player.getPlayerName(Turns1.getPlayerTurn()));
			}
			Turns1.scaleIndependentTurn();
			Turns1.endTurn();
		}
		GUI.getUserButtonPressed(Language.getLang("WIN"), Language.getLang("CL"));
		
		GUI.close();
		long gameTime2 = System.currentTimeMillis();
		double gameTime = (gameTime2-gameTime1/1000)/60;
		System.out.println("Game lasted: " + (int)gameTime + " minutes");
	}
}