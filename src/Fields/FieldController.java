package Fields;

import Game.GameBoard;
import Game.Player;
import java.util.Arrays;

public class FieldController {
	Player Player = new Player();
	GameBoard GameBoard = new GameBoard(21);
	private int[] terArray = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	private int[] fleArray = {-1,-1,-1,-1};
	private int[] labArray = {-1,-1};
	
	private void setTerArray(int IDOfPlayer, int index){
		terArray[index] = IDOfPlayer;
	}	
	private void setFleArray(int IDOfPlayer, int index){
		fleArray[index] = IDOfPlayer;
	}	
	private void setLabArray(int IDOfPlayer, int index){
		labArray[index] = IDOfPlayer;
	}
	
	private int getTerArray(int index){
		return terArray[index];
	}
	private int getFleArray(int index){
		return fleArray[index];
	}
	private int getLabArray(int index){
		return labArray[index];
	}
	
	public void OwnableCheck(int IDOfPlayer){
		
		Boolean[] fieldOwnable = GameBoard.getFieldOwnable();
		String[] fieldNames = GameBoard.getFieldNames();
		String fieldName = fieldNames[Player.getPlayerPosition(IDOfPlayer)];
		
		if (fieldOwnable[Player.getPlayerPosition(IDOfPlayer)] == true) {
			if (fieldName.contains("TER") == true){
				System.out.println(fieldNames[Player.getPlayerPosition(IDOfPlayer)]);
				System.out.println(IDOfPlayer);
				isTerOwned(IDOfPlayer);
			} else if (fieldName.contains("FLE") == true){
				System.out.println("Fleet");
				isFleOwned(IDOfPlayer);
			} else if (fieldName.contains("LAB") == true){
				System.out.println("Labor Camp");
				isLabOwned(IDOfPlayer);
			}
		}
	}
	
	public boolean isTerOwned(int IDOfPlayer){
		boolean isOwned= false;
		String[] fieldNames = GameBoard.getFieldNames();
		
		if (fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER1") {
			if (terArray[0] == -1) {
				isOwned = false;
			} else if (terArray[0] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER2") {
			if (terArray[1] == -1) {
				isOwned = false;
			} else if (terArray[1] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER3") {
			if (terArray[2] == -1) {
				isOwned = false;
			} else if (terArray[2] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER4") {
			if (terArray[3] == -1) {
				isOwned = false;
			} else if (terArray[3] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER5") {
			if (terArray[4] == -1) {
				isOwned = false;
			} else if (terArray[4] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER6") {
			if (terArray[5] == -1) {
				isOwned = false;
			} else if (terArray[5] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER7") {
			if (terArray[6] == -1) {
				isOwned = false;
			} else if (terArray[6] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER8") {
			if (terArray[7] == -1) {
				isOwned = false;
			} else if (terArray[7] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER9") {
			if (terArray[8] == -1) {
				isOwned = false;
			} else if (terArray[8] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER10") {
			if (terArray[9] == -1) {
				isOwned = false;
			} else if (terArray[9] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "TER11") {
			if (terArray[10] == -1) {
				isOwned = false;
			} else if (terArray[10] >= 0) {
				isOwned = true;
			}
		}
		return isOwned;
	}
	public boolean isFleOwned(int IDOfPlayer){

		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		if (fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE1") {
			if (fleArray[0] == -1) {
				isOwned = false;
			} else if (fleArray[0] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE2") {
			if (fleArray[1] == -1) {
				isOwned = false;
			} else if (fleArray[1] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE3") {
			if (fleArray[2] == -1) {
				isOwned = false;
			} else if (fleArray[2] >= 0) {
				isOwned = true;
			}
		} else if(fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "FLE4") {
			if (fleArray[3] == -1) {
				isOwned = false;
			} else if (fleArray[3] >= 0) {
				isOwned = true;
			}
		}
		return isOwned;
	}
	public boolean isLabOwned(int IDOfPlayer){

		boolean isOwned = false;
		String[] fieldNames = GameBoard.getFieldNames();
		if (fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "LAB1") {
			if (labArray[0] == -1) {
				isOwned = false;
			} else if (labArray[0] >= 0) {
				isOwned = true;
				//whoOwns(IDOfPlayer,labArray[0]);
			}
		} else if (fieldNames[Player.getPlayerPosition(IDOfPlayer)] == "LAB1") {
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
	
