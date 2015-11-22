package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;


public class Main {
	
	
	public static void main(String[] args) {
		
		Die Roll = new Die();
		int[] roll = Roll.roll();
		GameBoard Board = new GameBoard();
//		Player player = new Player();	
//		int playerAmount = Player.getPlayerAmount();
		
		
		//Spilleplade (SKAL vÃ¦re fÃ¸rst)
		new Fields();
		
		
		
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
				
		
			
//		Starten på et player check loop - der skal tjekke hvor mange spillere der skal være med. Laver det færdigt i morgen - Lukas22/11-2015
		boolean newPlayer = GUI.getUserLeftButtonPressed("Er der flere spillere med?", "ja", "nej");
		int i = 2;
		if (newPlayer && i<=6){
			String player3Name = GUI.getUserString("Choose your name player 3");
			Car car3 = new Car.Builder().typeCar().patternHorizontalDualColor().primaryColor(Color.RED).secondaryColor(Color.BLUE).build();
			GUI.addPlayer(player3Name, 3000, car3);
			i++;
		}
		else if (!newPlayer){
			System.out.println("Let the games. Begin.");
			
		}
		
		
		
		//		if(playerAmount == 2){
//			//input name here
//			GUI.addPlayer("Name1", 1000, car1);
//			//input name here
//			GUI.addPlayer("Name2", 1000, car2);
//		}
//		else if(playerAmount == 3){
//			//input name here
//			GUI.addPlayer("Name3", 1000, car3);
//		}
//		else if(playerAmount == 4){
//			//input name here
//			GUI.addPlayer("Name4", 1000, car4);
//		}
//		else if(playerAmount == 5){
//			//input name here
//			GUI.addPlayer("Name5", 1000, car5);
//		}
//		else if(playerAmount == 6){
//			//input name here
//			GUI.addPlayer("Name6", 1000, car6);
//		}
//		else{
//			System.out.println("Fejl! For mange/fÃ¥ spillere!");
//		}
		
		
		
		//DETTE AFSNIT ER EN TEST
		System.out.println("Rolled: "+roll[2]);
		System.out.println(Board.getFieldRent(1));
		System.out.println(Board.getFieldName(1));
		System.out.println("Price: "+Board.getFieldPrice(1));
		
				
				
//		GUI.getUserButtonPressed("Press me", "ENTER");
//		GUI.close();

	}

		

	
}
