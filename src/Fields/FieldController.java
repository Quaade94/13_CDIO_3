package Fields;

import Game.GameBoard;
import Game.Player;

public class FieldController {
	Player Player = new Player();
	GameBoard GameBoard = new GameBoard(21);
	
	public void OwnableCheck(int IDOfPlayer){
		
		Boolean[] fieldOwnable = GameBoard.getFieldOwnable();
		
		String[] fieldNames = GameBoard.getFieldNames();
		
		String fieldName = fieldNames[Player.getPlayerPosition(IDOfPlayer)];
		
		if (fieldOwnable[Player.getPlayerPosition(IDOfPlayer)] == true) {
			if (fieldName.contains("TER") == true){
				isTerOwned(IDOfPlayer);
			} else if (fieldName.contains("FLE") == true){
				isFleOwned(IDOfPlayer);
			} else if (fieldName.contains("LAB") == true){
				//this.isLabOwned(IDOfPlayer);
			}
		}
	}
	
	public boolean isTerOwned(int IDOfPlayer){
		int[] isOwnedArray = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		boolean isOwned= false;
		String[] fieldNames = GameBoard.getFieldNames();
		
		if (fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER1") {
			if (isOwnedArray[0] == -1) {
				isOwned = false;
			} else if (isOwnedArray[0] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER2") {
			if (isOwnedArray[1] == -1) {
				isOwned = false;
			} else if (isOwnedArray[1] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER3") {
			if (isOwnedArray[2] == -1) {
				isOwned = false;
			} else if (isOwnedArray[2] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER4") {
			if (isOwnedArray[3] == -1) {
				isOwned = false;
			} else if (isOwnedArray[3] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER5") {
			if (isOwnedArray[4] == -1) {
				isOwned = false;
			} else if (isOwnedArray[4] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER6") {
			if (isOwnedArray[5] == -1) {
				isOwned = false;
			} else if (isOwnedArray[5] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER7") {
			if (isOwnedArray[6] == -1) {
				isOwned = false;
			} else if (isOwnedArray[6] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER8") {
			if (isOwnedArray[7] == -1) {
				isOwned = false;
			} else if (isOwnedArray[7] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER9") {
			if (isOwnedArray[8] == -1) {
				isOwned = false;
			} else if (isOwnedArray[8] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER10") {
			if (isOwnedArray[9] == -1) {
				isOwned = false;
			} else if (isOwnedArray[9] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER11") {
			if (isOwnedArray[10] == -1) {
				isOwned = false;
			} else if (isOwnedArray[10] >= 0) {
				isOwned = true;
			}
		}
		return isOwned;
	}
	public boolean isFleOwned(int IDOfPlayer){
		int[] isOwnedArray = {-1,-1,-1,-1};
		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		if (fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE1") {
			if (isOwnedArray[0] == -1) {
				isOwned = false;
			} else if (isOwnedArray[0] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE2") {
			if (isOwnedArray[1] == -1) {
				isOwned = false;
			} else if (isOwnedArray[1] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE3") {
			if (isOwnedArray[2] == -1) {
				isOwned = false;
			} else if (isOwnedArray[2] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE4") {
			if (isOwnedArray[3] == -1) {
				isOwned = false;
			} else if (isOwnedArray[3] >= 0) {
				isOwned = true;
			}
		}
		return isOwned;
	}
	public boolean isLabOwned(int IDOfPlayer){
		int[] isOwnedArray = {-1,-1};
		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		if (fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "LAB1") {
			if (isOwnedArray[0] == -1) {
				isOwned = false;
			} else if (isOwnedArray[0] >= 0) {
				isOwned = true;
			}
		} else if (fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "LAB1") {
			if (isOwnedArray[1] == -1) {
				isOwned = false;
			} else if (isOwnedArray[1] >= 0) {
				isOwned = true;
			}
		}
		return isOwned;
	}
}
	
