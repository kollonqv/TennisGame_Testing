import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Ignore;

public class TennisGameTest {
	
// Here is the format of the scores: "player1Score - player2Score"
// "love - love"
// "15 - 15"
// "30 - 30"
// "deuce"
// "15 - love", "love - 15"
// "30 - love", "love - 30"
// "40 - love", "love - 40"
// "30 - 15", "15 - 30"
// "40 - 15", "15 - 40"
// "player1 has advantage"
// "player2 has advantage"
// "player1 wins"
// "player2 wins"
	
	@Test
	public void testTennisGame_Start() {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Initial score incorrect", "love - love", score);		
	}
	
	
	@Test
	public void testTennisGame_player1_15_player2_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("15 15", "15 - 15", score);		
	}
	
	@Test
	public void testTennisGame_player1_30_player2_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("30 30", "30 - 30", score);		
	}
	
	@Test
	public void testTennisGame_EahcPlayerWin4Points_Score_Deuce() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "deuce", score);		
	}
	
	@Test
	public void testTennisGame_EahcPlayerWin5Points_Score_Deuce() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Tie score incorrect", "deuce", score);		
	}
	
	@Test
	public void testTennisGame_player1_advantage_after_5pointDeuce() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player 1 advantage", "player1 has advantage", score);			
	}
	
	@Test
	public void testTennisGame_player1_15_player2_love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("15-0", "15 - love", score);		
	}
	
	@Test
	public void testTennisGame_player2_15_player1_love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("love - 15", "love - 15", score);		
	}
	
	@Test
	public void testTennisGame_player1_30_player2_love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("30-0", "30 - love", score);		
	}
	
	@Test
	public void testTennisGame_player2_30_player1_love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("love-30", "love - 30", score);		
	}
	
	@Test
	public void testTennisGame_player1_40_player2_love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("40-0", "40 - love", score);		
	}
	
	@Test
	public void testTennisGame_player2_40_player1_love() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("love-40", "love - 40", score);		
	}
	
	@Test
	public void testTennisGame_player1_30_player2_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("30-15", "30 - 15", score);		
	}
	
	@Test
	public void testTennisGame_player2_30_player1_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("15-30", "15 - 30", score);		
	}
	
	@Test
	public void testTennisGame_player1_40_player2_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("40-15", "40 - 15", score);		
	}
	
	@Test
	public void testTennisGame_player2_40_player1_15() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("15-40", "15 - 40", score);		
	}
	
	@Test
	public void testTennisGame_player1_40_player2_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		
		game.player2Scored();
		game.player2Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("40-30", "40 - 30", score);		
	}
	
	@Test
	public void testTennisGame_player2_40_player1_30() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player1Scored();
		
		String score = game.getScore() ;
		// Assert
		assertEquals("30-40", "30 - 40", score);		
	}
	
	@Test
	public void testTennisGame_player1HasAdvantage() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player 1 advantage", "player1 has advantage", score);		
	}
	
	@Test
	public void testTennisGame_player1WinAfterAdvantage() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player 1 wins", "player1 wins", score);		
	}
	
	@Test
	public void testTennisGame_player2HasAdvantage() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player 2 advantage", "player2 has advantage", score);		
	}
	
	public void testTennisGame_player2WinAfterAdvantage() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		
		game.player1Scored();
		game.player2Scored();
		game.player1Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("player 2 wins", "player2 wins", score);		
	}
	

	
	public void testTennisGame_player1Wins() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Player 1 wins", "40 - 0", score);		
	}
	
	public void testTennisGame_player2Wins() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		game.player2Scored();
		//Act
		String score = game.getScore() ;
		// Assert
		assertEquals("Player 1 wins", "40 - 0", score);		
	}
	
	@Test (expected = TennisGameException.class)
	public void testTennisGame_Player1WinsPointAfterGameEnded_ResultsException() throws TennisGameException {
		//Arrange
		TennisGame game = new TennisGame();
		//Act
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		game.player1Scored();
		//Act
		// This statement should cause an exception
		game.player1Scored();
	}
	
	
	
}
