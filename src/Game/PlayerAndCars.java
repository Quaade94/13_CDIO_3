package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class PlayerAndCars {
	
	public void addPlayer1AndCar(){
		
		String player1Name = GUI.getUserString("Choose your name player 1");
		
		Car car1 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player1Name, 1000, car1);
		
	}
	public void addPlayer2AndCar(){
		
		String player2Name = GUI.getUserString("Choose your name player 2");
		
		Car car2 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player2Name, 1000, car2);
		
	}
	public void addPlayer3AndCar(){
		
		String player3Name = GUI.getUserString("Choose your name player 3");
		
		Car car3 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player3Name, 1000, car3);
		
	}
	public void addPlayer4AndCar(){
		
		String player4Name = GUI.getUserString("Choose your name player 4");
		
		Car car4 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player4Name, 1000, car4);
		
	}
	public void addPlayer5AndCar(){
		
		String player5Name = GUI.getUserString("Choose your name player 5");
		
		Car car5 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player5Name, 1000, car5);
		
	}
	public void addPlayer6AndCar(){
		
		String player6Name = GUI.getUserString("Choose your name player 6");
		
		Car car6 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player6Name, 1000, car6);
		
	}	
}
