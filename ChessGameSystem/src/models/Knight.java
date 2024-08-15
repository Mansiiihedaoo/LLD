package models;

public class Knight extends Piece{

    @Override
    public boolean canMove(ChessBoard board, Box start, Box end) {
        return false;
    }
}
