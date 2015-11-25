package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class PlayerAndCars {
	
	Account Account = new Account(30000);
	
	private int numOfPlayers;
	
	public PlayerAndCars(int numOfPlayersConstructor) {

		numOfPlayers = numOfPlayersConstructor;

	}
	
	public void addPlayers(){
		
		int i;
		
		for (i=1; i <= numOfPlayers; i++) {
			
			this.addPlayerSwitch(i);
			
		}	
	}
	
	private void addPlayerSwitch(int PlayerNumber){
		
		switch (PlayerNumber){
		case 1: 		this.addPlayer1AndCar(); break;
		case 2: 		this.addPlayer2AndCar(); break;
		case 3: 		this.addPlayer3AndCar(); break;
		case 4: 		this.addPlayer4AndCar(); break;
		case 5: 		this.addPlayer5AndCar(); break;
		case 6: 		this.addPlayer6AndCar(); break;
		}
	}
	
	private void addPlayer1AndCar(){
		
		String player1Name = GUI.getUserString("Choose your name player 1");
		Account.addPlayerAndAccount(player1Name);
		
		Car car1 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.CYAN)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player1Name, Account.getPlayerStash(0), car1);
	
	}
	private void addPlayer2AndCar(){
		
		String player2Name = GUI.getUserString("Choose your name player 2");
		Account.addPlayerAndAccount(player2Name);
		
		Car car2 = new Car.Builder()
				.typeRacecar()
				.patternHorizontalDualColor()
				.primaryColor(Color.WHITE)
				.secondaryColor(Color.BLACK)
				.build();
		GUI.addPlayer(player2Name, Account.getPlayerStash(1), car2);
	
	}
	private void addPlayer3AndCar(){
		
		String player3Name = GUI.getUserString("Choose your name player 3");
		Account.addPlayerAndAccount(player3Name);
		
		Car car3 = new Car.Builder()
				.typeTractor()
				.patternHorizontalDualColor()
				.primaryColor(Color.PINK)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player3Name, Account.getPlayerStash(2), car3);
	
	}
	private void addPlayer4AndCar(){
		
		String player4Name = GUI.getUserString("Choose your name player 4");
		Account.addPlayerAndAccount(player4Name);
		
		Car car4 = new Car.Builder()
				.typeUfo()
				.patternHorizontalDualColor()
				.primaryColor(Color.GREEN)
				.secondaryColor(Color.GREEN)
				.build();
		GUI.addPlayer(player4Name, Account.getPlayerStash(3), car4);
	
	}
	private void addPlayer5AndCar(){
		
		String player5Name = GUI.getUserString("Choose your name player 5");
		Account.addPlayerAndAccount(player5Name);
		
		Car car5 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.PINK)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player5Name, Account.getPlayerStash(4), car5);

	}
	private void addPlayer6AndCar(){
		
		String player6Name = GUI.getUserString("Choose your name player 6");
		Account.addPlayerAndAccount(player6Name);
		
		Car car6 = new Car.Builder()
				.typeRacecar()
				.patternHorizontalDualColor()
				.primaryColor(Color.YELLOW)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player6Name, Account.getPlayerStash(5), car6);
		
	}	
}
