package Fields;

import Game.GameBoard;
import Game.Player;

public class FieldController {
	Player Player = new Player();
	GameBoard GameBoard = new GameBoard();
	Territory Territory = new Territory();
	Fleet Fleet = new Fleet();
	Laborcamp Laborcamp = new Laborcamp();
	Tax Tax = new Tax();
	Refuge Refuge = new Refuge();

	private int type;
	//Get the price of the field
	public int getPrice(){
		int returnValue = 0;
		if (type == 1){
			returnValue = Territory.getPrice();
		} else if (type == 2){
			returnValue = Fleet.getPrice();
		} else if (type == 3){
			returnValue = Laborcamp.getPrice();
		}
		return returnValue;
	}
	//Get the owner of the field
	public int getPlayer(){
		int returnValue = 0;
		if (type == 1){
			returnValue = Territory.getPlayer();
		} else if (type == 2){
			returnValue = Fleet.getPlayer();
		} else if (type == 3){
			returnValue = Laborcamp.getPlayer();
		}else if (type == 4){
			returnValue = 6;
		} else if (type == 5){
			returnValue = 6;
		}
		return returnValue;
	}
	//Returning the rent of the field
	public int getRent(){
		int returnValue = 0;
		if (type == 1){
			returnValue = Territory.getRent();
		} else if (type == 2){
			returnValue = Fleet.getRent();
		} else if (type == 3){
			returnValue = Laborcamp.getRent();
		}else if (type == 4){
			returnValue = Tax.getRent();
		} else if (type == 5){
			returnValue = Refuge.getBonus();
		}
		return returnValue;
	}
	//Setting the owner of the field
	public void setOwner(int IDOfPlayer){
		if (type == 1){
			Territory.setNewOwner(IDOfPlayer);
		} else if (type == 2){
			Fleet.setNewOwner(IDOfPlayer);
		} else if (type == 3){
			Laborcamp.setNewOwner(IDOfPlayer);
		}
	}
	public void setPlayerPercent(int playerMoney){
		Tax.setTenPercent(playerMoney);
	}
	public void setDieSum(int diceSum){
		Laborcamp.setDieSum(diceSum);
	}
	//Determines the type of the field and then checking the field in the types class
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
				Laborcamp.setPlayerPositionLab(playerPosition-1);
				if (Laborcamp.isOwned(IDOfPlayer)){
					isOwned = true;
				} else if (!(Laborcamp.isOwned(IDOfPlayer))){
					isOwned = false;
				}
				Laborcamp.landOnField(IDOfPlayer);
			}
		} else {
			 if (fieldName.contains("TAX")){
					type = 4;
					Tax.setPlayerPositionTax(playerPosition-1);
					if (fieldName.contains("TAX1")){
						Tax.setFieldNumber(1);
					} else if (fieldName.contains("TAX2")){
						Tax.setFieldNumber(2);
					}
					Tax.landOnField(IDOfPlayer);
					isOwned = true;
				} else if (fieldName.contains("REF")){
					type = 5;
					if (fieldName.contains("REF1")){
						Refuge.setFieldNumber(1);
					} else if (fieldName.contains("REF2")){
						Refuge.setFieldNumber(2);
					}
					Refuge.landOnField(IDOfPlayer);
					isOwned = true;
				}
		}
		return isOwned;
	}
}
	
