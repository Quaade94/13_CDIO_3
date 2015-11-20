package Game;

public class Player {

	protected static int lenghtOfPlayerArray = 0;
	protected static int indexNumber = 0;
	
	protected static String[]	 Names 	= new String[lenghtOfPlayerArray];
	
	
	
	
//	This constructor uses 5000 as a starting capital for the player, but needs the accual staring capital.
	Account Account = new Account(5000);
	
	
	
	
	public void addPlayer(String NameOfPlayer){
		
		if (indexNumber <= 6){
			Player.addSpaceForPlayer();
			Player.addNameOfPlayerToArray(NameOfPlayer);
			Account.addPlayerAccount(indexNumber);
			Player.moveToNextIndex();
		}
		
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
		
		lenghtOfPlayerArray++;
		
	}
	private static void addNameOfPlayerToArray(String NameOfPlayer){
		
		Names[indexNumber] = NameOfPlayer;
		
	}
	private static void moveToNextIndex(){
		
		indexNumber++;
		
	}
	protected static boolean isValidID(int IDOfPlayer){
		
		boolean validity = false;
		
		if (IDOfPlayer < lenghtOfPlayerArray && IDOfPlayer >= 0){
			
			validity = true;
		}
		if (IDOfPlayer > lenghtOfPlayerArray || IDOfPlayer < 0){
			
			validity = false;
		}
		return validity;
	}

//	Additional, can be deleted when program is finished
	
	public void setIndexNumber(int NewIndexNumber){
		
		indexNumber = NewIndexNumber;
	}
	public void setLenghtOfArray(int NewLenghtOfArray){
		
		lenghtOfPlayerArray = NewLenghtOfArray;
	}
}
