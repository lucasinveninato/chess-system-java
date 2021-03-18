package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {
	public Queen(Board board, Color color) {
		super(board, color);		
	}
	@Override
	public String toString() {
		return "Q";
	}	
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
		return mat;
	}
}
