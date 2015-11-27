package GameTests;

import static org.junit.Assert.*;
import org.junit.Test;

import Game.Die;
import Game.GameBoard;
import Game.Language;
import Game.Player;
import Game.Account;


public class PlayerTest {

//	Creates 3 players and their accounts
	GameBoard field = new GameBoard();
	Language lang = new Language();
	Account account = new Account();
	
	@Test
	public void testAccount(){

		account.addAccounts(6);
		int player5Money = account.getPlayerStash(5);
		assertEquals(30000, player5Money);
	}

}
