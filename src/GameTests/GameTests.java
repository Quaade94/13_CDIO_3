package GameTests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import Game.Die;
import Game.GameBoard;
import Game.Language;
import Game.Player;
import Game.Account;
import Game.PlayerTurnSwitcher;
import desktop_resources.GUI;
import Fields.Field;
import Fields.FieldController;
import Fields.Fleet;
import Fields.Laborcamp;
import Fields.Ownable;
import Fields.Refuge;
import Fields.Tax;
import Fields.Territory;

public class GameTests {
	
	Die Die = new Die();
	Player Player = new Player(6);
	GameBoard GameBoard = new GameBoard();
	Language lang = new Language();
	Account Account = new Account();
	Territory ter = new Territory();
	PlayerTurnSwitcher Turns1 = new PlayerTurnSwitcher();
//	Field field2 = new Field();
	
	@Test 
	public void testPlayerPosition(){
		
		Die.roll();
		int roll = Die.getDiceSum();
		Player.setPlayerPosition(0, roll);
		
		assertEquals(Player.getPlayerPosition(0), roll);	
	}
	
	@Test
	public void testAccount(){

		Account.addAccounts(6);
		int Actualplayer5Money = Account.getPlayerStash(5);
		int Expectedplayer5Money = 30000;
		assertEquals(Expectedplayer5Money, Actualplayer5Money);
	}
	DieTest testdice = new DieTest();
	
	@Test
	public void testLandOnField(){
		
		Account.addAccounts(6);
		Turns1.setPlayerSize(2);
//		Checks that the field is not owned by player 1
//		assertFalse(ter.isTerOwned(0, 5));
		
		Player.setPlayerPosition(0, 5);
//		Sets the owner to player 1 (for the field he is stading on, in this case field 5)
//		ter.setNewOwner(0);
//		Checks if player 1 owns field 5
//		assertTrue(ter.isTerOwned(0, 5));
		
		System.out.println("Spiller 1 konto "+Account.getPlayerStash(0));
		System.out.println("Første spiller tur: "+Turns1.getPlayerTurn());

		Turns1.setTenPercent(Account.getPlayerStash(Turns1.getPlayerTurn()));
		Turns1.checkField(Turns1.getPlayerTurn(), Player.getPlayerPosition(Turns1.getPlayerTurn()));
		int[] rentAndPlayer = Turns1.getRentAndPlayer();
		if (!(Turns1.getOwned())){
			if (Account.getPlayerStash(Turns1.getPlayerTurn()) >= rentAndPlayer[0] * -1) {
				boolean wantToBuy = true;
				if (wantToBuy){
						Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0]);
						Turns1.shiftOwner(Turns1.getPlayerTurn());
				}
			}
		} else if (Turns1.getOwned()){
			System.out.println(Arrays.toString(rentAndPlayer));
			Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0] * -1);
			GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
			if(rentAndPlayer[1] != 6){
				System.out.println(rentAndPlayer[1]);
				Account.setPlayerStash(rentAndPlayer[1], rentAndPlayer[0]);
			}
	}
		
		
		System.out.println("Spiller 1's position"+Player.getPlayerPosition(0));
		System.out.println("Spiller 1 nye penge: "+Account.getPlayerStash(0));
		
		Turns1.scaleIndependentTurn();
		Turns1.endTurn();
		
		ter.setNewOwner(0);
		assertTrue(ter.isTerOwned(0, 5));
		
		System.out.println("Næste spillers tur: "+Turns1.getPlayerTurn());
		
		Player.setPlayerPosition(1, 5);
		
		Turns1.setTenPercent(Account.getPlayerStash(Turns1.getPlayerTurn()));
		Turns1.checkField(Turns1.getPlayerTurn(), Player.getPlayerPosition(Turns1.getPlayerTurn()));
		if (!(Turns1.getOwned())){
			if (Account.getPlayerStash(Turns1.getPlayerTurn()) >= rentAndPlayer[0] * -1) {
				boolean wantToBuy = false;
				if (wantToBuy){
						Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0]);
						GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
						Turns1.shiftOwner(Turns1.getPlayerTurn());
				}
			}
		} else if (Turns1.getOwned()){
			System.out.println(Arrays.toString(rentAndPlayer));
			Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0] * -1);
			GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
			if(rentAndPlayer[1] != 6){
				System.out.println(rentAndPlayer[1]);
				Account.setPlayerStash(rentAndPlayer[1], rentAndPlayer[0]);
				GUI.setBalance(Player.getPlayerName(rentAndPlayer[1]), Account.getPlayerStash(rentAndPlayer[1]));
			}
		}

		System.out.println("Spiller 1 "+Account.getPlayerStash(0));
		System.out.println("Spiller 2 "+Account.getPlayerStash(1));

			
		}
		
		
//		player.setPlayerPosition(1, 5);
//	}


}
