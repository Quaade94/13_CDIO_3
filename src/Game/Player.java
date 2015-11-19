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
		
		
		
		
		
		
		
		return null;
		
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

	
	
	
	
	
	
}
