package Fields;

import java.util.Arrays;

import desktop_resources.GUI;

public class Territory extends Ownable{

	private int rent;
	private int price;
	private int player;
	private int[] terArray = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	private int[] priceArray = {1000,1500,2000,3000,4000,4300,4750,5000,5500,6000,8000};
	private int[] rentArray = {100,300,500,700,1000,1300,1600,2000,2600,3200,4000};
	private int playerPosition;
	private int whoOwns;
	private int fieldNumber;
	

	@Override
	public void landOnField(int IDOfPlayer){
		rent = 0;
		price = 0;
		rent = rentArray[fieldNumber];
		price = priceArray[fieldNumber];
		System.out.println("field " + fieldNumber);
	}
	public boolean isOwned(int IDOfPlayer){
		boolean isOwned = isTerOwned(IDOfPlayer, playerPosition);
		return isOwned;
	}
	//Trækker penge fra spiller og sætter som ny ejer
	public void setNewOwner(int IDOfPlayer){
			terArray[fieldNumber] = IDOfPlayer;
			System.out.println("Dette er ter array: " + Arrays.toString(terArray));
	}
	//Modtager spillerens position
	public void setPlayerPositionTer(int playerPositionMethod) {
		playerPosition = playerPositionMethod;
	}
	//Tjekker om pladsen spilleren er landet på er optaget
	public boolean isTerOwned(int IDOfPlayer, int playerPosition){
		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		
		if (fieldNames[playerPosition] == "TER1") {
			fieldNumber = 0;
			if (terArray[0] == -1) {
				isOwned = false;
			} else if (terArray[0] >= 0) {
				isOwned = true;
				whoOwns = terArray[0];
			}
		} else if(fieldNames[playerPosition] == "TER2") {
			fieldNumber = 1;
			if (terArray[1] == -1) {
				isOwned = false;
			} else if (terArray[1] >= 0) {
				isOwned = true;
				whoOwns = terArray[1];
			}
		} else if(fieldNames[playerPosition] == "TER3") {
			fieldNumber = 2;
			if (terArray[2] == -1) {
				isOwned = false;
			} else if (terArray[2] >= 0) {
				isOwned = true;
				whoOwns = terArray[2];
			}
		} else if(fieldNames[playerPosition] == "TER4") {
			fieldNumber = 3;
			if (terArray[3] == -1) {
				isOwned = false;
			} else if (terArray[3] >= 0) {
				isOwned = true;
				whoOwns = terArray[3];
			}
		} else if(fieldNames[playerPosition] == "TER5") {
			fieldNumber = 4;
			if (terArray[4] == -1) {
				isOwned = false;
			} else if (terArray[4] >= 0) {
				isOwned = true;
				whoOwns = terArray[4];
			}
		} else if(fieldNames[playerPosition] == "TER6") {
			fieldNumber = 5;
			if (terArray[5] == -1) {
				isOwned = false;
			} else if (terArray[5] >= 0) {
				isOwned = true;
				whoOwns = terArray[5];
			}
		} else if(fieldNames[playerPosition] == "TER7") {
			fieldNumber = 6;
			if (terArray[6] == -1) {
				isOwned = false;
			} else if (terArray[6] >= 0) {
				isOwned = true;
				whoOwns = terArray[6];
			}
		} else if(fieldNames[playerPosition] == "TER8") {
			fieldNumber = 7;
			if (terArray[7] == -1) {
				isOwned = false;
			} else if (terArray[7] >= 0) {
				isOwned = true;
				whoOwns = terArray[7];
			}
		} else if(fieldNames[playerPosition] == "TER9") {
			fieldNumber = 8;
			if (terArray[8] == -1) {
				isOwned = false;
			} else if (terArray[8] >= 0) {
				isOwned = true;
				whoOwns = terArray[8];
			}
		} else if(fieldNames[playerPosition] == "TER10") {
			fieldNumber = 9;
			if (terArray[9] == -1) {
				isOwned = false;
			} else if (terArray[9] >= 0) {
				isOwned = true;
				whoOwns = terArray[9];
			}
		} else if(fieldNames[playerPosition] == "TER11") {
			fieldNumber = 10;
			if (terArray[10] == -1) {
				isOwned = false;
			} else if (terArray[10] >= 0) {
				isOwned = true;
				whoOwns = terArray[10];
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
	public int getPrice(){
		return price;
	}
	
}


