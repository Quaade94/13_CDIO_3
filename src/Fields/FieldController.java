package Fields;

import Game.GameBoard;
import Game.Player;
import desktop_resources.GUI;

import java.util.Arrays;

import Game.Account;

public class FieldController {
	Player Player = new Player();
	GameBoard GameBoard = new GameBoard();
	Territory Territory = new Territory();

	private int[] fleArray = {-1,-1,-1,-1};
	private int[] labArray = {-1,-1};
	private int type;
	
//	private void setFleArray(int IDOfPlayer, int index){
//		fleArray[index] = IDOfPlayer;
//	}	
//	private void setLabArray(int IDOfPlayer, int index){
//		labArray[index] = IDOfPlayer;
//	}
//	
//	private int getFleArray(int index){
//		return fleArray[index];
//	}
//	private int getLabArray(int index){
//		return labArray[index];
//	}
	
	public int getTerPrice(){
		int returnValue = 0;
		if (type == 1){
			returnValue = Territory.getPrice();
		} else if (type == 4){
			
		}
		return returnValue;
	}
	public int getTerPlayer(){
		int returnValue = 0;
		if (type == 1){
			returnValue = Territory.getPlayer();
		} else if (type == 2){
			
		}
		return returnValue;
	}
	public int getTerRent(){
		int returnValue = 0;
		if (type == 1){
			returnValue = Territory.getRent();
		} else if (type == 2){
			
		}
		return returnValue;
	}
	public void setTerOwner(int IDOfPlayer){
		if (type == 1){
			Territory.setNewOwner(IDOfPlayer);
		} else if (type == 2){
			
		}
	}
	public boolean OwnableCheck(int IDOfPlayer, int playerPosition){
		boolean isOwned = true;
		Boolean[] fieldOwnable = GameBoard.getFieldOwnable();
		String[] fieldNames = GameBoard.getFieldNames();
		String fieldName = fieldNames[playerPosition-1];
		
		if (fieldOwnable[playerPosition-1]) {
			if (fieldName.contains("TER")){
				type = 1;
				Territory.setPlayerPositionTer(playerPosition-1);
				if (Territory.isOwned(IDOfPlayer)){
					isOwned = true;
				} else if (!(Territory.isOwned(IDOfPlayer))){
					isOwned = false;
				}
				Territory.landOnField(IDOfPlayer);
			} else if (fieldName.contains("FLE")){
				type = 2;
				System.out.println("Fleet");
			} else if (fieldName.contains("LAB")){
				type = 3;
				System.out.println("Labor Camp");
				isLabOwned(IDOfPlayer, playerPosition);
			} else if (fieldName.contains("TAX")){
				type = 4;
				isOwned = true;
			} else if (fieldName.contains("REF")){
				type = 5;
				isOwned = true;
			}
		}
		return isOwned;
	}
	
	public boolean isFleOwned(int IDOfPlayer, int playerPosition){

		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		if (fieldNames[playerPosition-1] == "FLE1") {
			if (fleArray[0] == -1) {
				isOwned = false;
			} else if (fleArray[0] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[playerPosition-1] == "FLE2") {
			if (fleArray[1] == -1) {
				isOwned = false;
			} else if (fleArray[1] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[playerPosition-1] == "FLE3") {
			if (fleArray[2] == -1) {
				isOwned = false;
			} else if (fleArray[2] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[playerPosition-1] == "FLE4") {
			if (fleArray[3] == -1) {
				isOwned = false;
			} else if (fleArray[3] >= 0) {
				isOwned = true;
			}
		}
		return isOwned;
	}
	public boolean isLabOwned(int IDOfPlayer, int playerPosition){

		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		if (fieldNames[playerPosition-1] == "LAB1") {
			if (labArray[0] == -1) {
				isOwned = false;
			} else if (labArray[0] >= 0) {
				isOwned = true;
				//whoOwns(IDOfPlayer,labArray[0]);
			}
		} else if (fieldNames[playerPosition-1] == "LAB1") {
			if (labArray[1] == -1) {
				isOwned = false;
			} else if (labArray[1] >= 0) {
				isOwned = true;
			}
		}
		return isOwned;
	}
//	public int whoOwns(int IDOfPlayer, int fieldNumber){
//		boolean isMe = true;
//		if(IDOfPlayer != fieldNumber){
//			isMe = false;
//		}
//	}
}
	
