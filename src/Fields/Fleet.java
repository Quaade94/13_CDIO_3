package Fields;

public class Fleet extends Ownable{

	private int RENT_1 = 500;
	private int RENT_2 = 1000;
	private int RENT_3 = 1500;
	private int RENT_4 = 2000;
	
	private int rent;
	
	private boolean isOwned= false;
	
	private int[] isOwnedArray = {-1,-1,-1,-1};

	private int ReturnElement;
	
	@Override
	public void landOnField(int IDOfPlayer){
		
		if (Player.getPlayerPosition(IDOfPlayer) >= 17 || Player.getPlayerPosition(IDOfPlayer) <= 20){
			
			if (!(isFieldOwned(IDOfPlayer))){
				
				setOwner(IDOfPlayer);
			}
			if (isFieldOwned(IDOfPlayer)){
				
//				Mangler så man kan overføre penge
				
				isOwnedByWho(IDOfPlayer);
				
				switch (	occurences(0, isOwnedArray)){
				case 1: rent = RENT_1; break;
				case 2: rent = RENT_2; break;
				case 3: rent = RENT_3; break;
				case 4: rent = RENT_4; break;
				}					
			}
		}
	}
	
	@Override
	public int getRent() {

		return rent;
	}
	
	public boolean isFieldOwned(int IDOfPlayer){
		String[] fieldNames = GameBoard.getFieldNames();
		if (fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE1") {
			if (isOwnedArray[0] == -1) {
				isOwned = false;
			} else if (isOwnedArray[0] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE2") {
			if (isOwnedArray[1] == -1) {
				isOwned = false;
			} else if (isOwnedArray[1] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE3") {
			if (isOwnedArray[2] == -1) {
				isOwned = false;
			} else if (isOwnedArray[2] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE4") {
			if (isOwnedArray[3] == -1) {
				isOwned = false;
			} else if (isOwnedArray[3] >= 0) {
				isOwned = true;
			}
		}
		return isOwned;
	}
	
	private int occurences(int LookingFor, int[] Array){
		
		int i = 0;
		int Occurances = 0;
		
		while (i < Array.length){
			
			if (Array[i] == LookingFor){
				Occurances++;
				i++;
			} else i++;	
		}
	
		return Occurances;
	}
	
	public void setOwner(int IDOfPlayer){
		
		if (Player.getPlayerPosition(IDOfPlayer) >= 17 || Player.getPlayerPosition(IDOfPlayer) <= 20){

			if (!(isFieldOwned(IDOfPlayer))){
				
				isOwnedArray[Player.getPlayerPosition(IDOfPlayer) - 17] =  IDOfPlayer;
			}
			
			if ((isFieldOwned(IDOfPlayer))){
				
//				Her skal staa en PayRent Metod der traekker penge fra personens penge og saetter dem over paa den anden persons penge
			}		
		}
	}
	
	public int isOwnedByWho(int IDOfPlayer){
		
		// If this method returns -1, then it is not working properly
		
		ReturnElement = -1;
		
		if (Player.getPlayerPosition(IDOfPlayer) >= 17 || Player.getPlayerPosition(IDOfPlayer) <= 20){
	
			ReturnElement = isOwnedArray[Player.getPlayerPosition(IDOfPlayer) - 17];	
		}
		
		return ReturnElement;		
	}
}
