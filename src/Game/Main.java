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
//		Player player = new Player();	
//		int playerAmount = Player.getPlayerAmount();
		
		
		//Spilleplade (SKAL være først)
		Field[] fields = new Field[21];
		
		
		fields[0] = new Street.Builder()
				.setTitle(Language.getLang("TER1"))
				.setRent(Board.getFieldRent(1)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(1))
				.build();
		
		fields[1] = new Street.Builder()
				.setTitle(Language.getLang("TER2"))
				.setRent(Board.getFieldRent(2)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(2))
				.build();
		
		fields[2] = new Street.Builder()
				.setTitle(Language.getLang("TER3"))
				.setRent(Board.getFieldRent(3)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(3))
				.build();
		
		fields[3] = new Street.Builder()
				.setTitle(Language.getLang("TER4"))
				.setRent(Board.getFieldRent(4)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(4))
				.build();
		
		fields[4] = new Street.Builder()
				.setTitle(Language.getLang("TER5"))
				.setRent(Board.getFieldRent(5)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(5))
				.build();
		
		fields[5] = new Street.Builder()
				.setTitle(Language.getLang("TER6"))
				.setRent(Board.getFieldRent(6)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(6))
				.build();
		
		fields[6] = new Street.Builder()
				.setTitle(Language.getLang("TER7"))
				.setRent(Board.getFieldRent(7)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(7))
				.build();
		
		fields[7] = new Street.Builder()
				.setTitle(Language.getLang("TER8"))
				.setRent(Board.getFieldRent(8)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(8))
				.build();
		
		fields[8] = new Street.Builder()
				.setTitle(Language.getLang("TER9"))
				.setRent(Board.getFieldRent(9)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(9))
				.build();
		
		fields[9] = new Street.Builder()
				.setTitle(Language.getLang("TER10"))
				.setRent(Board.getFieldRent(10)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(10))
				.build();
		
		fields[10] = new Street.Builder()
				.setTitle(Language.getLang("TER11"))
				.setRent(Board.getFieldRent(11)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(11))
				.build();
		
		fields[11] = new Street.Builder()
				.setTitle(Language.getLang("REF1"))
				.setRent(Board.getFieldRent(12)+",-")
				.setSubText(Language.getLang("REC")+": "+Board.getFieldPrice(12))
				.build();
		
		fields[12] = new Street.Builder()
				.setTitle(Language.getLang("REF2"))
				.setRent(Board.getFieldRent(13)+",-")
				.setSubText(Language.getLang("REC")+": "+Board.getFieldPrice(13))
				.build();
		
		fields[13] = new Street.Builder()
				.setTitle(Language.getLang("LAB1"))
				.setRent(Board.getFieldRent(14)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(14))
				.build();
		
		fields[14] = new Street.Builder()
				.setTitle(Language.getLang("LAB2"))
				.setRent(Board.getFieldRent(15)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(15))
				.build();
		
		fields[15] = new Street.Builder()
				.setTitle(Language.getLang("TAX1"))
				.setRent(Board.getFieldRent(16)+",-")
				.setSubText("PAY (not done)")
				.build();
		
		fields[16] = new Street.Builder()
				.setTitle(Language.getLang("TAX2"))
				.setRent("")
				.setSubText("4000 or 10% of total assets,-")
				.build();
		
		fields[17] = new Street.Builder()
				.setTitle(Language.getLang("FLE1"))
				.setRent(Board.getFieldRent(18)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(18))
				.build();
		
		fields[18] = new Street.Builder()
				.setTitle(Language.getLang("FLE2"))
				.setRent(Board.getFieldRent(19)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(19))
				.build();
		
		fields[19] = new Street.Builder()
				.setTitle(Language.getLang("FLE3"))
				.setRent(Board.getFieldRent(20)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(20))
				.build();
		
		fields[20] = new Street.Builder()
				.setTitle(Language.getLang("FLE4"))
				.setRent(Board.getFieldRent(21)+",-")
				.setSubText(Language.getLang("PRI")+": "+Board.getFieldPrice(21))
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
		GUI.addPlayer("Name1", 1000, car1);
		
		
//		if(playerAmount == 2){
//			//input name here
//			GUI.addPlayer("Name1", 1000, car1);
//			//input name here
//			GUI.addPlayer("Name2", 1000, car2);
//		}
//		else if(playerAmount == 3){
//			//input name here
//			GUI.addPlayer("Name3", 1000, car3);
//		}
//		else if(playerAmount == 4){
//			//input name here
//			GUI.addPlayer("Name4", 1000, car4);
//		}
//		else if(playerAmount == 5){
//			//input name here
//			GUI.addPlayer("Name5", 1000, car5);
//		}
//		else if(playerAmount == 6){
//			//input name here
//			GUI.addPlayer("Name6", 1000, car6);
//		}
//		else{
//			System.out.println("Fejl! For mange/få spillere!");
//		}
		
		
		
		//DETTE AFSNIT ER EN TEST
		System.out.println("Rolled: "+roll[2]);
		System.out.println(Board.getFieldRent(1));
		System.out.println(Board.getFieldName(1));
		System.out.println("Price: "+Board.getFieldPrice(1));
		
				
				
//		GUI.getUserButtonPressed("Press me", "ENTER");
//		GUI.close();

	}

		

	
}
