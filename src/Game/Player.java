package Game;

public class Player {

	protected  int lenghtOfPlayerArray = 6;
	protected  int indexNumber = 0;
	
	protected  String[]	 Names 	= new String[lenghtOfPlayerArray];
	
	
	
	
//	This constructor uses 5000 as a starting capital for the player, but needs the accual staring capital.

	
	public String getNameOfPlayer(int IDOfPlayer){
				
		return Names[IDOfPlayer];
		
	}

	protected void addNameOfPlayerToArray(String NameOfPlayer){
		
		Names[indexNumber] = NameOfPlayer;
			
	}
	protected void moveToNextIndex(){
		
		indexNumber++;
		
	}
	
	public void setIndexNumber(int NewIndexNumber){
		
		indexNumber = NewIndexNumber;
	}
	public void setLenghtOfArray(int NewLenghtOfArray){
		
		lenghtOfPlayerArray = NewLenghtOfArray;
	}

}
