package models;

public class Rook extends Piece{
    @Override
    public boolean canMove(ChessBoard board, Box start, Box end) {
        return false;
    }
}
