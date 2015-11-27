package Fields;

import java.util.Arrays;

public class Fleet extends Ownable{

	private int RENT_1 = 500;
	private int RENT_2 = 1000;
	private int RENT_3 = 1500;
	private int RENT_4 = 2000;
	private int whoOwns;
	private int rent;
	private int playerPosition;
	private int price;
	private int fieldNumber;
	
	private int[] fleArray = {-1,-1,-1,-1};

	private int ReturnElement;
	
	@Override
	public void landOnField(int IDOfPlayer){
		price = 4000;

		switch (occurences(whoOwns, fleArray)){
		case 1: rent = RENT_1; break;
		case 2: rent = RENT_2; break;
		case 3: rent = RENT_3; break;
		case 4: rent = RENT_4; break;
		}					
	}
	
	public int getPlayer(){
		return whoOwns;
	}
	@Override
	public int getRent() {

		return rent;
	}
	public int getPrice(){
		return price;
	}
	public void setNewOwner(int IDOfPlayer){
		fleArray[fieldNumber] = IDOfPlayer;
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
	public void setPlayerPositionTer(int playerPositionMethod) {
		playerPosition = playerPositionMethod;
	}
	public boolean isOwned(int IDOfPlayer){
		boolean isOwned = isFleOwned(IDOfPlayer, playerPosition);
		return isOwned;
	}
	public boolean isFleOwned(int IDOfPlayer, int playerPosition){
		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		
		if (fieldNames[playerPosition] == "TER1") {
			fieldNumber = 0;
			if (fleArray[0] == -1) {
				isOwned = false;
			} else if (fleArray[0] >= 0) {
				isOwned = true;
				whoOwns = fleArray[0];
			}
		} else if(fieldNames[playerPosition] == "TER2") {
			fieldNumber = 1;
			if (fleArray[1] == -1) {
				isOwned = false;
			} else if (fleArray[1] >= 0) {
				isOwned = true;
				whoOwns = fleArray[1];
			}
		} else if(fieldNames[playerPosition] == "TER3") {
			fieldNumber = 2;
			if (fleArray[2] == -1) {
				isOwned = false;
			} else if (fleArray[2] >= 0) {
				isOwned = true;
				whoOwns = fleArray[2];
			}
		} else if(fieldNames[playerPosition] == "TER4") {
			fieldNumber = 3;
			if (fleArray[3] == -1) {
				isOwned = false;
			} else if (fleArray[3] >= 0) {
				isOwned = true;
				whoOwns = fleArray[3];
			}
		}
		return isOwned;
	}	
}
