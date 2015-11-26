package Test;

import Test.Ownable;

public class Territory extends Ownable{

	
	private int rent;
	private int price;
	private int[] priceArray = {100,300,500,700,1000,1300,1600,2000,2600,3200};
	private int [] rentArray = {1000,1500,2000,3000,4000,4300,4750,5000,5500};
	
	
	
	@Override
	public void landOnField(int IDOfPlayer){
		
		rent = 0;
		price = 0;

		if (PlayerPosition.getPlayerPosition(IDOfPlayer) >= 0 && PlayerPosition.getPlayerPosition(IDOfPlayer) <= 10){
						
			price = priceArray[PlayerPosition.getPlayerPosition(IDOfPlayer)];
			rent = rentArray[PlayerPosition.getPlayerPosition(IDOfPlayer)];

		}
	}
	
	@Override
	public int getRent() {
		return rent;
		
	}
	public int getPrice(){
		
		return price;
		
	}
}
