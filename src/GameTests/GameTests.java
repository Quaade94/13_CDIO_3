package GameTests;

import static org.junit.Assert.*;

import org.junit.Test;

import Game.Die;
import Game.GameBoard;
import Game.Language;
import Game.Player;
import Game.Account;

public class GameTests {
	
	Die dice = new Die();
	Player player = new Player(6);
	GameBoard field = new GameBoard();
	Language lang = new Language();
	Account account = new Account();
	
	@Test 
	public void testPlayerPosition(){
		
		dice.roll();
		int roll = dice.getDiceSum();
		player.setPlayerPosition(0, roll);
		
		assertEquals(player.getPlayerPosition(0), roll);	
	}
	
	@Test
	public void testAccount(){

		account.addAccounts(6);
		int Actualplayer5Money = account.getPlayerStash(5);
		int Expectedplayer5Money = 30000;
		assertEquals(Expectedplayer5Money, Actualplayer5Money);
	}

}
