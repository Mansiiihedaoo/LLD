package models;

public class King extends Piece{
    @Override
    public boolean canMove(ChessBoard board, Box start, Box end) {
        return false;
    }
}
