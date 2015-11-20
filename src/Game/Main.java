package Game;

import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_resources.GUI;
import desktop_fields.Street;



public class Main {
	
	public static void main(String[] args) {

		//Spilleplade (SKAL være først)
		Field[] fields = new Field[40];
		GUI.create(fields);
		
		fields[0] = new Street.Builder()
				.setTitle(Language.getLang("TER1"))
				.setRent("")
				.build();
		
		fields[1] = new Street.Builder()
				.setTitle(Language.getLang(""))
				.setRent("600,-")
				.build();
		
		fields[0] = new Street.Builder().build();
//		System.out.println(Language.getLang("TURN1"));
	
		

//		Tilføjer en spiller til spillepladen
		
		Car car = new Car.Builder()
				.typeUfo()
				.patternHorizontalDualColor()
				.primaryColor(Color.RED)
				.secondaryColor(Color.BLUE)
				.build();
				GUI.addPlayer("John Rambo", 1000, car);
		
		
				
				
		GUI.getUserButtonPressed("Press me", "ENTER");
		GUI.close();

	}

}
