package GameTests;

import static org.junit.Assert.*;

import org.junit.Test;

import Game.Die;
import Game.Main;
import Game.GameBoard;
import Game.Language;
import Game.Player;

public class GameTests {
	
	Die dice = new Die();
	Player player = new Player(6);
	GameBoard field = new GameBoard();
	Language lang = new Language();
	
	@Test 
	public void testPlayerPosition(){
		
		dice.roll();
		int roll = dice.getDiceSum();
		player.setPlayerPosition(0, roll);
		
		assertEquals(player.getPlayerPosition(0), roll);	
	}
	
}
