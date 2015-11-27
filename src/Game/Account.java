package Game;

import java.util.Arrays;
// Account er ikke en spiller, men en spiller har et account, saa ikke helt rigtigt, men kan virke alligevel

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
		System.out.println("Dette: " + IDOfPlayer + incMoney);
		System.out.println(Arrays.toString(Accounts));
		Accounts[IDOfPlayer] = Accounts[IDOfPlayer] + incMoney;
		System.out.println(Arrays.toString(Accounts));
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
