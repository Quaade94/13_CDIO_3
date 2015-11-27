package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class Player{
	
	private String player1Name;
	private String player2Name;
	private String player3Name;
	private String player4Name;
	private String player5Name;
	private String player6Name;
	private int numOfPlayers;
	String[] playerNameArray;
	
	// This constructor will get the amount of players (2-6) and save them in an array. 
	public Player(int numOfPlayersConstructor){
		numOfPlayers = numOfPlayersConstructor;
		playerNameArray = new String[numOfPlayers];
	}
	
	// This adds the players based on how many the user entered.
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
	
	// Depending on how many players entered, this creates their car, their GUI spot and adds their name to the name array
	private void addPlayer1(){		
		player1Name = GUI.getUserString("Choose your name player 1");
		playerNameArray[0] = player1Name;
		Car car1 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.CYAN)
				.secondaryColor(Color.BLUE)
				.build();
		GUI.addPlayer(player1Name, 30000, car1);
	}
	
	private void addPlayer2(){		
		player2Name = GUI.getUserString("Choose your name player 2");	
		while(player2Name.equals(player1Name)){
			player2Name = GUI.getUserString(Language.getLang("NAMEERROR"));
		}
		playerNameArray[1] = player2Name;
		Car car2 = new Car.Builder()
				.typeRacecar()
				.patternHorizontalDualColor()
				.primaryColor(Color.WHITE)
				.secondaryColor(Color.BLACK)
				.build();
		GUI.addPlayer(player2Name, 30000, car2);
	}
	
	private void addPlayer3(){
		
		player3Name = GUI.getUserString("Choose your name player 3");
		
		while(player3Name.equals(player2Name)||player3Name.equals(player1Name)){
			player3Name = GUI.getUserString(Language.getLang("NAMEERROR"));
		}
		playerNameArray[2] = player3Name;
		Car car3 = new Car.Builder()
				.typeTractor()
				.patternHorizontalDualColor()
				.primaryColor(Color.PINK)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player3Name, 30000, car3);
	}
	
	private void addPlayer4(){		
		player4Name = GUI.getUserString("Choose your name player 4");
		
		while(player4Name.equals(player3Name)||player4Name.equals(player2Name)||player4Name.equals(player1Name)){
			player4Name = GUI.getUserString(Language.getLang("NAMEERROR"));
		}
		playerNameArray[3] = player4Name;
		Car car4 = new Car.Builder()
				.typeUfo()
				.patternHorizontalDualColor()
				.primaryColor(Color.GREEN)
				.secondaryColor(Color.GREEN)
				.build();
		GUI.addPlayer(player4Name, 30000, car4);	
	}
	
	private void addPlayer5(){
		player5Name = GUI.getUserString("Choose your name player 5");
		
		while(player5Name.equals(player4Name)||player5Name.equals(player3Name)||player5Name.equals(player2Name)||player5Name.equals(player1Name)){
			player5Name = GUI.getUserString(Language.getLang("NAMEERROR"));
		}
		playerNameArray[4] = player5Name;
		Car car5 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.PINK)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player5Name, 30000, car5);
	}
	
	private void addPlayer6(){		
		player6Name = GUI.getUserString("Choose your name player 6");
		
		while(player6Name.equals(player5Name)||player6Name.equals(player4Name)||player6Name.equals(player3Name)||player6Name.equals(player2Name)||player6Name.equals(player1Name)){
			player6Name = GUI.getUserString(Language.getLang("NAMEERROR"));
		}
		playerNameArray[5] = player6Name;
		Car car6 = new Car.Builder()
				.typeRacecar()
				.patternHorizontalDualColor()
				.primaryColor(Color.YELLOW)
				.secondaryColor(Color.RED)
				.build();
		GUI.addPlayer(player6Name, 30000, car6);
	}	
	
	/**
	 * A method made so the playername can be called 
	 * @param IDOfPlayer The ID of the player you want the name of
	 * @return Player Name
	 */
	public String getPlayerName(int IDOfPlayer){	
		return playerNameArray[IDOfPlayer];	
	}	
	
	/**
	 *  @return int number of players
	 */
	public int getNumberOfPlayers(){
		return playerNameArray.length;
	}
	public String[] getPlayerArray(){
		return playerNameArray;
	}

//---------------------------------------------------------------------------------------------------------------------------------------
	Die Die = new Die();
	
	public Player(){
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

	/**
	 * Gets  the players position
	 * @param IDOfPlayer The player ID
	 * @return The players position
	 */
	public int getPlayerPosition(int IDOfPlayer){		
		return playerPosition[IDOfPlayer];
	}

	/**
	 * Sets the players position according to the sum of the two dices
	 * @param IDOfPlayer The player 
	 * @param DiceSum
	 */
	public void setPlayerPosition(int IDOfPlayer, int DiceSum){
		
		playerPosition[IDOfPlayer] = (playerPosition[IDOfPlayer] + DiceSum);
		
		// Saves the players car position to remove it from the board
		carDestroyer = playerPosition[IDOfPlayer]-DiceSum;
		
		// Makes the player go around
		if(playerPosition[IDOfPlayer]>21){
			fakePos = playerPosition[IDOfPlayer];
			fakePos = fakePos - 21;
			playerPosition[IDOfPlayer] = fakePos;
			}		
	}	
}