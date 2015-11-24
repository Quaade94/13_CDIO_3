package Game;

import java.awt.Color;

import desktop_fields.Field;
//import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;


public class GameBoard {

	Die Die = new Die();

	private int numberOfFields = 0;
	private int index = 0;

	public GameBoard(int numberOfFieldsConstructor){
		numberOfFields = numberOfFieldsConstructor;
	}

	private String[] fieldName = {"TER1","TER2","TER3","TER4","TER5","TER6","TER7","TER8","TER9","TER10","TER11","REF1","REF2","LAB1","LAB2","TAX1","TAX2","FLE1","FLE2", "FLE3", "FLE4"};
	private String[] fieldDescription = {"TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","TER_DES1","REF1_DES","REF2_DES","LAB_DES","LAB_DES","TAX1_DES","TAX2_DES","FLEET_DES","FLEET_DES","FLEET_DES","FLEET_DES"};
	private int[] fieldRent = {100,300,500,700,1000,1300,1600,2000,2600,3200,4000,5000,500,(Die.getDiceSum()*100),(Die.getDiceSum()*100),2000,4000,500,500,500,500};
	private int[] fieldPrice = {1000,1500,2000,3000,4000,4300,4750,5000,5500,6000,8000,0,0,2500,2500,0,0,4000,4000,4000,4000};

	public void setGameBoard() {

		Field[] fields = new Field[numberOfFields];

		for(index = 0; index < numberOfFields ; index++){

			if (index == 11 || index == 12 || index == 15 || index == 16 ){

				fields[index] = new Street.Builder()
						.setTitle(Language.getLang(fieldName[index]))
						.setDescription(Language.getLang(fieldDescription[index]))
						.setSubText(fieldRent[index] + ",-")
						.setRent(fieldRent[index] + ",-")
						.setFgColor(Color.BLACK)
						.setBgColor(Color.pink)
						.build();
			}


			else if (index == 13 || index == 14 ){

				fields[index] = new Street.Builder()
						.setTitle(Language.getLang(fieldName[index]))
						.setDescription(Language.getLang(fieldDescription[index]))
						.setSubText("Price: " +fieldPrice[index] + ",-")
						.setRent(fieldRent[index] + ",-")
						.setFgColor(Color.BLACK)
						.setBgColor(Color.orange)
						.build();
			}

			else if (index == 17 || index == 18 || index == 19 || index == 20 ){

				fields[index] = new Street.Builder()
						.setTitle(Language.getLang(fieldName[index]))
						.setDescription(Language.getLang(fieldDescription[index]))
						.setSubText(fieldRent[index] + ",-")
						.setRent(fieldRent[index] + ",-")
						.setFgColor(Color.black)
						.setBgColor(Color.cyan)
						.build();
			}

			else {

				fields[index] = new Street.Builder()
						.setTitle(Language.getLang(fieldName[index]))
						.setDescription(Language.getLang(fieldDescription[index]))
						.setSubText("Price: " +fieldPrice[index] + ",-")
						.setRent(fieldRent[index] + ",-")
						.setFgColor(Color.BLACK)
						.setBgColor(Color.yellow)
						.build();
			}
		}
		GUI.create(fields);
	}
}
