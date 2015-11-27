package Fields;

import Fields.Ownable;
import Game.Die;
import java.util.Arrays;

public class Laborcamp extends Ownable {

	private int baseRent = 100;
	private int whoOwns;
	private int rent;
	private int playerPosition;
	private int price;
	private int fieldNumber;
	private int dieSum;
	
	private int[] labArray = { -1, -1 };

	@Override
	public void landOnField(int IDOfPlayer) {

		rent = 0;
		price = 2500;

		if (occurences(whoOwns, labArray) == 2) {
			rent = rent * 2;
		}
		rent = baseRent * dieSum;
	}

	public void setNewOwner(int IDOfPlayer){
		labArray[fieldNumber] = IDOfPlayer;
	}
	public void setDieSum(int diceSum){
		dieSum = diceSum;
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
	
	public void setPlayerPositionLab(int playerPositionMethod) {
		playerPosition = playerPositionMethod;
	}
	public boolean isOwned(int IDOfPlayer){
		boolean isOwned = isLabOwned(IDOfPlayer, playerPosition);
		return isOwned;
	}
	
	public boolean isLabOwned(int IDOfPlayer, int playerPosition){
		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		System.out.println(fieldNames[playerPosition]);
		
		if (fieldNames[playerPosition] == "LAB1") {
			System.out.println("labdsads1");
			fieldNumber = 0;
			if (labArray[0] == -1) {
				isOwned = false;
			} else if (labArray[0] >= 0) {
				isOwned = true;
				whoOwns = labArray[0];
			}
		} else if(fieldNames[playerPosition] == "LAB2") {
			System.out.println("lsssab2");
			fieldNumber = 1;
			if (labArray[1] == -1) {
				isOwned = false;
			} else if (labArray[1] >= 0) {
				isOwned = true;
				whoOwns = labArray[1];
			}
		}
		return isOwned;
}
	public int getPlayer(){
		return whoOwns;
	}
	@Override
	public int getRent() {

		return rent;
	}
	public int getPrice() {

		return price;
	}
}
