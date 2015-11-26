package Game;

// Account er ikke en spiller, men en spiller har et account, saa ikke helt rigtigt, men kan virke alligevel

public class Account {

	private int StartingCapital;
	private int indexNumber = 0;
	
	
	public Account (){		
		StartingCapital = 30000;		
	}
	
	protected int lenghtOfAccountArray = 6;

	protected int[]	Accounts = new int[lenghtOfAccountArray];

	public void addPlayerAndAccount(String NameOfPlayer){			
		this.addStartingCapitalOfPlayerToArray(StartingCapital);		
	}

	private void addStartingCapitalOfPlayerToArray(int StartingCapital){		
		Accounts[indexNumber] = StartingCapital;		
	}
	
	public int getPlayerStash(int IDOfPlayer){
		return Accounts[IDOfPlayer];
	}
	
	public void setPlayerStash(int IDOfPlayer, int incMoney){
		Accounts[IDOfPlayer] = Accounts[IDOfPlayer] + incMoney;
	}
	
//	public static int getAccountSum(int IDOfPlayer){
//		
//		int SumOfAccount = 0;
//		
//		if (isValidID(IDOfPlayer)){
//			if (isNotBroke(IDOfPlayer)){
//				
//				SumOfAccount = Accounts[IDOfPlayer];
//			}
//			if (!(isNotBroke(IDOfPlayer))){
//				
//				System.out.println("This Player ID = " + IDOfPlayer + " is broke, and cannot play anymore");
//				
//			}
//			
//		}
//		if (!(isValidID(IDOfPlayer))){
//			
//			System.out.println("A fault happend - See; Game -> Account -> getAccountSum");
//
//		}
//		
//		return SumOfAccount;
//
//	}
	
//	public void addOrRemoveCapitalFromPlayerAccount(int IDOfPlayer, int AddRemove){
//		
//		if (super.isValidID(IDOfPlayer)){
//			
//			Accounts[IDOfPlayer] = Accounts[IDOfPlayer] + AddRemove;
//		}
//		if (!(super.isValidID(IDOfPlayer))){
//			
//			System.out.println("A fault happend - See; Game -> Account -> addOrRemoveCapitalFromPlayerAccount");
//
//		}
//	}
//	
//	private static boolean isNotBroke(int IDOfPlayer){
//		
//		boolean broke = false;
//		
//		if (Account.getAccountSum(IDOfPlayer) < 0){
//			
//			broke = true;
//			
//		}
//
//		return broke;
//		
//	}
	
}
