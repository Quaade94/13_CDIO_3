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
	public void testLandOnFieldTerritory(){

		Account.addAccounts(6);
		Turns1.setPlayerSize(2);
		Player.setPlayerPosition(0, 5);

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
		}

		Turns1.scaleIndependentTurn();
		Turns1.endTurn();

		//Checks if player is the owner of the field he bought
		int expected = 0;
		int actual = Turns1.getRentAndPlayer()[1];
		assertEquals(actual, expected);


		//Checks if the price of the field was taken from player account
		expected = 30000-4000;
		actual = Account.getPlayerStash(0);
		assertEquals(actual, expected);

		Player.setPlayerPosition(1, 5);

		Turns1.setTenPercent(Account.getPlayerStash(Turns1.getPlayerTurn()));
		Turns1.checkField(Turns1.getPlayerTurn(), Player.getPlayerPosition(Turns1.getPlayerTurn()));
		rentAndPlayer = Turns1.getRentAndPlayer();
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
			Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0] * -1);
			GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
			if(rentAndPlayer[1] != 6){
				Account.setPlayerStash(rentAndPlayer[1], rentAndPlayer[0]);
				GUI.setBalance(Player.getPlayerName(rentAndPlayer[1]), Account.getPlayerStash(rentAndPlayer[1]));
			}
		}

		//Checks if player 2 pays rent
		expected = 30000-1000;
		actual = Account.getPlayerStash(1);
		assertEquals(expected, actual);

		//Checks if player 1 recieves player 2's money
		expected = 26000+1000;
		actual = Account.getPlayerStash(0);
		assertEquals(expected, actual);
	}
	@Test
	public void testLandOnFieldFleet(){

		Account.addAccounts(6);
		Turns1.setPlayerSize(2);
		Player.setPlayerPosition(0, 20);

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
		}
		Player.setPlayerPosition(0, 19);

		Turns1.setTenPercent(Account.getPlayerStash(Turns1.getPlayerTurn()));
		Turns1.checkField(Turns1.getPlayerTurn(), Player.getPlayerPosition(Turns1.getPlayerTurn()));
		rentAndPlayer = Turns1.getRentAndPlayer();
		if (!(Turns1.getOwned())){
			if (Account.getPlayerStash(Turns1.getPlayerTurn()) >= rentAndPlayer[0] * -1) {
				boolean wantToBuy = true;
				if (wantToBuy){
					Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0]);
					Turns1.shiftOwner(Turns1.getPlayerTurn());
				}
			}
		}

		Turns1.scaleIndependentTurn();
		Turns1.endTurn();

		//Checks if player is the owner of the field he bought
		int expected = 0;
		int actual = Turns1.getRentAndPlayer()[1];
		assertEquals(actual, expected);


		//Checks if the price of the field was taken from player account
		expected = 26000-4000;
		actual = Account.getPlayerStash(0);
		assertEquals(actual, expected);

		Player.setPlayerPosition(1, 20);

		Turns1.setTenPercent(Account.getPlayerStash(Turns1.getPlayerTurn()));
		Turns1.checkField(Turns1.getPlayerTurn(), Player.getPlayerPosition(Turns1.getPlayerTurn()));
		rentAndPlayer = Turns1.getRentAndPlayer();
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
			Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0] * -1);
			GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
			if(rentAndPlayer[1] != 6){
				System.out.println(rentAndPlayer[1]);
				Account.setPlayerStash(rentAndPlayer[1], rentAndPlayer[0]);
				GUI.setBalance(Player.getPlayerName(rentAndPlayer[1]), Account.getPlayerStash(rentAndPlayer[1]));
			}
		}

		//Checks if player 2 pays rent
		expected = 30000-1000;
		actual = Account.getPlayerStash(1);
		assertEquals(expected, actual);

		//Checks if player 1 recieves player 2's money
		expected = 22000+1000;
		actual = Account.getPlayerStash(0);
		assertEquals(expected, actual);
	}
	@Test
	public void testLandOnFieldRefuge(){
		Account.addAccounts(6);
		Turns1.setPlayerSize(2);
		Player.setPlayerPosition(0, 12);
		
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
			Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0] * -1);
			GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
			if(rentAndPlayer[1] != 6){
				Account.setPlayerStash(rentAndPlayer[1], rentAndPlayer[0]);
				GUI.setBalance(Player.getPlayerName(rentAndPlayer[1]), Account.getPlayerStash(rentAndPlayer[1]));
			}
		}

		Turns1.scaleIndependentTurn();
		Turns1.endTurn();
		System.out.println(Account.getPlayerStash(0));
		//Checks if the player recieves his price
		int expected = 30000+5000;
		int actual = Account.getPlayerStash(0);
		assertEquals(actual, expected);
	}
	@Test
	public void testLandOnFieldTax(){
		Account.addAccounts(6);
		Turns1.setPlayerSize(2);
		Player.setPlayerPosition(0, 16);
		
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
			Account.setPlayerStash(Turns1.getPlayerTurn(), rentAndPlayer[0] * -1);
			GUI.setBalance(Player.getPlayerName(Turns1.getPlayerTurn()), Account.getPlayerStash(Turns1.getPlayerTurn()));
			if(rentAndPlayer[1] != 6){
				Account.setPlayerStash(rentAndPlayer[1], rentAndPlayer[0]);
				GUI.setBalance(Player.getPlayerName(rentAndPlayer[1]), Account.getPlayerStash(rentAndPlayer[1]));
			}
		}

		Turns1.scaleIndependentTurn();
		Turns1.endTurn();
		System.out.println(Account.getPlayerStash(0));
		//Checks if the player recieves his price
		int expected = 30000-2000;
		int actual = Account.getPlayerStash(0);
		assertEquals(actual, expected);
	}





























}


