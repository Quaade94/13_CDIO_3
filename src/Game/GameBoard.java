package Game;

public class GameBoard {
	
	Die Roll = new Die();
	int[] roll = Roll.roll();
	
	private String[] fieldName = {"Tribe Encampment","Crater","Mountain","Cold Desert","Black Cave","The Werewall","Mountain Village","South Citadel","Palace Gates","Tower","Castle","Walled City","Monastery","Huts in the Mountain","The Pit","Goldmine","Caravan","Second Sail","Sea Grover", "The Buccaneers", "Privateer armade"};
	private int[] fieldRent = {100,300,500,700,1000,1300,1600,2000,2600,3200,4000,5000,500,(100*roll[2]),(100*roll[2]),2000,4000,500,500,500,500};
	private int[] fieldPrice = {};
	
public int getFieldRent(int playerField) {
		
		return fieldRent[playerField-1];
	}

public int getFieldPrice(int playerField) {
	
	return fieldPrice[playerField-1];
}

	public String getFieldName(int playerField) {

		return fieldName[playerField-1];
	}
	
}
