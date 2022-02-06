package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

	private Color color;
//	private Integer moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}
}
