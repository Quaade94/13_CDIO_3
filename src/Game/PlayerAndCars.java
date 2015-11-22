package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class PlayerAndCars {
	
	Account Account = new Account(5000);
	
	public void addPlayer1AndCar(){
		
		String player1Name = GUI.getUserString("Choose your name player 1");
		
		Car car1 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player1Name, 1000, car1);
		
		Account.addPlayerAndAccount(player1Name);
		
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
		
		Account.addPlayerAndAccount(player2Name);
		
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
		
		Account.addPlayerAndAccount(player3Name);
		
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
		
		Account.addPlayerAndAccount(player4Name);
		
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
		
		Account.addPlayerAndAccount(player5Name);
		
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
		
		Account.addPlayerAndAccount(player6Name);

	}	
}
