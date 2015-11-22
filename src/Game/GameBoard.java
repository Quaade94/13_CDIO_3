package Game;

import desktop_fields.Field;
//import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;


public class GameBoard {
	
	private int numberOfFields = 0;
	private int index = 0;
	
	public GameBoard(int numberOfFieldsConstructor){
		numberOfFields = numberOfFieldsConstructor;
	}
	
	private String[] fieldName = {"TER1","TER2","TER3","TER4","TER5","TER6","TER7","TER8","TER9","TER10","TER11","REF1","REF2","LAB1","LAB2","TAX1","TAX2","FLE1","FLE2", "FLE3", "FLE4"};
	private int[] fieldRent = {100,300,500,700,1000,1300,1600,2000,2600,3200,4000,5000,500,100,100,2000,4000,500,500,500,500};
	private int[] fieldPrice = {1000,1500,2000,3000,4000,4300,4750,5000,5500,6000,8000,0,0,2500,2500,0,0,4000,4000,4000,4000};
	
	
	public void setGameBoard() {
		
		Field[] fields = new Field[numberOfFields];
		
		for(index = 0; index < numberOfFields ; index++){
			
			fields[index] = new Street.Builder()
					.setTitle(Language.getLang(fieldName[index]))
					.setRent(fieldRent[index] + ",-")
					.setSubText(Language.getLang("PRI") + ": " + fieldPrice[index])
					.build();
			
		}
	GUI.create(fields);
	}
}
