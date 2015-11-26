package Game;

import desktop_resources.GUI;

public class Main {

	public static void main(String[] args) {

		//Spilleplade (SKAL være først)
		GameBoard GameBoard = new GameBoard(21);
		GameBoard.setGameBoard();
		
		Die Die = new Die();
		Player Player = new Player((GUI.getUserInteger(Language.getLang("PLAYERNO"), 2, 6)));
		Account Account = new Account();

		PlayerTurnSwitcher Turns1 = new PlayerTurnSwitcher();
		Turns1.setPlayerSize(Player.getNumberOfPlayers());
		Player.addPlayers();
		Account.addAccounts(Player.getNumberOfPlayers());
		
		//Start knappen
		GUI.getUserButtonPressed(Language.getLang("RDY"), Language.getLang("SRT"));
			
		//DETTE SKAL SLETTES
		int antalspillere = Player.getNumberOfPlayers();
		
		//player kaster med terningen og flytter brikken
		
		while(antalspillere>1){
			
			GUI.getUserButtonPressed(Player.getPlayerName(Turns1.getPlayerTurn()) + Language.getLang("TURN"), Language.getLang("TD"));
			Die.roll();
			GUI.setDice(Die.getDice1(),Die.getDice2());
			Account.setPlayerStash(0, 300);
			System.out.println(Account.getPlayerStash(0));
			Player.setPlayerPosition(Turns1.getPlayerTurn(), Die.getDiceSum());
			GUI.setCar(Player.getPlayerPosition(Turns1.getPlayerTurn()), Player.getPlayerName(Turns1.getPlayerTurn()));
		
		
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

	}
}