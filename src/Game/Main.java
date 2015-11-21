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
		
		
		//Spilleplade (SKAL være først)
		new Fields();
	

//		Laver spilernes biler
		
		Car car1 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car2 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car3 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car4 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car5 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car6 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		
	
		
		
//		Tilføjer spillere til spillepladen
		
		//Denne er der kun så GUI kan åbne
		GUI.addPlayer("Name1", 1000, car1);
		
		
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
//			System.out.println("Fejl! For mange/få spillere!");
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
