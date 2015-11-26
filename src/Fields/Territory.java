package Fields;

import Fields.Ownable;

public class Territory extends Ownable{

	
	private int rent;
	private int price;
	private int[] priceArray = {100,300,500,700,1000,1300,1600,2000,2600,3200};
	private int[] rentArray = {1000,1500,2000,3000,4000,4300,4750,5000,5500};
	
	private int[] isOwnedArray = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	
	private boolean isOwned= false;
	
	private int RetrunElement;
	
	@Override
	public void landOnField(int IDOfPlayer){
		
		rent = 0;
		price = 0;

		if (!(isFieldOwned(IDOfPlayer))){
			if (Player.getPlayerPosition(IDOfPlayer) >= 0 && Player.getPlayerPosition(IDOfPlayer) <= 10){
				
				price = priceArray[Player.getPlayerPosition(IDOfPlayer)];
				rent = rentArray[Player.getPlayerPosition(IDOfPlayer)];
			}
		}
	}
	
	@Override
	public int getRent() {
		return rent;
	}
	public int getPrice(){
		return price;
	}
	

	
	public int isOwnedByWho(int IDOfPlayer){
		
		// If this method returns -1, then it is not working properly
		
		RetrunElement = -1;
		
		if (Player.getPlayerPosition(IDOfPlayer) >= 0 && Player.getPlayerPosition(IDOfPlayer) <= 10){
			RetrunElement = isOwnedArray[Player.getPlayerPosition(IDOfPlayer)];		
		}
		
		return RetrunElement;				
	}
	
	public void setOwner(int IDOfPlayer){
		
		if (Player.getPlayerPosition(IDOfPlayer) >= 0 && Player.getPlayerPosition(IDOfPlayer) <= 10){

			if (!(isFieldOwned(IDOfPlayer))){
				
				isOwnedArray[Player.getPlayerPosition(IDOfPlayer)] = IDOfPlayer;	
			}
			
			if ((isFieldOwned(IDOfPlayer))){
				
//				Her skal staa en PayRent Metod der traekker penge fra personens penge og saetter dem over paa den anden persons penge
				
			}		
		}
	}
}








