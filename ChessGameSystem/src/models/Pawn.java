package models;

public class Pawn extends Piece{

    @Override
    public boolean canMove(ChessBoard board, Box start, Box end) {
        return false;
    }
}
