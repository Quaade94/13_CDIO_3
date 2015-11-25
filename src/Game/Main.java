package Game;

import java.awt.Color;
import desktop_fields.Street;
import desktop_resources.GUI;
import desktop_codebehind.Car;

public class Main {

	private int index;
	
	public static void main(String[] args) {

		//Spilleplade (SKAL være først)
		GameBoard GameBoard = new GameBoard(21);
		GameBoard.setGameBoard();
		
		Die Die = new Die();
		PlayerPosition PlayerPosition = new PlayerPosition();
		Account Account = new Account(30000);
		
		VehicleBuilder VehicleBuilder = new VehicleBuilder((GUI.getUserInteger(Language.getLang("PLAYERNO"), 2, 6)));
		VehicleBuilder.addPlayers();
		
		//Start knappen
		GUI.getUserButtonPressed(Language.getLang("RDY"), Language.getLang("SRT"));
		
		
		
		
		
		//DETTE SKAL SLETTES
		int antalspillere = 2;
		
		//player kaster med terningen og flytter brikken
		//Der mangler at blive kaldt et navn og spillerens egen position
		int turn = 0;
		
		while(antalspillere>1){
			
		GUI.getUserButtonPressed(VehicleBuilder.getPlayerName(0) + Language.getLang("TURN"), Language.getLang("TD"));
		Die.roll();
		GUI.setDice(Die.getDice1(),Die.getDice2());
		PlayerPosition.setPlayerPosition(0, Die.getDiceSum());
		//placerer bilen på sin nye plads
		
//		System.out.println(Player.getNameOfPlayer(0));
		

		
		//fjerner bilen fra sin tidligere plads (med mindre det er første tur)
		if (turn>0){
		GUI.removeCar(PlayerPosition.getPlayerPosition(0)-Die.getDiceSum(), VehicleBuilder.getPlayerName(0));
		}
		turn++;
		}
		
		GUI.getUserButtonPressed(Language.getLang("WIN"), Language.getLang("CL"));
		GUI.close();

	}
}