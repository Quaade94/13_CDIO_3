package Game;

// Account er ikke en spiller, men en spiller har en account, så ikke helt rigtigt, men kan virker alligevel

public class Account extends Player {

	private  int StartingCapital;
	
	public Account (int StaringCapitalConstructor){
		
		StartingCapital = StaringCapitalConstructor;
		
	}
	
	protected   int lenghtOfAccountArray = 6;

	protected   int[]	 Accounts 	= new int[lenghtOfAccountArray];

	public  void addPlayerAndAccount(String NameOfPlayer){
	
		super.addNameOfPlayerToArray(NameOfPlayer);
		this.addStartingCapitalOfPlayerToArray(StartingCapital);
		super.moveToNextIndex();
		System.out.println(Accounts[indexNumber-1]);
		
	}

	private  void addStartingCapitalOfPlayerToArray(int StartingCapital){
		
		Accounts[indexNumber] = StartingCapital;
		
	}
	
	public int getPlayerStash(int playerId){
		int playerStash = Accounts[playerId];
		return playerStash;
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
