package Game;

public class Player {

	private static int lenghtOfArray = 0;
	private static int indexNumber = 0;
	
	private static String[]	 Names 	= new String[lenghtOfArray];
	
	public void addPlayer(String NameOfPlayer){
		
		Player.addSpaceForPlayer();
		Player.addNameOfPlayerToArray(NameOfPlayer);
		Player.moveToNextIndex();
		
		if (indexNumber > 6){
			System.out.println("You should not be able to add more than 6 players - See; Game -> Player");
		}
		
	}
	
	public String getPlayerName (int IDOfPlayer){
		
		String NameOfPlayer = null;
	
		if (Player.isValidID(IDOfPlayer)){
			
			NameOfPlayer = Names[IDOfPlayer];
		}
		if (!(Player.isValidID(IDOfPlayer))){
			
			NameOfPlayer = "A fault happend - See; Game -> Player -> getPlayerName";
			System.out.println("A fault happend - See; Game -> Player -> getPlayerName");
		}
		
		return NameOfPlayer;
		
	}
	
	private static void addSpaceForPlayer(){
		
		lenghtOfArray++;
		
	}
	private static void addNameOfPlayerToArray(String NameOfPlayer){
		
		Names[indexNumber] = NameOfPlayer;
		
	}
	private static void moveToNextIndex(){
		
		indexNumber++;
		
	}
	private static boolean isValidID(int IDOfPlayer){
		
		boolean validity = false;
		
		if (IDOfPlayer < 6 && IDOfPlayer >= 0){
			
			validity = true;
		}
		if (IDOfPlayer > 6 || IDOfPlayer < 0){
			
			validity = false;
		}
		return validity;
	}

//	Additional, can be deleted when program is finished
	
	public void setIndexNumber(int NewIndexNumber){
		
		indexNumber = NewIndexNumber;
	}
	public void setLenghtOfArray(int NewLenghtOfArray){
		
		lenghtOfArray = NewLenghtOfArray;
	}
}
