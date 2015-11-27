package Game;

public class KlasseTilDestruktion {
	
//	Denne klasse indeholder nogle metoder der skal implementeres i PlayerTurnSwitcher
//	Har skrevet nogle beskrivelser af hvad der skal ske i den første metode
	
	
	public void theGame(int[] ArrayOfPlayers, int IDOfPlayer){
		
		if (shouldThisPlayerHaveItsTurn(IDOfPlayer, ArrayOfPlayers)){
			
			// The Player will have its trun
			
			if (numberOfBankrupts(ArrayOfPlayers) == (Player.getNumberOfPlayers()) - 1){
				
				// There is only one player remaining that has money left
				
				System.out.println("The Winner is ID: " + whoHasWon(ArrayOfPlayers));
				
			}
			else {
				
				//// Roll The Dices
				//// Display Dices
				
				//// Remove the Car
				//// Place Car on new field
				
				//// Run commands to buy the field ////
				
				break;	
			}
			break;
		}
		break;
	}
	
	
	/**
	 * This method can determin the amount of occurrence of numbers smaller than a number you diside, in an array of your choice 
	 * 
	 * @param LookingForLessThan: The number that want to look for the amount of occurrence smaller than this number
	 * @param ArrayOfPlayers The Array of int's that you want to look for the number in
	 * @return Returns the number of occurrence that was in the array
	 */
	private int numberOfBankrupts(int[] ArrayOfPlayers){
			int i = 0;
			int occurrence = 0;
			while (i <= ArrayOfPlayers.length)
			if (ArrayOfPlayers[i] < 0){
				i++;
				occurrence++;
			} else i++;
			return occurrence;
	}
	
	/**
	 * This method will look in the players account, and determin if the player shuld have its turn. So, if the balance is smaller than 0, the method will return false signifying
	 * that the player shuld not have it's turn. And returns true, if there is a balance equal or bigger than 0, therefor the player should be allowed to roll the dice again
	 * 
	 * @param IDOfPlayer The ID of the player you wnat to test, if it should have it's turn
	 * @param ArrayOfPlayers The array of predefined players
	 * @return Returns true if the player should have its turn, and false if not
	 */
	private boolean shouldThisPlayerHaveItsTurn(int IDOfPlayer, int[] ArrayOfPlayers){
		boolean R = true;
		if (ArrayOfPlayers[IDOfPlayer] < 0){
			R = false;
		}
		return R;
	}

	/**
	 * This method will look in an array, and determin at what FIRST position in the array there is a value bigger than 0.
	 * It is required that that there is only one value in the array that is bigger than 0, therefor it needs a method that cheks for this
	 * ie. numberOfBankrupts
	 * @param ArrayOfPlayers The Array that the method will look in
	 * @return Returns the fist position in the array where the value is bigger than 0
	 */
	
	private int whoHasWon(int[] ArrayOfPlayers){
		int i = 0;
		int R = 0;
		while (i < ArrayOfPlayers.length){
			if (ArrayOfPlayers[i] > 0){
					R = i;
			} else i++;
		}
		return R;
	}
}
