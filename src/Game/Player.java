package Game;

public class Player {

	protected  int lenghtOfPlayerArray = 6;
	protected  int indexNumber = 0;
	
	protected  String[]	 Names 	= new String[lenghtOfPlayerArray];
	
	
	
	
//	This constructor uses 5000 as a starting capital for the player, but needs the accual staring capital.

	
	

	
//	public String getPlayerName (int IDOfPlayer){
//		
//		String NameOfPlayer = null;
//	
//		if (Player.isValidID(IDOfPlayer)){
//			
//			NameOfPlayer = Names[IDOfPlayer];
//		}
//		if (!(Player.isValidID(IDOfPlayer))){
//			
//			NameOfPlayer = "A fault happend - See; Game -> Player -> getPlayerName";
//			System.out.println("A fault happend - See; Game -> Player -> getPlayerName");
//		}
//		
//		return NameOfPlayer;
//		
//	}
	

	protected void addNameOfPlayerToArray(String NameOfPlayer){
		
		System.out.println("addNameOfPlayerToArray " + NameOfPlayer);
		System.out.println("addNameOfPlayerToArray " + indexNumber);

		
		Names[indexNumber] = NameOfPlayer;
		
		System.out.println("addNameOfPlayerToArray " + Names[indexNumber]);
		
	}
	protected void moveToNextIndex(){
		
		indexNumber++;
		
	}
//	protected static boolean isValidID(int IDOfPlayer){
//		
//		boolean validity = false;
//		
//		if (IDOfPlayer < lenghtOfPlayerArray && IDOfPlayer >= 0){
//			
//			validity = true;
//		}
//		if (IDOfPlayer > lenghtOfPlayerArray || IDOfPlayer < 0){
//			
//			validity = false;
//		}
//		return validity;
//	}

//	Additional, can be deleted when program is finished
	
	public void setIndexNumber(int NewIndexNumber){
		
		indexNumber = NewIndexNumber;
	}
	public void setLenghtOfArray(int NewLenghtOfArray){
		
		lenghtOfPlayerArray = NewLenghtOfArray;
	}
//	public static int getPlayerAmount(){
//		
//		int playerAmount = lenghtOfPlayerArray;
//		System.out.println(playerAmount);
//		return playerAmount;
//		
//	}
}
