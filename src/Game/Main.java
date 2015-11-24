package Game;

import java.awt.Color;
import desktop_fields.Street;
import desktop_resources.GUI;
import desktop_codebehind.Car;

public class Main {

	public static void main(String[] args) {

		//Spilleplade (SKAL være først)
		GameBoard GameBoard = new GameBoard(21);
		GameBoard.setGameBoard();
		
		Die Die = new Die();

		PlayerAndCars PlayerAndCars = new PlayerAndCars((GUI.getUserInteger(Language.getLang("PLAYERNO"), 2, 6)));
		PlayerAndCars.addPlayers();
		
		//Start knappen
		GUI.getUserButtonPressed(Language.getLang("RDY"), Language.getLang("SRT"));
		
		//player1 kaster med terningen
		GUI.getUserButtonPressed(Language.getLang("TURN"), Language.getLang("TD"));
		Die.roll();
		GUI.setDice(Die.getDice1(),Die.getDice2());
		
		//GUI.close();

	}
}