package Game;

import desktop_resources.GUI;

public class Main {

	public static void main(String[] args) {

		//Spilleplade (SKAL være først)
		GameBoard GameBoard = new GameBoard(21);
		GameBoard.setGameBoard();
		
		Die Die = new Die();
		PlayerPosition PlayerPosition = new PlayerPosition();
		Account Account = new Account(30000);
		
		VehicleBuilder VehicleBuilder = new VehicleBuilder((GUI.getUserInteger(Language.getLang("PLAYERNO"), 2, 6)));
		PlayerTurnSwitcher Turns1 = new PlayerTurnSwitcher();
		Turns1.setPlayerSize(VehicleBuilder.getNumberOfPlayers());
		VehicleBuilder.addPlayers();
		
		//Start knappen
		GUI.getUserButtonPressed(Language.getLang("RDY"), Language.getLang("SRT"));
			
		//DETTE SKAL SLETTES
		int antalspillere = VehicleBuilder.getNumberOfPlayers();
		
		//player kaster med terningen og flytter brikken
		
		while(antalspillere>1){
			
			GUI.getUserButtonPressed(VehicleBuilder.getPlayerName(Turns1.getPlayerTurn()) + Language.getLang("TURN"), Language.getLang("TD"));
			Die.roll();
			GUI.setDice(Die.getDice1(),Die.getDice2());
			
			PlayerPosition.setPlayerPosition(Turns1.getPlayerTurn(), Die.getDiceSum());
			GUI.setCar(PlayerPosition.getPlayerPosition(Turns1.getPlayerTurn()), VehicleBuilder.getPlayerName(Turns1.getPlayerTurn()));
		
		
		//placerer bilen på sin nye plads
		
//		System.out.println(Player.getNameOfPlayer(0));
		
	
		//fjerner bilen fra sin tidligere plads (med mindre det er første tur)
		if (Turns1.getIndependentTurn() > 0){
		GUI.removeCar(PlayerPosition.carDestroyer, VehicleBuilder.getPlayerName(Turns1.getPlayerTurn()));
		}
		Turns1.scaleIndependentTurn();
		Turns1.endTurn();
		}
		
		GUI.getUserButtonPressed(Language.getLang("WIN"), Language.getLang("CL"));
		GUI.close();

	}
}