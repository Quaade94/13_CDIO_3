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
	
	public int getAccountSum(int IDOfPlayer){
		
		int SumOfAccount = 0;
		
		if (super.isValidID(IDOfPlayer)){
			if (isNotBroke(IDOfPlayer)){
				
				SumOfAccount = Accounts[IDOfPlayer];
			}
			if (!(isNotBroke(IDOfPlayer))){
				
				System.out.println("This Player ID = " + IDOfPlayer + " is broke, and cannot play anymore");
				
			}
			
		}
		if (!(super.isValidID(IDOfPlayer))){
			
			System.out.println("A fault happend - See; Game -> Account -> getAccountSum");

		}
		
		return SumOfAccount;

	}
	
	public void addOrRemoveCapitalFromPlayerAccount(int IDOfPlayer, int AddRemove){
		
		if (super.isValidID(IDOfPlayer)){
			
			Accounts[IDOfPlayer] = Accounts[IDOfPlayer] + AddRemove;
		}
		if (!(super.isValidID(IDOfPlayer))){
			
			System.out.println("A fault happend - See; Game -> Account -> addOrRemoveCapitalFromPlayerAccount");

		}
	}
	
	private boolean isNotBroke(int IDOfPlayer){
		
		boolean broke = false;
		
		if (Account.getAccountSum(IDOfPlayer) < 0){
			
			broke = true;
			
		}

		return broke;
		
	}
	
}
