package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;


public class Main {
	
	
	public static void main(String[] args) {
		
		Die Roll = new Die();
		int[] roll = Roll.roll();
		GameBoard Board = new GameBoard();
		int playerAmount = new Player().getPlayerAmount();
		
		
		//Spilleplade (SKAL være først)
		Field[] fields = new Field[21];
		
		
		fields[0] = new Street.Builder()
				.setTitle(Language.getLang("TER1"))
				.setRent("100")
				.setSubText(Language.getLang("PRI")+": 1000")
				.build();
		
		fields[1] = new Street.Builder()
				.setTitle(Language.getLang("TER2"))
				.setRent("300,-")
				.setSubText(Language.getLang("PRI")+": 1500")
				.build();
		
		fields[2] = new Street.Builder()
				.setTitle(Language.getLang("TER3"))
				.setRent("500,-")
				.setSubText(Language.getLang("PRI")+": 2000")
				.build();
		
		fields[3] = new Street.Builder()
				.setTitle(Language.getLang("TER4"))
				.setRent("700,-")
				.setSubText(Language.getLang("PRI")+": 3000")
				.build();
		
		fields[4] = new Street.Builder()
				.setTitle(Language.getLang("TER5"))
				.setRent("1000,-")
				.setSubText(Language.getLang("PRI")+": 4000")
				.build();
		
		fields[5] = new Street.Builder()
				.setTitle(Language.getLang("TER6"))
				.setRent("1300,-")
				.setSubText(Language.getLang("PRI")+": 4300")
				.build();
		
		fields[6] = new Street.Builder()
				.setTitle(Language.getLang("TER7"))
				.setRent("1600,-")
				.setSubText(Language.getLang("PRI")+": 4750")
				.build();
		
		fields[7] = new Street.Builder()
				.setTitle(Language.getLang("TER8"))
				.setRent("2000,-")
				.setSubText(Language.getLang("PRI")+": 5000")
				.build();
		
		fields[8] = new Street.Builder()
				.setTitle(Language.getLang("TER9"))
				.setRent("2600,-")
				.setSubText(Language.getLang("PRI")+": 5500")
				.build();
		
		fields[9] = new Street.Builder()
				.setTitle(Language.getLang("TER10"))
				.setRent("3200,-")
				.setSubText(Language.getLang("PRI")+": 6000")
				.build();
		
		fields[10] = new Street.Builder()
				.setTitle(Language.getLang("TER11"))
				.setRent("4000,-")
				.setSubText(Language.getLang("PRI")+": 8000")
				.build();
		
		fields[11] = new Street.Builder()
				.setTitle(Language.getLang("REF1"))
				.setSubText(Language.getLang("REC")+": 5000")
				.build();
		
		fields[12] = new Street.Builder()
				.setTitle(Language.getLang("REF2"))
				.setSubText(Language.getLang("REC")+": 500")
				.build();
		
		fields[13] = new Street.Builder()
				.setTitle(Language.getLang("LAB1"))
				.setRent(roll[2]*100+",-")
				.setSubText(Language.getLang("PRI")+": 2500")
				.build();
		
		fields[14] = new Street.Builder()
				.setTitle(Language.getLang("LAB2"))
				.setRent(roll[2]*100+",-")
				.setSubText(Language.getLang("PRI")+": 2500")
				.build();
		
		fields[15] = new Street.Builder()
				.setTitle(Language.getLang("TAX1"))
				.setRent("2000,-")
				.build();
		
		fields[16] = new Street.Builder()
				.setTitle(Language.getLang("TAX2"))
				.setRent("4000 or 10% of total assets,-")
				.build();
		
		fields[17] = new Street.Builder()
				.setTitle(Language.getLang("FLE1"))
				.setRent("500-4000,-")
				.setSubText(Language.getLang("PRI")+": 4000")
				.build();
		
		fields[18] = new Street.Builder()
				.setTitle(Language.getLang("FLE2"))
				.setRent("500-4000,-")
				.setSubText(Language.getLang("PRI")+": 4000")
				.build();
		
		fields[19] = new Street.Builder()
				.setTitle(Language.getLang("FLE3"))
				.setRent("500-4000,-")
				.setSubText(Language.getLang("PRI")+": 4000")
				.build();
		
		fields[20] = new Street.Builder()
				.setTitle(Language.getLang("FLE4"))
				.setRent("500-4000,-")
				.setSubText(Language.getLang("PRI")+": 4000")
				.build();
		
		GUI.create(fields);
	

//		Laver spilernes biler
		
		Car car1 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car2 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car3 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car4 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car5 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		Car car6 = new Car.Builder()
				.typeCar()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
		
		
	
		
		
//		Tilføjer spillere til spillepladen
		
		//Denne er der kun så GUI kan åbne
//		GUI.addPlayer("Name1", 1000, car1);
		
		if(playerAmount == 2){
			//input name here
			GUI.addPlayer("Name1", 1000, car1);
			//input name here
			GUI.addPlayer("Name2", 1000, car2);
		}
		else if(playerAmount == 3){
			//input name here
			GUI.addPlayer("Name3", 1000, car3);
		}
		else if(playerAmount == 4){
			//input name here
			GUI.addPlayer("Name4", 1000, car4);
		}
		else if(playerAmount == 5){
			//input name here
			GUI.addPlayer("Name5", 1000, car5);
		}
		else if(playerAmount == 6){
			//input name here
			GUI.addPlayer("Name6", 1000, car6);
		}
		else{
			System.out.println("Fejl! For mange/få spillere!");
		}
		
		
		
		//DETTE AFSNIT ER EN TEST
		System.out.println("Rolled: "+roll[2]);
		System.out.println(Board.getFieldRent(14));
		System.out.println(Board.getFieldName(14));
		System.out.println("Price: "+Board.getFieldPrice(14));
		
				
				
//		GUI.getUserButtonPressed("Press me", "ENTER");
//		GUI.close();

	}

		

	
}
