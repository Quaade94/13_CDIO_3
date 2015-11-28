package Game;


public class Account {

	private int StartingCapital;
	private int[] Accounts;
	
	public Account (){		
		StartingCapital = 30000;		
	}
//Creating accounts for all active players
	public void addAccounts(int lengthOfAccountArray){
		Accounts = new int[lengthOfAccountArray];
		for (int i = 0; i < Accounts.length; i++){
			Accounts[i] = StartingCapital;		
		}
	}
	//Getting the account balance of a specific player
	public int getPlayerStash(int IDOfPlayer){
		return Accounts[IDOfPlayer];
	}
	//Setting the account balance of a specific player
	public void setPlayerStash(int IDOfPlayer, int incMoney){
		Accounts[IDOfPlayer] = Accounts[IDOfPlayer] + incMoney;
	}
	//Getting all accounts in an array
	public int[] getAccountArray(){
		return Accounts;
	}	
}
