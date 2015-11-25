package Test;


public class Territory extends Ownable{

	
	private int rent;
	private int price;
	
	@Override
	public void landOnField(int IDOfPlayer){
		
		rent = 0;
		price = 0;
		
		int TempRent[] = GameBoard.getFieldRent();
		int TempPrice[] = GameBoard.getFieldPrice();
		
		if (PlayerPosition.getPlayerPosition(IDOfPlayer) >= 0 && PlayerPosition.getPlayerPosition(IDOfPlayer) <= 10){
			
			rent = TempRent[PlayerPosition.getPlayerPosition(IDOfPlayer)];
			price = TempPrice[PlayerPosition.getPlayerPosition(IDOfPlayer)];
			
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
