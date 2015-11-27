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
	Fleet Fleet = new Fleet();
	Laborcamp Laborcamp = new Laborcamp();

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
	
	public int getPrice(){
		int returnValue = 0;
		if (type == 1){
			returnValue = Territory.getPrice();
		} else if (type == 2){
			returnValue = Fleet.getPrice();
		}
		return returnValue;
	}
	public int getPlayer(){
		int returnValue = 0;
		if (type == 1){
			returnValue = Territory.getPlayer();
		} else if (type == 2){
			returnValue = Fleet.getPlayer();
		}
		return returnValue;
	}
	public int getRent(){
		int returnValue = 0;
		if (type == 1){
			returnValue = Territory.getRent();
		} else if (type == 2){
			returnValue = Fleet.getRent();
		}
		return returnValue;
	}
	public void setOwner(int IDOfPlayer){
		if (type == 1){
			Territory.setNewOwner(IDOfPlayer);
		} else if (type == 2){
			Fleet.setNewOwner(IDOfPlayer);
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
				Fleet.setPlayerPositionTer(playerPosition-1);
				if (Fleet.isOwned(IDOfPlayer)){
					isOwned = true;
				} else if (!(Fleet.isOwned(IDOfPlayer))){
					isOwned = false;
				}
				Fleet.landOnField(IDOfPlayer);
			} else if (fieldName.contains("LAB")){
				type = 3;
				System.out.println("Labor Camp");
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
//	public int whoOwns(int IDOfPlayer, int fieldNumber){
//		boolean isMe = true;
//		if(IDOfPlayer != fieldNumber){
//			isMe = false;
//		}
//	}
}
	
