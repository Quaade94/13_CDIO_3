package Game;

public class GameBoard {
	
	Die Roll = new Die();
	int[] roll = Roll.roll();
	
	private String[] fieldName = {"TER1","TER2","TER3","TER4","TER5","TER6","TER7","TER8","TER9","TER10","TER11","REF1","REF2","LAB1","LAB2","TAX1","TAX2","FLE1","FLE2", "FLE3", "FLE4"};
	private int[] fieldRent = {100,300,500,700,1000,1300,1600,2000,2600,3200,4000,5000,500,100,100,2000,4000,500,500,500,500};
	private int[] fieldPrice = {1000,1500,2000,3000,4000,4300,4750,5000,5500,6000,8000,0,0,2500,2500,0,0,4000,4000,4000,4000};
	
	
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
