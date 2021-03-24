package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);		
	}

	@Override
	public String toString() {
		return "P";
	}
	
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColums()];
		
		Position p = new Position (0, 0);
		
		if (getColor() == color.WHITE) {
			// above first time
			p.setValues(position.getRow() - 2, position.getColum());
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColum()] = true;
			}
			
			// above
			p.setValues(position.getRow() - 1, position.getColum());
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColum()] = true;
			}	
			
			// nw
			p.setValues(position.getRow() - 1, position.getColum() - 1);
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColum()] = true;
			}
			if (getBoard().positionExists(p) && isThereOponentPiece(p)) {
				mat[p.getRow()][p.getColum()] = true;
			}
			
			// ne
			p.setValues(position.getRow() - 1, position.getColum() + 1);
			if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColum()] = true;
			}
			if (getBoard().positionExists(p) && isThereOponentPiece(p)) {
				mat[p.getRow()][p.getColum()] = true;
			}
		}
		
		
		return mat;		
	}
}
