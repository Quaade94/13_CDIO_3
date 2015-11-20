package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_resources.GUI;

import Test.TestKlasse;



public class Main {
	
	
	public static void main(String[] args) {

		//Spilleplade (SKAL være først)
		Field[] fields = new Field[21];
		
		TestKlasse TestT = new TestKlasse();
		

		
		

		
		
		
		
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
				.setRent("100*Dice,-")
				.setSubText(Language.getLang("PRI")+": 2500")
				.build();
		
		fields[14] = new Street.Builder()
				.setTitle(Language.getLang("LAB2"))
				.setRent("100*Dice,-")
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
	
//		Tilføjer en spiller til spillepladen
		
		Car car = new Car.Builder()
				.typeUfo()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
				
		GUI.addPlayer("John Rambo", 1000);
		
		
				
				
//		GUI.getUserButtonPressed("Press me", "ENTER");
//		GUI.close();

	}

		

	
}
