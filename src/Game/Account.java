package Game;


public class Account {

	private int StartingCapital;
	private int[] Accounts;
	
	public Account (){		
		StartingCapital = 30000;		
	}

	public void addAccounts(int lengthOfAccountArray){
		Accounts = new int[lengthOfAccountArray];
		for (int i = 0; i < Accounts.length; i++){
			Accounts[i] = StartingCapital;		
		}
	}
	
	public int getPlayerStash(int IDOfPlayer){
		return Accounts[IDOfPlayer];
	}
	
	public void setPlayerStash(int IDOfPlayer, int incMoney){
		Accounts[IDOfPlayer] = Accounts[IDOfPlayer] + incMoney;
	}
	
	public int[] getAccountArray(){
		return Accounts;
	}	
}
