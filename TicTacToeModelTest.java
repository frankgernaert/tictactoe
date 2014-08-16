package com.frankgernaert.tictactoe.test;

import static org.junit.Assert.*;

import org.junit.Test;



import com.frankgernaert.tictactoe.TicTacToeModel;
import com.frankgernaert.tictactoe.TicTacToeModel.Piece;

public class TicTacToeModelTest {

	@Test
	public void testXWins() {
		TicTacToeModel board=new TicTacToeModel();
		board.setValue(0, 0, Piece.X);
		board.setValue(0, 1, Piece.X);
		board.setValue(0, 2, Piece.X);
		assertEquals(board.checkWinner(),Piece.X);
		
	}
	@Test
	public void testOWins() {
		TicTacToeModel board=new TicTacToeModel();
		board.setValue(1, 0, Piece.O);
		board.setValue(1, 1, Piece.O);
		board.setValue(1, 2, Piece.O);
		assertEquals(board.checkWinner(),Piece.O);
		
	}
	@Test
	public void testSanity() {
		TicTacToeModel board=new TicTacToeModel();
		board.setValue(0, 0, Piece.X);
		assertEquals(board.getCurrentPlayer(),Piece.O);
		
	}

}
