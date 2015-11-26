package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class VehicleBuilder {
	
//	Account Account = new Account(30000);
	private String player1Name;
	private String player2Name;
	private String player3Name;
	private String player4Name;
	private String player5Name;
	private String player6Name;
	private int numOfPlayers;
	String[] playerNameArray;
	
	public VehicleBuilder(int numOfPlayersConstructor) {
		numOfPlayers = numOfPlayersConstructor;
		playerNameArray = new String[numOfPlayers];
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
		
		player1Name = GUI.getUserString("Choose your name player 1");
//		Account.addPlayerAndAccount(player1Name);
		
		Car car1 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.CYAN)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player1Name, 1000, car1);
	
		playerNameArray[0] = player1Name;
	}
	
	private void addPlayer2AndCar(){
		
		player2Name = GUI.getUserString("Choose your name player 2");
//		Account.addPlayerAndAccount(player2Name);
		
		Car car2 = new Car.Builder()
				.typeRacecar()
				.patternHorizontalDualColor()
				.primaryColor(Color.WHITE)
				.secondaryColor(Color.BLACK)
				.build();
		GUI.addPlayer(player2Name, 1000, car2);
	
		playerNameArray[1] = player2Name;
	}
	
	private void addPlayer3AndCar(){
		
		player3Name = GUI.getUserString("Choose your name player 3");
//		Account.addPlayerAndAccount(player3Name);
		
		Car car3 = new Car.Builder()
				.typeTractor()
				.patternHorizontalDualColor()
				.primaryColor(Color.PINK)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player3Name, 1000, car3);
	
		playerNameArray[2] = player3Name;
	}
	
	private void addPlayer4AndCar(){
		
		player4Name = GUI.getUserString("Choose your name player 4");
//		Account.addPlayerAndAccount(player4Name);
		
		Car car4 = new Car.Builder()
				.typeUfo()
				.patternHorizontalDualColor()
				.primaryColor(Color.GREEN)
				.secondaryColor(Color.GREEN)
				.build();
		GUI.addPlayer(player4Name, 1000, car4);
	
		playerNameArray[3] = player4Name;
	}
	
	private void addPlayer5AndCar(){
		
		player5Name = GUI.getUserString("Choose your name player 5");
//		Account.addPlayerAndAccount(player5Name);
		
		Car car5 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.PINK)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player5Name, 1000, car5);

		playerNameArray[4] = player5Name;
	}
	
	private void addPlayer6AndCar(){
		
		player6Name = GUI.getUserString("Choose your name player 6");
//		Account.addPlayerAndAccount(player6Name);
		
		Car car6 = new Car.Builder()
				.typeRacecar()
				.patternHorizontalDualColor()
				.primaryColor(Color.YELLOW)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player6Name, 1000, car6);
		
		//		GUI.addPlayer(player6Name, Account.getPlayerStash(5), car6);

		playerNameArray[5] = player6Name;
	}	
	
	public String getPlayerName(int IDOfPlayer){
	
		return playerNameArray[IDOfPlayer];	
	}	
	
	public int getNumberOfPlayers(){
		return playerNameArray.length;
	}
}
