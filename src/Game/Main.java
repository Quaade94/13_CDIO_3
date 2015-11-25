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
		int[] pposition = PlayerPosition.playerPosittion();

		PlayerAndCars PlayerAndCars = new PlayerAndCars((GUI.getUserInteger(Language.getLang("PLAYERNO"), 2, 6)));
		PlayerAndCars.addPlayers();
		
		//Start knappen
		GUI.getUserButtonPressed(Language.getLang("RDY"), Language.getLang("SRT"));
		
		
		//DETTE SKAL SLETTES
		int antalspillere = 2;
		
		//player kaster med terningen og flytter brikken
		//Der mangler at blive kaldt et navn og spillerens egen position
		int turn = 0;
		
		while(antalspillere>1){
			
		GUI.getUserButtonPressed(Language.getLang("TURN"), Language.getLang("TD"));
		Die.roll();
		GUI.setDice(Die.getDice1(),Die.getDice2());
		pposition[1] = pposition[1] + Die.getDiceSum();
		//placerer bilen på sin nye plads
		GUI.setCar(pposition[1], "Test");
		//fjerner bilen fra sin tidligere plads (med mindre det er første tur)
		if (turn>0){
		GUI.removeCar(pposition[1] - Die.getDiceSum(), "Test");
		}
		turn++;
		}
		
		GUI.getUserButtonPressed(Language.getLang("WIN"), Language.getLang("CL"));
		GUI.close();

	}
}