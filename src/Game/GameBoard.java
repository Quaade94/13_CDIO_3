package Game;

import java.awt.Color;

import Game.Language;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;


public class GameBoard {

	private int numberOfFields = 0;
	private int index = 0;

	public GameBoard(){
		numberOfFields = 21;
	}

	
	
	private String[] fieldName = {"TER1","TER2","TER3","TER4","TER5","TER6","TER7","TER8","TER9","TER10","TER11","REF1","REF2","LAB1","LAB2","TAX1","TAX2","FLE1","FLE2", "FLE3", "FLE4"};
	private String[] fieldDescription = {"TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","REF1_DES","REF2_DES","LAB_DES","LAB_DES","TAX1_DES","TAX2_DES","FLEET_DES","FLEET_DES","FLEET_DES","FLEET_DES"};
	private Boolean[] fieldOwnable = {true, true, true, true, true, true, true, true, true, true, true, false, false, true, true, false, false, true, true, true, true};
	private int[] fieldPrice = {1000,1500,2000,3000,4000,4300,4750,5000,5500,6000,8000,5000,500,2500,2500,2000,4000,4000,4000,4000,4000};

	public String[] getFieldNames(){
		return fieldName;
	}
	public int[] getFieldPrice(){
		return fieldPrice;
	}
	public Boolean[] getFieldOwnable() {
		return fieldOwnable;
	}
	
	public void toStrings(){

		for (int i = 0 ; i < 21 ; i++){
			System.out.println(Language.getLang(this.getFieldNames()[i]) + " ");
		}	
}
	
	public void setGameBoard() {
		Field[] fields = new Field[numberOfFields];	
		
		for(index = 0; index < numberOfFields ; index++){	
			
			//REFUGE
			if (index == 11 || index == 12 ){
				
				fields[index] = new Street.Builder()
						.setTitle(Language.getLang(fieldName[index]))
						.setDescription(Language.getLang(fieldDescription[index]))
						.setSubText(Language.getLang("REC")+fieldPrice[index] + ",-")
						.setFgColor(Color.BLACK)
						.setBgColor(Color.pink)
						.build();
			}
			//TAX
			else if (index == 15 || index == 16 ){
				
				fields[index] = new Street.Builder()
						.setTitle(Language.getLang(fieldName[index]))
						.setDescription(Language.getLang(fieldDescription[index]))
						.setSubText(Language.getLang("PAY")+fieldPrice[index] + ",-")
						.setFgColor(Color.BLACK)
						.setBgColor(Color.LIGHT_GRAY)
						.build();
				
			}
			
				//FLEET
			else if (index == 17 || index == 18 || index == 19 || index == 20 ){

				fields[index] = new Street.Builder()
						.setTitle(Language.getLang(fieldName[index]))
						.setDescription(Language.getLang(fieldDescription[index]))
						.setSubText(Language.getLang("PRI")+fieldPrice[index] + ",-")
						.setFgColor(Color.black)
						.setBgColor(Color.cyan)
						.build();
			}
			
			//LABOR CAMP
			else if (index == 13 || index == 14 ){

				fields[index] = new Street.Builder()
						.setTitle(Language.getLang(fieldName[index]))
						.setDescription(Language.getLang(fieldDescription[index]))
						.setSubText(Language.getLang("PRI")+fieldPrice[index] + ",-")
						.setFgColor(Color.BLACK)
						.setBgColor(Color.orange)
						.build();
			}
		
			//TERRITORY
			else {

				fields[index] = new Street.Builder()
						.setTitle(Language.getLang(fieldName[index]))
						.setDescription(Language.getLang(fieldDescription[index]))
						.setSubText(Language.getLang("PRI")+fieldPrice[index] + ",-")
						.setFgColor(Color.BLACK)
						.setBgColor(Color.yellow)
						.build();
			}
		}
		GUI.create(fields);
	}
}