package Fields;

import Fields.Ownable;
import Game.Die;

public class Laborcamp extends Ownable{

	private int baseRent = 100;
	private int rent;
	private int price;
	private int ReturnnElement;
	
	private boolean isOwned= false;
	
	private int[] isOwnedArray = {-1,-1};
	
	Die Die = new Die();
	
	
	@Override
	public void landOnField(int IDOfPlayer){
	
	rent = 0;
	price = 2500;
		
	if (Player.getPlayerPosition(IDOfPlayer) == 13 || Player.getPlayerPosition(IDOfPlayer) == 14){
	
		if (!(isFieldOwned(IDOfPlayer))){
		
		rent = baseRent*Die.getDiceSum();
		
		}
		
	}
	
	if (occurences(0, isOwnedArray)==2){
		
		rent = rent*2;
		
	}
	
	}
	
	
	@Override
	public int getRent() {

		return rent;
	}
	public int getPrice() {

		return price;
	}
	
	public boolean isFieldOwned(int IDOfPlayer){
		
		if (Player.getPlayerPosition(IDOfPlayer) == 13 || Player.getPlayerPosition(IDOfPlayer) == 14){
			
				if (isOwnedArray[Player.getPlayerPosition(IDOfPlayer)] - 13 == -1){
					
					isOwned = false;
					
				}
				
				if (isOwnedArray[Player.getPlayerPosition(IDOfPlayer)] - 13 >= 0){
					
					isOwned = true;
					
				}
		}
		
		return isOwned;
	}
	
private int occurences(int LookingFor, int[] Array){
		
		int i = 0;
		int Occurances = 0;
		
		while (i < Array.length){
			
			if (Array[i] == LookingFor){
				Occurances++;
				i++;
			}
			else i++;	
		}
	
		return Occurances;
	}
	
public void setOwner(int IDOfPlayer){
	
	if (Player.getPlayerPosition(IDOfPlayer) == 13 || Player.getPlayerPosition(IDOfPlayer) == 20){

		if (!(isFieldOwned(IDOfPlayer))){
			
			isOwnedArray[Player.getPlayerPosition(IDOfPlayer) - 13] =  IDOfPlayer;
			
		}
		
		
	}
}

public int isOwnedByWho(int IDOfPlayer){
	
	// If this method returns -1, then it is not working properly
	
	ReturnnElement = -1;
	
	if (Player.getPlayerPosition(IDOfPlayer) == 13 || Player.getPlayerPosition(IDOfPlayer) <= 14){

		ReturnnElement = isOwnedArray[Player.getPlayerPosition(IDOfPlayer) - 17];	
		
	}
	
	return ReturnnElement;		
	
}

}

