package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;
import Game.VehicleBuilder;

public class Player{

	Die Die = new Die();
	
	private String player1Name;
	private String player2Name;
	private String player3Name;
	private String player4Name;
	private String player5Name;
	private String player6Name;
	private int numOfPlayers;
	String[] playerNameArray;
	
	public void PlayerConstructor(int numOfPlayersConstructor){
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
		case 1: 		this.addPlayer1(); break;
		case 2: 		this.addPlayer2(); break;
		case 3: 		this.addPlayer3(); break;
		case 4: 		this.addPlayer4(); break;
		case 5: 		this.addPlayer5(); break;
		case 6: 		this.addPlayer6(); break;
		}
	}
	

	
	private void addPlayer1(){
		
		player1Name = GUI.getUserString("Choose your name player 1");	
		Car car1 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.CYAN)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player1Name, 1000, car1);
	
		playerNameArray[0] = player1Name;
	}
	
	private void addPlayer2(){
		
		player2Name = GUI.getUserString("Choose your name player 2");
		Car car2 = new Car.Builder()
				.typeRacecar()
				.patternHorizontalDualColor()
				.primaryColor(Color.WHITE)
				.secondaryColor(Color.BLACK)
				.build();
		GUI.addPlayer(player2Name, 1000, car2);
	
		playerNameArray[1] = player2Name;
	}
	
	private void addPlayer3(){
		
		player3Name = GUI.getUserString("Choose your name player 3");		
		Car car3 = new Car.Builder()
				.typeTractor()
				.patternHorizontalDualColor()
				.primaryColor(Color.PINK)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player3Name, 1000, car3);
	
		playerNameArray[2] = player3Name;
	}
	
	private void addPlayer4(){		
		player4Name = GUI.getUserString("Choose your name player 4");		
		Car car4 = new Car.Builder()
				.typeUfo()
				.patternHorizontalDualColor()
				.primaryColor(Color.GREEN)
				.secondaryColor(Color.GREEN)
				.build();
		GUI.addPlayer(player4Name, 1000, car4);
	
		playerNameArray[3] = player4Name;
	}
	
	private void addPlayer5(){
		
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
	
	private void addPlayer6(){
		
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

	
	private int player1Position = 0;
	private int player2Position = 0;
	private int player3Position = 0;
	private int player4Position = 0;
	private int player5Position = 0;
	private int player6Position = 0;
	
	private int fakePos = 0;
	
	public int carDestroyer = 0;
	
	int[] playerPosition = {player1Position,player2Position,player3Position,player4Position,player5Position,player6Position,};

	public int getPlayerPosition(int IDOfPlayer){		
		return playerPosition[IDOfPlayer];
	}

	public void setPlayerPosition(int IDOfPlayer, int DiceSum){
		
		playerPosition[IDOfPlayer] = (playerPosition[IDOfPlayer] + DiceSum);
		
		/**
		 * For removing the car from the last known position
		 **/
		carDestroyer = playerPosition[IDOfPlayer]-DiceSum;
		
		/**
		 * Makes the player go back to the start if he reaches the end of the GameBoard
		 **/
		if(playerPosition[IDOfPlayer]>21){
			fakePos = playerPosition[IDOfPlayer];
			fakePos = fakePos - 21;
			playerPosition[IDOfPlayer] = fakePos;
			}		
	}	
}