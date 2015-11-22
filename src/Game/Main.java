package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;


public class Main {
	
	public static void main(String[] args) {
		
		//Spilleplade (SKAL være først)
		//GameBoard GameBoard = new GameBoard();
		
		// Opretter en spiller ved at de indtaster deres navn
		String player1Name = GUI.getUserString("Choose your name player 1");
		//Laver spilernes biler
		Car car1 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player1Name, 1000, car1);
		
				
		
		//opretter spiller 2
		String player2Name = GUI.getUserString("Choose your name player 2");
		Car car2 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player2Name, 1000, car2);
				
		
			
//		Starten p� et player check loop - der skal tjekke hvor mange spillere der skal v�re med. Laver det f�rdigt i morgen - Lukas22/11-2015
		boolean newPlayer = GUI.getUserLeftButtonPressed("Er der flere spillere med?", "ja", "nej");
		int i = 2;
		if (newPlayer && i<=6){
			String player3Name = GUI.getUserString("Choose your name player 3");
			Car car3 = new Car.Builder()
					.typeCar().patternHorizontalDualColor()
					.primaryColor(Color.RED)
					.secondaryColor(Color.BLUE)
					.build();
			GUI.addPlayer(player3Name, 3000, car3);
			i++;
		}
		else if (!newPlayer){
			System.out.println("Let the games. Begin.");
			
		}
	
//		GUI.close();

	}
}
