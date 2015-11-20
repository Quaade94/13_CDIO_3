package Game;

public class Account extends Player {

	private int StartingCapital;
	
	public Account (int StaringCapitalConstructor){
		
		StartingCapital = StaringCapitalConstructor;
		
	}
	
	protected  int lenghtOfAccountArray = 0;

	protected  int[]	 Accounts 	= new int[lenghtOfAccountArray];

	
	public void addPlayerAccount(int IDOfPlayer){
		
		Account.addAccountSpaceForPlayer();
		
		Account.addStartingCapitalOfPlayerToArray(StartingCapital);
		
	}
	
	private void addAccountSpaceForPlayer(){
		
		lenghtOfAccountArray++;
		
	}
	private void addStartingCapitalOfPlayerToArray(int StartingCapital){
		
		Accounts[indexNumber] = StartingCapital;
		
	}
	
	
	
}
