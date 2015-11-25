package Game;

public class TurnSwitcher {
	

	
	private int playerTurn =1;
	
	private int playerArraySize =2;	// størrelsen på array der styrer antal spillere. (Hentes fra en anden klasse med size af array metoden).
	

			
public void endTurn(){
	
		
		if(playerTurn<=playerArraySize){
			
			playerTurn++;
			
		}
			
		if(playerTurn>playerArraySize) {	
			playerTurn = 1;
			}
}

public int getPlayerTurn(){
	
	return playerTurn-1;
}
	
			
		
		

}
